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
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import userInterface.NotificationsDialog;

public class NotificationsPage {

	private NotificationsDialog notificationsDialog;
	private JPanel notificationsJPanel;

	public NotificationsPage() {
		// TODO Auto-generated constructor stub
	}

	public NotificationsDialog createNotifications() {
		// TODO Auto-generated method stub
		notificationsDialog = new NotificationsDialog();
		notificationsJPanel = new JPanel();
		notificationsDialog.setLayout(new BorderLayout());
//		notificationsDialog.setTitle("Notifications");
		notificationsJPanel.setLayout(new BoxLayout(notificationsJPanel, BoxLayout.Y_AXIS));
		createYourTransactions();
		createAddSubscriptions();
		notificationsDialog.add(notificationsJPanel, BorderLayout.NORTH);
		notificationsDialog.setVisible(true);
		return notificationsDialog;
	}

	private void createYourTransactions() {
		// TODO Auto-generated method stub
		JPanel yourSubscrpJPanel = new JPanel();
		yourSubscrpJPanel.setBorder(new TitledBorder("Your Transactions"));
		yourSubscrpJPanel.setLayout(new BoxLayout(yourSubscrpJPanel, BoxLayout.Y_AXIS));
		JPanel buttonJPanel = new JPanel();
		buttonJPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 0));
		JButton unsubscribeJButton = new JButton("Unsubscribe");
		buttonJPanel.add(unsubscribeJButton);
		JPanel selectJPanel = new JPanel();
		selectJPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 5));
		JButton selectAll = new JButton("Select All");
		JButton selectNone = new JButton("Select None");
		selectJPanel.add(selectAll);
		selectJPanel.add(selectNone);
		JPanel headerJPanel = new JPanel();
		headerJPanel.setLayout(new GridLayout(1, 3, 0, 0));
		headerJPanel.setBorder(new LineBorder(Color.black));
		JLabel selecJLabel = new JLabel("Select");
		JLabel transactioTyJLabel = new JLabel("Transaction Type");
		JLabel actionJLabel = new JLabel("Action");
		headerJPanel.add(selecJLabel);
		headerJPanel.add(transactioTyJLabel);
		headerJPanel.add(actionJLabel);

		JPanel rowJPanel = new JPanel();
		rowJPanel.setLayout(new GridLayout(1, 3, 0, 0));
		rowJPanel.setBorder(new EmptyBorder(5, 0, 5, 0));
		JCheckBox selCheckBox = new JCheckBox();
		JLabel trantypJLabel = new JLabel("Purchase Order");
		JLabel actJLabel = new JLabel("Send");
		rowJPanel.add(selCheckBox);
		rowJPanel.add(trantypJLabel);
		rowJPanel.add(actJLabel);

		JPanel rowJPanel1 = new JPanel();
		rowJPanel1.setLayout(new GridLayout(1, 3, 0, 0));
		rowJPanel.setBorder(new EmptyBorder(5, 0, 5, 0));
		JCheckBox selCheckBox1 = new JCheckBox();
		JLabel trantypJLabel1 = new JLabel("Change Purchase Order");
		JLabel actJLabel1 = new JLabel("Send");
		rowJPanel1.add(selCheckBox1);
		rowJPanel1.add(trantypJLabel1);
		rowJPanel1.add(actJLabel1);

		yourSubscrpJPanel.add(buttonJPanel);
		yourSubscrpJPanel.add(selectJPanel);
		yourSubscrpJPanel.add(headerJPanel);
		yourSubscrpJPanel.add(rowJPanel);
		yourSubscrpJPanel.add(rowJPanel1);
		notificationsJPanel.add(yourSubscrpJPanel);
	}

	private void createAddSubscriptions() {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		JPanel addSubscrpJPanel = new JPanel();
		addSubscrpJPanel.setBorder(new TitledBorder("Add Transactions"));
		addSubscrpJPanel.setLayout(new BoxLayout(addSubscrpJPanel, BoxLayout.Y_AXIS));
		JPanel buttonJPanel = new JPanel();
		buttonJPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 2));
		JButton unsubscribeJButton = new JButton("Subscribe");
		buttonJPanel.add(unsubscribeJButton);
		JPanel selectJPanel = new JPanel();
		selectJPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 2));
		JButton selectAll = new JButton("Select All");
		JButton selectNone = new JButton("Select None");
		selectJPanel.add(selectAll);
		selectJPanel.add(selectNone);
		JPanel headerJPanel = new JPanel();
		headerJPanel.setLayout(new GridLayout(1, 3, 0, 0));
		headerJPanel.setBorder(new LineBorder(Color.black));
		JLabel selecJLabel = new JLabel("Select");
		JLabel transactioTyJLabel = new JLabel("Transaction Type");
		JLabel actionJLabel = new JLabel("Action");
		headerJPanel.add(selecJLabel);
		headerJPanel.add(transactioTyJLabel);
		headerJPanel.add(actionJLabel);
		JPanel rowJPanel = new JPanel();
		rowJPanel.setLayout(new GridLayout(1, 3, 0, 0));
		rowJPanel.setBorder(new EmptyBorder(5, 0, 5, 0));
		JCheckBox selCheckBox = new JCheckBox();
		JLabel trantypJLabel = new JLabel("Invoice");
		JLabel actJLabel = new JLabel("Receive");
		rowJPanel.add(selCheckBox);
		rowJPanel.add(trantypJLabel);
		rowJPanel.add(actJLabel);

		JPanel rowJPanel1 = new JPanel();
		rowJPanel1.setLayout(new GridLayout(1, 3, 0, 0));
		rowJPanel.setBorder(new EmptyBorder(5, 0, 5, 0));
		JCheckBox selCheckBox1 = new JCheckBox();
		JLabel trantypJLabel1 = new JLabel("Purchase Order Acknowledgement");
		JLabel actJLabel1 = new JLabel("Receive");
		rowJPanel1.add(selCheckBox1);
		rowJPanel1.add(trantypJLabel1);
		rowJPanel1.add(actJLabel1);

		addSubscrpJPanel.add(buttonJPanel);
		addSubscrpJPanel.add(selectJPanel);
		addSubscrpJPanel.add(headerJPanel);
		addSubscrpJPanel.add(rowJPanel);
		addSubscrpJPanel.add(rowJPanel1);
		notificationsJPanel.add(addSubscrpJPanel);

	}

}
