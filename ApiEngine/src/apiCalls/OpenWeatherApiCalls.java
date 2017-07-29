package apiCalls;

public class OpenWeatherApiCalls {

	public enum Weather_Calls_One_Location {
		BY_CITY_NAME(new String[]{"q:0", "q:1"}, new String[]{"cityName:String", "cityCode:String"}), BY_CITY_ID(new String[]{"id:0"},
				new String[]{"cityId:Integer"}), BY_GEO_COORDINATES(new String[]{"lat:0", "lon:1"}, new String[]{"lat:Integer", "lon:String"}), BY_ZIP_CODE(
				new String[]{"zip:0", "zip:1"}, new String[]{"zipCode:String", "countryCode:String"});

		private String[] parameterName;
		private String[] paramValuesNames;

		Weather_Calls_One_Location(String[] parameterName, String[] paramValuesNames) {
			this.setParameterName(parameterName);
			this.setParamValuesNames(paramValuesNames);
		}

		public String[] getParamValuesNames() {
			return paramValuesNames;
		}

		public void setParamValuesNames(String[] paramValuesNames) {
			this.paramValuesNames = paramValuesNames;
		}

		public String[] getParameterName() {
			return parameterName;
		}

		public void setParameterName(String[] parameterName) {
			this.parameterName = parameterName;
		}
	}

	public enum Weather_Calls_Multiple_Cities {
		BBOX(new String[]{"bbox:0", "bbox:1", "bbox:2", "bbox:3", "bbox:4"}, new String[]{"[lon-left:String", "lat-bottom:String", "lon-right:String",
				"lat-top:String", "zoom:String"}), CYCLE(new String[]{"lat:0", "lon:1", "cnt:2"}, new String[]{"latitude:Integer", "longitude:Integer",
				"cities number:Integer"}), IDS(new String[]{"id:0", "units:1"}, new String[]{"cityID:Integer", "metric:Constant"});

		private String parameterName[];
		private String parameterValuesName[];

		Weather_Calls_Multiple_Cities(String[] parameterName, String[] parameterValuesName) {
			this.parameterName = parameterName;
			this.parameterValuesName = parameterValuesName;
		}

		public String[] getParameterName() {
			return parameterName;
		}

		public void setParameterName(String parameterName[]) {
			this.parameterName = parameterName;
		}

		public String[] getParameterValuesName() {
			return parameterValuesName;
		}

		public void setParameterValuesName(String parameterValuesName[]) {
			this.parameterValuesName = parameterValuesName;
		}
	}

	public enum Forecast_Calls {
		BY_CITY_NAME(new String[]{"id:0", "id:1"}, new String[]{"cityName:String", "countryCode:String"}), BY_CITY_ID(new String[]{"id:0"},
				new String[]{"city ID:String"}), BY_GEO_COORDINATES(new String[]{"lat:0,lon:1"}, new String[]{"lat:Integer", "lon:Integer"}), BY_ZIP_CODE(
				new String[]{"zip:0", "zip:1"}, new String[]{"zip code:Integer", "country code:Integer"});

		private String[] parameterName;
		private String[] parameterValuesName;

		Forecast_Calls(String[] parameterName, String[] parameterValuesName) {
			this.setParameterName(parameterName);
			this.setParameterValuesName(parameterValuesName);
		}

		public String[] getParameterName() {
			return parameterName;
		}

		public void setParameterName(String[] parameterName) {
			this.parameterName = parameterName;
		}

		public String[] getParameterValuesName() {
			return parameterValuesName;
		}

		public void setParameterValuesName(String[] parameterValuesName) {
			this.parameterValuesName = parameterValuesName;
		}

	}

	public enum Daily_Forecast_Calls {
		BY_CITY_NAME(new String[]{"q:0", "q:1", "units:2", "cnt:3"}, new String[]{"city name:String", "country code:Integer", "metric:Constant",
				"number days:Integer"}), BY_CITY_ID(new String[]{"id:0", "cnt:1"}, new String[]{"city ID:String", "number days:Integer"}), BY_GEO_COORDINATES(
				new String[]{"lat:0", "lon:1", "cnt:2"}, new String[]{"lat:Integer", "lon:Integer", "number days:Integer"}), BY_ZIP_CODE(new String[]{"zip:0",
				"zip:1"}, new String[]{"zip code:String", "country code:String"});

		private String[] parameterName;
		private String[] parameterValuesName;

		private Daily_Forecast_Calls(String[] parameterName, String[] parameterValuesName) {
			// TODO Auto-generated constructor stub
			this.setParameterName(parameterName);
			this.setParameterValuesName(parameterValuesName);
		}

		public String[] getParameterName() {
			return parameterName;
		}

		public void setParameterName(String[] parameterName) {
			this.parameterName = parameterName;
		}

		public String[] getParameterValuesName() {
			return parameterValuesName;
		}

		public void setParameterValuesName(String[] parameterValuesName) {
			this.parameterValuesName = parameterValuesName;
		}

	}

	public enum Historical_Calls {
		BY_CITY_ID(new String[]{"id:0", "type:1"}, new String[]{"city ID:Integer", "hour:Constant"}), BY_CITY_NAME(new String[]{"q:0", "q:1"}, new String[]{
				"city ID:String", "country code:Integer"}), BY_GEO_COORDINATES(new String[]{"lat:0", "lon:1"}, new String[]{"lat:Integer", "lon:Integer"});

		private String[] parameterName;
		private String[] parameterValuesName;

		private Historical_Calls(String[] parameterName, String[] parameterValuesName) {
			// TODO Auto-generated constructor stub

		}

		public String[] getParameterValuesName() {
			return parameterValuesName;
		}

		public void setParameterValuesName(String[] parameterValuesName) {
			this.parameterValuesName = parameterValuesName;
		}

		public String[] getParameterName() {
			return parameterName;
		}

		public void setParameterName(String[] parameterName) {
			this.parameterName = parameterName;
		}

	}

	public enum Alerts_Calls {
		BY_ID(new String[]{""}, new String[]{"Id:Integer"});

		private String[] parameterName;
		private String[] parameterValuesName;

		private Alerts_Calls(String[] parameterName, String[] parameterValuesName) {
			// TODO Auto-generated constructor stub
			this.parameterName = parameterName;
			this.parameterValuesName = parameterValuesName;
		}

		public String[] getParameterName() {
			return parameterName;
		}

		public void setParameterName(String[] parameterName) {
			this.parameterName = parameterName;
		}

		public String[] getParameterValuesName() {
			return parameterValuesName;
		}

		public void setParameterValuesName(String[] parameterValuesName) {
			this.parameterValuesName = parameterValuesName;
		}
	}

}
