package message;

import user.SimpleUser;

public class MessageReciver {

	private String mRecieverIdentifier;
	private String messageRecieving;
	private SimpleUser reciverUser;
	private String messageText;
	private String description;
	private String routeIdentifier;
	private String serverName;
	private String sessionIdentifier;
	private boolean reciverWaiting;
	private boolean recieverAlsoTyping;
	private int messagesInTransit;
	private int messagesRecieved;
	private int messagesSent;
	private boolean recieverActive;
	private boolean reciverPassive;

	public String getmRecieverIdentifier() {
		return mRecieverIdentifier;
	}

	public void setmRecieverIdentifier(String mRecieverIdentifier) {
		this.mRecieverIdentifier = mRecieverIdentifier;
	}

	public String getMessageRecieving() {
		return messageRecieving;
	}

	public void setMessageRecieving(String messageRecieving) {
		this.messageRecieving = messageRecieving;
	}

	public SimpleUser getReciverUser() {
		return reciverUser;
	}

	public void setReciverUser(SimpleUser reciverUser) {
		this.reciverUser = reciverUser;
	}

	public String getMessageText() {
		return messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRouteIdentifier() {
		return routeIdentifier;
	}

	public void setRouteIdentifier(String routeIdentifier) {
		this.routeIdentifier = routeIdentifier;
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public String getSessionIdentifier() {
		return sessionIdentifier;
	}

	public void setSessionIdentifier(String sessionIdentifier) {
		this.sessionIdentifier = sessionIdentifier;
	}

	public boolean isReciverWaiting() {
		return reciverWaiting;
	}

	public void setReciverWaiting(boolean reciverWaiting) {
		this.reciverWaiting = reciverWaiting;
	}

	public boolean isRecieverAlsoTyping() {
		return recieverAlsoTyping;
	}

	public void setRecieverAlsoTyping(boolean recieverAlsoTyping) {
		this.recieverAlsoTyping = recieverAlsoTyping;
	}

	public int getMessagesInTransit() {
		return messagesInTransit;
	}

	public void setMessagesInTransit(int messagesInTransit) {
		this.messagesInTransit = messagesInTransit;
	}

	public int getMessagesRecieved() {
		return messagesRecieved;
	}

	public void setMessagesRecieved(int messagesRecieved) {
		this.messagesRecieved = messagesRecieved;
	}

	public int getMessagesSent() {
		return messagesSent;
	}

	public void setMessagesSent(int messagesSent) {
		this.messagesSent = messagesSent;
	}

	public boolean isRecieverActive() {
		return recieverActive;
	}

	public void setRecieverActive(boolean recieverActive) {
		this.recieverActive = recieverActive;
	}

	public boolean isReciverPassive() {
		return reciverPassive;
	}

	public void setReciverPassive(boolean reciverPassive) {
		this.reciverPassive = reciverPassive;
	}

}
