package userInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import login.LoginActionProcessor;

public class LoginButtonActionListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getID()== ActionEvent.ACTION_PERFORMED) {
			if (LoginActionProcessor.getLoginPressProcessor().processLogin()) {
			}
		}
	}

}
