package ui;

import java.awt.TextArea;

import actions.CreateReponse;

public class ResponseDialogLauncher {

	public static void launch() {
		// TODO Auto-generated method stub
		ResponseDialog window = new ResponseDialog(null, false);
		TextArea textArea = new TextArea();
		textArea.setText(CreateReponse.getResponseObject().getResponseBody());
		window.add(textArea);
		window.setVisible(true);
	}

}
