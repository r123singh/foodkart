package initializer;

import launcher.MainUserThread;

public class ChatUIInitializer {
	
	private static BasicUIinitializer initializer;

	public ChatUIInitializer() {
		// TODO Auto-generated constructor stub
	}

	public static void init(MainUserThread mainUserThread) {
		initializer= BasicUIinitializer.getInitializerInstance();
		initializer.init(mainUserThread);
	}

}
