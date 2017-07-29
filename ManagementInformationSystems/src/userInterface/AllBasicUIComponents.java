package userInterface;

import java.util.HashMap;

public class AllBasicUIComponents {

	private static HashMap allUIComponentsMap;

	public static void initializeUIMap() {
		// TODO Auto-generated method stub
		if (getAllUIComponentsMap() == null) {
			allUIComponentsMap = new HashMap();
		}
	}

	public static HashMap getUIMapInstance() {
		// TODO Auto-generated method stub
		return getAllUIComponentsMap();
	}

	public static HashMap getAllUIComponentsMap() {
		return allUIComponentsMap;
	}

}
