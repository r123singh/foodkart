package userInterface;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;

public class BasicAccountDialog extends Dialog {
	
	private Frame dialogOwner;
	private String dialogTitle;
	private boolean dialogModal;
	private GraphicsConfiguration dialogGc;

	public static String BASIC_DIALOG_LABEL_DEFAULT_STRING;
	public static String BASIC_DIALOG_LABEL_ADD_ACCOUNT_STRING;
	public static String BASIC_DIALOG_LABEL_ACCOUNT_CODE_STRING;
	public static String BASIC_DIALOG_LABEL_ACCOUNT_NAME_STRING;
	public static String BASIC_DIALOG_LABEL_ACCOUNT_DESCRIPTION_STRING;
	
	public static String BASIC_DIALOG_TEXT_ACCOUNT_CODE_STRING;
	public static String BASIC_DIALOG_TEXT_ACCOUNT_NAME_STRING;
	public static String BASIC_DIALOG_TEXT_ACCOUNT_DESCRIPTION_STRING;
	
	private Color basicDialogColor = Color.LIGHT_GRAY;

	private int basicDialogWidth = 500;
	private int basicDialogHeight = 500;
	private int windowLocationX = 200;
	private int windowLocationY = 10;
	


	public static void loadAllBasicDialogStrings() {
		// TODO Auto-generated method stub
		BASIC_DIALOG_LABEL_DEFAULT_STRING = "DEFAULT_DIALOG";
		BASIC_DIALOG_LABEL_ADD_ACCOUNT_STRING = "ADD ACCOUNT";
		BASIC_DIALOG_LABEL_ACCOUNT_CODE_STRING = "CODE";
		BASIC_DIALOG_LABEL_ACCOUNT_NAME_STRING = "NAME";
		BASIC_DIALOG_LABEL_ACCOUNT_DESCRIPTION_STRING="DESCRIPTION";
		
		BASIC_DIALOG_TEXT_ACCOUNT_CODE_STRING="enter the account code";
		BASIC_DIALOG_TEXT_ACCOUNT_NAME_STRING="enter the account name";
		BASIC_DIALOG_TEXT_ACCOUNT_DESCRIPTION_STRING="account description";
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String BASIC_DIALOG_LABEL_DEFAULT_ITEM_STRING = "DEFAULT LABEL";
	public static final int GRID_ROWS = 5;
	public static final int GRID_COLUMNS = 2;
	public static final int VGAP = 30;
	public static final int HGAP = 30;
	
	public static final String BASIC_DIALOG_BUTTON_ACCOUNT_ADD_STRING = "Add Account";
	public static final String BASIC_DIALOG_LABEL_VIEW_ACCOUNT_STRING = "View Account";
	public static final int VIEW_ACCOUNT_GRID_COLUMNS = 3;
	public static final int VIEW_HGAP = 30;
	public static final int VIEW_VGAP = 30;
	
	//TO BE SET DEPENDING ON NUMBER OF OBJECTS
	public static int VIEW_ACCOUNT_GRID_ROWS = 1;
	public static final int VIEW_ACCOUNT_HEADER_ROW=1;
	
	public BasicAccountDialog(Frame owner, String title, boolean modal,
			GraphicsConfiguration gc) {
		
		super(owner, title, modal, gc);
		// TODO Auto-generated constructor stub
		this.dialogGc=gc;
		this.dialogTitle=title;
		this.dialogOwner=owner;
		this.dialogModal=modal;
		addWindowListener(new BasicWindowListener(this));
	}

	public Frame getDialogOwner() {
		return dialogOwner;
	}

	public void setDialogOwner(Frame dialogOwner) {
		this.dialogOwner = dialogOwner;
	}

	public String getDialogTitle() {
		return dialogTitle;
	}

	public void setDialogTitle(String dialogTitle) {
		this.dialogTitle = dialogTitle;
	}

	public boolean isDialogModal() {
		return dialogModal;
	}

	public void setDialogModal(boolean dialogModal) {
		this.dialogModal = dialogModal;
	}

	public GraphicsConfiguration getDialogGc() {
		return dialogGc;
	}

	public void setDialogGc(GraphicsConfiguration dialogGc) {
		this.dialogGc = dialogGc;
	}
	
	public void layoutDialog() {
		this.setBounds(windowLocationX, windowLocationY, basicDialogHeight,
				basicDialogWidth);
		this.setBackground(basicDialogColor);
	}

}
