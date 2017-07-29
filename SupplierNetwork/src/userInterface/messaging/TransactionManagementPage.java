package userInterface.messaging;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import userInterface.TransactionManagementDialog;

public class TransactionManagementPage {

	private JPanel transactioManageJPanel;
	private TransactionManagementDialog transactionManagementDialog;

	public TransactionManagementPage() {
		// TODO Auto-generated constructor stub
	}

	public TransactionManagementDialog createTransactionManagement() {
		transactionManagementDialog = new TransactionManagementDialog();
		transactionManagementDialog.setLayout(new BorderLayout());
//		transactionManagementDialog.setTitle("Transaction Management");
		transactioManageJPanel = new JPanel();
		transactioManageJPanel.setLayout(new BoxLayout(transactioManageJPanel, BoxLayout.Y_AXIS));
		createYourTransactions();
		createAddTransactions();
		transactionManagementDialog.add(transactioManageJPanel, BorderLayout.NORTH);
		transactionManagementDialog.setVisible(true);
		return transactionManagementDialog;
	}

	private void createYourTransactions() {
		// TODO Auto-generated method stub
		JPanel yourTransactionsJPanel = new JPanel();
		yourTransactionsJPanel.setLayout(new BoxLayout(yourTransactionsJPanel, BoxLayout.Y_AXIS));
		yourTransactionsJPanel.setBorder(new TitledBorder("Your Transactions"));

		JPanel buttonJPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 1, 0));
		buttonJPanel.setBorder(new EmptyBorder(0, 5, 2, 0));
		JButton modifyButton = new JButton("Modify");
		JButton removeJButton = new JButton("Remove");
		buttonJPanel.add(modifyButton);
		buttonJPanel.add(removeJButton);
		JPanel headerJPanel = new JPanel();
		LineBorder border = new LineBorder(Color.BLACK);
		JLabel selectJLabel = new JLabel("Select");
		JLabel transationtJLabel = new JLabel("Transaction Type");
		JLabel documentFormJLabel = new JLabel("Document Format");
		JLabel formateVerJLabel = new JLabel("Format Version");
		JLabel documentTyJLabel = new JLabel("Document Type");
		JLabel actionJLabel = new JLabel("Action");
		selectJLabel.setBorder(border);
		transationtJLabel.setBorder(border);
		documentFormJLabel.setBorder(border);
		formateVerJLabel.setBorder(border);
		documentTyJLabel.setBorder(border);
		actionJLabel.setBorder(border);
		headerJPanel.setLayout(new GridLayout(1, 6, 0, 0));
		headerJPanel.add(selectJLabel);
		headerJPanel.add(transationtJLabel);
		headerJPanel.add(documentFormJLabel);
		headerJPanel.add(formateVerJLabel);
		headerJPanel.add(documentTyJLabel);
		headerJPanel.add(actionJLabel);

		JPanel rowJPanel = new JPanel();
		JRadioButton selectJRadioButton = new JRadioButton();
		JLabel transactionJLabel = new JLabel("Advance Ship Nootice");
		JLabel documentForJLabel = new JLabel("OAG");
		JLabel formateVJLabel = new JLabel("005");
		JLabel docTypeJLabel = new JLabel("SHOW_SHIPMENT_005");
		JLabel actJLabel = new JLabel("Receive");
		rowJPanel.setLayout(new GridLayout(1, 6, 0, 0));
		rowJPanel.add(selectJRadioButton);
		rowJPanel.add(transactionJLabel);
		rowJPanel.add(documentForJLabel);
		rowJPanel.add(formateVJLabel);
		rowJPanel.add(docTypeJLabel);
		rowJPanel.add(actJLabel);

		JPanel rowJPanel1 = new JPanel();
		JRadioButton selectJRadioButton1 = new JRadioButton();
		JLabel transactionJLabel1 = new JLabel("Change Order");
		JLabel documentForJLabel1 = new JLabel("OAG");
		JLabel formateVJLabel1 = new JLabel("006");
		JLabel docTypeJLabel1 = new JLabel("CHANGE_PO_006");
		JLabel actJLabel1 = new JLabel("Send");
		rowJPanel1.setLayout(new GridLayout(1, 6, 0, 0));
		rowJPanel1.add(selectJRadioButton1);
		rowJPanel1.add(transactionJLabel1);
		rowJPanel1.add(documentForJLabel1);
		rowJPanel1.add(formateVJLabel1);
		rowJPanel1.add(docTypeJLabel1);
		rowJPanel1.add(actJLabel1);

		JPanel rowJPanel2 = new JPanel();
		JRadioButton selectJRadioButton2 = new JRadioButton();
		JLabel transactionJLabel2 = new JLabel("Invoice");
		JLabel documentForJLabel2 = new JLabel("OAG");
		JLabel formateVJLabel2 = new JLabel("002");
		JLabel docTypeJLabel2 = new JLabel("PROCESS_INVOICE_002");
		JLabel actJLabel2 = new JLabel("Receive");
		rowJPanel2.setLayout(new GridLayout(1, 6, 0, 0));
		rowJPanel2.add(selectJRadioButton2);
		rowJPanel2.add(transactionJLabel2);
		rowJPanel2.add(documentForJLabel2);
		rowJPanel2.add(formateVJLabel2);
		rowJPanel2.add(docTypeJLabel2);
		rowJPanel2.add(actJLabel2);

		JPanel rowJPanel3 = new JPanel();
		JRadioButton selectJRadioButton3 = new JRadioButton();
		JLabel transactionJLabel3 = new JLabel("Purchase Order");
		JLabel documentForJLabel3 = new JLabel("OAG");
		JLabel formateVJLabel3 = new JLabel("007");
		JLabel docTypeJLabel3 = new JLabel("PROCESS_PO_007");
		JLabel actJLabel3 = new JLabel("Send");
		rowJPanel3.setLayout(new GridLayout(1, 6, 0, 0));
		rowJPanel3.add(selectJRadioButton3);
		rowJPanel3.add(transactionJLabel3);
		rowJPanel3.add(documentForJLabel3);
		rowJPanel3.add(formateVJLabel3);
		rowJPanel3.add(docTypeJLabel3);
		rowJPanel3.add(actJLabel3);

		yourTransactionsJPanel.add(buttonJPanel);
		yourTransactionsJPanel.add(headerJPanel);
		yourTransactionsJPanel.add(rowJPanel);
		yourTransactionsJPanel.add(rowJPanel1);
		yourTransactionsJPanel.add(rowJPanel2);
		yourTransactionsJPanel.add(rowJPanel3);
		transactioManageJPanel.add(yourTransactionsJPanel);

	}

	private void createAddTransactions() {
		// TODO Auto-generated method stub
		JPanel addTransactionsJPanel = new JPanel();
		addTransactionsJPanel.setLayout(new BoxLayout(addTransactionsJPanel, BoxLayout.Y_AXIS));
		addTransactionsJPanel.setBorder(new TitledBorder("Add Transactions"));
		JPanel buttonJPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 1, 0));
		buttonJPanel.setBorder(new EmptyBorder(0, 5, 2, 0));
		JButton addJButton = new JButton("Add");
		buttonJPanel.add(addJButton);

		JPanel headerJPanel = new JPanel();
		LineBorder border = new LineBorder(Color.BLACK);
		JLabel selectJLabel = new JLabel("Select");
		JLabel transationtJLabel = new JLabel("Transaction Type");
		JLabel documentFormJLabel = new JLabel("Document Format");
		JLabel formateVerJLabel = new JLabel("Format Version");
		JLabel documentTyJLabel = new JLabel("Document Type");
		selectJLabel.setBorder(border);
		transationtJLabel.setBorder(border);
		documentFormJLabel.setBorder(border);
		formateVerJLabel.setBorder(border);
		documentTyJLabel.setBorder(border);
		headerJPanel.setLayout(new GridLayout(1, 6, 0, 0));
		headerJPanel.add(selectJLabel);
		headerJPanel.add(transationtJLabel);
		headerJPanel.add(documentFormJLabel);
		headerJPanel.add(documentTyJLabel);
		headerJPanel.add(formateVerJLabel);

		JPanel rowJPanel = new JPanel();
		JRadioButton selectJRadioButton = new JRadioButton();
		JLabel transactionJLabel = new JLabel("Advance Ship Notice");
		JLabel documentForJLabel = new JLabel("cXML");
		JLabel docTypeJLabel = new JLabel("ShipNoticeRequest");
		JLabel formateVJLabel = new JLabel("1.2.007");
		rowJPanel.setLayout(new GridLayout(1, 5, 0, 0));
		rowJPanel.add(selectJRadioButton);
		rowJPanel.add(transactionJLabel);
		rowJPanel.add(documentForJLabel);
		rowJPanel.add(docTypeJLabel);
		rowJPanel.add(formateVJLabel);

		JPanel rowJPanel1 = new JPanel();
		JRadioButton selectJRadioButton1 = new JRadioButton();
		JLabel transactionJLabel1 = new JLabel("Change Order");
		JLabel documentForJLabel1 = new JLabel("cXML");
		JLabel docTypeJLabel1 = new JLabel("OrderRequest");
		JLabel formateVJLabel1 = new JLabel("1.2.009");
		rowJPanel1.setLayout(new GridLayout(1, 5, 0, 0));
		rowJPanel1.add(selectJRadioButton1);
		rowJPanel1.add(transactionJLabel1);
		rowJPanel1.add(documentForJLabel1);
		rowJPanel1.add(docTypeJLabel1);
		rowJPanel1.add(formateVJLabel1);

		JPanel rowJPanel2 = new JPanel();
		JRadioButton selectJRadioButton2 = new JRadioButton();
		JLabel transactionJLabel2 = new JLabel("Change Sales Order");
		JLabel documentForJLabel2 = new JLabel("OAG");
		JLabel docTypeJLabel2 = new JLabel("CHANGE_SALESORDER");
		JLabel formateVJLabel2 = new JLabel("008");
		rowJPanel2.setLayout(new GridLayout(1, 5, 0, 0));
		rowJPanel2.add(selectJRadioButton2);
		rowJPanel2.add(transactionJLabel2);
		rowJPanel2.add(documentForJLabel2);
		rowJPanel2.add(docTypeJLabel2);
		rowJPanel2.add(formateVJLabel2);

		JPanel rowJPanel3 = new JPanel();
		JRadioButton selectJRadioButton3 = new JRadioButton();
		JLabel transactionJLabel3 = new JLabel("Invoice");
		JLabel documentForJLabel3 = new JLabel("cXML");
		JLabel docTypeJLabel3 = new JLabel("InvoiceDetailRequest");
		JLabel formateVJLabel3 = new JLabel("1.2.007");
		rowJPanel3.setLayout(new GridLayout(1, 5, 0, 0));
		rowJPanel3.add(selectJRadioButton3);
		rowJPanel3.add(transactionJLabel3);
		rowJPanel3.add(documentForJLabel3);
		rowJPanel3.add(docTypeJLabel3);
		rowJPanel3.add(formateVJLabel3);

		JPanel rowJPanel4 = new JPanel();
		JRadioButton selectJRadioButton4 = new JRadioButton();
		JLabel transactionJLabel4 = new JLabel("Purchase Order");
		JLabel documentForJLabel4 = new JLabel("cXML");
		JLabel docTypeJLabel4 = new JLabel("OrderRequest");
		JLabel formateVJLabel4 = new JLabel("1.2.007");
		rowJPanel4.setLayout(new GridLayout(1, 5, 0, 0));
		rowJPanel4.add(selectJRadioButton4);
		rowJPanel4.add(transactionJLabel4);
		rowJPanel4.add(documentForJLabel4);
		rowJPanel4.add(docTypeJLabel4);
		rowJPanel4.add(formateVJLabel4);

		JPanel rowJPanel5 = new JPanel();
		JRadioButton selectJRadioButton5 = new JRadioButton();
		JLabel transactionJLabel5 = new JLabel("Purchase Order Acknowledgement");
		JLabel documentForJLabel5 = new JLabel("OAG");
		JLabel docTypeJLabel5 = new JLabel("ACKNOWLEDGE_PO");
		JLabel formateVJLabel5 = new JLabel("008");
		rowJPanel5.setLayout(new GridLayout(1, 5, 0, 0));
		rowJPanel5.add(selectJRadioButton5);
		rowJPanel5.add(transactionJLabel5);
		rowJPanel5.add(documentForJLabel5);
		rowJPanel5.add(docTypeJLabel5);
		rowJPanel5.add(formateVJLabel5);

		JPanel rowJPanel6 = new JPanel();
		JRadioButton selectJRadioButton6 = new JRadioButton();
		JLabel transactionJLabel6 = new JLabel("Purchase Order Acknowledgement");
		JLabel documentForJLabel6 = new JLabel("cXML");
		JLabel docTypeJLabel6 = new JLabel("ConfirmationRequest");
		JLabel formateVJLabel6 = new JLabel("1.2.011");
		rowJPanel6.setLayout(new GridLayout(1, 5, 0, 0));
		rowJPanel6.add(selectJRadioButton6);
		rowJPanel6.add(transactionJLabel6);
		rowJPanel6.add(documentForJLabel6);
		rowJPanel6.add(docTypeJLabel6);
		rowJPanel6.add(formateVJLabel6);
		addTransactionsJPanel.add(buttonJPanel);
		addTransactionsJPanel.add(headerJPanel);
		addTransactionsJPanel.add(rowJPanel);
		addTransactionsJPanel.add(rowJPanel1);
		addTransactionsJPanel.add(rowJPanel2);
		addTransactionsJPanel.add(rowJPanel3);
		addTransactionsJPanel.add(rowJPanel4);
		addTransactionsJPanel.add(rowJPanel5);
		addTransactionsJPanel.add(rowJPanel6);
		transactioManageJPanel.add(addTransactionsJPanel);
	}
}
