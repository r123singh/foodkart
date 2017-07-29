package data;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Vector;

import accountPackage.Account;

public class WriteAccountFileOperation {

	private Account account;
	private Vector accountVector;

	private static WriteAccountFileOperation accountFileOperation;
	private boolean fileWriteOperationCompleted = false;

	public static WriteAccountFileOperation getAccountFileOperation() {
		if (accountFileOperation == null) {
			accountFileOperation = new WriteAccountFileOperation();
			return accountFileOperation;
		}
		return accountFileOperation;
	}

	public WriteAccountFileOperation() {
		// TODO Auto-generated constructor stub
		accountVector = AccountDataLoader.getAccountVector();
	}

	public boolean init(Account account) {
		initiateWriteOperation(account, false);
		return fileWriteOperationCompleted;
	}

	private void initiateWriteOperation(Account account, boolean writeSuccessful) {
		// TODO Auto-generated method stub
		setAccount(account);
		if (account != null) {
			accountVector.add(account);
		}
		AccountDataFile dataFile = (AccountDataFile) MISFileInitializer
				.getAllDatafilesMap().get(FileProperties.MAP_ACCOUNT_FILE_NAME);
		try {
			AccountDataFileOutputStream dataFileOutputStream = new AccountDataFileOutputStream(dataFile);
			AccountObjectOutputStream objectOutputStream = new AccountObjectOutputStream(dataFileOutputStream);
			objectOutputStream.writeObject(this.accountVector);
			objectOutputStream.close();
			writeSuccessful = true;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			if (!writeSuccessful) {
				fileWriteOperationCompleted = false;
			}
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			if (!writeSuccessful) {
				fileWriteOperationCompleted = false;
			}
			e.printStackTrace();
		}

		if (!writeSuccessful) {
			fileWriteOperationCompleted = false;
		} else {
			fileWriteOperationCompleted = true;
		}
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
