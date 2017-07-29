package userInterface.messaging;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import userInterface.ModifyTransactionManagementDialog;

public class ModifyTransactionManagementPage {

	public ModifyTransactionManagementPage() {
		// TODO Auto-generated constructor stub
	}

	public void createInvoice() {
		// TODO Auto-generated method stub
		ModifyTransactionManagementDialog modifyTransactionManagementDialog = new ModifyTransactionManagementDialog();
		modifyTransactionManagementDialog.setLayout(new BorderLayout());
		modifyTransactionManagementDialog.setTitle("Transaction Management");
		JPanel invoiceJPanel = new JPanel();
		invoiceJPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 0));
		invoiceJPanel.setBorder(new TitledBorder("Invoice"));
		JPanel labelsJPanel = new JPanel();
		labelsJPanel.setLayout(new BoxLayout(labelsJPanel, BoxLayout.Y_AXIS));
		JLabel documenttypeJLabel = new JLabel("Document Type");
		JLabel format = new JLabel("Format");
		JLabel version = new JLabel("Version");
		JLabel sendRecieve = new JLabel("Send/Receive");
		JLabel deliveryMJLabel = new JLabel("Delivery Method");
		JLabel linebreakJLabel = new JLabel("<html><br/></html>");
		JLabel linebreakJLabel1 = new JLabel("<html><br/></html>");
		JLabel linebreakJLabel2 = new JLabel("<html><br/></html>");
		JLabel linebreakJLabel3 = new JLabel("<html><br/></html>");
		JLabel linebreakJLabel4 = new JLabel("<html><br/></html>");
		JLabel linebreakJLabel5 = new JLabel("<html><br/></html>");
		JLabel linebreakJLabel6 = new JLabel("<html><br/></html>");
		JLabel linebreakJLabel7 = new JLabel("<html><br/></html>");

		labelsJPanel.add(documenttypeJLabel);
		labelsJPanel.add(linebreakJLabel);
		labelsJPanel.add(format);
		labelsJPanel.add(linebreakJLabel1);
		labelsJPanel.add(version);
		labelsJPanel.add(linebreakJLabel2);
		labelsJPanel.add(sendRecieve);
		labelsJPanel.add(linebreakJLabel3);
		labelsJPanel.add(deliveryMJLabel);
		JPanel fieldsJPanel = new JPanel();
		fieldsJPanel.setLayout(new BoxLayout(fieldsJPanel, BoxLayout.Y_AXIS));
		JLabel doctypeJLabel = new JLabel("InvoiceDetailRequest");
		JLabel formJLabel = new JLabel("cXML");
		JLabel versJLabel = new JLabel("1.2.007");
		JComboBox sendreJComboBox = new JComboBox(new String[]{"Send", "Recieve"});
		JComboBox deliverJComboBox = new JComboBox(new String[]{"HTTP URL Connection"});
		fieldsJPanel.add(doctypeJLabel);
		fieldsJPanel.add(linebreakJLabel4);
		fieldsJPanel.add(formJLabel);
		fieldsJPanel.add(linebreakJLabel5);
		fieldsJPanel.add(versJLabel);
		fieldsJPanel.add(linebreakJLabel6);
		fieldsJPanel.add(sendreJComboBox);
		fieldsJPanel.add(linebreakJLabel7);
		fieldsJPanel.add(deliverJComboBox);
		invoiceJPanel.add(labelsJPanel);
		invoiceJPanel.add(fieldsJPanel);
		modifyTransactionManagementDialog.add(invoiceJPanel);
		modifyTransactionManagementDialog.setBounds(350, 150, 400, 400);
		modifyTransactionManagementDialog.setVisible(true);
	}
}
