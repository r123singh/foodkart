package subscription;

import java.awt.Frame;
import java.awt.Label;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import subscription.SubscriptionEntities.Choose_Subscription;

public class SubscriptionUI extends JDialog {

	public SubscriptionUI(Frame owner, boolean modal) {
		super(owner, modal);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void loadDialog() {
		// TODO Auto-generated method stub
		buildSubscriptionPage();
	}
	private void buildSubscriptionPage() {
		// TODO Auto-generated method stub

		JLabel mainTitle = new JLabel(SubscriptionPage.PAGE_TITLE);
		JLabel welcomeTitle = new JLabel(SubscriptionPage.WLECOME_TITLE);
		add(mainTitle);
		add(welcomeTitle);
		buildSubscibeBox();
		JLabel activationLabel = new JLabel(SubscriptionPage.API_ACTIVATION_TITLE);
		JLabel acitvationContent = new JLabel(SubscriptionPage.API_ACTIVATION_MESSAGE);
		JLabel paymentPolicylabel = new JLabel(SubscriptionPage.PAYMENT_POLICY_TITLE);
		JLabel paymentPolicy = new JLabel(SubscriptionPage.PAYMENT_POLICY_CONTENT);
		add(activationLabel);
		add(acitvationContent);
		add(paymentPolicylabel);
		add(paymentPolicy);

	}

	private void buildSubscibeBox() {
		// TODO Auto-generated method stub
		JPanel boxPanel = new JPanel();
		JLabel boxTitleLabel = new JLabel(SubscriptionPage.PAYPAL_RECURRENT_TITLE);
		JLabel apiEnterLabel = new JLabel(SubscriptionEntities.Subscribe.API_KEY.displayMessage);
		JTextField apiKeyText = new JTextField(20);
		JLabel optionLabel = new JLabel(SubscriptionEntities.Subscribe.TPYE.displayMessage);
		Vector<SubscriptionEntities.Choose_Subscription> choose_Subscriptions = new Vector<>();
		choose_Subscriptions.add(Choose_Subscription.STARTUP);
		choose_Subscriptions.add(Choose_Subscription.DEVELOPER);
		choose_Subscriptions.add(Choose_Subscription.ENTERPRISE);
		choose_Subscriptions.add(Choose_Subscription.HISTORY_MEDIUM);
		choose_Subscriptions.add(Choose_Subscription.HISTORY_STARTER);
		JComboBox<Choose_Subscription> jComboBox = new JComboBox<>(choose_Subscriptions);
		JRadioButton chooseButton = new JRadioButton();
		Label agreeLabel = new Label(SubscriptionEntities.CHOOSE_POLICY_STRING);
		JButton subscribeButton = new JButton(SubscriptionEntities.Subscribe.BUTTON.displayMessage);

		boxPanel.add(boxTitleLabel);
		boxPanel.add(apiEnterLabel);
		boxPanel.add(apiKeyText);
		boxPanel.add(optionLabel);
		boxPanel.add(jComboBox);
		boxPanel.add(chooseButton);
		boxPanel.add(agreeLabel);
		boxPanel.add(subscribeButton);
		add(boxPanel);
	}
}
