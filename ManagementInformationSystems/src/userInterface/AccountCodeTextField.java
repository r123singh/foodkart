package userInterface;

import java.awt.TextField;

public class AccountCodeTextField extends TextField {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private NewAccountCodeTextListener accountCodeTextListener = null;

	public AccountCodeTextField(String label) {
		accountCodeTextListener = new NewAccountCodeTextListener();
		addTextListener(accountCodeTextListener);
		setText(label);
		setEditable(true);
	}

}
