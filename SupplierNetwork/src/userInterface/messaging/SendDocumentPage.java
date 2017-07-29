package userInterface.messaging;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import userInterface.SendDocumentDialof;

public class SendDocumentPage {

	public SendDocumentPage() {
		// TODO Auto-generated constructor stub
	}

	public SendDocumentDialof createSendDocument() {
		// TODO Auto-generated method stub
		SendDocumentDialof sendDocumentDialof = new SendDocumentDialof();
		JPanel sendDocumentJPanel = new JPanel();
		sendDocumentJPanel.setLayout(new BoxLayout(sendDocumentJPanel, BoxLayout.Y_AXIS));
		sendDocumentJPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
//		sendDocumentDialof.setTitle("Send Document");
		sendDocumentDialof.setLayout(new BorderLayout());
		JPanel headerJPanel = new JPanel();
		headerJPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 1, 0));
		headerJPanel.setBorder(new EmptyBorder(0, 0, 8, 0));
		JLabel requiredJLabel = new JLabel("<html><font face='Verdana'>* Indicates a Required Field");
		headerJPanel.add(requiredJLabel);
		JPanel rowJPanel = new JPanel();
		rowJPanel.setLayout(new GridLayout(1, 2, 0, 0));
		rowJPanel.setBorder(new EmptyBorder(2, 0, 5, 0));
		JLabel documenttypeJLabel = new JLabel("<html><font face='Verdana'>* Document Type");
		JComboBox documenttyJComboBox = new JComboBox(new String[]{"OAG:PROCESS_PO_007"});
		rowJPanel.add(documenttypeJLabel);
		rowJPanel.add(documenttyJComboBox);
		JPanel rowJPanel1 = new JPanel();
		rowJPanel1.setLayout(new GridLayout(1, 2, 0, 0));
		rowJPanel1.setBorder(new EmptyBorder(2, 0, 5, 0));
		JLabel sendtoJLabel = new JLabel("* Send To");
		JComboBox sendtoJComboBox = new JComboBox(new String[]{"Integrated Solutions,Inc."});
		rowJPanel1.add(sendtoJLabel);
		rowJPanel1.add(sendtoJComboBox);
		JPanel rowJPanel2 = new JPanel();
		rowJPanel2.setLayout(new GridLayout(1, 2, 0, 0));
		rowJPanel2.setBorder(new EmptyBorder(2, 0, 5, 0));
		JLabel documentnoJLabel = new JLabel("<html><font face='Verdana'>* Document Number");
		JTextField documentnoJTextField = new JTextField(10);
		documentnoJTextField.setText("<html><font face='Verdana'>1111");
		rowJPanel2.add(documentnoJLabel);
		rowJPanel2.add(documentnoJTextField);
		JPanel rowJPanel3 = new JPanel();
		rowJPanel3.setLayout(new GridLayout(1, 3, 5, 0));
		rowJPanel3.setBorder(new EmptyBorder(2, 0, 5, 0));
		JLabel payloadJLabel = new JLabel("<html><font face='Verdana'>* Payload");
		JTextField payloadJTextField = new JTextField(10);
		JButton browseJButton = new JButton("<html><font face='Verdana'>Browse...");
		rowJPanel3.add(payloadJLabel);
		rowJPanel3.add(payloadJTextField);
		rowJPanel3.add(browseJButton);

		sendDocumentJPanel.add(headerJPanel);
		sendDocumentJPanel.add(rowJPanel);
		sendDocumentJPanel.add(rowJPanel1);
		sendDocumentJPanel.add(rowJPanel2);
		sendDocumentJPanel.add(rowJPanel3);
		sendDocumentDialof.add(sendDocumentJPanel, BorderLayout.NORTH);
		sendDocumentDialof.setVisible(true);
		return sendDocumentDialof;
	}
}
