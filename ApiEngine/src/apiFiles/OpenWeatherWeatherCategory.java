package apiFiles;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import parameter.GETParameter;
import apiCalls.OpenWeatherApiCalls;
import apiCalls.OpenWeatherApiCalls.Weather_Calls_One_Location;
import apiData.OpenWeatherApiData;

public class OpenWeatherWeatherCategory {

	private String categoryString;
	private String description;
	private Vector<SubCategory> weatherOneSubcategory;

	class SubCategory {
		private String categoryName;
		private Vector<GETParameter> parameters;
		public String getCategoryName() {
			return categoryName;
		}
		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}
		public Vector<GETParameter> getParameters() {
			return parameters;
		}
		public void setParameters(Vector<GETParameter> parameters) {
			this.parameters = parameters;
		}

	}

	public OpenWeatherWeatherCategory() {
		// TODO Auto-generated constructor stub
		categoryString = OpenWeatherApiCategories.WEAHTER_CATEGORY_ONE;
	}

	private void setWeatherCall(String categoryName) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		HashMap<OpenWeatherApiCalls.Weather_Calls_One_Location, Vector<GETParameter>> map = ((HashMap<Weather_Calls_One_Location, Vector<GETParameter>>) OpenWeatherApiData
				.getOpenWeatherApiInstance().categoryCallMap().get(OpenWeatherApiCategories.WEAHTER_CATEGORY_ONE));
		for (Map.Entry<OpenWeatherApiCalls.Weather_Calls_One_Location, Vector<GETParameter>> m : map.entrySet()) {
			String subCat = m.getKey().toString();
			Vector<GETParameter> parameters = m.getValue();
			SubCategory category = new SubCategory();
			category.setCategoryName(subCat);
			category.setParameters(parameters);
			HashMap<String, SubCategory> me = new HashMap<>();
			me.put(subCat, category);
			weatherOneSubcategory.add(category);
		}
	}
	public String getCategoryString() {
		return categoryString;
	}
	public void setCategoryString(String categoryString) {
		this.categoryString = categoryString;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
