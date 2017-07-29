package session;

import java.util.Date;

public class Session {

	private String sessionName;
	private String sessionDescription;
	private boolean active;
	private boolean passive;
	private boolean sleep;
	private int numberUsers;
	private int activeUsers;
	private int sessionIdentifier;
	private Date sessionStart;
	private Date sessionEnd;

	public String getSessionName() {
		return sessionName;
	}

	public void setSessionName(String sessionName) {
		this.sessionName = sessionName;
	}

	public String getSessionDescription() {
		return sessionDescription;
	}

	public void setSessionDescription(String sessionDescription) {
		this.sessionDescription = sessionDescription;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean isPassive() {
		return passive;
	}

	public void setPassive(boolean passive) {
		this.passive = passive;
	}

	public boolean isSleep() {
		return sleep;
	}

	public void setSleep(boolean sleep) {
		this.sleep = sleep;
	}

	public int getNumberUsers() {
		return numberUsers;
	}

	public void setNumberUsers(int numberUsers) {
		this.numberUsers = numberUsers;
	}

	public int getActiveUsers() {
		return activeUsers;
	}

	public void setActiveUsers(int activeUsers) {
		this.activeUsers = activeUsers;
	}

	public int getSessionIdentifier() {
		return sessionIdentifier;
	}

	public void setSessionIdentifier(int sessionIdentifier) {
		this.sessionIdentifier = sessionIdentifier;
	}

	public Date getSessionStart() {
		return sessionStart;
	}

	public void setSessionStart(Date sessionStart) {
		this.sessionStart = sessionStart;
	}

	public Date getSessionEnd() {
		return sessionEnd;
	}

	public void setSessionEnd(Date sessionEnd) {
		this.sessionEnd = sessionEnd;
	}

}
