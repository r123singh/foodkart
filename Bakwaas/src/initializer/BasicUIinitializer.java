package initializer;

import launcher.MainUserThread;
import chatboxUI.BasicChatWindowLauncher;

public class BasicUIinitializer {

	private static BasicUIinitializer basicUIinitializer;

	public static BasicUIinitializer getBasicUIinitializer() {
		return basicUIinitializer;
	}

	public static void setBasicUIinitializer(
			BasicUIinitializer basicUIinitializer) {
		BasicUIinitializer.basicUIinitializer = basicUIinitializer;
	}

	public static BasicUIinitializer getInitializerInstance() {

		if (basicUIinitializer == null) {
			basicUIinitializer = new BasicUIinitializer();
			setBasicUIinitializer(basicUIinitializer);
		}
		return basicUIinitializer;
	}

	public void init(MainUserThread mainUserThread) {
		BasicChatWindowLauncher chatScreenLaunher=new BasicChatWindowLauncher();
		chatScreenLaunher.initialize(mainUserThread);
	}

}
