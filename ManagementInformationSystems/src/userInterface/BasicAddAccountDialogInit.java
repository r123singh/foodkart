package userInterface;

import java.awt.ComponentOrientation;
import java.awt.GridLayout;

public class BasicAddAccountDialogInit {
	private BasicFrame basicFrame;
	private static BasicAccountDialog basicAccountDialog;

	public void initializeAccountDialog(BasicFrame basicFrame) {
		// TODO Auto-generated method stub
		setBasicFrame(basicFrame);

		BasicAccountDialog.loadAllBasicDialogStrings();
		// calling the method creating basic menu
		constructDefaultDialog(BasicAccountDialog.BASIC_DIALOG_LABEL_ADD_ACCOUNT_STRING);

		doLayoutDefaultDialog();

		initializeAccountDialogItems();

		basicAccountDialog.layoutDialog();
		basicAccountDialog.setResizable(false);
		basicAccountDialog.setVisible(true);
	}

	private void doLayoutDefaultDialog() {
		// TODO Auto-generated method stub
		basicAccountDialog
				.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		GridLayout gridLayout = new GridLayout(BasicAccountDialog.GRID_ROWS,
				BasicAccountDialog.GRID_COLUMNS, BasicAccountDialog.HGAP,
				BasicAccountDialog.VGAP);
		basicAccountDialog.setLayout(gridLayout);
	}

	private void initializeAccountDialogItems() {
		// TODO Auto-generated method stub
		constructDefaultDialogAccountCodeLabelItem(BasicAccountDialog.BASIC_DIALOG_LABEL_ACCOUNT_CODE_STRING);
		constructDefaultDialogTextCode(BasicAccountDialog.BASIC_DIALOG_TEXT_ACCOUNT_CODE_STRING);
		constructDefaultDialogAccountNameLabelItem(BasicAccountDialog.BASIC_DIALOG_LABEL_ACCOUNT_NAME_STRING);
		constructDefaultDialogTextName(BasicAccountDialog.BASIC_DIALOG_TEXT_ACCOUNT_NAME_STRING);

		constructDefaultDialogAccountDescriptionLabelItem(BasicAccountDialog.BASIC_DIALOG_LABEL_ACCOUNT_DESCRIPTION_STRING);
		constructDefaultDialogTextDescription(BasicAccountDialog.BASIC_DIALOG_TEXT_ACCOUNT_DESCRIPTION_STRING);

		constructDefaultDialogAccountAddButton(BasicAccountDialog.BASIC_DIALOG_BUTTON_ACCOUNT_ADD_STRING);
	}

	private void constructDefaultDialogAccountAddButton(String label) {
		// TODO Auto-generated method stub
		AccountAddButton accountAddButton = new AccountAddButton(label);
		basicAccountDialog.add(accountAddButton);
		AllBasicUIComponents.getAllUIComponentsMap().put("ACCOUNT_ADD_BUTTON",
				accountAddButton);

	}

	private void constructDefaultDialogTextDescription(String text) {
		// TODO Auto-generated method stub
		AccountDescriptionTextfield descriptionTextfield = new AccountDescriptionTextfield(
				text);
		basicAccountDialog.add(descriptionTextfield);
	}

	private void constructDefaultDialogAccountDescriptionLabelItem(String label) {
		// TODO Auto-generated method stub
		AccountDescriptionLabel accountDescriptionLabel = new AccountDescriptionLabel();
		if (label == null) {
			accountDescriptionLabel
					.setText(BasicAccountDialog.BASIC_DIALOG_LABEL_ACCOUNT_DESCRIPTION_STRING);
		} else {
			accountDescriptionLabel.setText(label);
		}
		basicAccountDialog.add(accountDescriptionLabel);
	}

	private void constructDefaultDialogTextName(String text) {
		// TODO Auto-generated method stub
		AccountNameTextfield nameTextfield = new AccountNameTextfield(text);
		basicAccountDialog.add(nameTextfield);
	}

	private void constructDefaultDialogAccountNameLabelItem(String label) {
		// TODO Auto-generated method stub
		AccountNameLabel nameLabel = new AccountNameLabel();
		if (label == null) {
			nameLabel
					.setText(BasicAccountDialog.BASIC_DIALOG_LABEL_DEFAULT_ITEM_STRING);
		} else {
			nameLabel.setText(label);
		}
		basicAccountDialog.add(nameLabel);
	}

	private void constructDefaultDialogTextCode(String text) {
		// TODO Auto-generated method stub
		AccountCodeTextField codeTextField = new AccountCodeTextField(text);
		basicAccountDialog.add(codeTextField);
	}

	private void constructDefaultDialogAccountCodeLabelItem(String label) {
		// creating the basic dialog item
		AccountCodeLabel codeLabel = new AccountCodeLabel();
		if (label == null) {
			codeLabel
					.setText(BasicAccountDialog.BASIC_DIALOG_LABEL_DEFAULT_ITEM_STRING);
		} else {
			codeLabel.setText(label);
		}
		basicAccountDialog.add(codeLabel);
	}

	private void constructDefaultDialog(String label) {
		// creating the object of basic dialog
		BasicAccountDialog accountDialog = null;
		if (label == null) {
			accountDialog = new BasicAccountDialog(getBasicFrame(),
					BasicAccountDialog.BASIC_DIALOG_LABEL_DEFAULT_STRING, true,
					null);
		} else {
			accountDialog = new BasicAccountDialog(getBasicFrame(), label,
					true, null);
		}
		AllBasicUIComponents.getUIMapInstance().put(label, accountDialog);
		accountDialog.setFont(BasicFont.getDefaultFont());
		basicAccountDialog = accountDialog;
	}

	private BasicFrame getBasicFrame() {
		return basicFrame;
	}

	void setBasicFrame(BasicFrame basicFrame) {
		this.basicFrame = basicFrame;
	}
}
