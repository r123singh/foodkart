package session;

import java.util.Date;

import user.SimpleUser;

public class SessionUsers {

	private SimpleUser primaryUser;
	private SimpleUser secondaryUser;
	private String sessionIdentifier;
	private String sessionDesription;
	private int totalMessagesTransit;
	private Date sessionStart;
	private Date sessionClose;
	private int activeUsers;
	private int passiveUsers;
	private String userId1;
	private String userId2;
	private String lastMessageInTransit;
	private boolean oneUser;
	private boolean multipleUsers;
	public SimpleUser getPrimaryUser() {
		return primaryUser;
	}
	public void setPrimaryUser(SimpleUser primaryUser) {
		this.primaryUser = primaryUser;
	}
	public SimpleUser getSecondaryUser() {
		return secondaryUser;
	}
	public void setSecondaryUser(SimpleUser secondaryUser) {
		this.secondaryUser = secondaryUser;
	}
	public String getSessionIdentifier() {
		return sessionIdentifier;
	}
	public void setSessionIdentifier(String sessionIdentifier) {
		this.sessionIdentifier = sessionIdentifier;
	}
	public String getSessionDesription() {
		return sessionDesription;
	}
	public void setSessionDesription(String sessionDesription) {
		this.sessionDesription = sessionDesription;
	}
	public int getTotalMessagesTransit() {
		return totalMessagesTransit;
	}
	public void setTotalMessagesTransit(int totalMessagesTransit) {
		this.totalMessagesTransit = totalMessagesTransit;
	}
	public Date getSessionStart() {
		return sessionStart;
	}
	public void setSessionStart(Date sessionStart) {
		this.sessionStart = sessionStart;
	}
	public Date getSessionClose() {
		return sessionClose;
	}
	public void setSessionClose(Date sessionClose) {
		this.sessionClose = sessionClose;
	}
	public int getActiveUsers() {
		return activeUsers;
	}
	public void setActiveUsers(int activeUsers) {
		this.activeUsers = activeUsers;
	}
	public int getPassiveUsers() {
		return passiveUsers;
	}
	public void setPassiveUsers(int passiveUsers) {
		this.passiveUsers = passiveUsers;
	}
	public String getUserId1() {
		return userId1;
	}
	public void setUserId1(String userId1) {
		this.userId1 = userId1;
	}
	public String getUserId2() {
		return userId2;
	}
	public void setUserId2(String userId2) {
		this.userId2 = userId2;
	}
	public String getLastMessageInTransit() {
		return lastMessageInTransit;
	}
	public void setLastMessageInTransit(String lastMessageInTransit) {
		this.lastMessageInTransit = lastMessageInTransit;
	}
	public boolean isOneUser() {
		return oneUser;
	}
	public void setOneUser(boolean oneUser) {
		this.oneUser = oneUser;
	}
	public boolean isMultipleUsers() {
		return multipleUsers;
	}
	public void setMultipleUsers(boolean multipleUsers) {
		this.multipleUsers = multipleUsers;
	}

}
