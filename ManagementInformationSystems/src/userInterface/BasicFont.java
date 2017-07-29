package userInterface;

import java.awt.Font;

public class BasicFont extends Font {

	private static String defaultName = "Times New Roman";

	private static int defaultStyle = Font.BOLD;

	private static int defaultSize = 12;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BasicFont(String name, int style, int size) {
		super(name, style, size);
		// TODO Auto-generated constructor stub
	}

	public static BasicFont getDefaultFont() {
		BasicFont defaultFont = new BasicFont(defaultName, defaultStyle, defaultSize);
		return defaultFont;
	}

}
