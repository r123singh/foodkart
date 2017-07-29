package userInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicMenuItemActionListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getID() == ActionEvent.ACTION_PERFORMED) {
			MISDialogInitalizer.getMISDialogInitializerInstance().initalizeMISDialog(e.getActionCommand());
		}
	}
}
