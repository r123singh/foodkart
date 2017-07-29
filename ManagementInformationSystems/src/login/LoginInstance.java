package login;

public class LoginInstance {

	private static LoginInstance loginInstance;
	private String loginName;
	private String loginPassword;

	public static LoginInstance getLoginInstance() {
		if (loginInstance == null) {
			loginInstance = new LoginInstance();
			return loginInstance;
		}
		return loginInstance;

	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

}
