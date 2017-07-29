package userInterface;

import java.awt.TextField;

public class AccountDescriptionTextfield extends TextField {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private NewAccountDescriptionListener accountDescriptionListener=null;
	
	public AccountDescriptionTextfield(String label) {
		// TODO Auto-generated constructor stub
		accountDescriptionListener=new NewAccountDescriptionListener();
		addTextListener(accountDescriptionListener);
		setText(label);
		setEditable(true);
	}

}
