package now.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import main.PowerColors;
import now.CurrentWeather;

public class NowDialog {

	public NowDialog() {
		// TODO Auto-generated constructor stub
	}

	public void createNow(CurrentWeather currentWeather) throws UnsupportedAudioFileException, IOException, Exception {
		// TODO Auto-generated method stub
		JDialog nowJDialog = new JDialog();
		final String DEGREE = "\u00b0";
		String timeStamp = new SimpleDateFormat("hh:mm a").format(Calendar.getInstance().getTime());
		nowJDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		nowJDialog.setTitle("POWER WEATHERS NOW"+" \u00AE"+ timeStamp);
		nowJDialog.setIconImage(new ImageIcon("../PowerWeather/res/power-weather-icon.png").getImage());
		nowJDialog.setLayout(new BorderLayout());
		JPanel enclsoingJPanel = new JPanel(false);
		enclsoingJPanel.setBorder(new EmptyBorder(30, 0, 10, 0));
		enclsoingJPanel.setLayout(new BoxLayout(enclsoingJPanel, BoxLayout.Y_AXIS));
		JPanel currentweartherJPanel = new JPanel();
		JPanel temperatureJPanel = new JPanel();
		temperatureJPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 0));
		currentweartherJPanel.setLayout(new BoxLayout(currentweartherJPanel, BoxLayout.Y_AXIS));
		TitledBorder titledBorder = new TitledBorder("<html><div style='color:#4863A0;'><font face='Verdana'><h1>CURRENT WEATHER");
		titledBorder.setTitleJustification(TitledBorder.CENTER);
		currentweartherJPanel.setBorder(titledBorder);
		JLabel temperatureLabel = new JLabel("<html><div style='color:#2B3856'><font size='40'>" + currentWeather.getTemperatvalue() + DEGREE + currentWeather.getTemperaturunit()+"/"+currentWeather.getImpertempValue()+DEGREE+currentWeather.getImpertemunit());
		JLabel weathertext = new JLabel("<html><div style='color:#2B3856'><font face='verdana'><h1>" + currentWeather.getWeatherText());
		JButton seehourlyButton = new JButton("<html><div style='color:#FFA62F'><h2><font face='Verdana'>See Hourly");
		JLabel weathertextGif = new JLabel("<html><font face='Verdana' size='4'><div style='color:"+PowerColors.Turquoise+"'>RealFeel \u00AE", new ImageIcon("../PowerWeather/res/thunderstorm-label-gif.gif"), SwingConstants.CENTER);
		currentweartherJPanel.add(temperatureLabel);
		currentweartherJPanel.add(new JSeparator());
		currentweartherJPanel.add(weathertextGif);
		currentweartherJPanel.add(new JSeparator());
		currentweartherJPanel.add(weathertext);
		currentweartherJPanel.add(new JSeparator());
		currentweartherJPanel.add(seehourlyButton);
		enclsoingJPanel.add(currentweartherJPanel);
		nowJDialog.add(enclsoingJPanel, BorderLayout.CENTER);
		nowJDialog.setSize(400, 500);
		nowJDialog.setLocationRelativeTo(null);
		nowJDialog.setVisible(true);
		AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("../PowerWeather/res/storm-thunder.wav").getAbsoluteFile());
		Clip clip = AudioSystem.getClip();
		clip.open(audioInputStream);
		clip.loop(Clip.LOOP_CONTINUOUSLY);
		clip.start();
	}

}
