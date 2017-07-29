package actions;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class PrettyJson {

	private static void create() throws IOException {
		// TODO Auto-generated method stub
		StringBuilder formData = new StringBuilder();

		formData.append("json_data:");

		URL pretty = new URL("http://jsonprettyprint.com/json-pretty-printer.php");
		HttpURLConnection conn = (HttpURLConnection) pretty.openConnection();

		conn.setDoOutput(true);
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		conn.setRequestProperty("Content-Length", Integer.toString(formData.toString().getBytes().length));
		conn.setRequestProperty("Upgrade-Insecure-Requests", "1");
		conn.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8");
		conn.setRequestProperty("Origin", "http://jsonprettyprint.com");
		conn.setRequestProperty("Referer", "http://jsonprettyprint.com/");

		DataOutputStream dataOutputStream = new DataOutputStream(conn.getOutputStream());
		dataOutputStream.writeUTF(formData.toString());
		dataOutputStream.close();
	}

}
