package file;

import java.io.File;

public class ResponseFile extends File {

	private static String parentPath = System.getProperty("user.dir").concat("/res");

	public ResponseFile(String parent, String child) {
		super(parentPath, child);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
