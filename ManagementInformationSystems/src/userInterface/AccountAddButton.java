package userInterface;

import java.awt.Button;
import java.awt.Color;

public class AccountAddButton extends Button {
	private static final long serialVersionUID = 1L;
	private AccountAddButtonActionListener accountAddButtonActionListener = null;

	public AccountAddButton(String label) {
		accountAddButtonActionListener=new AccountAddButtonActionListener();
		setLabel(label);
		addActionListener(accountAddButtonActionListener);
	}

	public void decorateButton() {
		// TODO Auto-generated method stub
		this.setForeground(Color.BLACK);
		this.setBackground(Color.LIGHT_GRAY);
	}

}
