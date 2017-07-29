package messaging;

public class CommRuntimeParameters {

	private String documentUrl;
	private String basicAuthntication;
	private String basicAuthenticationRealm;
	private String basicAuthenticationUsername;
	private String basicAuthenticationPassword;
	public String getDocumentUrl() {
		return documentUrl;
	}
	public void setDocumentUrl(String documentUrl) {
		this.documentUrl = documentUrl;
	}
	public String getBasicAuthntication() {
		return basicAuthntication;
	}
	public void setBasicAuthntication(String basicAuthntication) {
		this.basicAuthntication = basicAuthntication;
	}
	public String getBasicAuthenticationRealm() {
		return basicAuthenticationRealm;
	}
	public void setBasicAuthenticationRealm(String basicAuthenticationRealm) {
		this.basicAuthenticationRealm = basicAuthenticationRealm;
	}
	public String getBasicAuthenticationUsername() {
		return basicAuthenticationUsername;
	}
	public void setBasicAuthenticationUsername(String basicAuthenticationUsername) {
		this.basicAuthenticationUsername = basicAuthenticationUsername;
	}
	public String getBasicAuthenticationPassword() {
		return basicAuthenticationPassword;
	}
	public void setBasicAuthenticationPassword(String basicAuthenticationPassword) {
		this.basicAuthenticationPassword = basicAuthenticationPassword;
	}

}
