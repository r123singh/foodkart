package userInterface;

import java.awt.Color;
import java.awt.TextField;

public class LoginPasswordTextField extends TextField {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int loginPasswordTextHeight = 10;
	private int loginPasswordTextWidth = 100;
	private int loginPasswordTextLocationX;
	private int loginPasswordTextLocationY;
	private char passwordEchoCharacter = '*';
	private LoginPasswordTextListener passwordTextListener=null;

	private static String loginPasswordTextString = "password";

	
	public LoginPasswordTextField(LoginPasswordLabel loginPasswordLabel) {
		passwordTextListener=new LoginPasswordTextListener();
		loginPasswordTextLocationX = loginPasswordLabel.getBounds().x
				+ loginPasswordLabel.getWidth() + 10;
		loginPasswordTextLocationY = loginPasswordLabel.getBounds().y;
		loginPasswordTextHeight = LoginLabelFont.getLoginFontSize();
		setBounds(loginPasswordTextLocationX, loginPasswordTextLocationY,
				loginPasswordTextWidth, loginPasswordTextHeight);
		setEchoChar(passwordEchoCharacter);
		setText(loginPasswordTextString);
		addTextListener(passwordTextListener);
		setEditable(true);
	}

	public void decorateLabel() {
		// TODO Auto-generated method stub
		this.setForeground(Color.black);
		this.setBackground(Color.white);
	}

}
