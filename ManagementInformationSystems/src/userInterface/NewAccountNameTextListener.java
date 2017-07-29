package userInterface;

import java.awt.event.TextEvent;
import java.awt.event.TextListener;

import account.NewAccountInstance;

public class NewAccountNameTextListener implements TextListener {


	public void textValueChanged(TextEvent t) {
		// TODO Auto-generated method stub
		if (t.getID()== TextEvent.TEXT_VALUE_CHANGED) {
			Object source= t.getSource();
			if (source instanceof AccountNameTextfield) {
				NewAccountInstance.getAccountInstance().setName(((AccountNameTextfield) source).getText());
			}
		}
	}


}
