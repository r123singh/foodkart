package messaging;

public class TransactionManagment {

	private String transactionType;
	private String documentFormat;
	private String formateVersion;
	private String documentType;
	private String action;
	private String formatVersion;
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getDocumentFormat() {
		return documentFormat;
	}
	public void setDocumentFormat(String documentFormat) {
		this.documentFormat = documentFormat;
	}
	public String getFormateVersion() {
		return formateVersion;
	}
	public void setFormateVersion(String formateVersion) {
		this.formateVersion = formateVersion;
	}
	public String getDocumentType() {
		return documentType;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getFormatVersion() {
		return formatVersion;
	}
	public void setFormatVersion(String formatVersion) {
		this.formatVersion = formatVersion;
	}

}
