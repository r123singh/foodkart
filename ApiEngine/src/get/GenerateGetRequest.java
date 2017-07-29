package get;

import parameter.GETParameter;

public class GenerateGetRequest {

	public GenerateGetRequest(String APICategory) {
		// TODO Auto-generated constructor stub
	}

	public static void createGetRequest(GETCall call) {
		// TODO Auto-generated method stub
		GETParameter[] parameters = call.getGetParameters();
		StringBuilder sb = new StringBuilder();
		sb.append(call.getUrl());
		sb.append("?");
		for (int i = 0; i < parameters.length; i++) {
			sb.append(parameters[i].getParamName());
			sb.append("=");
			setParameterValueType(sb, parameters[i].getParamValue(), parameters[i].getParamValuetype());
			sb.append("&");
		}
		sb.toString();
	}

	private static void setParameterValueType(StringBuilder sb, String paramValue, String paramValuetype) {
		// TODO Auto-generated method stub
		switch (paramValuetype.toUpperCase()) {
			case "INTEGER" :
				int paramInteger = Integer.parseInt(paramValue);
				sb.append(paramInteger);
				break;
			case "FLOAT" :
				float paramFloat = Float.parseFloat(paramValue);
				sb.append(paramFloat);
				break;
			case "STRING" :
				sb.append(paramValue);
				break;
			default :
				break;
		}
	}

}
