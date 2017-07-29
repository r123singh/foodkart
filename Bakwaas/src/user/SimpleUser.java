package user;

public class SimpleUser {

	private String userId;
	private String username;
	private String userSerialNumber;
	private String userStatus;
	private String userIcon;
	private boolean active;
	private boolean sleep;
	private boolean loginpassword;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserSerialNumber() {
		return userSerialNumber;
	}

	public void setUserSerialNumber(String userSerialNumber) {
		this.userSerialNumber = userSerialNumber;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public String getUserIcon() {
		return userIcon;
	}

	public void setUserIcon(String userIcon) {
		this.userIcon = userIcon;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean isSleep() {
		return sleep;
	}

	public void setSleep(boolean sleep) {
		this.sleep = sleep;
	}

	public boolean isLoginpassword() {
		return loginpassword;
	}

	public void setLoginpassword(boolean loginpassword) {
		this.loginpassword = loginpassword;
	}

}
