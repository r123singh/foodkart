package chatboxUI;

import java.awt.TextArea;

public class BasicChatTextbox extends TextArea {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final int CHAT_TEXTBOX_HEIGHT = 10;
	private static final int CHAT_TEXTBOX_WIDTH = 350;

	public BasicChatTextbox(BasicChatDialog basicChatDialog) {
		// TODO Auto-generated constructor stub
	}

	public void layoutTextbox() {
		// TODO Auto-generated method stub
		this.setSize(CHAT_TEXTBOX_WIDTH, CHAT_TEXTBOX_HEIGHT);
	}

}
