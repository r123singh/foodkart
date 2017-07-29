package message;

import user.SimpleUser;

public class MessageInitiator {

	private String mInitiateIndetifier;
	private String messageText;
	private String username;
	private String description;
	private boolean initiated;
	private boolean initiatorWaiting;
	private boolean activeInitiator;
	private boolean passiveInitiator;
	private int numberOfMessagesTransit;
	private int messagesSent;
	private int messagesRecieved;
	private int sessionMessagesSent;
	private int sessionMessagesRecieved;
	private SimpleUser initiatorUser;
	private String lastMessageSent;
	private boolean initiatorTyping;

	public String getmInitiateIndetifier() {
		return mInitiateIndetifier;
	}

	public void setmInitiateIndetifier(String mInitiateIndetifier) {
		this.mInitiateIndetifier = mInitiateIndetifier;
	}

	public String getMessageText() {
		return messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isInitiated() {
		return initiated;
	}

	public void setInitiated(boolean initiated) {
		this.initiated = initiated;
	}

	public boolean isInitiatorWaiting() {
		return initiatorWaiting;
	}

	public void setInitiatorWaiting(boolean initiatorWaiting) {
		this.initiatorWaiting = initiatorWaiting;
	}

	public boolean isActiveInitiator() {
		return activeInitiator;
	}

	public void setActiveInitiator(boolean activeInitiator) {
		this.activeInitiator = activeInitiator;
	}

	public boolean isPassiveInitiator() {
		return passiveInitiator;
	}

	public void setPassiveInitiator(boolean passiveInitiator) {
		this.passiveInitiator = passiveInitiator;
	}

	public int getNumberOfMessagesTransit() {
		return numberOfMessagesTransit;
	}

	public void setNumberOfMessagesTransit(int numberOfMessagesTransit) {
		this.numberOfMessagesTransit = numberOfMessagesTransit;
	}

	public int getMessagesSent() {
		return messagesSent;
	}

	public void setMessagesSent(int messagesSent) {
		this.messagesSent = messagesSent;
	}

	public int getMessagesRecieved() {
		return messagesRecieved;
	}

	public void setMessagesRecieved(int messagesRecieved) {
		this.messagesRecieved = messagesRecieved;
	}

	public int getSessionMessagesSent() {
		return sessionMessagesSent;
	}

	public void setSessionMessagesSent(int sessionMessagesSent) {
		this.sessionMessagesSent = sessionMessagesSent;
	}

	public int getSessionMessagesRecieved() {
		return sessionMessagesRecieved;
	}

	public void setSessionMessagesRecieved(int sessionMessagesRecieved) {
		this.sessionMessagesRecieved = sessionMessagesRecieved;
	}

	public SimpleUser getInitiatorUser() {
		return initiatorUser;
	}

	public void setInitiatorUser(SimpleUser initiatorUser) {
		this.initiatorUser = initiatorUser;
	}

	public String getLastMessageSent() {
		return lastMessageSent;
	}

	public void setLastMessageSent(String lastMessageSent) {
		this.lastMessageSent = lastMessageSent;
	}

	public boolean isInitiatorTyping() {
		return initiatorTyping;
	}

	public void setInitiatorTyping(boolean initiatorTyping) {
		this.initiatorTyping = initiatorTyping;
	}

}
