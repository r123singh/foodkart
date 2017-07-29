package now;

public class CurrentWeather {

	private String localObservationTime;
	private String weatherText;
	private String weatherIcon;
	private String temperaturemetri;
	private String temperatvalue;
	private String temperaturunit;
	private String mobilelink;
	private String impertempValue;
	private String impertemunit;

	public String getImpertempValue() {
		return impertempValue;
	}
	public void setImpertempValue(String impertempValue) {
		this.impertempValue = impertempValue.trim();
	}
	public String getImpertemunit() {
		return impertemunit;
	}
	public void setImpertemunit(String impertemunit) {
		this.impertemunit = impertemunit;
	}
	public String getLocalObservationTime() {
		return localObservationTime;
	}
	public void setLocalObservationTime(String localObservationTime) {
		this.localObservationTime = localObservationTime;
	}
	public String getWeatherText() {
		return weatherText;
	}
	public void setWeatherText(String weatherText) {
		this.weatherText = weatherText;
	}
	public String getWeatherIcon() {
		return weatherIcon;
	}
	public void setWeatherIcon(String weatherIcon) {
		this.weatherIcon = weatherIcon;
	}
	public String getTemperaturemetri() {
		return temperaturemetri;
	}
	public void setTemperaturemetri(String temperaturemetri) {
		this.temperaturemetri = temperaturemetri;
	}
	public String getTemperatvalue() {
		return temperatvalue;
	}
	public void setTemperatvalue(String temperatvalue) {
		this.temperatvalue = temperatvalue.trim();
	}
	public String getTemperaturunit() {
		return temperaturunit;
	}
	public void setTemperaturunit(String temperaturunit) {
		this.temperaturunit = temperaturunit;
	}
	public String getMobilelink() {
		return mobilelink;
	}
	public void setMobilelink(String mobilelink) {
		this.mobilelink = mobilelink;
	}

}
