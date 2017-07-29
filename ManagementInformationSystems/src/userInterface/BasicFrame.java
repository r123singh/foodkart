package userInterface;

import java.awt.Color;

public class BasicFrame extends java.awt.Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private Color basicFrameColor = Color.darkGray;

	private int basicFrameWidth = 700;
	private int basicFrameHeight = 700;
	private int windowLocationX = 0;
	private int windowLocationY = 0;

	public static final String BASIC_FRAME_STRING = "BASIC_FRAME";

	public int getWindowLocationY() {
		return windowLocationY;
	}

	public void setWindowLocationY(int windowLocationY) {
		this.windowLocationY = windowLocationY;
	}

	public BasicFrame() {
		// TODO Auto-generated constructor stub
		addWindowListener(new BasicWindowListener(this));
		
		setBounds(windowLocationX, windowLocationY, basicFrameHeight,basicFrameWidth);
		setBackground(basicFrameColor);
	}
	

	public int getWindowLocationX() {
		return windowLocationX;
	}

	public void setWindowLocationX(int windowLocationX) {
		this.windowLocationX = windowLocationX;
	}

	public Color getBasicFrameColor() {
		return basicFrameColor;
	}

	public void setBasicFrameColor(Color basicFrameColor) {
		this.basicFrameColor = basicFrameColor;
	}

	public int getBasicFrameWidth() {
		return basicFrameWidth;
	}

	public void setBasicFrameWidth(int basicFrameWidth) {
		this.basicFrameWidth = basicFrameWidth;
	}

	public int getBasicFrameHeight() {
		return basicFrameHeight;
	}

	public void setBasicFrameHeight(int basicFrameHeight) {
		this.basicFrameHeight = basicFrameHeight;
	}

}
