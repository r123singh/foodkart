package userInterface.messaging;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import userInterface.tradingparnter.MytradingparternsPage;

public class TradingPartnersTab {

	public TradingPartnersTab() {
		// TODO Auto-generated constructor stub
	}

	public JTabbedPane createTradingpartners() {
		// TODO Auto-generated method stub
		JTabbedPane partnersTabbedPane = new JTabbedPane();
		partnersTabbedPane.addTab("<html><font face='Lucida Console'>My Trading Partners", new MytradingparternsPage().createTradingPartnersManagement());
		partnersTabbedPane.addTab("<html><font face='Lucida Console'>Routing Rules", new JPanel(false));
		partnersTabbedPane.addTab("<html><font face='Lucida Console'>iSP Wallet", new JPanel());
		partnersTabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		return partnersTabbedPane;
	}

}
