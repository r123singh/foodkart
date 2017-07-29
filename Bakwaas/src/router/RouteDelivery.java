package router;

import java.util.Date;

import user.SimpleUser;

public class RouteDelivery {

	private String messageString;
	private int delvieryIdentifier;
	private String description;
	private SimpleUser initiator;
	private SimpleUser reciever;
	private boolean started;
	private boolean completed;
	private Date deliveryDate;
	private String deliveryComments;
	private String routeName;
	private String routeIdentifier;
	private String sessionIdentifier;
	private String serverName;

	public String getMessageString() {
		return messageString;
	}

	public void setMessageString(String messageString) {
		this.messageString = messageString;
	}

	public int getDelvieryIdentifier() {
		return delvieryIdentifier;
	}

	public void setDelvieryIdentifier(int delvieryIdentifier) {
		this.delvieryIdentifier = delvieryIdentifier;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public SimpleUser getInitiator() {
		return initiator;
	}

	public void setInitiator(SimpleUser initiator) {
		this.initiator = initiator;
	}

	public SimpleUser getReciever() {
		return reciever;
	}

	public void setReciever(SimpleUser reciever) {
		this.reciever = reciever;
	}

	public boolean isStarted() {
		return started;
	}

	public void setStarted(boolean started) {
		this.started = started;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getDeliveryComments() {
		return deliveryComments;
	}

	public void setDeliveryComments(String deliveryComments) {
		this.deliveryComments = deliveryComments;
	}

	public String getRouteName() {
		return routeName;
	}

	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}

	public String getRouteIdentifier() {
		return routeIdentifier;
	}

	public void setRouteIdentifier(String routeIdentifier) {
		this.routeIdentifier = routeIdentifier;
	}

	public String getSessionIdentifier() {
		return sessionIdentifier;
	}

	public void setSessionIdentifier(String sessionIdentifier) {
		this.sessionIdentifier = sessionIdentifier;
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

}
