package router;

import java.util.Date;

public class RouteNode {

	private String nodeName;
	private String description;
	private Date nodeAdded;
	private String nodeIdenitifier;
	private String routeIdentifier;
	private RouteNode previousNode;
	private RouteNode nextNode;
	private int nodeOrderNumber;
	private String nodeSession;
	private boolean firstNode;
	private boolean lastNode;
	private boolean holdMessage;
	private boolean active;
	private boolean freeNode;

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getNodeAdded() {
		return nodeAdded;
	}

	public void setNodeAdded(Date nodeAdded) {
		this.nodeAdded = nodeAdded;
	}

	public String getNodeIdenitifier() {
		return nodeIdenitifier;
	}

	public void setNodeIdenitifier(String nodeIdenitifier) {
		this.nodeIdenitifier = nodeIdenitifier;
	}

	public String getRouteIdentifier() {
		return routeIdentifier;
	}

	public void setRouteIdentifier(String routeIdentifier) {
		this.routeIdentifier = routeIdentifier;
	}

	public RouteNode getPreviousNode() {
		return previousNode;
	}

	public void setPreviousNode(RouteNode previousNode) {
		this.previousNode = previousNode;
	}

	public RouteNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(RouteNode nextNode) {
		this.nextNode = nextNode;
	}

	public int getNodeOrderNumber() {
		return nodeOrderNumber;
	}

	public void setNodeOrderNumber(int nodeOrderNumber) {
		this.nodeOrderNumber = nodeOrderNumber;
	}

	public String getNodeSession() {
		return nodeSession;
	}

	public void setNodeSession(String nodeSession) {
		this.nodeSession = nodeSession;
	}

	public boolean isFirstNode() {
		return firstNode;
	}

	public void setFirstNode(boolean firstNode) {
		this.firstNode = firstNode;
	}

	public boolean isLastNode() {
		return lastNode;
	}

	public void setLastNode(boolean lastNode) {
		this.lastNode = lastNode;
	}

	public boolean isHoldMessage() {
		return holdMessage;
	}

	public void setHoldMessage(boolean holdMessage) {
		this.holdMessage = holdMessage;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean isFreeNode() {
		return freeNode;
	}

	public void setFreeNode(boolean freeNode) {
		this.freeNode = freeNode;
	}

}
