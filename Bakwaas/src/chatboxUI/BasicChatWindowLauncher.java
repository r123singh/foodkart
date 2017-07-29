package chatboxUI;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;

import launcher.MainUserThread;

public class BasicChatWindowLauncher {

	private static BasicChatDialog basicChatDialog;
	private static BasicTextComponentsPeers componentsPeers;
	private static MainUserThread mainUserThread;
	
	private BasicWindowListener basicWindowListener;

	private BasicChatTextboxTextListener basicChatTextboxTextListener;
	private BasicChatViewAreaTextListener basicChatViewAreaTextListener;
	private ChatTextboxKeyListener chatTextboxKeyListener;
	
	

	public BasicChatWindowLauncher() {
		// TODO Auto-generated constructor stub
	}

	public void initialize(MainUserThread mainUserThread) {
		// TODO Auto-generated method stub
		BasicChatWindowLauncher.mainUserThread = mainUserThread;
	
		basicWindowListener = new BasicWindowListener();
		
		basicChatTextboxTextListener = new BasicChatTextboxTextListener();
		basicChatViewAreaTextListener = new BasicChatViewAreaTextListener();
		chatTextboxKeyListener = new ChatTextboxKeyListener();
		componentsPeers=new BasicTextComponentsPeers();
		
		constructChatDialog();
		doChatDialogLayout();
		
		addChatItemsToChatDialog();
		
		basicChatDialog.setResizable(false);

		basicChatDialog.setVisible(true);
	}


	private void doChatDialogLayout() {
		// TODO Auto-generated method stub
		BorderLayout chatDialogLayout = new BorderLayout(BasicChatDialog.HGAP,BasicChatDialog.VGAP);
		basicChatDialog.setLayout(chatDialogLayout);
	}

	private void addChatItemsToChatDialog() {
		// TODO Auto-generated method stub
		addChatEditingTextbox();
		addAllChatsViewArea();
	}

	private void addAllChatsViewArea() {
		// TODO Auto-generated method stub
		BasicChatArea chatsViewArea = new BasicChatArea();
		chatsViewArea.layoutView();
		chatsViewArea.setEditable(BasicChatArea.EDIT_DISABLED);
		chatsViewArea.addTextListener(basicChatViewAreaTextListener);

		basicChatDialog.add(chatsViewArea, BorderLayout.CENTER);

		componentsPeers.setBasicChatArea(chatsViewArea);

	}

	private void addChatEditingTextbox() {
		// TODO Auto-generated method stub
		BasicChatTextbox basicChatTextbox = new BasicChatTextbox(basicChatDialog);
		basicChatTextbox.layoutTextbox();
		basicChatTextbox.addTextListener(basicChatTextboxTextListener);
		basicChatTextbox.addKeyListener(chatTextboxKeyListener);

		basicChatDialog.add(basicChatTextbox, BorderLayout.SOUTH);

		componentsPeers.setBasicChatTextbox(basicChatTextbox);
	}

	private void constructChatDialog() {
		// TODO Auto-generated method stub
		basicChatDialog = new BasicChatDialog(null, "Bakwaas");
		basicChatDialog.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		basicChatDialog.addWindowListener(basicWindowListener);
	}

	public static BasicChatDialog getBasicChatDialog() {
		return basicChatDialog;
	}

	public static void setBasicChatDialog(BasicChatDialog basicChatDialog) {
		BasicChatWindowLauncher.basicChatDialog = basicChatDialog;
	}
	
	public static BasicTextComponentsPeers getComponentsPeers() {
		return componentsPeers;
	}

	public static void setComponentsPeers(BasicTextComponentsPeers componentsPeers) {
		BasicChatWindowLauncher.componentsPeers = componentsPeers;
	}

	public static MainUserThread getMainUserThread() {
		return mainUserThread;
	}

	public static void setMainUserThread(MainUserThread mainUserThread) {
		BasicChatWindowLauncher.mainUserThread = mainUserThread;
	}

}
