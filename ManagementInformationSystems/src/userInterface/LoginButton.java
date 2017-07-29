package userInterface;

import java.awt.Button;
import java.awt.Color;

public class LoginButton extends Button {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final String LOGIN_BUTTON_LABEL = "Login";

	private int loginButtonHeight = 10;
	private int loginButtonWidth = 60;
	private int loginButtonLocationX;
	private int loginButtonLocationY;
	private LoginButtonActionListener loginButtonActionListener;


	public int getLoginLabelLocationX() {
		return loginButtonLocationX;
	}

	public void setLoginLabelLocationX(int loginLabelLocationX) {
		this.loginButtonLocationX = loginLabelLocationX;
	}

	public int getLoginLabelLocationY() {
		return loginButtonLocationY;
	}

	public void setLoginLabelLocationY(int loginLabelLocationY) {
		this.loginButtonLocationY = loginLabelLocationY;
	}

	public LoginButton(BasicFrame parent) {
		loginButtonActionListener=new LoginButtonActionListener();
		loginButtonLocationX = parent.getBounds().x + parent.getWidth() / 2;
		loginButtonLocationY = parent.getBounds().y + 200;
		loginButtonHeight = LoginLabelFont.getLoginFontSize();
		setBounds(loginButtonLocationX, loginButtonLocationY, loginButtonWidth,
				loginButtonHeight);
		setLabel(LOGIN_BUTTON_LABEL);
		addActionListener(loginButtonActionListener);
	}

	public void decorateButton() {
		// TODO Auto-generated method stub
		this.setForeground(Color.BLACK);
		this.setBackground(Color.LIGHT_GRAY);
	}

}
