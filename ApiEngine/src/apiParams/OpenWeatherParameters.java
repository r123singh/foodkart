package apiParams;

import java.util.Vector;

public class OpenWeatherParameters {

	private String weatherApiCategory;
	private Integer numberOfParameters;
	private Vector weatherApiParameters;
	public String getWeatherApiCategory() {
		return weatherApiCategory;
	}
	public void setWeatherApiCategory(String weatherApiCategory) {
		this.weatherApiCategory = weatherApiCategory;
	}
	public Integer getNumberOfParameters() {
		return numberOfParameters;
	}
	public void setNumberOfParameters(Integer numberOfParameters) {
		this.numberOfParameters = numberOfParameters;
	}
	public Vector getWeatherApiParameters() {
		return weatherApiParameters;
	}
	public void setWeatherApiParameters(Vector weatherApiParameters) {
		this.weatherApiParameters = weatherApiParameters;
	}

}
