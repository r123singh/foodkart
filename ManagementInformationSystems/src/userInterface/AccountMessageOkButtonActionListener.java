package userInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccountMessageOkButtonActionListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getID() == ActionEvent.ACTION_PERFORMED) {
			Object source = e.getSource();
			if (source instanceof AccountMessageOkButton) {
				AccountAddMessageDialog parent= (AccountAddMessageDialog) AllBasicUIComponents.getUIMapInstance().get(AccountAddMessageDialog.ACCOUNT_ADD_MESSAGE_DIALOG_TITLE);
				parent.dispose();
			}
		}

	}

}
