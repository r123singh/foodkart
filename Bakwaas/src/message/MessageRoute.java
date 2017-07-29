package message;

import java.util.Date;

import router.Route;
import user.SimpleUser;

public class MessageRoute {

	private int messageRouteSerialNumber;
	private String mRouteIdentifier;
	private Route messageRoute;
	private String routeName;
	private String messageRouteSessionId;
	private String messageText;
	private MessageInitiator routeIntitiator;
	private MessageReciver messageReciver;
	private String mRouteDescription;
	private boolean mRouteActive;
	private boolean mRoutePassive;
	private boolean totalMessagesTransit;
	private SimpleUser mRouteFirstUser;
	private SimpleUser mRouteLastUser;
	private Date mRTouteDate;

	public int getMessageRouteSerialNumber() {
		return messageRouteSerialNumber;
	}

	public void setMessageRouteSerialNumber(int messageRouteSerialNumber) {
		this.messageRouteSerialNumber = messageRouteSerialNumber;
	}

	public String getmRouteIdentifier() {
		return mRouteIdentifier;
	}

	public void setmRouteIdentifier(String mRouteIdentifier) {
		this.mRouteIdentifier = mRouteIdentifier;
	}

	public Route getMessageRoute() {
		return messageRoute;
	}

	public void setMessageRoute(Route messageRoute) {
		this.messageRoute = messageRoute;
	}

	public String getRouteName() {
		return routeName;
	}

	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}

	public String getMessageRouteSessionId() {
		return messageRouteSessionId;
	}

	public void setMessageRouteSessionId(String messageRouteSessionId) {
		this.messageRouteSessionId = messageRouteSessionId;
	}

	public String getMessageText() {
		return messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	public MessageInitiator getRouteIntitiator() {
		return routeIntitiator;
	}

	public void setRouteIntitiator(MessageInitiator routeIntitiator) {
		this.routeIntitiator = routeIntitiator;
	}

	public MessageReciver getMessageReciver() {
		return messageReciver;
	}

	public void setMessageReciver(MessageReciver messageReciver) {
		this.messageReciver = messageReciver;
	}

	public String getmRouteDescription() {
		return mRouteDescription;
	}

	public void setmRouteDescription(String mRouteDescription) {
		this.mRouteDescription = mRouteDescription;
	}

	public boolean ismRouteActive() {
		return mRouteActive;
	}

	public void setmRouteActive(boolean mRouteActive) {
		this.mRouteActive = mRouteActive;
	}

	public boolean ismRoutePassive() {
		return mRoutePassive;
	}

	public void setmRoutePassive(boolean mRoutePassive) {
		this.mRoutePassive = mRoutePassive;
	}

	public boolean isTotalMessagesTransit() {
		return totalMessagesTransit;
	}

	public void setTotalMessagesTransit(boolean totalMessagesTransit) {
		this.totalMessagesTransit = totalMessagesTransit;
	}

	public SimpleUser getmRouteFirstUser() {
		return mRouteFirstUser;
	}

	public void setmRouteFirstUser(SimpleUser mRouteFirstUser) {
		this.mRouteFirstUser = mRouteFirstUser;
	}

	public SimpleUser getmRouteLastUser() {
		return mRouteLastUser;
	}

	public void setmRouteLastUser(SimpleUser mRouteLastUser) {
		this.mRouteLastUser = mRouteLastUser;
	}

	public Date getmRTouteDate() {
		return mRTouteDate;
	}

	public void setmRTouteDate(Date mRTouteDate) {
		this.mRTouteDate = mRTouteDate;
	}

}
