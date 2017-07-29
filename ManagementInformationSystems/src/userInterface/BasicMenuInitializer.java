package userInterface;

public class BasicMenuInitializer {
	private BasicFrame basicFrame;
	private BasicMenuBar basicMenuBar;
	private BasicMenuItemActionListener actionListener;

	public void initializeBasicMenu(BasicFrame basicFrame) {
		// TODO Auto-generated method stub
		setBasicFrame(basicFrame);
		initializeDefaultMenuBar();

		BasicMenu.loadAllBasicMenuStrings();
		// calling the method creating basic menu
		constructDefaultMenu(BasicMenu.BASIC_MENU_LABEL_LOGIN_STRING);
		constructDefaultMenu(BasicMenu.BASIC_MENU_LABEL_ACCOUNT_STRING);
		constructDefaultMenu(BasicMenu.BASIC_MENU_TRANSACTIONS_ACCOUNT_STRING);

		initializeBasicMenuItems();
		// calling the method format basic menu
	}

	private void initializeDefaultMenuBar() {
		// TODO Auto-generated method stub
		BasicMenuBar basicMenuBar = new BasicMenuBar(this.getBasicFrame());
		setBasicMenuBar(basicMenuBar);
	}

	private void initializeBasicMenuItems() {
		// TODO Auto-generated method stub
		BasicMenuItem.loadAllBasicMenuItemStrings();
		constructDefaultMenuItem(
				(BasicMenu) AllBasicUIComponents.getAllUIComponentsMap().get(
						BasicMenu.BASIC_MENU_LABEL_ACCOUNT_STRING),
				BasicMenuItem.BASIC_MENU_ITEM_VIEW_ACCOUNT_STRING,BasicMenuItem.VIEW_ACCOUNT_COMMAND);
		constructDefaultMenuItem(
				(BasicMenu) AllBasicUIComponents.getAllUIComponentsMap().get(
						BasicMenu.BASIC_MENU_LABEL_ACCOUNT_STRING),
				BasicMenuItem.BASIC_MENU_ITEM_ADD_ACCOUNT_STRING,BasicMenuItem.ADD_ACCOUNT_COMMAND);
	}

	private void formatDefaultMenu(BasicMenu basicMenu) {
		// TODO Auto-generated method stub
		BasicFont basicFont = BasicFont.getDefaultFont();
		basicMenu.setFont(basicFont);
	}

	private BasicMenu constructDefaultMenu(String label) {
		// creating the object of basic menu to hold the basic menu bar
		BasicMenu basicMenu = null;
		if (label == null) {
			basicMenu = new BasicMenu(BasicMenu.BASIC_MENU_LABEL_DEFAULT_STRING);
		} else {
			basicMenu = new BasicMenu(label);
		}
		addToDefaultMenuBar(basicMenu);
		enableBasicMenu(basicMenu);
		formatDefaultMenu(basicMenu);
		AllBasicUIComponents.getUIMapInstance().put(label, basicMenu);
		return basicMenu;
	}

	private void addToDefaultMenuBar(BasicMenu basicMenu) {
		// TODO Auto-generated method stub
		getBasicMenuBar().add(basicMenu);
	}

	private void enableBasicMenu(BasicMenu basicMenu) {
		// TODO Auto-generated method stub
		basicMenu.setEnabled(true);
	}

	private void constructDefaultMenuItem(BasicMenu basicMenu, String label, String commandString) {
		// TODO Auto-generated method stub
		// creating the basic menu item
		actionListener=new BasicMenuItemActionListener();
		BasicMenuItem basicMenuItem = new BasicMenuItem();
		if (label == null) {
			basicMenuItem
					.setLabel(BasicMenuItem.BASIC_MENU_ITEM_DEFAULT_STRING);
		} else {
			basicMenuItem.setLabel(label);
		}

		basicMenuItem.setEnabled(true);
		basicMenuItem.setActionCommand(commandString);
		basicMenuItem.addActionListener(actionListener);
		basicMenu.add(basicMenuItem);

	}

	private BasicFrame getBasicFrame() {
		return basicFrame;
	}

	private void setBasicFrame(BasicFrame basicFrame) {
		this.basicFrame = basicFrame;
	}

	public BasicMenuBar getBasicMenuBar() {
		return basicMenuBar;
	}

	public void setBasicMenuBar(BasicMenuBar basicMenuBar) {
		this.basicMenuBar = basicMenuBar;
	}

}
