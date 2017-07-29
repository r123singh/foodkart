package userInterface;

import java.awt.Menu;

public class BasicMenu extends Menu {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static String BASIC_MENU_LABEL_DEFAULT_STRING;
	public static String BASIC_MENU_LABEL_ACCOUNT_STRING;
	public static String BASIC_MENU_LABEL_LOGIN_STRING;
	public static String BASIC_MENU_TRANSACTIONS_ACCOUNT_STRING;

	public BasicMenu(String label) {
		super.setLabel(label);
	}

	public static void loadAllBasicMenuStrings() {
		// TODO Auto-generated method stub
		BASIC_MENU_LABEL_DEFAULT_STRING = "DEFAULT_MENU";
		BASIC_MENU_LABEL_ACCOUNT_STRING = "ACCOUNT";
		BASIC_MENU_LABEL_LOGIN_STRING = "LOGIN";
		BASIC_MENU_TRANSACTIONS_ACCOUNT_STRING = "TRANSACTIONS";
	}

}
