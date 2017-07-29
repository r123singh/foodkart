package userInterface;

import java.awt.Color;
import java.awt.Label;

public class LoginLabel extends Label {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int loginLabelHeight = 10;
	private int loginLabelWidth = 60;
	private int loginLabelLocationX;
	private int loginLabelLocationY;

	private static String loginLabelString = "LOGIN";

	public int getLoginLabelLocationX() {
		return loginLabelLocationX;
	}

	public void setLoginLabelLocationX(int loginLabelLocationX) {
		this.loginLabelLocationX = loginLabelLocationX;
	}

	public int getLoginLabelLocationY() {
		return loginLabelLocationY;
	}

	public void setLoginLabelLocationY(int loginLabelLocationY) {
		this.loginLabelLocationY = loginLabelLocationY;
	}


	public LoginLabel() {
		// TODO Auto-generated constructor stub
	}

	LoginLabel(BasicFrame parent) {
		loginLabelLocationX = parent.getBounds().x + parent.getWidth() / 2;
		loginLabelLocationY = parent.getBounds().y + 50;
		loginLabelHeight = LoginLabelFont.getLoginFontSize();
		setBounds(loginLabelLocationX, loginLabelLocationY, loginLabelWidth,
				loginLabelHeight);
		setText(loginLabelString);
		setFont(LoginLabelFont.getLogintFont());
	}

	public void decorateLabel() {
		// TODO Auto-generated method stub
		this.setForeground(Color.BLACK);
		this.setBackground(Color.LIGHT_GRAY);
	}
}
