package server;

public class ServerQueue {

	private String queueName;
	private int numberOfMessages;
	private String lastMessage;
	private int lastMessageIndex;
	private boolean messageDispatched;
	private int messagesWaiting;

	public String getQueueName() {
		return queueName;
	}

	public void setQueueName(String queueName) {
		this.queueName = queueName;
	}

	public int getNumberOfMessages() {
		return numberOfMessages;
	}

	public void setNumberOfMessages(int numberOfMessages) {
		this.numberOfMessages = numberOfMessages;
	}

	public String getLastMessage() {
		return lastMessage;
	}

	public void setLastMessage(String lastMessage) {
		this.lastMessage = lastMessage;
	}

	public int getLastMessageIndex() {
		return lastMessageIndex;
	}

	public void setLastMessageIndex(int lastMessageIndex) {
		this.lastMessageIndex = lastMessageIndex;
	}

	public boolean isMessageDispatched() {
		return messageDispatched;
	}

	public void setMessageDispatched(boolean messageDispatched) {
		this.messageDispatched = messageDispatched;
	}

	public int getMessagesWaiting() {
		return messagesWaiting;
	}

	public void setMessagesWaiting(int messagesWaiting) {
		this.messagesWaiting = messagesWaiting;
	}

}
