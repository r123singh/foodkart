package data;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadAccountFileOperation {

	private static ReadAccountFileOperation accountFileOperation;
	private boolean fileReadOperationCompleted = false;
	private AccountVector accountVector;

	public static ReadAccountFileOperation getAccountFileOperation() {
		if (accountFileOperation == null) {
			accountFileOperation = new ReadAccountFileOperation();
			return accountFileOperation;
		}
		return accountFileOperation;
	}

	public ReadAccountFileOperation() {
		// TODO Auto-generated constructor stub
	}

	public boolean init() {
		initiateReadOperation(false);
		return fileReadOperationCompleted;
	}

	private void initiateReadOperation(boolean successful) {
		// TODO Auto-generated method stub
		AccountDataFile dataFile = (AccountDataFile) MISFileInitializer
				.getAllDatafilesMap().get(FileProperties.MAP_ACCOUNT_FILE_NAME);
		if (!dataFile.isNewFile()) {
			try {
				AccountDataFileInputStream fis = new AccountDataFileInputStream(
						dataFile);
				if (fis.available() > 0) {
					AccountObjectInputStream ois = new AccountObjectInputStream(
							fis);
					setAccountVector((AccountVector) ois.readObject());
					ois.close();
					successful = true;
					fileReadOperationCompleted = true;
				}

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				successful = false;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				successful = false;
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				successful = false;
			}
		} else {
			successful = false;
		}
		if (!successful) {
			fileReadOperationCompleted = false;
		}
	}

	public AccountVector getAccountVector() {
		return accountVector;
	}

	public void setAccountVector(AccountVector accountVector) {
		this.accountVector = accountVector;
	}
}
