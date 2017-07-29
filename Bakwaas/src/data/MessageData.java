package data;

public class MessageData {

	private static MessageData messageInstance;
	
	private String currentMessage;
	private String finalMessage;
	private boolean messageBlank;

	public String getCurrentMessage() {
		return currentMessage;
	}

	public void setCurrentMessage(String currentMessage) {
		this.currentMessage = currentMessage;
	}

	public String getFinalMessage() {
		return finalMessage;
	}

	public void setFinalMessage(String finalMessage) {
		this.finalMessage = finalMessage;
	}

	public boolean isMessageBlank() {
		return messageBlank;
	}

	public void setMessageBlank(boolean messageBlank) {
		this.messageBlank = messageBlank;
	}

	public static MessageData getMessageInstance() {
		if (messageInstance == null) {
			messageInstance = new MessageData();
		}
		return messageInstance;
	}

	
}
