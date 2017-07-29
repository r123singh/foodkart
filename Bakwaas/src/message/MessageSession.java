package message;

import java.util.Date;

import session.Session;
import session.SessionUsers;
import user.SimpleUser;

public class MessageSession {

	private Session messageSession;
	private SessionUsers messageSessionUsers;
	private int totalMessagesInTransit;
	private int totalActiveUsers;
	private SimpleUser initiatorUser;
	private SimpleUser secondaryUser;
	private String messageSessionIdentifier;
	private String sessionDescription;
	private Date messageSessionStart;
	private Date messageSessionClose;
	private boolean sessionActive;
	private boolean sessionPassive;
	private int sessionUsers;
	private int mSessionIdentifier;

	public Session getMessageSession() {
		return messageSession;
	}

	public void setMessageSession(Session messageSession) {
		this.messageSession = messageSession;
	}

	public SessionUsers getMessageSessionUsers() {
		return messageSessionUsers;
	}

	public void setMessageSessionUsers(SessionUsers messageSessionUsers) {
		this.messageSessionUsers = messageSessionUsers;
	}

	public int getTotalMessagesInTransit() {
		return totalMessagesInTransit;
	}

	public void setTotalMessagesInTransit(int totalMessagesInTransit) {
		this.totalMessagesInTransit = totalMessagesInTransit;
	}

	public int getTotalActiveUsers() {
		return totalActiveUsers;
	}

	public void setTotalActiveUsers(int totalActiveUsers) {
		this.totalActiveUsers = totalActiveUsers;
	}

	public SimpleUser getInitiatorUser() {
		return initiatorUser;
	}

	public void setInitiatorUser(SimpleUser initiatorUser) {
		this.initiatorUser = initiatorUser;
	}

	public SimpleUser getSecondaryUser() {
		return secondaryUser;
	}

	public void setSecondaryUser(SimpleUser secondaryUser) {
		this.secondaryUser = secondaryUser;
	}

	public String getMessageSessionIdentifier() {
		return messageSessionIdentifier;
	}

	public void setMessageSessionIdentifier(String messageSessionIdentifier) {
		this.messageSessionIdentifier = messageSessionIdentifier;
	}

	public String getSessionDescription() {
		return sessionDescription;
	}

	public void setSessionDescription(String sessionDescription) {
		this.sessionDescription = sessionDescription;
	}

	public Date getMessageSessionStart() {
		return messageSessionStart;
	}

	public void setMessageSessionStart(Date messageSessionStart) {
		this.messageSessionStart = messageSessionStart;
	}

	public Date getMessageSessionClose() {
		return messageSessionClose;
	}

	public void setMessageSessionClose(Date messageSessionClose) {
		this.messageSessionClose = messageSessionClose;
	}

	public boolean isSessionActive() {
		return sessionActive;
	}

	public void setSessionActive(boolean sessionActive) {
		this.sessionActive = sessionActive;
	}

	public boolean isSessionPassive() {
		return sessionPassive;
	}

	public void setSessionPassive(boolean sessionPassive) {
		this.sessionPassive = sessionPassive;
	}

	public int getSessionUsers() {
		return sessionUsers;
	}

	public void setSessionUsers(int sessionUsers) {
		this.sessionUsers = sessionUsers;
	}

	public int getmSessionIdentifier() {
		return mSessionIdentifier;
	}

	public void setmSessionIdentifier(int mSessionIdentifier) {
		this.mSessionIdentifier = mSessionIdentifier;
	}

}
