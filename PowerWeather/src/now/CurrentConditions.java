package now;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.JSONObject;

public class CurrentConditions {

	public CurrentWeather fetchCurrentcondtions() throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		URL httpUrl = new URL("http://apidev.accuweather.com/currentconditions/v1/189555.json?language=en&apikey=hoArfRosT1215");
		HttpURLConnection httpURLConnection = (HttpURLConnection) httpUrl.openConnection();
		httpURLConnection.setRequestMethod("GET");
		java.util.logging.Logger.getAnonymousLogger().info(httpURLConnection.getURL().toString());
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
		java.util.logging.Logger.getAnonymousLogger().info(sb.toString());
		String response = sb.toString().replace("[", "").replace("]", "");
		JSONObject jsonObject = new JSONObject(response);
		int temperaturevalue = jsonObject.getJSONObject("Temperature").getJSONObject("Metric").getInt("Value");
		String tempunit = jsonObject.getJSONObject("Temperature").getJSONObject("Metric").getString("Unit");
		int imperialvalue = jsonObject.getJSONObject("Temperature").getJSONObject("Imperial").getInt("Value");
		String imperialunit = jsonObject.getJSONObject("Temperature").getJSONObject("Imperial").getString("Unit");
		String weathertext = jsonObject.getString("WeatherText");
		String mobilelink = jsonObject.getString("MobileLink");
		CurrentWeather currentWeather = new CurrentWeather();
		currentWeather.setTemperatvalue("" + temperaturevalue);
		currentWeather.setTemperaturunit(tempunit);
		currentWeather.setMobilelink(mobilelink);
		currentWeather.setWeatherText(weathertext);
		currentWeather.setImpertempValue(""+imperialvalue);
		currentWeather.setImpertemunit(imperialunit);
		return currentWeather;
	}

}
