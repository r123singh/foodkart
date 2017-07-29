package userInterface.adduser;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import userInterface.AdduserDialof;

public class AdduserPage {

	private AdduserDialof adduserDialof;
	private JPanel addusPanel;

	public AdduserPage() {
		// TODO Auto-generated constructor stub
	}

	public AdduserDialof createaddUser() {
		// TODO Auto-generated method stub
		adduserDialof = new AdduserDialof();
		addusPanel = new JPanel();
		addusPanel.setLayout(new BoxLayout(addusPanel, BoxLayout.Y_AXIS));
		adduserDialof.setLayout(new BorderLayout());
		createAddUser();
		createAssignroles();
		adduserDialof.add(addusPanel, BorderLayout.NORTH);
		adduserDialof.setVisible(true);
		return adduserDialof;
	}

	private void createAddUser() {
		// TODO Auto-generated method stub
		JPanel adduseradjusJPanel = new JPanel();
		adduseradjusJPanel.setLayout(new BorderLayout());
		JPanel adduserJPanel = new JPanel();
		adduserJPanel.setLayout(new BoxLayout(adduserJPanel, BoxLayout.Y_AXIS));
		adduseradjusJPanel.setBorder(new TitledBorder("<html><font face='Verdana'>Add User"));
		JPanel rowJPanel = new JPanel();
		JLabel titleJLabel = new JLabel("<html><font face='Verdana'>Title");
		JTextField titleJTextField = new JTextField(10);
		rowJPanel.add(titleJLabel);
		rowJPanel.add(titleJTextField);
		JPanel rowJPanel2 = new JPanel();
		JLabel firstnameJLabel = new JLabel("<html><font face='Verdana'>* First Name");
		JTextField firstnameJTextField = new JTextField(10);
		rowJPanel2.add(firstnameJLabel);
		rowJPanel2.add(firstnameJTextField);
		JPanel rowJPanel3 = new JPanel();
		JLabel middlenameJLabel = new JLabel("<html><font face='Verdana'>Middle Name");
		JTextField middlenamJTextField = new JTextField(10);
		rowJPanel3.add(middlenameJLabel);
		rowJPanel3.add(middlenamJTextField);
		JPanel rowJPanel4 = new JPanel();
		JLabel lastnameJLabel = new JLabel("<html><font face='Verdana'>* Last Name");
		JTextField lastnameField = new JTextField(10);
		rowJPanel4.add(lastnameJLabel);
		rowJPanel4.add(lastnameField);
		JPanel rowJPanel5 = new JPanel();
		JLabel emailaddressJLabel = new JLabel("<html><font face='Verdana'>* Email Address");
		JTextField emailaddressJTextField = new JTextField(10);
		rowJPanel5.add(emailaddressJLabel);
		rowJPanel5.add(emailaddressJTextField);
		JPanel rowJPanel6 = new JPanel();
		JLabel usernameJLabel = new JLabel("<html><font face='Verdana'>* Username");
		JTextField usernameJTextField = new JTextField(10);
		rowJPanel6.add(usernameJLabel);
		rowJPanel6.add(usernameJTextField);
		adduserJPanel.add(rowJPanel);
		adduserJPanel.add(rowJPanel2);
		adduserJPanel.add(rowJPanel3);
		adduserJPanel.add(rowJPanel4);
		adduserJPanel.add(rowJPanel5);
		adduserJPanel.add(rowJPanel6);
		adduseradjusJPanel.add(adduserJPanel, BorderLayout.WEST);
		addusPanel.add(adduseradjusJPanel);
	}

	private void createAssignroles() {
		// TODO Auto-generated method stub
		JPanel assignrolesJPanel = new JPanel();
		assignrolesJPanel.setLayout(new BoxLayout(assignrolesJPanel, BoxLayout.Y_AXIS));
		assignrolesJPanel.setBorder(new TitledBorder("<html><font face='Verdana'>Assign Roles"));
		JPanel buttonJPanel = new JPanel();
		buttonJPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 0));
		JButton selectall = new JButton("<html><font face='Verdana'>Select All");
		JButton selectnone = new JButton("<html><font face='Verdana'>Select None");
		buttonJPanel.add(selectall);
		buttonJPanel.add(selectnone);
		JPanel headerJPanel = new JPanel();
		headerJPanel.setLayout(new GridLayout(1, 3, 0, 0));
		headerJPanel.setBorder(new LineBorder(Color.BLACK));
		JLabel selectJLabel = new JLabel("<html><font face='Verdana'>Select");
		JLabel rolenameJLabel = new JLabel("<html><font face='Verdana'>Role Name");
		JLabel descriptionsJLabel = new JLabel("<html><font face='Verdana'>Description");
		headerJPanel.add(selectJLabel);
		headerJPanel.add(rolenameJLabel);
		headerJPanel.add(descriptionsJLabel);
		headerJPanel.setBorder(new LineBorder(Color.BLACK));

		JPanel roleJPanel = new JPanel();
		roleJPanel.setLayout(new GridLayout(1, 3, 0, 0));
		JCheckBox selecBox = new JCheckBox();
		JLabel admisniJLabel = new JLabel("<html><font face='Verdana'>Administrator");
		JLabel descriptionJLabel = new JLabel("<html><font size='1' face='Verdana'>Maintains company<p> profile information,<p>manages users and trading partners.</html>");
		roleJPanel.add(selecBox);
		roleJPanel.add(admisniJLabel);
		roleJPanel.add(descriptionJLabel);

		JPanel roleJPanel1 = new JPanel();
		roleJPanel1.setLayout(new GridLayout(1, 3, 0, 0));
		JCheckBox selecBox1 = new JCheckBox();
		JLabel admisniJLabel1 = new JLabel("<html><font face='Verdana'>Messaging");
		JLabel descriptionJLabel1 = new JLabel(
				"<html><font size='1' face='Verdana'>Responsible for messaging <p>configuration and execution,<p> as well as trading <p>partner administration</html>");
		roleJPanel1.add(selecBox1);
		roleJPanel1.add(admisniJLabel1);
		roleJPanel1.add(descriptionJLabel1);

		JPanel roleJPanel2 = new JPanel();
		roleJPanel2.setLayout(new GridLayout(1, 3, 0, 0));
		JCheckBox selecBox2 = new JCheckBox();
		JLabel admisniJLabel2 = new JLabel("<html><font face='Verdana'>View Messages");
		JLabel descriptionJLabel2 = new JLabel(
				"<html><font size='1' face='Verdana'>View Only access to<p> messaging configuration and <p>transaction logs. Also<p> able to register for <p>messaging notifications</html>");
		roleJPanel2.add(selecBox2);
		roleJPanel2.add(admisniJLabel2);
		roleJPanel2.add(descriptionJLabel2);

		JPanel roleJPanel3 = new JPanel();
		roleJPanel3.setLayout(new GridLayout(1, 3, 0, 0));
		JCheckBox selecBox3 = new JCheckBox();
		JLabel admisniJLabel3 = new JLabel("<html><font face='Verdana'>iSP");
		JLabel descriptionJLabel3 = new JLabel(
				"<html><font size='1' face='Verdana'>Enables user to setup and<p> requst accounts for accessing<p> buyers' iSupplier portal <p>applications</html>");
		roleJPanel3.add(selecBox3);
		roleJPanel3.add(admisniJLabel3);
		roleJPanel3.add(descriptionJLabel3);
		assignrolesJPanel.add(buttonJPanel);
		assignrolesJPanel.add(headerJPanel);
		assignrolesJPanel.add(roleJPanel);
		assignrolesJPanel.add(new JSeparator());
		assignrolesJPanel.add(roleJPanel1);
		assignrolesJPanel.add(new JSeparator());
		assignrolesJPanel.add(roleJPanel2);
		assignrolesJPanel.add(new JSeparator());
		assignrolesJPanel.add(roleJPanel3);
		addusPanel.add(assignrolesJPanel);
	}

}
