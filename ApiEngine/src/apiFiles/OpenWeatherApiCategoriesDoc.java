package apiFiles;

public class OpenWeatherApiCategoriesDoc {

	public enum CURRENT_WEATHER {
		CITY_NAME("You can call by city name or city name and country code. API responds with a list of results that match a searching word."), CITY_ID(
				"You can call by city ID. API responds with exact result."), GEO_COORDINATES("Coordinates of the location of your interest"), ZIP_CODE(
				"Please note if country is not specified then the search works for USA as a default.");

		private String description;

		CURRENT_WEATHER(String description) {
			this.setDescription(description);
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

}
