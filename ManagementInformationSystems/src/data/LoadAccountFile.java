package data;

import java.io.IOException;

public class LoadAccountFile {

	private boolean loadSuccessful = false;
	private AccountDataFile accountDataFile = null;

	private static LoadAccountFile loaderInstance;

	public static LoadAccountFile getLoaderInstance() {
		if (loaderInstance == null) {
			loaderInstance = new LoadAccountFile();
			return loaderInstance;
		}
		return loaderInstance;
	}

	public AccountDataFile load() {
		if (!loadFile(false)) {
			setLoadSuccessful(false);
		} else {
			setLoadSuccessful(true);
		}
		return accountDataFile;
	}

	private boolean loadFile(boolean loadingDone) {
		// TODO Auto-generated method stub
		String path = FileProperties.DATA_FILE_FOLDER
				+ FileProperties.ACCOUNT_FILE_NAME;
		accountDataFile = new AccountDataFile(path);
		loadingDone = true;
		try {
			if (!accountDataFile.exists()) {
				accountDataFile.createNewFile();
				accountDataFile.setEmpty(true);
				accountDataFile.setnewFile(true);
			} else {
				accountDataFile.setnewFile(false);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			if (!loadingDone) {
				setLoadSuccessful(false);
			}
			e.printStackTrace();
		}
		if (!loadingDone) {
			setLoadSuccessful(false);
		}
		return loadingDone;
	}

	public boolean isLoadSuccessful() {
		return loadSuccessful;
	}

	public void setLoadSuccessful(boolean loadSuccessful) {
		this.loadSuccessful = loadSuccessful;
	}

}
