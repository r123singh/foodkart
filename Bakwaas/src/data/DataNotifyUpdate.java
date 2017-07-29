package data;

import chatboxUI.BasicChatWindowLauncher;
import chatboxUI.ChatTextboxKeyListener;

public class DataNotifyUpdate {
	
	public  static void updateAllChatviewScreen(String addonMessage) {
		// TODO Auto-generated method stub
		BasicChatWindowLauncher.getComponentsPeers().getBasicChatArea().append(ChatTextboxKeyListener.NEW_LINE);
		BasicChatWindowLauncher.getComponentsPeers().getBasicChatArea().append(addonMessage);
	}

	public static boolean bufferMessageInstance(String finalMessage) {
		// TODO Auto-generated method stub
		boolean notifyViewScreen = false;
		MessageData mData = MessageData.getMessageInstance();
		mData.setFinalMessage(finalMessage);
		if (finalMessage.isEmpty()) {
			mData.setMessageBlank(true);
			notifyViewScreen = false;
		} else {
			mData.setMessageBlank(false);
			notifyViewScreen = true;
		}
		mData.setCurrentMessage(ChatTextboxKeyListener.EMPTY_STRING);
		VectorData vectorData = (VectorData) BufferedData.getBufferMapInstance().get(BufferedData.getUserPair().getUserPaidIdentifier());
		vectorData.add(mData);
		BufferedData.getBufferMapInstance().put(BufferedData.getUserPair().getUserPaidIdentifier(), vectorData);
		return notifyViewScreen;
	}


}
