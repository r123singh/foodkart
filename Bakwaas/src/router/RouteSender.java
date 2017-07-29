package router;

import user.SimpleUser;

public class RouteSender {

	private String username;
	private SimpleUser senderUser;
	private SimpleUser arrivalUser;
	private String senderIdentifier;
	private String messageString;
	private String sessionIdentifier;
	private String routeDescription;
	private String nodeName;
	private boolean senderInitiated;
	private boolean messageSendInitiated;
	private boolean routerSenderWaiting;
	private String routeIdentifier;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public SimpleUser getSenderUser() {
		return senderUser;
	}

	public void setSenderUser(SimpleUser senderUser) {
		this.senderUser = senderUser;
	}

	public SimpleUser getArrivalUser() {
		return arrivalUser;
	}

	public void setArrivalUser(SimpleUser arrivalUser) {
		this.arrivalUser = arrivalUser;
	}

	public String getSenderIdentifier() {
		return senderIdentifier;
	}

	public void setSenderIdentifier(String senderIdentifier) {
		this.senderIdentifier = senderIdentifier;
	}

	public String getMessageString() {
		return messageString;
	}

	public void setMessageString(String messageString) {
		this.messageString = messageString;
	}

	public String getSessionIdentifier() {
		return sessionIdentifier;
	}

	public void setSessionIdentifier(String sessionIdentifier) {
		this.sessionIdentifier = sessionIdentifier;
	}

	public String getRouteDescription() {
		return routeDescription;
	}

	public void setRouteDescription(String routeDescription) {
		this.routeDescription = routeDescription;
	}

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public boolean isSenderInitiated() {
		return senderInitiated;
	}

	public void setSenderInitiated(boolean senderInitiated) {
		this.senderInitiated = senderInitiated;
	}

	public boolean isMessageSendInitiated() {
		return messageSendInitiated;
	}

	public void setMessageSendInitiated(boolean messageSendInitiated) {
		this.messageSendInitiated = messageSendInitiated;
	}

	public boolean isRouterSenderWaiting() {
		return routerSenderWaiting;
	}

	public void setRouterSenderWaiting(boolean routerSenderWaiting) {
		this.routerSenderWaiting = routerSenderWaiting;
	}

	public String getRouteIdentifier() {
		return routeIdentifier;
	}

	public void setRouteIdentifier(String routeIdentifier) {
		this.routeIdentifier = routeIdentifier;
	}

}
