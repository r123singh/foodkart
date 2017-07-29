package launcher;

import data.MISDataLoader;
import data.MISFileInitializer;
import userInterface.AllBasicUIComponents;
import userInterface.MISFrameInitializer;
import userInterface.MISMenuInitializer;

public class MainApp {
	public static void main(String[] args) {

		// initialize FILE FUNCTIONS
		initializeDataFiles();
		initializeFileOperations();

		// initialize UI FUNCTIONS
		initializeUIComponents();

	}

	private static void initializeDataFiles() {
		// TODO Auto-generated method stub
		MISFileInitializer.initialize();
	}

	private static void initializeFileOperations() {
		// TODO Auto-generated method stub
		initializeAccountsVector();
	}

	private static void initializeAccountsVector() {
		// TODO Auto-generated method stub
		MISDataLoader.initializeAccounts();
	}

	private static void initializeUIComponents() {
		// TODO Auto-generated method stub
		initializeAllUIComponentMap();
		initializeUIFrame();
		initializeUIMenu();

		initializeUIHome();

	}

	private static void initializeAllUIComponentMap() {
		// TODO Auto-generated method stub
		AllBasicUIComponents.initializeUIMap();
	}

	private static void initializeUIHome() {
		// TODO Auto-generated method stub

	}

	private static void initializeUIMenu() {
		// TODO Auto-generated method stub
		MISMenuInitializer misMenuInitializer = MISMenuInitializer
				.getMISInitializeInstance();
		misMenuInitializer.initializeMISMenu();

	}

	private static void initializeUIFrame() {
		// TODO Auto-generated method stub
		MISFrameInitializer misFrameInitializer = MISFrameInitializer
				.getMISFrameInitializerInstance();
		misFrameInitializer.initializeBasicFrame();
	}
}
