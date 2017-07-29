package router;

import java.util.Date;

import user.SimpleUser;

public class Route {

	private SimpleUser senderUser;
	private SimpleUser recievingUser;
	private String routeName;;
	private Date setupTime;
	private boolean started;
	private boolean messageOnway;
	private boolean arrived;
	private String routeIdentifier;
	private String routeSession;
	private int messagesWaiting;
	private int messagesActive;
	private boolean activeRoute;
	private boolean deadRoute;
	private boolean oneToMany;
	private boolean oneToOne;
	private boolean manyToOne;

	public SimpleUser getSenderUser() {
		return senderUser;
	}

	public void setSenderUser(SimpleUser senderUser) {
		this.senderUser = senderUser;
	}

	public SimpleUser getRecievingUser() {
		return recievingUser;
	}

	public void setRecievingUser(SimpleUser recievingUser) {
		this.recievingUser = recievingUser;
	}

	public String getRouteName() {
		return routeName;
	}

	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}

	public Date getSetupTime() {
		return setupTime;
	}

	public void setSetupTime(Date setupTime) {
		this.setupTime = setupTime;
	}

	public boolean isStarted() {
		return started;
	}

	public void setStarted(boolean started) {
		this.started = started;
	}

	public boolean isMessageOnway() {
		return messageOnway;
	}

	public void setMessageOnway(boolean messageOnway) {
		this.messageOnway = messageOnway;
	}

	public boolean isArrived() {
		return arrived;
	}

	public void setArrived(boolean arrived) {
		this.arrived = arrived;
	}

	public String getRouteIdentifier() {
		return routeIdentifier;
	}

	public void setRouteIdentifier(String routeIdentifier) {
		this.routeIdentifier = routeIdentifier;
	}

	public String getRouteSession() {
		return routeSession;
	}

	public void setRouteSession(String routeSession) {
		this.routeSession = routeSession;
	}

	public int getMessagesWaiting() {
		return messagesWaiting;
	}

	public void setMessagesWaiting(int messagesWaiting) {
		this.messagesWaiting = messagesWaiting;
	}

	public int getMessagesActive() {
		return messagesActive;
	}

	public void setMessagesActive(int messagesActive) {
		this.messagesActive = messagesActive;
	}

	public boolean isActiveRoute() {
		return activeRoute;
	}

	public void setActiveRoute(boolean activeRoute) {
		this.activeRoute = activeRoute;
	}

	public boolean isDeadRoute() {
		return deadRoute;
	}

	public void setDeadRoute(boolean deadRoute) {
		this.deadRoute = deadRoute;
	}

	public boolean isOneToMany() {
		return oneToMany;
	}

	public void setOneToMany(boolean oneToMany) {
		this.oneToMany = oneToMany;
	}

	public boolean isOneToOne() {
		return oneToOne;
	}

	public void setOneToOne(boolean oneToOne) {
		this.oneToOne = oneToOne;
	}

	public boolean isManyToOne() {
		return manyToOne;
	}

	public void setManyToOne(boolean manyToOne) {
		this.manyToOne = manyToOne;
	}

}
