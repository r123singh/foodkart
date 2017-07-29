package chatboxUI;

import java.awt.TextArea;

public class BasicChatArea extends TextArea {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final int VIEW_HEIGHT = 300;
	private static final int VIEW_WIDTH = 350;

	public static final boolean EDIT_DISABLED = false;

	public BasicChatArea() {
		// TODO Auto-generated constructor stub
	}

	public void layoutView() {
		// TODO Auto-generated method stub
		this.setSize(VIEW_WIDTH, VIEW_HEIGHT);
	}

}
