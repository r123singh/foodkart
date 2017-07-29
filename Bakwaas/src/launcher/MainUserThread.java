package launcher;

import initializer.ChatUIInitializer;
import data.ChatDataInitializer;

public class MainUserThread extends Thread {

	private String username;

	public MainUserThread(String username) {
		super();
		this.username = username;
	}

	public void run() {
		// TODO Auto-generated method stub

		// CHAT UI INITIALIZER
		ChatUIInitializer.init(this);

		// bUFFER INITIALIZER
		ChatDataInitializer.init();

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public MainUserThread() {
		// TODO Auto-generated constructor stub
	}

}
