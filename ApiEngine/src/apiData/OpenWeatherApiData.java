package apiData;

import java.util.HashMap;
import java.util.Vector;

import parameter.GETParameter;
import apiCalls.OpenWeatherApiCalls;
import apiCalls.OpenWeatherApiCalls.Alerts_Calls;
import apiCalls.OpenWeatherApiCalls.Daily_Forecast_Calls;
import apiCalls.OpenWeatherApiCalls.Forecast_Calls;
import apiCalls.OpenWeatherApiCalls.Historical_Calls;
import apiCalls.OpenWeatherApiCalls.Weather_Calls_Multiple_Cities;
import apiCalls.OpenWeatherApiCalls.Weather_Calls_One_Location;
import apiFiles.OpenWeatherApiCategories;

public class OpenWeatherApiData {

	public static String API_TITLE = "Weather API";
	public static String API_DESCRIPTION = "Weather API is simple, clear and free. We also offer higher levels of support, please see our paid plan options. To access the API you need to sign up for an API key if you are on a free or paid plan.";

	private HashMap categoryCallsMap;
	private static OpenWeatherApiData openWeatherApiData;

	private HashMap<Weather_Calls_One_Location, Vector<GETParameter>> callTypeParametersMap_1;
	private HashMap<Weather_Calls_Multiple_Cities, Vector<GETParameter>> callTypeParametersMap_2;
	private HashMap<Forecast_Calls, Vector<GETParameter>> callTypeParametersMap_3;
	private HashMap<Daily_Forecast_Calls, Vector<GETParameter>> callTypeParametersMap_4;
	private HashMap<Historical_Calls, Vector<GETParameter>> callTypeParametersMap_5;
	private HashMap<Alerts_Calls, Vector<GETParameter>> callTypeParametersMap_6;

	private Vector<GETParameter> weatherCallsOneLocation_byCity;
	private Vector<GETParameter> weatherCallsOneLocation_byCityName;
	private Vector<GETParameter> weatherCallsOneLocation_byGeo;
	private Vector<GETParameter> weatherCallsOneLocation_byZip;
	private Vector<GETParameter> weatherCallsMultipleLocation_bbox;
	private Vector<GETParameter> weatherCallsMultipleLocation_cycle;
	private Vector<GETParameter> weatherCallsMultipleLocation_ids;
	private Vector<GETParameter> forecastCalls_byCity;
	private Vector<GETParameter> forecastCalls_byCityName;
	private Vector<GETParameter> forecastCalls_byGeo;
	private Vector<GETParameter> forecastCalls_byZip;
	private Vector<GETParameter> dailyForecastCalls_byCityId;
	private Vector<GETParameter> dailyForecastCalls_byCityName;
	private Vector<GETParameter> dailyForecastCalls_byGeo;
	private Vector<GETParameter> dailyForecastCalls_byZip;
	private Vector<GETParameter> historicalCalls_byCity;
	private Vector<GETParameter> historicalCalls_byCityName;
	private Vector<GETParameter> historicalCalls_byGeo;
	private Vector<GETParameter> alertsCalls_byId;

	private Vector onlyHistoricalCalls;
	private Vector onlyAlertsCalls;
	private Vector onlyWeatherCalls_1;
	private Vector onlyWeatherCalls_2;
	private Vector onlyForecastCalls_1;
	private Vector onlyForecastCalls_2;

	public OpenWeatherApiData() {
		// TODO Auto-generated constructor stub
	}

	public static OpenWeatherApiData getOpenWeatherApiInstance() {
		if (openWeatherApiData == null) {
			openWeatherApiData = new OpenWeatherApiData();
		}
		return openWeatherApiData;
	}

	public void loadApiData() {
		// TODO Auto-generated method stub
		buildCallParameterObjects();
		buildCalltypeParametersMap();
		buildCategoryCallMap();
	}

	public HashMap categoryCallMap() {
		return categoryCallsMap;
	}
	private void buildCategoryCallMap() {
		// TODO Auto-generated method stub
		categoryCallsMap = new HashMap();
		categoryCallsMap.put(OpenWeatherApiCategories.WEAHTER_CATEGORY_ONE, callTypeParametersMap_1);
		categoryCallsMap.put(OpenWeatherApiCategories.WEAHTER_CATEGORY_MUL, callTypeParametersMap_2);

		categoryCallsMap.put(OpenWeatherApiCategories.FORECAST_CATEGORY, callTypeParametersMap_3);
		categoryCallsMap.put(OpenWeatherApiCategories.FORECAST_CATEGORY_DAILY, callTypeParametersMap_4);

		categoryCallsMap.put(OpenWeatherApiCategories.HISTORY_CATEGORY, callTypeParametersMap_5);
		categoryCallsMap.put(OpenWeatherApiCategories.ALERTS_CATEGORY, callTypeParametersMap_6);
	}

	private void buildCalltypeParametersMap() {
		// TODO Auto-generated method stub
		callTypeParametersMap_1 = new HashMap<OpenWeatherApiCalls.Weather_Calls_One_Location, Vector<GETParameter>>();
		callTypeParametersMap_2 = new HashMap<OpenWeatherApiCalls.Weather_Calls_Multiple_Cities, Vector<GETParameter>>();
		callTypeParametersMap_3 = new HashMap<OpenWeatherApiCalls.Forecast_Calls, Vector<GETParameter>>();
		callTypeParametersMap_4 = new HashMap<OpenWeatherApiCalls.Daily_Forecast_Calls, Vector<GETParameter>>();
		callTypeParametersMap_5 = new HashMap<OpenWeatherApiCalls.Historical_Calls, Vector<GETParameter>>();
		callTypeParametersMap_6 = new HashMap<OpenWeatherApiCalls.Alerts_Calls, Vector<GETParameter>>();

		callTypeParametersMap_1.put(OpenWeatherApiCalls.Weather_Calls_One_Location.BY_CITY_ID, weatherCallsOneLocation_byCity);
		callTypeParametersMap_1.put(OpenWeatherApiCalls.Weather_Calls_One_Location.BY_CITY_NAME, weatherCallsOneLocation_byCityName);
		callTypeParametersMap_1.put(OpenWeatherApiCalls.Weather_Calls_One_Location.BY_GEO_COORDINATES, weatherCallsOneLocation_byGeo);
		callTypeParametersMap_1.put(OpenWeatherApiCalls.Weather_Calls_One_Location.BY_ZIP_CODE, weatherCallsOneLocation_byZip);

		callTypeParametersMap_2.put(OpenWeatherApiCalls.Weather_Calls_Multiple_Cities.BBOX, weatherCallsMultipleLocation_bbox);
		callTypeParametersMap_2.put(OpenWeatherApiCalls.Weather_Calls_Multiple_Cities.CYCLE, weatherCallsMultipleLocation_cycle);
		callTypeParametersMap_2.put(OpenWeatherApiCalls.Weather_Calls_Multiple_Cities.IDS, weatherCallsMultipleLocation_ids);

		callTypeParametersMap_3.put(Forecast_Calls.BY_CITY_ID, forecastCalls_byCity);
		callTypeParametersMap_3.put(Forecast_Calls.BY_CITY_NAME, forecastCalls_byCityName);
		callTypeParametersMap_3.put(Forecast_Calls.BY_GEO_COORDINATES, forecastCalls_byGeo);
		callTypeParametersMap_3.put(Forecast_Calls.BY_ZIP_CODE, forecastCalls_byZip);

		callTypeParametersMap_4.put(Daily_Forecast_Calls.BY_CITY_ID, dailyForecastCalls_byCityId);
		callTypeParametersMap_4.put(Daily_Forecast_Calls.BY_CITY_NAME, dailyForecastCalls_byCityName);
		callTypeParametersMap_4.put(Daily_Forecast_Calls.BY_GEO_COORDINATES, dailyForecastCalls_byGeo);
		callTypeParametersMap_4.put(Daily_Forecast_Calls.BY_ZIP_CODE, dailyForecastCalls_byZip);

		callTypeParametersMap_5.put(Historical_Calls.BY_CITY_ID, historicalCalls_byCity);
		callTypeParametersMap_5.put(Historical_Calls.BY_CITY_NAME, historicalCalls_byCityName);
		callTypeParametersMap_5.put(Historical_Calls.BY_GEO_COORDINATES, historicalCalls_byGeo);

		callTypeParametersMap_6.put(Alerts_Calls.BY_ID, alertsCalls_byId);

	}

	private void buildCallParameterObjects() {
		// TODO Auto-generated method stub
		String parameterNames[] = OpenWeatherApiCalls.Weather_Calls_One_Location.BY_CITY_ID.getParameterName();
		String paramValueNames[] = OpenWeatherApiCalls.Weather_Calls_One_Location.BY_CITY_ID.getParamValuesNames();
		weatherCallsOneLocation_byCity = new Vector<GETParameter>();

		for (int i = 0; i < parameterNames.length; i++) {
			GETParameter getParameter = new GETParameter();
			String paramindexPair[] = parameterNames[i].split(":");
			getParameter.setParamName(paramindexPair[0]);
			int paramValueNameIndex = Integer.parseInt(paramindexPair[1]);
			String[] paramValueNamePairs = paramValueNames[paramValueNameIndex].split(":");
			getParameter.setParamValue(paramValueNamePairs[0]);
			getParameter.setParamValuetype(paramValueNamePairs[1]);
			weatherCallsOneLocation_byCity.add(getParameter);
		}

		parameterNames = OpenWeatherApiCalls.Weather_Calls_One_Location.BY_CITY_NAME.getParameterName();
		paramValueNames = OpenWeatherApiCalls.Weather_Calls_One_Location.BY_CITY_NAME.getParamValuesNames();
		weatherCallsOneLocation_byCityName = new Vector<GETParameter>();

		for (int i = 0; i < parameterNames.length; i++) {
			GETParameter getParameter = new GETParameter();
			String paramindexPair[] = parameterNames[i].split(":");
			getParameter.setParamName(paramindexPair[0]);
			int paramValueNameIndex = Integer.parseInt(paramindexPair[1]);
			String[] paramValueNamePairs = paramValueNames[paramValueNameIndex].split(":");
			getParameter.setParamValue(paramValueNamePairs[0]);
			getParameter.setParamValuetype(paramValueNamePairs[1]);
			weatherCallsOneLocation_byCityName.add(getParameter);
		}

		parameterNames = OpenWeatherApiCalls.Weather_Calls_One_Location.BY_GEO_COORDINATES.getParameterName();
		paramValueNames = OpenWeatherApiCalls.Weather_Calls_One_Location.BY_GEO_COORDINATES.getParamValuesNames();
		weatherCallsOneLocation_byGeo = new Vector<GETParameter>();
		for (int i = 0; i < parameterNames.length; i++) {
			GETParameter getParameter = new GETParameter();
			String paramindexPair[] = parameterNames[i].split(":");
			getParameter.setParamName(paramindexPair[0]);
			int paramValueNameIndex = Integer.parseInt(paramindexPair[1]);
			String[] paramValueNamePairs = paramValueNames[paramValueNameIndex].split(":");
			getParameter.setParamValue(paramValueNamePairs[0]);
			getParameter.setParamValuetype(paramValueNamePairs[1]);
			weatherCallsOneLocation_byGeo.add(getParameter);
		}

		parameterNames = OpenWeatherApiCalls.Weather_Calls_One_Location.BY_ZIP_CODE.getParameterName();
		paramValueNames = OpenWeatherApiCalls.Weather_Calls_One_Location.BY_ZIP_CODE.getParamValuesNames();
		weatherCallsOneLocation_byZip = new Vector<GETParameter>();

		for (int i = 0; i < parameterNames.length; i++) {
			GETParameter getParameter = new GETParameter();
			String paramindexPair[] = parameterNames[i].split(":");
			getParameter.setParamName(paramindexPair[0]);
			int paramValueNameIndex = Integer.parseInt(paramindexPair[1]);
			String[] paramValueNamePairs = paramValueNames[paramValueNameIndex].split(":");
			getParameter.setParamValue(paramValueNamePairs[0]);
			getParameter.setParamValuetype(paramValueNamePairs[1]);
			weatherCallsOneLocation_byZip.add(getParameter);
		}

		parameterNames = OpenWeatherApiCalls.Weather_Calls_Multiple_Cities.BBOX.getParameterName();
		paramValueNames = OpenWeatherApiCalls.Weather_Calls_Multiple_Cities.BBOX.getParameterValuesName();
		weatherCallsMultipleLocation_bbox = new Vector<GETParameter>();

		for (int i = 0; i < parameterNames.length; i++) {
			GETParameter getParameter = new GETParameter();
			String paramindexPair[] = parameterNames[i].split(":");
			getParameter.setParamName(paramindexPair[0]);
			int paramValueNameIndex = Integer.parseInt(paramindexPair[1]);
			String[] paramValueNamePairs = paramValueNames[paramValueNameIndex].split(":");
			getParameter.setParamValue(paramValueNamePairs[0]);
			getParameter.setParamValuetype(paramValueNamePairs[1]);
			weatherCallsMultipleLocation_bbox.add(getParameter);
		}

		parameterNames = OpenWeatherApiCalls.Weather_Calls_Multiple_Cities.CYCLE.getParameterName();
		paramValueNames = OpenWeatherApiCalls.Weather_Calls_Multiple_Cities.CYCLE.getParameterValuesName();
		weatherCallsMultipleLocation_cycle = new Vector<GETParameter>();

		for (int i = 0; i < parameterNames.length; i++) {
			GETParameter getParameter = new GETParameter();
			String paramindexPair[] = parameterNames[i].split(":");
			getParameter.setParamName(paramindexPair[0]);
			int paramValueNameIndex = Integer.parseInt(paramindexPair[1]);
			String[] paramValueNamePairs = paramValueNames[paramValueNameIndex].split(":");
			getParameter.setParamValue(paramValueNamePairs[0]);
			getParameter.setParamValuetype(paramValueNamePairs[1]);
			weatherCallsMultipleLocation_cycle.add(getParameter);
		}

		parameterNames = OpenWeatherApiCalls.Weather_Calls_Multiple_Cities.IDS.getParameterName();
		paramValueNames = OpenWeatherApiCalls.Weather_Calls_Multiple_Cities.IDS.getParameterValuesName();
		weatherCallsMultipleLocation_ids = new Vector<GETParameter>();

		for (int i = 0; i < parameterNames.length; i++) {
			GETParameter getParameter = new GETParameter();
			String paramindexPair[] = parameterNames[i].split(":");
			getParameter.setParamName(paramindexPair[0]);
			getParameter.setParamValue(paramValueNames[Integer.parseInt(paramindexPair[1])]);
			weatherCallsMultipleLocation_ids.add(getParameter);
		}

		parameterNames = OpenWeatherApiCalls.Forecast_Calls.BY_CITY_ID.getParameterName();
		paramValueNames = OpenWeatherApiCalls.Forecast_Calls.BY_CITY_ID.getParameterValuesName();
		forecastCalls_byCity = new Vector<GETParameter>();

		for (int i = 0; i < parameterNames.length; i++) {
			GETParameter getParameter = new GETParameter();
			String paramindexPair[] = parameterNames[i].split(":");
			getParameter.setParamName(paramindexPair[0]);
			int paramValueNameIndex = Integer.parseInt(paramindexPair[1]);
			String[] paramValueNamePairs = paramValueNames[paramValueNameIndex].split(":");
			getParameter.setParamValue(paramValueNamePairs[0]);
			getParameter.setParamValuetype(paramValueNamePairs[1]);
			forecastCalls_byCity.add(getParameter);
		}

		parameterNames = OpenWeatherApiCalls.Forecast_Calls.BY_CITY_NAME.getParameterName();
		paramValueNames = OpenWeatherApiCalls.Forecast_Calls.BY_CITY_NAME.getParameterValuesName();
		forecastCalls_byCityName = new Vector<GETParameter>();

		for (int i = 0; i < parameterNames.length; i++) {
			GETParameter getParameter = new GETParameter();
			String paramindexPair[] = parameterNames[i].split(":");
			getParameter.setParamName(paramindexPair[0]);
			int paramValueNameIndex = Integer.parseInt(paramindexPair[1]);
			String[] paramValueNamePairs = paramValueNames[paramValueNameIndex].split(":");
			getParameter.setParamValue(paramValueNamePairs[0]);
			getParameter.setParamValuetype(paramValueNamePairs[1]);
			forecastCalls_byCityName.add(getParameter);
		}

		parameterNames = OpenWeatherApiCalls.Forecast_Calls.BY_GEO_COORDINATES.getParameterName();
		paramValueNames = OpenWeatherApiCalls.Forecast_Calls.BY_GEO_COORDINATES.getParameterValuesName();
		forecastCalls_byGeo = new Vector<GETParameter>();

		for (int i = 0; i < parameterNames.length; i++) {
			GETParameter getParameter = new GETParameter();
			String paramindexPair[] = parameterNames[i].split(":");
			getParameter.setParamName(paramindexPair[0]);
			int paramValueNameIndex = Integer.parseInt(paramindexPair[1]);
			String[] paramValueNamePairs = paramValueNames[paramValueNameIndex].split(":");
			getParameter.setParamValue(paramValueNamePairs[0]);
			getParameter.setParamValuetype(paramValueNamePairs[1]);
			forecastCalls_byGeo.add(getParameter);
		}

		parameterNames = OpenWeatherApiCalls.Forecast_Calls.BY_ZIP_CODE.getParameterName();
		paramValueNames = OpenWeatherApiCalls.Forecast_Calls.BY_ZIP_CODE.getParameterValuesName();
		forecastCalls_byZip = new Vector<GETParameter>();

		for (int i = 0; i < parameterNames.length; i++) {
			GETParameter getParameter = new GETParameter();
			String paramindexPair[] = parameterNames[i].split(":");
			getParameter.setParamName(paramindexPair[0]);
			int paramValueNameIndex = Integer.parseInt(paramindexPair[1]);
			String[] paramValueNamePairs = paramValueNames[paramValueNameIndex].split(":");
			getParameter.setParamValue(paramValueNamePairs[0]);
			getParameter.setParamValuetype(paramValueNamePairs[1]);
			forecastCalls_byZip.add(getParameter);
		}

		parameterNames = OpenWeatherApiCalls.Daily_Forecast_Calls.BY_CITY_ID.getParameterName();
		paramValueNames = OpenWeatherApiCalls.Daily_Forecast_Calls.BY_CITY_ID.getParameterValuesName();
		dailyForecastCalls_byCityId = new Vector<GETParameter>();

		for (int i = 0; i < parameterNames.length; i++) {
			GETParameter getParameter = new GETParameter();
			String paramindexPair[] = parameterNames[i].split(":");
			getParameter.setParamName(paramindexPair[0]);
			int paramValueNameIndex = Integer.parseInt(paramindexPair[1]);
			String[] paramValueNamePairs = paramValueNames[paramValueNameIndex].split(":");
			getParameter.setParamValue(paramValueNamePairs[0]);
			getParameter.setParamValuetype(paramValueNamePairs[1]);
			dailyForecastCalls_byCityId.add(getParameter);
		}

		parameterNames = OpenWeatherApiCalls.Daily_Forecast_Calls.BY_CITY_NAME.getParameterName();
		paramValueNames = OpenWeatherApiCalls.Daily_Forecast_Calls.BY_CITY_NAME.getParameterValuesName();
		dailyForecastCalls_byCityName = new Vector<GETParameter>();

		for (int i = 0; i < parameterNames.length; i++) {
			GETParameter getParameter = new GETParameter();
			String paramindexPair[] = parameterNames[i].split(":");
			getParameter.setParamName(paramindexPair[0]);
			int paramValueNameIndex = Integer.parseInt(paramindexPair[1]);
			String[] paramValueNamePairs = paramValueNames[paramValueNameIndex].split(":");
			getParameter.setParamValue(paramValueNamePairs[0]);
			getParameter.setParamValuetype(paramValueNamePairs[1]);
			dailyForecastCalls_byCityName.add(getParameter);
		}

		parameterNames = OpenWeatherApiCalls.Daily_Forecast_Calls.BY_GEO_COORDINATES.getParameterName();
		paramValueNames = OpenWeatherApiCalls.Daily_Forecast_Calls.BY_GEO_COORDINATES.getParameterValuesName();
		dailyForecastCalls_byGeo = new Vector<GETParameter>();

		for (int i = 0; i < parameterNames.length; i++) {
			GETParameter getParameter = new GETParameter();
			String paramindexPair[] = parameterNames[i].split(":");
			getParameter.setParamName(paramindexPair[0]);
			int paramValueNameIndex = Integer.parseInt(paramindexPair[1]);
			String[] paramValueNamePairs = paramValueNames[paramValueNameIndex].split(":");
			getParameter.setParamValue(paramValueNamePairs[0]);
			getParameter.setParamValuetype(paramValueNamePairs[1]);
			dailyForecastCalls_byGeo.add(getParameter);
		}

		parameterNames = OpenWeatherApiCalls.Daily_Forecast_Calls.BY_ZIP_CODE.getParameterName();
		paramValueNames = OpenWeatherApiCalls.Daily_Forecast_Calls.BY_ZIP_CODE.getParameterValuesName();
		dailyForecastCalls_byZip = new Vector<GETParameter>();

		for (int i = 0; i < parameterNames.length; i++) {
			GETParameter getParameter = new GETParameter();
			String paramindexPair[] = parameterNames[i].split(":");
			getParameter.setParamName(paramindexPair[0]);
			int paramValueNameIndex = Integer.parseInt(paramindexPair[1]);
			String[] paramValueNamePairs = paramValueNames[paramValueNameIndex].split(":");
			getParameter.setParamValue(paramValueNamePairs[0]);
			getParameter.setParamValuetype(paramValueNamePairs[1]);
			dailyForecastCalls_byZip.add(getParameter);
		}

		parameterNames = OpenWeatherApiCalls.Historical_Calls.BY_CITY_ID.getParameterName();
		paramValueNames = OpenWeatherApiCalls.Historical_Calls.BY_CITY_ID.getParameterValuesName();
		historicalCalls_byCity = new Vector<GETParameter>();

		for (int i = 0; i < parameterNames.length; i++) {
			GETParameter getParameter = new GETParameter();
			String paramindexPair[] = parameterNames[i].split(":");
			getParameter.setParamName(paramindexPair[0]);
			int paramValueNameIndex = Integer.parseInt(paramindexPair[1]);
			String[] paramValueNamePairs = paramValueNames[paramValueNameIndex].split(":");
			getParameter.setParamValue(paramValueNamePairs[0]);
			getParameter.setParamValuetype(paramValueNamePairs[1]);
			historicalCalls_byCity.add(getParameter);
		}

		parameterNames = OpenWeatherApiCalls.Historical_Calls.BY_CITY_NAME.getParameterName();
		paramValueNames = OpenWeatherApiCalls.Historical_Calls.BY_CITY_NAME.getParameterValuesName();
		historicalCalls_byCityName = new Vector<GETParameter>();

		for (int i = 0; i < parameterNames.length; i++) {
			GETParameter getParameter = new GETParameter();
			String paramindexPair[] = parameterNames[i].split(":");
			getParameter.setParamName(paramindexPair[0]);
			int paramValueNameIndex = Integer.parseInt(paramindexPair[1]);
			String[] paramValueNamePairs = paramValueNames[paramValueNameIndex].split(":");
			getParameter.setParamValue(paramValueNamePairs[0]);
			getParameter.setParamValuetype(paramValueNamePairs[1]);
			historicalCalls_byCityName.add(getParameter);
		}

		parameterNames = OpenWeatherApiCalls.Historical_Calls.BY_GEO_COORDINATES.getParameterName();
		paramValueNames = OpenWeatherApiCalls.Historical_Calls.BY_GEO_COORDINATES.getParameterValuesName();
		historicalCalls_byGeo = new Vector<GETParameter>();

		for (int i = 0; i < parameterNames.length; i++) {
			GETParameter getParameter = new GETParameter();
			String paramindexPair[] = parameterNames[i].split(":");
			getParameter.setParamName(paramindexPair[0]);
			int paramValueNameIndex = Integer.parseInt(paramindexPair[1]);
			String[] paramValueNamePairs = paramValueNames[paramValueNameIndex].split(":");
			getParameter.setParamValue(paramValueNamePairs[0]);
			getParameter.setParamValuetype(paramValueNamePairs[1]);
			historicalCalls_byGeo.add(getParameter);
		}

		parameterNames = OpenWeatherApiCalls.Alerts_Calls.BY_ID.getParameterName();
		paramValueNames = OpenWeatherApiCalls.Alerts_Calls.BY_ID.getParameterValuesName();
		alertsCalls_byId = new Vector<GETParameter>();

		for (int i = 0; i < parameterNames.length; i++) {
			GETParameter getParameter = new GETParameter();
			if (!parameterNames[i].isEmpty()) {
				String paramindexPair[] = parameterNames[i].split(":");
				getParameter.setParamName(paramindexPair[0]);
				int paramValueNameIndex = Integer.parseInt(paramindexPair[1]);
				String[] paramValueNamePairs = paramValueNames[paramValueNameIndex].split(":");
				getParameter.setParamValue(paramValueNamePairs[0]);
				getParameter.setParamValuetype(paramValueNamePairs[1]);
			} else {
				getParameter.setParamValue(paramValueNames[0].split(":")[0]);
				getParameter.setParamValue(paramValueNames[0].split(":")[1]);
			}
			alertsCalls_byId.add(getParameter);
		}

	}

}
