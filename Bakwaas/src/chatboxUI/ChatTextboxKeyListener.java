package chatboxUI;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import data.DataNotifyUpdate;

public class ChatTextboxKeyListener implements KeyListener {

	public static final String EMPTY_STRING = null;
	public static final String NEW_LINE = "\n";

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == 10) {
			BasicChatTextbox chatTextbox = (BasicChatTextbox) e.getSource();
			if (DataNotifyUpdate.bufferMessageInstance(chatTextbox.getText())) {
				DataNotifyUpdate.updateAllChatviewScreen(chatTextbox.getText());
			}
			chatTextbox.setText(EMPTY_STRING);
		}
	}

}
