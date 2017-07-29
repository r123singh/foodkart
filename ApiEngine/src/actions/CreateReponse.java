package actions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;

import response.ResponseObject;
import logs.MainLogger;
import file.ResponseFile;

public class CreateReponse {

	private BufferedWriter bufferedWriter;
	private static ResponseObject responseObject;

	public CreateReponse() {
		// TODO Auto-generated constructor stub
		setResponseObject(new ResponseObject());
	}

	public File createFile(String responseObj) {
		
		MainLogger.getAnonymousLogger().info(responseObj);
		ResponseFile f = new ResponseFile(null, Long.toString(Instant.now().getEpochSecond()).concat(".json"));
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 bufferedWriter = new BufferedWriter(fileWriter);
		 
		 try {
			bufferedWriter.write(responseObj);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			bufferedWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MainLogger.getAnonymousLogger().info(f.getAbsolutePath());
		return f;
	}

	public static ResponseObject getResponseObject() {
		return responseObject;
	}

	public static void setResponseObject(ResponseObject responseObject) {
		CreateReponse.responseObject = responseObject;
	}

}
