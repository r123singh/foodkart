package get;

import parameter.GETParameter;

public class GETCall {

	private GETParameter[] getParameters;
	private String url;
	public GETParameter[] getGetParameters() {
		return getParameters;
	}
	public void setGetParameters(GETParameter[] getParameters) {
		this.getParameters = getParameters;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
