package userInterface.registeration;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import userInterface.RegisterationDialog;

public class RegisterationPage {

	RegisterationDialog registerationDialog;
	JPanel registerationPanel;

	public RegisterationPage() {
		// TODO Auto-generated constructor stub
	}

	public void constructRegisteration() {
		// TODO Auto-generated method stub
		constructCompanyInformation();
		constructCompanyContact();
		JPanel panel1 = new JPanel();
		JLabel importantLabel = new JLabel("<html><font face='Courier New'>* Indicates a Required Field</html>");
		JButton registerButton = new JButton("<html><font face='verdana'>Continue");
		JButton returnButton = new JButton("<html><font face='verdana'>Return");

		panel1.add(importantLabel);
		panel1.add(registerButton);
		panel1.add(returnButton);
		registerationPanel.add(panel1);
		registerationDialog.add(registerationPanel, BorderLayout.NORTH);
		registerationDialog.setBounds(100, 10, 500, 1000);
		registerationDialog.setVisible(true);

	}

	private void constructCompanyInformation() {
		// TODO Auto-generated method stub
		registerationDialog = new RegisterationDialog();
		registerationDialog.setTitle("SUPPLIER NETWORK LTD.");
		registerationDialog.setIconImage(new ImageIcon("C:/Users/ramandeep singh/project/SupplierNetwork/res/icon-supplier-network.png").getImage());
		registerationPanel = new JPanel();
		registerationPanel.setLayout(new BoxLayout(registerationPanel, BoxLayout.Y_AXIS));
		TitledBorder border = new TitledBorder("<html><font face='Lucida Grande' size='4'>Registeration</html>");
		registerationPanel.setBorder(border);

		JPanel informationPanel = new JPanel();
		TitledBorder titledBorder = new TitledBorder("<html><font face='verdana'>Company Information</html>");
		informationPanel.setBorder(titledBorder);
		informationPanel.setLayout(new BoxLayout(informationPanel, BoxLayout.Y_AXIS));

		JLabel companyNameLabel = new JLabel();
		JLabel addressLineOne = new JLabel();
		JLabel addressLineTwo = new JLabel();
		JLabel addressLineThree = new JLabel();
		JLabel cityLabel = new JLabel();
		JLabel stateLabel = new JLabel();
		JLabel postalLabel = new JLabel();
		JLabel counteyLabel = new JLabel();
		JLabel identifierTypeLabel = new JLabel();
		JLabel identifierValueLabel = new JLabel();
		JLabel applicationCustomerLabel = new JLabel();
		JLabel csiLabel = new JLabel();

		JTextField companyName = new JTextField(10);
		JTextField addressLine1 = new JTextField(10);
		JTextField addressLine2 = new JTextField(10);
		JTextField addressLine3 = new JTextField(10);
		JTextField city = new JTextField(10);
		JTextField state = new JTextField(10);
		JTextField postalCode = new JTextField(10);
		JTextField country = new JTextField(10);
		JTextField identifierType = new JTextField(10);
		JTextField identifierValue = new JTextField(10);
		JTextField applicationCust = new JTextField(10);
		JTextField csi = new JTextField(10);

		companyNameLabel.setText("<html><font face='verdana'>* Company Name</html>");
		addressLineOne.setText("<html><font face='verdana'>* Address Line 1");
		addressLineTwo.setText("<html><font face='verdana'>Address Line 2");
		addressLineThree.setText("<html><font face='verdana'>Address Line 3");
		cityLabel.setText("<html><font face='verdana'>* City");
		stateLabel.setText("<html><font face='verdana'>State/Region");
		postalLabel.setText("<html><font face='verdana'>* Zip/Postal Code");
		counteyLabel.setText("<html><font face='verdana'>* Country");
		identifierTypeLabel.setText("<html><font face='verdana'>* Identifier Type");
		identifierValueLabel.setText("<html><font face='verdana'>* Identifier Value");
		applicationCustomerLabel.setText("<html><font face='verdana'>* Application Customer");
		csiLabel.setText("<html><font face='verdana'>Customer Support Indentifier(CSI)");

		registerationDialog.setLayout(new BorderLayout());

		JPanel panel1 = new JPanel();
		panel1.add(companyNameLabel);
		panel1.add(companyName);

		JPanel panel2 = new JPanel();
		panel2.add(addressLineOne);
		panel2.add(addressLine1);

		JPanel panel3 = new JPanel();
		panel3.add(addressLineTwo);
		panel3.add(addressLine2);

		JPanel panel4 = new JPanel();
		panel4.add(addressLineThree);
		panel4.add(addressLine3);

		JPanel panel5 = new JPanel();
		panel5.add(cityLabel);
		panel5.add(city);

		JPanel panel6 = new JPanel();
		panel6.add(stateLabel);
		panel6.add(state);

		JPanel panel7 = new JPanel();
		panel7.add(postalLabel);
		panel7.add(postalCode);

		JPanel panel8 = new JPanel();
		panel8.add(counteyLabel);
		panel8.add(country);

		JPanel panel9 = new JPanel();
		panel9.add(identifierTypeLabel);
		panel9.add(identifierType);

		JPanel panel10 = new JPanel();
		panel10.add(identifierValueLabel);
		panel10.add(identifierValue);

		JPanel panel11 = new JPanel();
		panel11.add(applicationCustomerLabel);
		panel11.add(applicationCust);

		JPanel panel12 = new JPanel();
		panel12.add(csiLabel);
		panel12.add(csi);

		informationPanel.add(panel1);
		informationPanel.add(panel2);
		informationPanel.add(panel3);
		informationPanel.add(panel4);
		informationPanel.add(panel5);
		informationPanel.add(panel6);
		informationPanel.add(panel7);
		informationPanel.add(panel8);
		informationPanel.add(panel9);
		informationPanel.add(panel10);
		informationPanel.add(panel11);
		informationPanel.add(panel12);

		registerationPanel.add(informationPanel);
	}

	private void constructCompanyContact() {
		// TODO Auto-generated method stub
		JPanel contactPanel = new JPanel();
		TitledBorder titledBorder = new TitledBorder("<html><font face='verdana'>Company Contact Information");
		contactPanel.setBorder(titledBorder);
		contactPanel.setLayout(new BoxLayout(contactPanel, BoxLayout.Y_AXIS));

		JLabel titlJLabel = new JLabel("<html><font face='verdana'>Title");
		JLabel firstNameLabel = new JLabel("<html><font face='verdana'>* First Name");
		JLabel middleNameLabel = new JLabel("<html><font face='verdana'>Middle Name");
		JLabel lastNameLabel = new JLabel("<html><font face='verdana'>* Last Name");
		JLabel emailLabel = new JLabel("<html><font face='verdana'>* Email Address");
		JLabel usernameLabel = new JLabel("<html><font face='verdana'>* Username");
		JLabel passwordLabel = new JLabel("<html><font face='verdana'>* Password");
		JLabel confirmPasswordLabel = new JLabel("<html><font face='verdana'>* Confirm Password");

		JTextField titleField = new JTextField(10);
		JTextField firstNameField = new JTextField(10);
		JTextField middleNameField = new JTextField(10);
		JTextField lastNameField = new JTextField(10);
		JTextField emailField = new JTextField(10);
		JTextField usernamField = new JTextField(10);
		JTextField passwordField = new JTextField(10);
		JTextField confirmPassField = new JTextField(10);

		JPanel panel1 = new JPanel();
		panel1.add(titlJLabel);
		panel1.add(titleField);
		JPanel panel2 = new JPanel();
		panel2.add(firstNameLabel);
		panel2.add(firstNameField);
		JPanel panel3 = new JPanel();
		panel3.add(middleNameLabel);
		panel3.add(middleNameField);
		JPanel panel4 = new JPanel();
		panel4.add(lastNameLabel);
		panel4.add(lastNameField);
		JPanel panel5 = new JPanel();
		panel5.add(emailLabel);
		panel5.add(emailField);

		JPanel panel6 = new JPanel();
		panel6.add(usernameLabel);
		panel6.add(usernamField);

		JPanel panel7 = new JPanel();
		panel7.add(passwordLabel);
		panel7.add(passwordField);
		JPanel panel8 = new JPanel();
		panel8.add(confirmPasswordLabel);
		panel8.add(confirmPassField);

		contactPanel.add(panel1);
		contactPanel.add(panel2);
		contactPanel.add(panel3);
		contactPanel.add(panel4);
		contactPanel.add(panel5);
		contactPanel.add(panel6);
		contactPanel.add(panel7);
		contactPanel.add(panel8);
		registerationPanel.add(contactPanel);
	}

}
