package userInterface;

import java.awt.Color;
import java.awt.Dialog;

public class AccountAddMessageDialog extends BasicMessageDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String ACCOUNT_ADD_MESSAGE_DIALOG_TITLE="Account Status";
	public static final String ACCOUNT_SUCCESSFUL_MSG = "Account entry successfully created";
	public static final String ACCOUNT_FAILURE_MSG = "Account entry failed";
	
	private Color basicDialogColor = Color.LIGHT_GRAY;

	
	private int basicDialogWidth = 400;
	private int basicDialogHeight = 100;
	private int windowLocationX = 250;
	private int windowLocationY = 20;
	
	public static final int GRID_ROWS = 2;
	public static final int GRID_COLUMNS = 1;
	public static final int HGAP = 0;
	public static final int VGAP = 5;
	
	public static final String OK = "OK";

	public AccountAddMessageDialog(Dialog owner, String title) {
		super(owner, title);
		// TODO Auto-generated constructor stub
		addWindowListener(new BasicWindowListener(this) );
	}

	public void layoutDialog() {
		// TODO Auto-generated method stub
		this.setBounds(windowLocationX, windowLocationY,basicDialogWidth,basicDialogHeight);
		this.setBackground(basicDialogColor);
	}

}
