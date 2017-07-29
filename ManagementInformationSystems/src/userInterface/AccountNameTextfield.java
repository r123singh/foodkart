package userInterface;

import java.awt.TextField;

public class AccountNameTextfield extends TextField {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private NewAccountNameTextListener accountNameTextListener = null;

	public AccountNameTextfield(String label) {
		accountNameTextListener = new NewAccountNameTextListener();
		addTextListener(accountNameTextListener);
		setText(label);
		setEditable(true);
	}

}
