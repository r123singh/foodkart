package userInterface;

import java.awt.Button;
import java.awt.Color;

public class AccountMessageOkButton extends Button{
	private static final long serialVersionUID = 1L;
	private AccountMessageOkButtonActionListener okButtonActionListener = null;

	public AccountMessageOkButton(String label) {
		okButtonActionListener=new AccountMessageOkButtonActionListener();
		setLabel(label);
		addActionListener(okButtonActionListener);
	}

	public void decorateButton() {
		// TODO Auto-generated method stub
		this.setForeground(Color.BLACK);
		this.setBackground(Color.LIGHT_GRAY);
	}

}
