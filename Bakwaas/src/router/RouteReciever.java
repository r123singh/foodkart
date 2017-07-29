package router;

import java.util.Date;

import user.SimpleUser;

public class RouteReciever {

	private SimpleUser recieverUser;
	private String routeIdentifier;
	private int routeRecieverSerialNumber;
	private boolean currentlySending;
	private boolean waiting;
	private boolean sleeping;
	private boolean activeUser;
	private boolean passiveUser;
	private String nodeName;
	private Date recieverStarted;
	private String messageText;

	public SimpleUser getRecieverUser() {
		return recieverUser;
	}

	public void setRecieverUser(SimpleUser recieverUser) {
		this.recieverUser = recieverUser;
	}

	public String getRouteIdentifier() {
		return routeIdentifier;
	}

	public void setRouteIdentifier(String routeIdentifier) {
		this.routeIdentifier = routeIdentifier;
	}

	public int getRouteRecieverSerialNumber() {
		return routeRecieverSerialNumber;
	}

	public void setRouteRecieverSerialNumber(int routeRecieverSerialNumber) {
		this.routeRecieverSerialNumber = routeRecieverSerialNumber;
	}

	public boolean isCurrentlySending() {
		return currentlySending;
	}

	public void setCurrentlySending(boolean currentlySending) {
		this.currentlySending = currentlySending;
	}

	public boolean isWaiting() {
		return waiting;
	}

	public void setWaiting(boolean waiting) {
		this.waiting = waiting;
	}

	public boolean isSleeping() {
		return sleeping;
	}

	public void setSleeping(boolean sleeping) {
		this.sleeping = sleeping;
	}

	public boolean isActiveUser() {
		return activeUser;
	}

	public void setActiveUser(boolean activeUser) {
		this.activeUser = activeUser;
	}

	public boolean isPassiveUser() {
		return passiveUser;
	}

	public void setPassiveUser(boolean passiveUser) {
		this.passiveUser = passiveUser;
	}

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public Date getRecieverStarted() {
		return recieverStarted;
	}

	public void setRecieverStarted(Date recieverStarted) {
		this.recieverStarted = recieverStarted;
	}

	public String getMessageText() {
		return messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

}
