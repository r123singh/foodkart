package launcher;

import data.DataNotifyUpdate;

public class DummyUserThread extends Thread {

	private String username = "dummyUser";
	private String dummyMessage = "hey dummy";

	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		while (true) {
			try {
				sleep(5000);
				DataNotifyUpdate.bufferMessageInstance(username+":"+dummyMessage);
				DataNotifyUpdate.updateAllChatviewScreen(username+":"+dummyMessage);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
