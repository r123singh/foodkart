package userInterface;

import java.awt.Color;
import java.awt.Label;

public class AccountNameLabel extends Label {
	private static final long serialVersionUID = 1L;

	AccountNameLabel() {
		setFont(BasicFont.getDefaultFont());
	}

	public void decorateLabel() {
		// TODO Auto-generated method stub
		this.setForeground(Color.BLACK);
	}

}
