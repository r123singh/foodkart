package subscription;

public class SubscriptionEntities {

	public static String CHOOSE_POLICY_STRING = "I have read and agree to the Terms of Sales, Terms of Service, Privacy Policy";

	public enum Choose_Subscription {
		STARTUP(40, "monthly"), DEVELOPER(180, "monthly"), PROFESSIONAL(470, "monthly"), ENTERPRISE(2000, "monthly"), HISTORY_STARTER(150, "monthly"), HISTORY_MEDIUM(
				950, "monthly");

		public float price;
		public String duration;

		Choose_Subscription(float price, String duration) {
			this.price = price;
			this.duration = duration;
		}
	}

	public enum Subscribe {
		API_KEY("1.Enter your API key"), TPYE("2.Choose your subscription type"), BUTTON("Subscribe");

		public String displayMessage;

		Subscribe(String displayMessage) {
			this.displayMessage = displayMessage;
		}

	}
}
