package apiFiles;

public interface OpenWeatherApiCategories {

	public static String WEAHTER_CATEGORY_ONE = "Weather API";
	public static String WEAHTER_CATEGORY_MUL = "Weather API";
	
	public static String FORECAST_CATEGORY = "Forecast API";
	public static String FORECAST_CATEGORY_DAILY = "Forecast API";
	
	public static String HISTORY_CATEGORY = "History API";
	public static String ALERTS_CATEGORY = "Alerts API";

	void loadCategories();
}
