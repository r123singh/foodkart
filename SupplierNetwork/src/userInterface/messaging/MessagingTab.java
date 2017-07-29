package userInterface.messaging;

import javax.swing.JTabbedPane;

public class MessagingTab {

	public MessagingTab() {
		// TODO Auto-generated constructor stub
	}

	public JTabbedPane createMessaging() {
		// TODO Auto-generated method stub
		JTabbedPane messageTabbedPane = new JTabbedPane();
		messageTabbedPane.addTab("<html><font face='Lucida Console'>Identifiers", new MessagingPage().constructMessaging());
		messageTabbedPane.addTab("<html><font face='Lucida Console'>Communication Parameters", new CommunicationPage().constructCommunication());
		messageTabbedPane.addTab("<html><font face='Lucida Console'>Transaction Management", new TransactionManagementPage().createTransactionManagement());
		messageTabbedPane.addTab("<html><font face='Lucida Console'>Notifications", new NotificationsPage().createNotifications());
		messageTabbedPane.addTab("<html><font face='Lucida Console'>Send Document", new SendDocumentPage().createSendDocument());
		messageTabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		return messageTabbedPane;
	}

}
