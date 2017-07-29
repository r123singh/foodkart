package userInterface;

import java.awt.Color;
import java.awt.Label;

public class LoginNameLabel extends Label {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LoginNameLabel() {
		// TODO Auto-generated constructor stub

	}

	private int loginLabelHeight = 10;
	private int loginLabelWidth = 60;
	private int loginLabelLocationX;
	private int loginLabelLocationY;

	private static String loginNameLabelString = "NAME";

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

	LoginNameLabel(BasicFrame parent) {
		loginLabelLocationX = parent.getBounds().x + parent.getWidth() / 4;
		loginLabelLocationY = parent.getBounds().y + 100;
		loginLabelHeight = LoginLabelFont.getLoginFontSize();
		setBounds(loginLabelLocationX, loginLabelLocationY, loginLabelWidth,loginLabelHeight);
		setText(loginNameLabelString);
		setFont(LoginLabelFont.getLogintFont());
	}

	public void decorateLabel() {
		// TODO Auto-generated method stub
		this.setForeground(Color.black);
		this.setBackground(Color.LIGHT_GRAY);
	}

}
