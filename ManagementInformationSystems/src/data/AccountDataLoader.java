package data;

public class AccountDataLoader {

	public static AccountVector accountVector = null;
	private ReadAccountFileOperation operationInstance;


	public static AccountVector getAccountVector() {
		return accountVector;
	}

	public static void setAccountVector(AccountVector accountVector) {
		AccountDataLoader.accountVector = accountVector;
	}

	public AccountDataLoader() {
		// TODO Auto-generated constructor stub
	}

	private void load() {
		// TODO Auto-generated method stub
		if (operationInstance.init()) {
			accountVector = operationInstance.getAccountVector();
		} else {
			accountVector = new AccountVector();
		}
	}

	public void loadAll() {
		// TODO Auto-generated method stub
		operationInstance = ReadAccountFileOperation.getAccountFileOperation();
		if (operationInstance != null) {
			load();
		}

	}
}
