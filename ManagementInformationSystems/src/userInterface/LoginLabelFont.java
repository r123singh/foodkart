package userInterface;

import java.awt.Font;

public class LoginLabelFont extends BasicFont {

	private static String loginFontName = "Times New Roman";

	private static int loginStyle = Font.PLAIN;

	private static int loginFontSize = 18;

	public static int getLoginFontSize() {
		return loginFontSize;
	}

	public static void setLoginFontSize(int loginFontSize) {
		LoginLabelFont.loginFontSize = loginFontSize;
	}

	public LoginLabelFont(String name, int style, int size) {
		super(name, style, size);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static BasicFont getLogintFont() {
		BasicFont defaultFont = new BasicFont(loginFontName, loginStyle, loginFontSize);
		return defaultFont;
	}

}
