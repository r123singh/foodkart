package userInterface;

import java.awt.event.TextEvent;
import java.awt.event.TextListener;

import login.LoginInstance;

public class LoginNameTextListener implements TextListener {

	public void textValueChanged(TextEvent t) {
		// TODO Auto-generated method stub
		if (t.getID()== TextEvent.TEXT_VALUE_CHANGED) {
			Object source= t.getSource();
			if (source instanceof LoginNameTextField) {
				LoginInstance.getLoginInstance().setLoginName(((LoginNameTextField) source).getText());
			}
		}
	}

}
