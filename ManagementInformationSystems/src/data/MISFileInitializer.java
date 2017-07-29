package data;

import java.util.HashMap;

public class MISFileInitializer implements FileProperties {

	private static LoadAccountFile loadAccountFile = null;
	private static HashMap allDatafilesMap = null;

	public static HashMap getAllDatafilesMap() {
		return allDatafilesMap;
	}

	public static void setAllDatafilesMap(HashMap allDatafilesMap) {
		MISFileInitializer.allDatafilesMap = allDatafilesMap;
	}

	public MISFileInitializer() {
		// TODO Auto-generated constructor stub
	}

	public static void initialize() {
		// TODO Auto-generated method stub
		if (allDatafilesMap == null) {
			allDatafilesMap = new HashMap();
		}
		loadAccountFile = LoadAccountFile.getLoaderInstance();
		AccountDataFile f = loadAccountFile.load();
		if (loadAccountFile.isLoadSuccessful()) {
			allDatafilesMap.put(MAP_ACCOUNT_FILE_NAME, f);
		}
	}

}
