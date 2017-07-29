package login;

public class LoginActionProcessor {

	private static LoginActionProcessor actionProcessor;

	public static LoginActionProcessor getLoginPressProcessor() {
		if (actionProcessor == null) {
			actionProcessor = new LoginActionProcessor();
			return actionProcessor;
		}
		return actionProcessor;
	}

	public boolean processLogin() {
		String loginName = LoginInstance.getLoginInstance().getLoginName().trim();
		String loginPassword = LoginInstance.getLoginInstance()
				.getLoginPassword().trim();
		if ((loginName.equals("ramandeep")) && (loginPassword.equals("ramandeep"))) {
			return true;
		}
		return false;
	}

}
