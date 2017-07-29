package userInterface.home;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import userInterface.HomeTabbedDialog;
import userInterface.HomeTabbedPane;
import userInterface.adduser.AdduserPage;
import userInterface.messaging.MessagingTab;
import userInterface.messaging.ProfileTab;
import userInterface.messaging.TradingPartnersTab;
import userInterface.registeration.RegisterationPage;

public class HomePage {

	private HomeTabbedDialog homeTabbedDialog;

	public void createHomePage() {
		// TODO Auto-generated method stub
		homeTabbedDialog = new HomeTabbedDialog();
		homeTabbedDialog.setTitle("SN LIMITED WELCOMES SUPPLIER-");
		homeTabbedDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		homeTabbedDialog.setIconImage(new ImageIcon("C:/Users/ramandeep singh/project/SupplierNetwork/res/icon-supplier-network.png").getImage());
		HomeTabbedPane homeTabbedPane = new HomeTabbedPane();
		homeTabbedPane.addTab("<html><font face='verdana' size='4'>Profile", new ProfileTab().createProfiles());
		homeTabbedPane.addTab("<html><font face='verdana'size='4'>Messaging", new MessagingTab().createMessaging());
		homeTabbedPane.addTab("<html><font face='verdana' size='4'>Trading Partners", new TradingPartnersTab().createTradingpartners());
		homeTabbedPane.addTab("<html><font face='verdana' size='4'>Monitor", new JPanel(false));
		homeTabbedPane.addTab("<html><font face='verdana' size='4'>Users", new AdduserPage().createaddUser());
		homeTabbedDialog.add(homeTabbedPane);
		homeTabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		homeTabbedDialog.setSize(homeTabbedDialog.getPreferredSize());
		homeTabbedDialog.setLocationRelativeTo(null);
		homeTabbedDialog.setVisible(true);
	}

	public void login() {
		// TODO Auto-generated method stub

		final JFrame loginJFrame = new JFrame("SUPPLIER NETWORKS LTD");
		loginJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginJFrame.setIconImage(new ImageIcon("C:/Users/ramandeep singh/project/SupplierNetwork/res/icon-supplier-network.png").getImage());
		loginJFrame.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		JPanel mainJPanel = new JPanel(false);
		JPanel loginJPanel = new JPanel();
		loginJPanel.setLayout(new BoxLayout(loginJPanel, BoxLayout.Y_AXIS));
		loginJPanel.setBorder(new TitledBorder("<html><font face='Verdana'>Login</html>"));
		mainJPanel.setBorder(new EmptyBorder(50, 0, 0, 0));
		JPanel loginfailJPanel = new JPanel();
		final JLabel loginfailJLabel = new JLabel();
		loginfailJLabel.setText("<html><font size='2'></html>");
		loginfailJPanel.add(loginfailJLabel);
		JPanel usernameJPanel = new JPanel();
		usernameJPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));
		JLabel usernaemJLabel = new JLabel("<html><font face='Verdana'>Username</html>");
		final JTextField usernameJTextField = new JTextField(10);
		usernameJPanel.add(usernaemJLabel);
		usernameJPanel.add(usernameJTextField);
		JPanel passwordJPanel = new JPanel();
		passwordJPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));
		JLabel passwrodJLabel = new JLabel("<html><font face='Verdana'>Password</html>");
		final JTextField passwordsJTextField = new JTextField(10);
		passwordJPanel.add(passwrodJLabel);
		passwordJPanel.add(passwordsJTextField);
		JPanel buttonJPanel = new JPanel();
		JButton loginJButton = new JButton("<html><font face='Verdana'>Login</html>");
		loginJButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (usernameJTextField.getText().equals("raman") && passwordsJTextField.getText().equals("raman")) {
					loginJFrame.dispose();
					createHomePage();
				} else {
					loginfailJLabel.setText("<html><font size='2' face='verdana'>Incorrect Username/Password!!</html>");
				}
			}
		});
		JButton registerButton = new JButton("<html><font face='Verdana'>Register</html>");
		registerButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				RegisterationPage registerationPage = new RegisterationPage();
				registerationPage.constructRegisteration();

			}
		});
		buttonJPanel.add(registerButton);
		buttonJPanel.add(loginJButton);
		loginJPanel.add(usernameJPanel);
		loginJPanel.add(passwordJPanel);
		loginJPanel.add(buttonJPanel);
		loginJPanel.add(loginfailJPanel);
		loginJPanel.setPreferredSize(loginJPanel.getPreferredSize());
		mainJPanel.add(loginJPanel);
		loginJFrame.add(mainJPanel);
		loginJFrame.setSize(500, 400);
		loginJFrame.setLocationRelativeTo(null);
		loginJFrame.setVisible(true);
	}

}
