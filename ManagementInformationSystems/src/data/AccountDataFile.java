package data;

import java.io.File;

public class AccountDataFile extends File {
	private static final long serialVersionUID = 1L;
	private boolean isEmpty;
	private boolean isnewFile;

	public boolean isNewFile() {
		return isnewFile;
	}

	public void setnewFile(boolean isnewFile) {
		this.isnewFile = isnewFile;
	}

	public AccountDataFile(String path) {
		super(path);
		// TODO Auto-generated constructor stub
	}

	public boolean isEmpty() {
		return isEmpty;
	}

	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}

	/**
	 * 
	 */

}
