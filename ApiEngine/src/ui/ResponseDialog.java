package ui;

import java.awt.Dialog;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ResponseDialog extends Dialog {

	public ResponseDialog(Frame owner, boolean modal) {
		super(owner, modal);
		// TODO Auto-generated constructor stub
		setBounds(100, 100, 400, 400);
		enableDialogExit();

	}

	private void enableDialogExit() {
		// TODO Auto-generated method stub
		addWindowListener(new WindowListener() {

			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}

			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}
		});
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
