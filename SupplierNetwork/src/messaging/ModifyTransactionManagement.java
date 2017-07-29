package messaging;

public class ModifyTransactionManagement {

	private String documentType;
	private String documentFormat;
	private String documentVersion;
	private String sendReceive;
	private String deliveryMethod;
	public String getDocumentType() {
		return documentType;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	public String getDocumentFormat() {
		return documentFormat;
	}
	public void setDocumentFormat(String documentFormat) {
		this.documentFormat = documentFormat;
	}
	public String getDocumentVersion() {
		return documentVersion;
	}
	public void setDocumentVersion(String documentVersion) {
		this.documentVersion = documentVersion;
	}
	public String getSendReceive() {
		return sendReceive;
	}
	public void setSendReceive(String sendReceive) {
		this.sendReceive = sendReceive;
	}
	public String getDeliveryMethod() {
		return deliveryMethod;
	}
	public void setDeliveryMethod(String deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}

}
