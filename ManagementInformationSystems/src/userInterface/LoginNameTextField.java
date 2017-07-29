package userInterface;

import java.awt.Color;
import java.awt.TextField;

public class LoginNameTextField extends TextField {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LoginNameTextField() {
		// TODO Auto-generated constructor stub
	}

	private int loginNameTextHeight = 10;
	private int loginNameTextWidth = 100;
	private int loginNameTextLocationX;
	private int loginNameTextLocationY;
	private LoginNameTextListener loginNameTextListener=null;
	private static String loginNameTextString = "enter the name";

	LoginNameTextField(LoginNameLabel loginNameLabel) {
		loginNameTextListener=new LoginNameTextListener();
		loginNameTextLocationX = loginNameLabel.getBounds().x
				+ loginNameLabel.getWidth() + 10;
		loginNameTextLocationY = loginNameLabel.getBounds().y;
		loginNameTextHeight = LoginLabelFont.getLoginFontSize();
		setBounds(loginNameTextLocationX, loginNameTextLocationY,
				loginNameTextWidth, loginNameTextHeight);
		setText(loginNameTextString);
		addTextListener(loginNameTextListener);
		setEditable(true);
	}

	public void decorateLabel() {
		// TODO Auto-generated method stub
		this.setForeground(Color.black);
		this.setBackground(Color.white);
	}
}
