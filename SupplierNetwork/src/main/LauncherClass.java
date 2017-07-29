package main;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import userInterface.home.HomePage;

public class LauncherClass {

	public static void main(String[] args) {
		JWindow window = new JWindow();
		window.getContentPane().add(new JLabel("", new ImageIcon("../SupplierNetwork/res/sn-progress-bar-1.gif"), SwingConstants.CENTER));
		window.setSize(window.getPreferredSize());
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		window.dispose();
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
		    // If Nimbus is not available, you can set the GUI to another look and feel.
		}
		
		UIManager.put("swing.boldMetal", Boolean.FALSE);
		HomePage homePage = new HomePage();
		homePage.login();
	}
}
