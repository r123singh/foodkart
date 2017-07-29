package user;

import java.util.Date;

import session.Session;

public class UserMessage {

	private SimpleUser user;

	private String userMessageIdentifier;
	private String userMessageText;
	private String userMessageName;
	private Session userMessageSession;

	private int userMessageSerial;

	private Date dateCreated;
	private Date dateDelivered;

	private boolean messageInTransit;
	private boolean primaryUser;
	private boolean secondaryUser;

	public SimpleUser getUser() {
		return user;
	}

	public void setUser(SimpleUser user) {
		this.user = user;
	}

	public String getUserMessageIdentifier() {
		return userMessageIdentifier;
	}

	public void setUserMessageIdentifier(String userMessageIdentifier) {
		this.userMessageIdentifier = userMessageIdentifier;
	}

	public String getUserMessageText() {
		return userMessageText;
	}

	public void setUserMessageText(String userMessageText) {
		this.userMessageText = userMessageText;
	}

	public String getUserMessageName() {
		return userMessageName;
	}

	public void setUserMessageName(String userMessageName) {
		this.userMessageName = userMessageName;
	}

	public Session getUserMessageSession() {
		return userMessageSession;
	}

	public void setUserMessageSession(Session userMessageSession) {
		this.userMessageSession = userMessageSession;
	}

	public int getUserMessageSerial() {
		return userMessageSerial;
	}

	public void setUserMessageSerial(int userMessageSerial) {
		this.userMessageSerial = userMessageSerial;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateDelivered() {
		return dateDelivered;
	}

	public void setDateDelivered(Date dateDelivered) {
		this.dateDelivered = dateDelivered;
	}

	public boolean isMessageInTransit() {
		return messageInTransit;
	}

	public void setMessageInTransit(boolean messageInTransit) {
		this.messageInTransit = messageInTransit;
	}

	public boolean isPrimaryUser() {
		return primaryUser;
	}

	public void setPrimaryUser(boolean primaryUser) {
		this.primaryUser = primaryUser;
	}

	public boolean isSecondaryUser() {
		return secondaryUser;
	}

	public void setSecondaryUser(boolean secondaryUser) {
		this.secondaryUser = secondaryUser;
	}

}
