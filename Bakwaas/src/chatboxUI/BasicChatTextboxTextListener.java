package chatboxUI;

import java.awt.event.TextEvent;
import java.awt.event.TextListener;

import data.MessageData;

public class BasicChatTextboxTextListener implements TextListener {
	
	private static final String EMPTY_STRING = null;


	public void textValueChanged(TextEvent t) {
		// TODO Auto-generated method stub
		if (t.getID() == TextEvent.TEXT_VALUE_CHANGED) {
			BasicChatTextbox basicChatTextbox=(BasicChatTextbox) t.getSource();
			MessageData.getMessageInstance().setCurrentMessage(basicChatTextbox.getText());
			MessageData.getMessageInstance().setFinalMessage(EMPTY_STRING);
			if (basicChatTextbox.getText().equals(EMPTY_STRING)&& basicChatTextbox.getText().isEmpty()) {
				MessageData.getMessageInstance().setMessageBlank(true);
			} else {
				if (basicChatTextbox.getText().trim().isEmpty()) {
					MessageData.getMessageInstance().setMessageBlank(true);
				} else {
					MessageData.getMessageInstance().setMessageBlank(false);
				}
			}
		}
	}

}
