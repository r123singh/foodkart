package userInterface.messaging;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import userInterface.MessagingDialog;

public class MessagingPage {

	private MessagingDialog messagingDialog;
	private JPanel identifiersJPanel;

	public MessagingDialog constructMessaging() {
		// TODO Auto-generated method stub
		messagingDialog = new MessagingDialog();
		// messagingDialog.setTitle("Messaging");
		messagingDialog.setLayout(new BorderLayout());
		identifiersJPanel = new JPanel();
		identifiersJPanel.setLayout(new BoxLayout(identifiersJPanel, BoxLayout.Y_AXIS));
		identifiersJPanel.setBorder(new TitledBorder("<html><font face='Verdana'>Identifiers"));
		JLabel uniqueJLabel = new JLabel("<html><font face='Verdana'>Your Identifiers must be unique within the identifier type.");
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
		panel.setBorder(new EmptyBorder(0, 0, 5, 0));
		panel.add(uniqueJLabel);
		identifiersJPanel.add(panel);
		constructYourIdentifiers();
		constructAddIdentifiers();
		messagingDialog.add(identifiersJPanel, BorderLayout.NORTH);
		messagingDialog.setVisible(true);
		return messagingDialog;
	}

	private void constructYourIdentifiers() {
		// TODO Auto-generated method stub
		JPanel identifieJPanel = new JPanel();
		identifieJPanel.setLayout(new BoxLayout(identifieJPanel, BoxLayout.Y_AXIS));
		TitledBorder border1 = new TitledBorder("<html><font face='Verdana'>Your Identifiers");
		identifieJPanel.setBorder(border1);

		JPanel buttonJPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 1, 0));
		buttonJPanel.setBorder(new EmptyBorder(0, 5, 2, 0));
		JButton updateButton = new JButton("<html><font face='Verdana'>Update");
		JButton removeButton = new JButton("<html><font face='Verdana'>Remove");
		JButton primaryButton = new JButton("<html><font face='Verdana'>Set as Primary");
		buttonJPanel.add(updateButton);
		buttonJPanel.add(removeButton);
		buttonJPanel.add(primaryButton);
		JPanel headerJPanel = new JPanel();
		headerJPanel.setLayout(new GridLayout(1, 5, 0, 0));
		headerJPanel.setBorder(new EmptyBorder(0, 5, 0, 5));
		LineBorder border = new LineBorder(Color.DARK_GRAY);
		JLabel seleJLabel = new JLabel("<html><font face='Verdana'>Select");
		seleJLabel.setBorder(border);
		JLabel identifierTypJLabel = new JLabel("<html><font face='Verdana'>Identifier Type");
		identifierTypJLabel.setBorder(border);
		JLabel descriptionLabel = new JLabel("<html><font face='Verdana'>Description");
		descriptionLabel.setBorder(border);
		JLabel valueJLabel = new JLabel("<html><font face='Verdana'>Value");
		valueJLabel.setBorder(border);
		JLabel primaryIdJLabel = new JLabel("<html><font face='Verdana'>Primary Identifier");
		primaryIdJLabel.setBorder(border);
		headerJPanel.add(seleJLabel);
		headerJPanel.add(identifierTypJLabel);
		headerJPanel.add(descriptionLabel);
		headerJPanel.add(valueJLabel);
		headerJPanel.add(primaryIdJLabel);
		JPanel rowJPanel = new JPanel();
		rowJPanel.setLayout(new GridLayout(1, 5, 0, 0));
		rowJPanel.setBorder(new EmptyBorder(0, 5, 0, 5));
		JRadioButton jRadioButton = new JRadioButton();
		jRadioButton.setSelected(true);
		JLabel identiJLabel = new JLabel("<html><font face='Verdana'>DUNS");
		JLabel descriptJLabel = new JLabel("<html><font face='Verdana'>DUNS number");
		JTextField valueField = new JTextField(10);
		JCheckBox primJCheckBox = new JCheckBox();
		primJCheckBox.setSelected(true);
		rowJPanel.add(jRadioButton);
		rowJPanel.add(identiJLabel);
		rowJPanel.add(descriptJLabel);
		rowJPanel.add(valueField);
		rowJPanel.add(primJCheckBox);

		identifieJPanel.add(buttonJPanel);
		identifieJPanel.add(headerJPanel);
		identifieJPanel.add(rowJPanel);

		identifiersJPanel.add(identifieJPanel);
	}

	private void constructAddIdentifiers() {
		// TODO Auto-generated method stub
		JPanel identifieJPanel = new JPanel();
		identifieJPanel.setLayout(new BoxLayout(identifieJPanel, BoxLayout.Y_AXIS));
		TitledBorder border1 = new TitledBorder("<html><font face='Verdana'>Add Identifiers");
		identifieJPanel.setBorder(border1);
		JPanel buttonJPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 1, 0));
		buttonJPanel.setBorder(new EmptyBorder(0, 5, 2, 0));
		JButton addButton = new JButton("<html><font face='Verdana'>Add");
		buttonJPanel.add(addButton);
		JPanel headerJPanel = new JPanel();
		headerJPanel.setLayout(new GridLayout(1, 5, 0, 0));
		headerJPanel.setBorder(new EmptyBorder(0, 5, 0, 5));
		LineBorder border = new LineBorder(Color.DARK_GRAY);
		JLabel seleJLabel = new JLabel("<html><font face='Verdana'>Select");
		seleJLabel.setBorder(border);
		JLabel identifierTypJLabel = new JLabel("<html><font face='Verdana'>Identifier Type");
		identifierTypJLabel.setBorder(border);
		JLabel descriptionLabel = new JLabel("<html><font face='Verdana'>Description");
		descriptionLabel.setBorder(border);
		JLabel valueJLabel = new JLabel("<html><font face='Verdana'>Value");
		valueJLabel.setBorder(border);
		headerJPanel.add(seleJLabel);
		headerJPanel.add(identifierTypJLabel);
		headerJPanel.add(descriptionLabel);
		headerJPanel.add(valueJLabel);
		JPanel rowJPanel = new JPanel();
		rowJPanel.setLayout(new GridLayout(1, 5, 0, 0));
		rowJPanel.setBorder(new EmptyBorder(0, 5, 0, 5));
		JRadioButton jRadioButton = new JRadioButton();
		jRadioButton.setSelected(true);
		JLabel identiJLabel = new JLabel("<html><font face='Verdana'>DUNS");
		JLabel descriptJLabel = new JLabel("<html><font face='Verdana'>DUNS number");
		JTextField valueField = new JTextField(10);
		rowJPanel.add(jRadioButton);
		rowJPanel.add(identiJLabel);
		rowJPanel.add(descriptJLabel);
		rowJPanel.add(valueField);

		JPanel rowJPanel1 = new JPanel();
		rowJPanel1.setLayout(new GridLayout(1, 5, 0, 0));
		rowJPanel1.setBorder(new EmptyBorder(0, 5, 0, 5));
		JRadioButton jRadioButton1 = new JRadioButton();
		jRadioButton1.setSelected(true);
		JLabel identiJLabel1 = new JLabel("<html><font face='Verdana'>DUNS");
		JLabel descriptJLabel1 = new JLabel("<html><font face='Verdana'>DUNS number");
		JTextField valueField1 = new JTextField(10);
		rowJPanel1.add(jRadioButton1);
		rowJPanel1.add(identiJLabel1);
		rowJPanel1.add(descriptJLabel1);
		rowJPanel1.add(valueField1);

		JPanel rowJPanel2 = new JPanel();
		rowJPanel2.setLayout(new GridLayout(1, 5, 0, 0));
		rowJPanel2.setBorder(new EmptyBorder(0, 5, 0, 5));
		JRadioButton jRadioButton2 = new JRadioButton();
		jRadioButton2.setSelected(true);
		JLabel identiJLabel2 = new JLabel("<html><font face='Verdana'>DUNS");
		JLabel descriptJLabel2 = new JLabel("<html><font face='Verdana'>DUNS number");
		JTextField valueField2 = new JTextField(10);
		rowJPanel2.add(jRadioButton2);
		rowJPanel2.add(identiJLabel2);
		rowJPanel2.add(descriptJLabel2);
		rowJPanel2.add(valueField2);

		JPanel rowJPanel3 = new JPanel();
		rowJPanel3.setLayout(new GridLayout(1, 5, 0, 0));
		rowJPanel3.setBorder(new EmptyBorder(0, 5, 0, 5));
		JRadioButton jRadioButton3 = new JRadioButton();
		jRadioButton3.setSelected(true);
		JLabel identiJLabel3 = new JLabel("<html><font face='Verdana'>DUNS");
		JLabel descriptJLabel3 = new JLabel("<html><font face='Verdana'>DUNS number");
		JTextField valueField3 = new JTextField(10);
		rowJPanel3.add(jRadioButton3);
		rowJPanel3.add(identiJLabel3);
		rowJPanel3.add(descriptJLabel3);
		rowJPanel3.add(valueField3);

		identifieJPanel.add(buttonJPanel);
		identifieJPanel.add(headerJPanel);
		identifieJPanel.add(rowJPanel);
		identifieJPanel.add(rowJPanel1);
		identifieJPanel.add(rowJPanel2);
		identifieJPanel.add(rowJPanel3);
		identifiersJPanel.add(identifieJPanel);
	}

}
