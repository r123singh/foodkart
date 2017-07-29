package userInterface.messaging;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class ProfileTab {
	
	public ProfileTab() {
		// TODO Auto-generated constructor stub
	}
	
	public JTabbedPane createProfiles() {
		// TODO Auto-generated method stub
		JTabbedPane profileTabbedPane = new JTabbedPane();
		profileTabbedPane.addTab("<html><font face='Lucida Console'>Company Profile", new JPanel(false));
		profileTabbedPane.addTab("<html><font face='Lucida Console'>User Profile", new JPanel(false));
		return profileTabbedPane;
	}

}
