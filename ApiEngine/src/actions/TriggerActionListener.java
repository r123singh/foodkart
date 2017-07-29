package actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import logs.MainLogger;
import ui.ApiFrame;
import ui.ButtonPeers;
import ui.ResponseDialogLauncher;

public class TriggerActionListener implements ActionListener {

	private ApiFrame apiFrame;
	private ButtonPeers buttonPeers;
	private String appid = "b1b15e88fa797225412429c1c50c122a1";

	public TriggerActionListener(ApiFrame apiFrame, ButtonPeers buttonPeers) {
		// TODO Auto-generated constructor stub
		this.apiFrame = apiFrame;
		this.buttonPeers = buttonPeers;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getActionCommand().equals("Response_Window")) {
			ResponseDialogLauncher.launch();
			return;
		} else {
			String url = apiFrame.getUrlField().getText();
			String paramName = apiFrame.getParamTextField().getText();
			String paramValue = apiFrame.getParamValField().getText();

			StringBuilder requestBuilder = new StringBuilder(url);
			requestBuilder.append("?");
			requestBuilder.append(paramName);
			requestBuilder.append("=");
			requestBuilder.append(paramValue);

			try {
				URL httpUrl = new URL(requestBuilder.toString() + "&appid=" + appid);
				HttpURLConnection httpURLConnection = (HttpURLConnection) httpUrl.openConnection();
				httpURLConnection.setRequestMethod("GET");
				MainLogger.getAnonymousLogger().info(httpURLConnection.getURL().toString());
				httpURLConnection.connect();
				BufferedReader br = new BufferedReader(new InputStreamReader((httpURLConnection.getInputStream())));
				StringBuilder sb = new StringBuilder();
				String output;
				while ((output = br.readLine()) != null) {
					sb.append(output);
				}
				br.close();
				br = null;

				httpURLConnection.disconnect();
				CreateReponse response = new CreateReponse();
				CreateReponse.getResponseObject().setResponseBody(sb.toString());
				response.createFile(sb.toString());
				
				buttonPeers.getShowButton().setEnabled(true);

			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
	}
}
