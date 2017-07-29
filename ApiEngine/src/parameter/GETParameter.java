package parameter;

public class GETParameter {

	private String paramName;
	private String paramValue;
	private String paramValuetype;
	
	public GETParameter() {
		// TODO Auto-generated constructor stub
	}

	private String seperator;
	public String getParamName() {
		return paramName;
	}
	public void setParamName(String paramName) {
		this.paramName = paramName;
	}
	public String getParamValue() {
		return paramValue;
	}
	public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
	}
	public String getSeperator() {
		return seperator;
	}
	public void setSeperator(String seperator) {
		this.seperator = seperator;
	}
	public String getParamValuetype() {
		return paramValuetype;
	}
	public void setParamValuetype(String paramValuetype) {
		this.paramValuetype = paramValuetype;
	}

}
