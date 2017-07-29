package ui;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

import actions.TriggerActionListener;

public class ApiFrameBuilder {

	private ApiFrame apiFrame;
	private TriggerActionListener actionListener;
	public ApiFrameBuilder() {
	}

	public void buildApiFrame() {
		apiFrame = new ApiFrame();

		gridBuilder();

		addUrlLabel();
		addUrlTextbox();
		addParamLabel();
		addParamTextBox();
		addParamValueLabel();
		addParamValText();
		ButtonPeers buttonPeers = new ButtonPeers();
		actionListener = new TriggerActionListener(apiFrame,buttonPeers);

		addTriggerButton(buttonPeers);
		addresponseDialogButton(buttonPeers);
		
		apiFrame.setVisible(true);
	}

	private void addresponseDialogButton(ButtonPeers buttonPeers) {
		// TODO Auto-generated method stub
		Button triggerResponseDialog = new Button();
		triggerResponseDialog.setLabel("Pretty");
		triggerResponseDialog.setEnabled(false);
		triggerResponseDialog.setActionCommand("Response_Window");
		triggerResponseDialog.addActionListener(actionListener);
		buttonPeers.setShowButton(triggerResponseDialog);
		apiFrame.add(triggerResponseDialog);
	}

	private void addTriggerButton(ButtonPeers buttonPeers) {
		// TODO Auto-generated method stub
		Button triggerRequest = new Button();
		triggerRequest.setLabel("Send");
		triggerRequest.addActionListener(actionListener);
		buttonPeers.setSendButton(triggerRequest);
		apiFrame.add(triggerRequest);
	}

	private void gridBuilder() {
		// TODO Auto-generated method stub
		GridLayout gridLayout = new GridLayout();
		gridLayout.setRows(4);
		gridLayout.setColumns(2);
		gridLayout.setHgap(10);
		gridLayout.setVgap(10);

		apiFrame.setLayout(gridLayout);
	}

	private void addUrlLabel() {
		Label urlLabel = new Label();
		urlLabel.setText("URL");
		apiFrame.add(urlLabel);
	}

	private void addUrlTextbox() {
		// TODO Auto-generated method stub
		TextField urlField = new TextField();
		String url = "http://samples.openweathermap.org/data/2.5/forecast";
		urlField.setText(url);
		apiFrame.add(urlField);
		apiFrame.setUrlField(urlField);
	}

	private void addParamLabel() {
		Label paramLabel = new Label();
		paramLabel.setText("Parameter");
		apiFrame.add(paramLabel);
	}

	private void addParamTextBox() {
		// TODO Auto-generated method stub
		TextField paramText = new TextField();
		paramText.setText("id");
		apiFrame.add(paramText);
		apiFrame.setParamTextField(paramText);
	}

	private void addParamValueLabel() {
		// TODO Auto-generated method stub
		Label valueLabel = new Label();
		valueLabel.setText("Enter Parameter value");
		apiFrame.add(valueLabel);
	}

	private void addParamValText() {
		// TODO Auto-generated method stub
		TextField valueText = new TextField();
		valueText.setText("524901");
		apiFrame.add(valueText);
		apiFrame.setParamValField(valueText);
	}
}
