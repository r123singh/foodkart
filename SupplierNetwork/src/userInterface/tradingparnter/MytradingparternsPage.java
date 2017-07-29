package userInterface.tradingparnter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import userInterface.MyTradingpartnersDialog;

public class MytradingparternsPage {

	private MyTradingpartnersDialog myTradingpartnersDialog;
	private JPanel mytradingPartnersJPanel;

	public MytradingparternsPage() {
		// TODO Auto-generated constructor stub
	}

	public MyTradingpartnersDialog createTradingPartnersManagement() {
		myTradingpartnersDialog = new MyTradingpartnersDialog();
		mytradingPartnersJPanel = new JPanel();
		myTradingpartnersDialog.setLayout(new BorderLayout());
		mytradingPartnersJPanel.setLayout(new BoxLayout(mytradingPartnersJPanel, BoxLayout.Y_AXIS));
		mytradingPartnersJPanel.setBorder(new TitledBorder("<html><font face='Verdana'>Trading Partner Management"));
		createTradingPartnersRequestingApproval();
		createyourTradingpartners();
		createAddTradingPartners();
		myTradingpartnersDialog.add(mytradingPartnersJPanel, BorderLayout.NORTH);
		myTradingpartnersDialog.setVisible(true);
		return myTradingpartnersDialog;
	}

	private void createTradingPartnersRequestingApproval() {
		// TODO Auto-generated method stub
		JPanel tradingpartnersJPanel = new JPanel();
		tradingpartnersJPanel.setLayout(new BoxLayout(tradingpartnersJPanel, BoxLayout.Y_AXIS));
		tradingpartnersJPanel.setBorder(new TitledBorder("<html><font face='Verdana'>Trading Partners Request Approval"));
		JPanel headerJPanel = new JPanel();
		headerJPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 5));
		JLabel requireapppJLabel = new JLabel("<html><font face='Verdana'>The following companies require your approval");
		headerJPanel.add(requireapppJLabel);
		JPanel headJPanel = new JPanel();
		headJPanel.setLayout(new GridLayout(1, 5, 5, 0));
		headJPanel.setBorder(new LineBorder(Color.BLACK, 2));
		JLabel selecJLabel = new JLabel("<html><font face='Verdana'>Select");
		JLabel tradingpartnernamJLabel = new JLabel("<html><font face='Verdana'>Trading Partner Name");
		JLabel tradingpartnerAliaJLabel = new JLabel("<html><font face='Verdana'>Trading Partner Alias");
		JLabel contactNameJLabel = new JLabel("<html><font face='Verdana'>Contact Name");
		JLabel contactemailJLabel = new JLabel("<html><font face='Verdana'>Contact Email");
		headJPanel.add(selecJLabel);
		headJPanel.add(tradingpartnernamJLabel);
		headJPanel.add(tradingpartnerAliaJLabel);
		headJPanel.add(contactNameJLabel);
		headJPanel.add(contactemailJLabel);
		tradingpartnersJPanel.add(headerJPanel);
		tradingpartnersJPanel.add(headJPanel);
		mytradingPartnersJPanel.add(tradingpartnersJPanel);
	}

	private void createyourTradingpartners() {
		// TODO Auto-generated method stub
		JPanel yourtradingPartneJPanel = new JPanel();
		yourtradingPartneJPanel.setLayout(new BoxLayout(yourtradingPartneJPanel, BoxLayout.Y_AXIS));
		yourtradingPartneJPanel.setBorder(new TitledBorder("<html><font face='Verdana'>Your Trading Partners"));
		JPanel selectedtraJPanel = new JPanel();
		selectedtraJPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 5));
		JLabel selectedtradingJLabel = new JLabel("<html><font face='Verdana'>Below is a list of your selected trading partners");
		selectedtraJPanel.add(selectedtradingJLabel);
		JPanel buttonJPanel = new JPanel();
		buttonJPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 5));
		JButton updateJButton = new JButton("<html><font face='Verdana'>Update");
		JButton removeJButton = new JButton("<html><font face='Verdana'>Remove");
		buttonJPanel.add(updateJButton);
		buttonJPanel.add(removeJButton);
		JPanel headerJPanel = new JPanel();
		headerJPanel.setLayout(new GridLayout(1, 4, 0, 0));
		headerJPanel.setBorder(new LineBorder(Color.BLACK, 2));
		JLabel selectJLabel = new JLabel("<html><font face='Verdana'>Select");
		JLabel tradingpartnernameJLabel = new JLabel("<html><font face='Verdana'>Trading Partner Name");
		JLabel tradingpartnerAliaJLabel = new JLabel("<html><font face='Verdana'>Trading Partner Alias");
		JLabel messageStatusJLabel = new JLabel("<html><font face='Verdana'>Messaging Status");
		headerJPanel.add(selectJLabel);
		headerJPanel.add(tradingpartnernameJLabel);
		headerJPanel.add(tradingpartnerAliaJLabel);
		headerJPanel.add(messageStatusJLabel);
		JPanel rowJPanel = new JPanel();
		rowJPanel.setLayout(new GridLayout(1, 4, 0, 0));
		rowJPanel.setBorder(new EmptyBorder(2, 0, 2, 0));
		JRadioButton selecButton = new JRadioButton();
		JLabel tradingpartnernameJLabel2 = new JLabel("<html><font face='Verdana'>SN Operations");
		JTextField tradinfaliaJTextField = new JTextField("<html><font face='Verdana'>sn_ops");
		JLabel messaJLabel = new JLabel("<html><font face='Verdana'>Approved");
		rowJPanel.add(selecButton);
		rowJPanel.add(tradingpartnernameJLabel2);
		rowJPanel.add(tradinfaliaJTextField);
		rowJPanel.add(messaJLabel);
		JPanel rowJPanel1 = new JPanel();
		rowJPanel1.setLayout(new GridLayout(1, 4, 0, 0));
		rowJPanel1.setBorder(new EmptyBorder(2, 0, 2, 0));
		JRadioButton selecButton1 = new JRadioButton();
		JLabel tradingpartnernameJLabel3 = new JLabel("<html><font face='Verdana'>Integrated Solutions, Inc.");
		JTextField tradinfaliaJTextField1 = new JTextField("<html><font face='Verdana'>45882");
		JLabel messaJLabel1 = new JLabel("<html><font face='Verdana'>Approved");
		rowJPanel1.add(selecButton1);
		rowJPanel1.add(tradingpartnernameJLabel3);
		rowJPanel1.add(tradinfaliaJTextField1);
		rowJPanel1.add(messaJLabel1);
		yourtradingPartneJPanel.add(selectedtraJPanel);
		yourtradingPartneJPanel.add(buttonJPanel);
		yourtradingPartneJPanel.add(headerJPanel);
		yourtradingPartneJPanel.add(rowJPanel);
		yourtradingPartneJPanel.add(rowJPanel1);
		mytradingPartnersJPanel.add(yourtradingPartneJPanel);

	}

	private void createAddTradingPartners() {
		// TODO Auto-generated method stub
		JPanel addTradingpartnerJPanel = new JPanel();
		addTradingpartnerJPanel.setLayout(new BoxLayout(addTradingpartnerJPanel, BoxLayout.Y_AXIS));
		addTradingpartnerJPanel.setBorder(new TitledBorder("<html><font face='Verdana'>Add Trading Partners"));
		JPanel searchtradingJPanel = new JPanel();
		searchtradingJPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel searchtradingJLabel = new JLabel("<html><font face='Verdana'>Search the SN directory to find registered trading partners");
		searchtradingJPanel.add(searchtradingJLabel);
		JPanel searchJPanel = new JPanel();
		searchJPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 0));
		JLabel tradingpartnameJLabel = new JLabel("<html><font face='Verdana'>Trading Partner Name");
		JTextField tradingpartnernameJTextField = new JTextField(10);
		JButton searchJButton = new JButton("<html><font face='Verdana'>Search");
		JButton showallJButton = new JButton("<html><font face='Verdana'>Show All");
		searchJPanel.add(tradingpartnameJLabel);
		searchJPanel.add(tradingpartnernameJTextField);
		searchJPanel.add(searchJButton);
		searchJPanel.add(showallJButton);
		JPanel addnextJPanel = new JPanel();
		addnextJPanel.setLayout(new BorderLayout());
		JButton addButton = new JButton("<html><font face='Verdana'>Add");
		JPanel prevNextJPanel = new JPanel();
		JButton previousJButton = new JButton("Previous");
		JComboBox pagenumberJComboBox = new JComboBox(new String[]{"1-10 of 101"});
		JButton next10JButton = new JButton("<html><font face='Verdana'>Next 10");
		prevNextJPanel.add(previousJButton);
		prevNextJPanel.add(pagenumberJComboBox);
		prevNextJPanel.add(next10JButton);
		addnextJPanel.add(addButton, BorderLayout.WEST);
		addnextJPanel.add(prevNextJPanel, BorderLayout.EAST);
		JPanel selectAllnone = new JPanel();
		selectAllnone.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));
		selectAllnone.setBorder(new EmptyBorder(5, 0, 5, 0));
		JButton selectallJButton = new JButton("<html><font face='Verdana'>Select All");
		JButton selectnoneJButton = new JButton("<html><font face='Verdana'>Select None");
		selectAllnone.add(selectallJButton);
		selectAllnone.add(selectnoneJButton);

		JPanel headerJPanel = new JPanel();
		headerJPanel.setLayout(new GridLayout(1, 3, 0, 0));
		headerJPanel.setBorder(new LineBorder(Color.BLACK, 2));
		JLabel selectJLabel = new JLabel("<html><font face='Verdana'>Select");
		JLabel tradingpartnernameJLabel = new JLabel("<html><font face='Verdana'>Trading Partner Name");
		JLabel tradingpartnerAliaJLabel = new JLabel("<html><font face='Verdana'>Trading Partner Alias");
		headerJPanel.add(selectJLabel);
		headerJPanel.add(tradingpartnernameJLabel);
		headerJPanel.add(tradingpartnerAliaJLabel);

		JPanel rowJPanel = new JPanel();
		rowJPanel.setLayout(new GridLayout(1, 3, 0, 0));
		rowJPanel.setBorder(new EmptyBorder(2, 0, 2, 0));
		JCheckBox selecJCheckBox = new JCheckBox();
		JLabel tradingnameJLabel = new JLabel("<html><font face='Verdana'>ABE Services,LLC");
		JTextField tradinfaliaJTextField = new JTextField(20);
		rowJPanel.add(selecJCheckBox);
		rowJPanel.add(tradingnameJLabel);
		rowJPanel.add(tradinfaliaJTextField);

		JPanel rowJPanel1 = new JPanel();
		rowJPanel1.setLayout(new GridLayout(1, 3, 0, 0));
		rowJPanel1.setBorder(new EmptyBorder(2, 0, 2, 0));
		JCheckBox selecJCheckBox1 = new JCheckBox();
		JLabel tradingnameJLabel1 = new JLabel("<html><font face='Verdana'>ADB Systems International");
		JTextField tradinfaliaJTextField1 = new JTextField(20);
		rowJPanel1.add(selecJCheckBox1);
		rowJPanel1.add(tradingnameJLabel1);
		rowJPanel1.add(tradinfaliaJTextField1);

		JPanel rowJPanel2 = new JPanel();
		rowJPanel2.setLayout(new GridLayout(1, 3, 0, 0));
		rowJPanel2.setBorder(new EmptyBorder(2, 0, 2, 0));
		JCheckBox selecJCheckBox2 = new JCheckBox();
		JLabel tradingnameJLabel2 = new JLabel("<html><font face='Verdana'>Affiliated Computer Services,Inc.");
		JTextField tradinfaliaJTextField2 = new JTextField(20);
		rowJPanel2.add(selecJCheckBox2);
		rowJPanel2.add(tradingnameJLabel2);
		rowJPanel2.add(tradinfaliaJTextField2);

		addTradingpartnerJPanel.add(searchtradingJPanel);
		addTradingpartnerJPanel.add(searchJPanel);
		addTradingpartnerJPanel.add(addnextJPanel);
		addTradingpartnerJPanel.add(selectAllnone);
		addTradingpartnerJPanel.add(headerJPanel);
		addTradingpartnerJPanel.add(rowJPanel);
		addTradingpartnerJPanel.add(rowJPanel1);
		addTradingpartnerJPanel.add(rowJPanel2);
		mytradingPartnersJPanel.add(addTradingpartnerJPanel);

	}

}
