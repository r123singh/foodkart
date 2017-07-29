package userInterface.messaging;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import userInterface.CommunicationDialog;

public class CommunicationPage {

	private JPanel urlConnectionJPanel;
	private CommunicationDialog communicationDialog;

	public CommunicationPage() {
		// TODO Auto-generated constructor stub
	}

	public CommunicationDialog constructCommunication() {
		// TODO Auto-generated method stub
		communicationDialog = new CommunicationDialog();
//		communicationDialog.setTitle("Communication Parameters");
		communicationDialog.setLayout(new BorderLayout());
		urlConnectionJPanel = new JPanel();
		urlConnectionJPanel.setLayout(new BoxLayout(urlConnectionJPanel, BoxLayout.Y_AXIS));
		urlConnectionJPanel.setBorder(new TitledBorder("<html><font face='Verdana'>HTTP URL Connection"));
		constructDeliveryParameters();
		communicationDialog.add(urlConnectionJPanel, BorderLayout.NORTH);
		communicationDialog.setVisible(true);
		return communicationDialog;
	}

	private void constructDeliveryParameters() {
		// TODO Auto-generated method stub
		JPanel deliverMethoJPanel = new JPanel();
		deliverMethoJPanel.setLayout(new BoxLayout(deliverMethoJPanel, BoxLayout.Y_AXIS));
		deliverMethoJPanel.setBorder(new TitledBorder("<html><font face='Verdana'>Delivery Method Parameters"));

		JPanel tipJPanel = new JPanel();
		JCheckBox tipCheckBox = new JCheckBox();
		tipCheckBox.setSelected(true);
		JLabel tipJLabel = new JLabel("<html><font face='Verdana'>TIP Please enter delivery method parameter values for both Setup and Run-Time environments");
		tipJPanel.add(tipCheckBox);
		tipJPanel.add(tipJLabel);

		JPanel headerJPanel = new JPanel();
		headerJPanel.setLayout(new GridLayout(1, 3, 0, 0));
		headerJPanel.setBorder(new EmptyBorder(0, 5, 0, 5));

		LineBorder border = new LineBorder(Color.BLACK);
		JLabel descriptionJLabel = new JLabel("<html><font face='Verdana'>Description");
		descriptionJLabel.setBorder(border);
		JLabel setupJLabel = new JLabel("<html><font face='Verdana'>SN Setup");
		JLabel runtimeJLabel = new JLabel("<html><font face='Verdana'>SN Run-Time");
		setupJLabel.setBorder(border);
		runtimeJLabel.setBorder(border);
		headerJPanel.add(descriptionJLabel);
		headerJPanel.add(setupJLabel);
		headerJPanel.add(runtimeJLabel);

		JPanel rowJPanel = new JPanel();
		rowJPanel.setLayout(new GridLayout(1, 3, 0, 0));
		rowJPanel.setBorder(new EmptyBorder(2, 5, 5, 5));
		JLabel urlJLabel = new JLabel("<html><font face='Verdana'>URL");
		JPanel setupurlJPanel = new JPanel();
		setupurlJPanel.setLayout(new BoxLayout(setupurlJPanel, BoxLayout.Y_AXIS));
		JTextField setupField = new JTextField(15);
		JLabel setupurlJLabel = new JLabel("<html><font size='2' face='verdana'>Enter the URL for the server that will recieve documents from the hub</html>");
		setupurlJPanel.add(setupField);
		setupurlJPanel.add(setupurlJLabel);

		JTextField runtimeField = new JTextField(15);
		JLabel runtimeurlJLabel = new JLabel("<html><font size='2' face='verdana'>Enter the URL for the server that will recieve documents from the hub</html>");
		JPanel runtimeurlJPanel = new JPanel();
		runtimeurlJPanel.setLayout(new BoxLayout(runtimeurlJPanel, BoxLayout.Y_AXIS));
		runtimeurlJPanel.add(runtimeField);
		runtimeurlJPanel.add(runtimeurlJLabel);
		rowJPanel.add(urlJLabel);
		rowJPanel.add(setupurlJPanel);
		rowJPanel.add(runtimeurlJPanel);

		JPanel rowJPanel2 = new JPanel();
		rowJPanel2.setLayout(new GridLayout(1, 3, 0, 0));
		rowJPanel2.setBorder(new EmptyBorder(2, 5, 5, 5));
		JLabel basicAuthJLabel = new JLabel("<html><font face='Verdana'>Use Basic<p> Authentication</html>");
		JComboBox<String> setupAuthComboBox = new JComboBox<String>(new String[]{"Yes", "No"});
		JLabel setupAuthJLabel = new JLabel("<html><font size='2' face='verdana'>Select whether HTTP Basic Authentication <p>will be enabled</html>");
		JPanel setupJPanel=new JPanel();
		setupJLabel.setLayout(new BorderLayout());
		setupJPanel.add(setupAuthJLabel,BorderLayout.WEST);
		JPanel authSetupJPanel = new JPanel();
		authSetupJPanel.setLayout(new BoxLayout(authSetupJPanel, BoxLayout.Y_AXIS));
		authSetupJPanel.add(setupAuthComboBox);
		authSetupJPanel.add(setupJPanel);
		JComboBox<String> runtimeAuthComboBox = new JComboBox<String>(new String[]{"Yes", "No"});
		JLabel runtimeAuthJLabel = new JLabel("<html><font size='2' face='verdana'>Select whether HTTP Basic Authentication <p>will be enabled</html>");
		JPanel runtimeJPanel=new JPanel();
		runtimeJPanel.setLayout(new BorderLayout());
		runtimeJPanel.add(runtimeAuthJLabel,BorderLayout.WEST);
		JPanel runtimeAuthJPanel = new JPanel();
		runtimeAuthJPanel.setLayout(new BoxLayout(runtimeAuthJPanel, BoxLayout.Y_AXIS));
		runtimeAuthJPanel.add(runtimeAuthComboBox);
		runtimeAuthJPanel.add(runtimeJPanel);
		rowJPanel2.add(basicAuthJLabel);
		rowJPanel2.add(authSetupJPanel);
		rowJPanel2.add(runtimeAuthJPanel);

		JPanel rowJPanel3 = new JPanel();
		rowJPanel3.setLayout(new GridLayout(1, 3, 0, 0));
		rowJPanel3.setBorder(new EmptyBorder(2, 5, 5, 5));
		JLabel authRealmJLabel = new JLabel("<html><font face='Verdana'><p>Basic</p><p>Authentication</p><p>Realm</p></html>");
		JTextField realmSetupField = new JTextField(15);
		JLabel realmSetupJLabel = new JLabel("<html><font size='2' face='verdana'>Enter the HTTP Basic Authentication<p> realm.</html>");
		JPanel realmSetupJPanel = new JPanel();
		realmSetupJPanel.setLayout(new BoxLayout(realmSetupJPanel, BoxLayout.Y_AXIS));
		realmSetupJPanel.add(realmSetupField);
		realmSetupJPanel.add(realmSetupJLabel);
		JTextField realmRunField = new JTextField(15);
		JLabel realmRunLabel = new JLabel("<html><font size='2' face='verdana'>Enter the HTTP Basic Authentication<p> realm.</html>");
		JPanel realmRunPanel = new JPanel();
		realmRunPanel.setLayout(new BoxLayout(realmRunPanel, BoxLayout.Y_AXIS));
		realmRunPanel.add(realmRunField);
		realmRunPanel.add(realmRunLabel);
		rowJPanel3.add(authRealmJLabel);
		rowJPanel3.add(realmSetupJPanel);
		rowJPanel3.add(realmRunPanel);

		JPanel rowJPanel4 = new JPanel();
		rowJPanel4.setLayout(new GridLayout(1, 3, 0, 0));
		rowJPanel4.setBorder(new EmptyBorder(2, 5, 5, 5));
		JLabel authUserJLabel = new JLabel("<html><font face='Verdana'><p>Basic</p><p>Authentication</p><p>Username</p></html>");
		JTextField userSetupField = new JTextField(15);
		JLabel userSetupJLabel = new JLabel("<html><font size='2' face='verdana'>Enter the HTTP Basic Authentication username.</html>");
		JPanel userSetupJPanel = new JPanel();
		userSetupJPanel.setLayout(new BoxLayout(userSetupJPanel, BoxLayout.Y_AXIS));
		userSetupJPanel.add(userSetupField);
		userSetupJPanel.add(userSetupJLabel);
		JTextField userRunField = new JTextField(15);
		JLabel userRunLabel = new JLabel("<html><font size='2' face=='verdana'>Enter the HTTP Basic Authentication username.</html>");
		JPanel userRunPanel = new JPanel();
		userRunPanel.setLayout(new BoxLayout(userRunPanel, BoxLayout.Y_AXIS));
		userRunPanel.add(userRunField);
		userRunPanel.add(userRunLabel);
		rowJPanel4.add(authUserJLabel);
		rowJPanel4.add(userSetupJPanel);
		rowJPanel4.add(userRunPanel);

		JPanel rowJPanel5 = new JPanel();
		rowJPanel5.setLayout(new GridLayout(1, 3, 0, 0));
		rowJPanel5.setBorder(new EmptyBorder(2, 5, 5, 5));
		JLabel autPasswordJLabel = new JLabel("<html><html><font face='Verdana'><p>Basic</p><p>Authentication</p><p>Password</p></html>");
		JTextField passwordSetupField = new JTextField(15);
		JLabel passwordSetupJLabel = new JLabel("<html><font size='2' face='verdana'>Enter the HTTP Basic Authentication password.</html>");
		JPanel passwordSetupJPanel = new JPanel();
		passwordSetupJPanel.setLayout(new BoxLayout(passwordSetupJPanel, BoxLayout.Y_AXIS));
		passwordSetupJPanel.add(passwordSetupField);
		passwordSetupJPanel.add(passwordSetupJLabel);
		JTextField passwordRunField = new JTextField(15);
		JLabel passwordRunLabel = new JLabel("<html><font size='2' face='verdana'>Enter the HTTP Basic Authentication password.</html>");
		JPanel passwordRunPanel = new JPanel();
		passwordRunPanel.setLayout(new BoxLayout(passwordRunPanel, BoxLayout.Y_AXIS));
		passwordRunPanel.add(passwordRunField);
		passwordRunPanel.add(passwordRunLabel);
		rowJPanel5.add(autPasswordJLabel);
		rowJPanel5.add(passwordSetupJPanel);
		rowJPanel5.add(passwordRunPanel);

		deliverMethoJPanel.add(tipJPanel);
		deliverMethoJPanel.add(headerJPanel);
		deliverMethoJPanel.add(rowJPanel);
		deliverMethoJPanel.add(rowJPanel2);
		deliverMethoJPanel.add(rowJPanel3);
		deliverMethoJPanel.add(rowJPanel4);
		deliverMethoJPanel.add(rowJPanel5);
		urlConnectionJPanel.add(deliverMethoJPanel);

	}
}
