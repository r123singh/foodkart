package ui;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ApiFrame extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private TextField urlField;
	private TextField paramTextField;
	private TextField paramValField;

	public ApiFrame() {
		// TODO Auto-generated constructor stub
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
		setBounds(100, 100, 400, 400);
	}

	public TextField getUrlField() {
		return urlField;
	}

	public void setUrlField(TextField urlField) {
		this.urlField = urlField;
	}

	public TextField getParamTextField() {
		return paramTextField;
	}

	public void setParamTextField(TextField paramTextField) {
		this.paramTextField = paramTextField;
	}

	public TextField getParamValField() {
		return paramValField;
	}

	public void setParamValField(TextField paramValField) {
		this.paramValField = paramValField;
	}

}
