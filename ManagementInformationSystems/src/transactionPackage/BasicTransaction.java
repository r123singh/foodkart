package transactionPackage;

public class BasicTransaction extends Transaction {

	private Integer basicTransactionIdentifier;

	private Float basicAmountTransaction;

	private String basicTransactionType;

	private String basicTransactionRemarks;

	private Boolean basicTransactionModified;

	public Integer getBasicTransactionIdentifier() {
		return basicTransactionIdentifier;
	}

	public void setBasicTransactionIdentifier(Integer basicTransactionIdentifier) {
		this.basicTransactionIdentifier = basicTransactionIdentifier;
	}

	public Float getBasicAmountTransaction() {
		return basicAmountTransaction;
	}

	public void setBasicAmountTransaction(Float basicAmountTransaction) {
		this.basicAmountTransaction = basicAmountTransaction;
	}

	public String getBasicTransactionType() {
		return basicTransactionType;
	}

	public void setBasicTransactionType(String basicTransactionType) {
		this.basicTransactionType = basicTransactionType;
	}

	public String getBasicTransactionRemarks() {
		return basicTransactionRemarks;
	}

	public void setBasicTransactionRemarks(String basicTransactionRemarks) {
		this.basicTransactionRemarks = basicTransactionRemarks;
	}

	public Boolean getBasicTransactionModified() {
		return basicTransactionModified;
	}

	public void setBasicTransactionModified(Boolean basicTransactionModified) {
		this.basicTransactionModified = basicTransactionModified;
	}

}
