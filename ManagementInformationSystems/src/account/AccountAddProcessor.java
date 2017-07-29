package account;

import java.time.Instant;
import java.util.Date;

import data.AccountDataLoader;
import data.WriteAccountFileOperation;
import accountPackage.Account;

public class AccountAddProcessor {

	private static AccountAddProcessor actionProcessor;
	private boolean processSuccessful = false;

	public static AccountAddProcessor getAccountAddProcessor() {
		if (actionProcessor == null) {
			actionProcessor = new AccountAddProcessor();
			return actionProcessor;
		}
		return actionProcessor;
	}

	public boolean processAddAccount() {
		String accountCode = NewAccountInstance.getAccountInstance().getCode();
		String accountName = NewAccountInstance.getAccountInstance().getName();
		String accountDescription = NewAccountInstance.getAccountInstance()
				.getDescription();
		persistAccountObject(
				createNewAccountEntry(accountCode, accountName,
						accountDescription), false);
		return processSuccessful;
	}

	private Account createNewAccountEntry(String accountCode,
			String accountName, String accountDescription) {
		// TODO Auto-generated method stub
		Account account = new Account();
		account.setName(accountName);
		account.setDescription(accountDescription);
		account.setAccountCode(accountCode);
		account.setBalance(new Float(0));
		account.setStartDate(Date.from(Instant.now()));
		return account;
	}

	private boolean persistAccountObject(Account account, boolean persisted) {
		// TODO Auto-generated method stub
		try {
			AccountDataLoader.getAccountVector().add(account);
			if (WriteAccountFileOperation.getAccountFileOperation().init(
					account)) {
				persisted = true;
				processSuccessful = true;
			}
		} catch (NullPointerException e) {
			persisted = false;
		}
		if (!persisted) {
			processSuccessful = false;
		}
		return persisted;
	}
}
