package message;

import java.util.Date;

import user.SimpleUser;

public class Message {

	private String messageText;
	private String messageDescription;
	private SimpleUser messageSender;
	private SimpleUser messageReciever;
	private Date messageDate;
	private String messageIdentifier;
	private boolean messageDelivered;
	private int messageLength;
	private String messageServerName;
	private String messageQueueName;

	public String getMessageText() {
		return messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	public String getMessageDescription() {
		return messageDescription;
	}

	public void setMessageDescription(String messageDescription) {
		this.messageDescription = messageDescription;
	}

	public SimpleUser getMessageSender() {
		return messageSender;
	}

	public void setMessageSender(SimpleUser messageSender) {
		this.messageSender = messageSender;
	}

	public SimpleUser getMessageReciever() {
		return messageReciever;
	}

	public void setMessageReciever(SimpleUser messageReciever) {
		this.messageReciever = messageReciever;
	}

	public Date getMessageDate() {
		return messageDate;
	}

	public void setMessageDate(Date messageDate) {
		this.messageDate = messageDate;
	}

	public String getMessageIdentifier() {
		return messageIdentifier;
	}

	public void setMessageIdentifier(String messageIdentifier) {
		this.messageIdentifier = messageIdentifier;
	}

	public boolean isMessageDelivered() {
		return messageDelivered;
	}

	public void setMessageDelivered(boolean messageDelivered) {
		this.messageDelivered = messageDelivered;
	}

	public int getMessageLength() {
		return messageLength;
	}

	public void setMessageLength(int messageLength) {
		this.messageLength = messageLength;
	}

	public String getMessageServerName() {
		return messageServerName;
	}

	public void setMessageServerName(String messageServerName) {
		this.messageServerName = messageServerName;
	}

	public String getMessageQueueName() {
		return messageQueueName;
	}

	public void setMessageQueueName(String messageQueueName) {
		this.messageQueueName = messageQueueName;
	}

}
