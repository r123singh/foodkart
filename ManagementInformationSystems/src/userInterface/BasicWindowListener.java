package userInterface;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class BasicWindowListener implements WindowListener {

	private BasicAccountDialog accountDialog;
	private BasicFrame basicFrame;
	private AccountAddMessageDialog addMessageDialog;

	public BasicWindowListener(BasicAccountDialog basicAccountDialog) {
		// TODO Auto-generated constructor stub
		this.accountDialog = basicAccountDialog;
	}

	public BasicWindowListener(BasicFrame basicFrame) {
		// TODO Auto-generated constructor stub
		this.basicFrame = basicFrame;
	}

	public BasicWindowListener(AccountAddMessageDialog accountAddMessageDialog) {
		// TODO Auto-generated constructor stub
		this.addMessageDialog = accountAddMessageDialog;
	}

	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() instanceof BasicAccountDialog) {
			accountDialog.dispose();
		} else if (e.getSource() instanceof BasicFrame) {
			basicFrame.dispose();
		} else if (e.getSource() instanceof AccountAddMessageDialog) {
			addMessageDialog.dispose();
		}
	}

	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

}
