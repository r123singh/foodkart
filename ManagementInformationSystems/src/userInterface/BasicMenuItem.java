package userInterface;

import java.awt.MenuItem;

public class BasicMenuItem extends MenuItem {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String VIEW_ACCOUNT_COMMAND = "viewAccountCommand";
	public static final String ADD_ACCOUNT_COMMAND = "addAccountCommand";
	

	public static String BASIC_MENU_ITEM_DEFAULT_STRING;
	public static String BASIC_MENU_ITEM_VIEW_ACCOUNT_STRING;
	public static String BASIC_MENU_ITEM_ADD_ACCOUNT_STRING;

	public BasicMenuItem() {
		// TODO Auto-generated constructor stub
	}

	public static void loadAllBasicMenuItemStrings() {
		// TODO Auto-generated method stub
		BASIC_MENU_ITEM_DEFAULT_STRING = "DEFAULT";
		BASIC_MENU_ITEM_VIEW_ACCOUNT_STRING = "VIEW ACCOUNT";
		BASIC_MENU_ITEM_ADD_ACCOUNT_STRING = "ADD ACCOUNT";
	}
}
