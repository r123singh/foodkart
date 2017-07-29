package userInterface;

import java.awt.event.TextEvent;
import java.awt.event.TextListener;

import account.NewAccountInstance;

public class NewAccountCodeTextListener implements TextListener {

	public void textValueChanged(TextEvent t) {
		// TODO Auto-generated method stub
		if (t.getID()== TextEvent.TEXT_VALUE_CHANGED) {
			Object source= t.getSource();
			if (source instanceof AccountCodeTextField) {
				NewAccountInstance.getAccountInstance().setCode(((AccountCodeTextField) source).getText());
			}
		}
	}

}
