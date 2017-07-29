package userInterface;

import javax.swing.JTabbedPane;

public class HomeTabbedPane extends JTabbedPane {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String profile;
	private String messaging;
	private String tradingpartners;
	private String monitor;
	private String users;
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getMessaging() {
		return messaging;
	}
	public void setMessaging(String messaging) {
		this.messaging = messaging;
	}
	public String getTradingpartners() {
		return tradingpartners;
	}
	public void setTradingpartners(String tradingpartners) {
		this.tradingpartners = tradingpartners;
	}
	public String getMonitor() {
		return monitor;
	}
	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}
	public String getUsers() {
		return users;
	}
	public void setUsers(String users) {
		this.users = users;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
