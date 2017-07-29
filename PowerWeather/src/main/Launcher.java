package main;

import java.io.IOException;
import java.net.MalformedURLException;

import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import now.CurrentConditions;
import now.CurrentWeather;
import now.ui.NowDialog;

public class Launcher {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, Exception {
		CurrentConditions currentConditions = new CurrentConditions();
		NowDialog nowDialog = new NowDialog();

		try {
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (Exception e) {
		}
		UIManager.put("swing.boldMetal", Boolean.FALSE);

		try {
			CurrentWeather currentWeather=currentConditions.fetchCurrentcondtions();
			nowDialog.createNow(currentWeather);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
