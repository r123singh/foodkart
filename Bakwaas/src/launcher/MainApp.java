package launcher;


public class MainApp {
	

	public MainApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		MainUserThread userThread = new MainUserThread("user1");
		userThread.start();
		
		DummyUserThread dummyUserThread = new DummyUserThread();
		dummyUserThread.start();
	}

}
