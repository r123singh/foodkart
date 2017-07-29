package userInterface;

import java.awt.Color;
import java.awt.Label;

public class LoginPasswordLabel extends Label{
	
	 
		private static final long serialVersionUID = 1L;

		public LoginPasswordLabel() {
			// TODO Auto-generated constructor stub

		}

		private int loginLabelHeight = 10;
		private int loginLabelWidth = 110;
		private int loginLabelLocationX;
		private int loginLabelLocationY;

		private static String loginPasswordLabelString = "PASSWORD";

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

		LoginPasswordLabel(BasicFrame parent) {
			loginLabelLocationX = parent.getBounds().x + parent.getWidth() / 5;
			loginLabelLocationY = parent.getBounds().y + 150;
			loginLabelHeight = LoginLabelFont.getLoginFontSize();
			setBounds(loginLabelLocationX, loginLabelLocationY, loginLabelWidth,loginLabelHeight);
			setText(loginPasswordLabelString);
			setFont(LoginLabelFont.getLogintFont());
		}

		public void decorateLabel() {
			// TODO Auto-generated method stub
			this.setForeground(Color.black);
			this.setBackground(Color.LIGHT_GRAY);
		}

}
