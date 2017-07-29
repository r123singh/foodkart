package userInterface;

import java.awt.ComponentOrientation;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import account.AccountAddProcessor;

public class AccountAddButtonActionListener implements ActionListener {

	AccountAddMessageDialog accountAddMessageDialog = null;

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String dialogMessageDisplayed = null;

		if (e.getID() == ActionEvent.ACTION_PERFORMED) {
			if (AccountAddProcessor.getAccountAddProcessor()
					.processAddAccount()) {
				dialogMessageDisplayed = AccountAddMessageDialog.ACCOUNT_SUCCESSFUL_MSG;
			} else {
				dialogMessageDisplayed = AccountAddMessageDialog.ACCOUNT_FAILURE_MSG;
			}

			constructMessageDialog(
					AccountAddMessageDialog.ACCOUNT_ADD_MESSAGE_DIALOG_TITLE,
					BasicAccountDialog.BASIC_DIALOG_LABEL_ADD_ACCOUNT_STRING);
			doLayoutDefaultDialog();
			initializeMessageDialogItems(dialogMessageDisplayed);

			accountAddMessageDialog.layoutDialog();
			accountAddMessageDialog.setResizable(false);
			accountAddMessageDialog.setVisible(true);
		}
	}

	private void initializeMessageDialogItems(String messageDisplayed) {
		// TODO Auto-generated method stub
		constructDialogMessageLabelItem(messageDisplayed);
	}

	private void constructDialogMessageLabelItem(String messageDisplayed) {
		// TODO Auto-generated method stub
		AccountAddMessageDialogLabel label = new AccountAddMessageDialogLabel();
		label.setText(messageDisplayed);
		accountAddMessageDialog.add(label);
	}

	private void doLayoutDefaultDialog() {
		// TODO Auto-generated method stub
		accountAddMessageDialog
				.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		GridLayout gridLayout = new GridLayout(
				AccountAddMessageDialog.GRID_ROWS,
				AccountAddMessageDialog.GRID_COLUMNS,
				AccountAddMessageDialog.HGAP, AccountAddMessageDialog.VGAP);
		accountAddMessageDialog.setLayout(gridLayout);
	}

	private void constructMessageDialog(String label, String ownerLabel) {
		// TODO Auto-generated method stub
		BasicAccountDialog ownerDialog = (BasicAccountDialog) AllBasicUIComponents
				.getUIMapInstance().get(ownerLabel);

		accountAddMessageDialog = new AccountAddMessageDialog(ownerDialog,
				label);
		AllBasicUIComponents.getUIMapInstance().put(label,
				accountAddMessageDialog);
		accountAddMessageDialog.setFont(BasicFont.getDefaultFont());
	}
}
