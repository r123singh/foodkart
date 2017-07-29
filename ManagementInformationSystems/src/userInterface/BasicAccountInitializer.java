package userInterface;

import data.AccountDataLoader;


public class BasicAccountInitializer {
	
	public BasicAccountInitializer() {
		// TODO Auto-generated constructor stub
	}

	public void initializeAccountDialog(BasicFrame basicFrame, String command) {
		// TODO Auto-generated method stub
		BasicAccountDialog.loadAllBasicDialogStrings();

		if (command.equals(BasicMenuItem.ADD_ACCOUNT_COMMAND)) {
			
			BasicAddAccountDialogInit accountDialogInit = new BasicAddAccountDialogInit();
			accountDialogInit.initializeAccountDialog(basicFrame);
			
		} else if (command.equals(BasicMenuItem.VIEW_ACCOUNT_COMMAND)) {
			
			BasicViewAccountDialogInit accountDialogInit = new BasicViewAccountDialogInit();
			accountDialogInit.initializeAccountDialog(basicFrame,AccountDataLoader.getAccountVector());
			
		}
	}

}
