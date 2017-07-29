package transactionPackage;

public class MonthlyTransaction extends Transaction {

	private static String monthlyTransactionString = "MONTHLY";

	private static int standardMonthDuration = 30;

	private String monthlyTransactionRemarks;

	private String monthlyTransactionComments;

	private Integer monthlyTransactionIdentifier;

	private Boolean monthlyTransactionModified;

	private Float monthlyTransactionLimit;

	public static String getMonthlyTransactionString() {
		return monthlyTransactionString;
	}

	public static void setMonthlyTransactionString(
			String monthlyTransactionString) {
		MonthlyTransaction.monthlyTransactionString = monthlyTransactionString;
	}

	public static int getStandardMonthDuration() {
		return standardMonthDuration;
	}

	public static void setStandardMonthDuration(int standardMonthDuration) {
		MonthlyTransaction.standardMonthDuration = standardMonthDuration;
	}

	public String getMonthlyTransactionRemarks() {
		return monthlyTransactionRemarks;
	}

	public void setMonthlyTransactionRemarks(String monthlyTransactionRemarks) {
		this.monthlyTransactionRemarks = monthlyTransactionRemarks;
	}

	public String getMonthlyTransactionComments() {
		return monthlyTransactionComments;
	}

	public void setMonthlyTransactionComments(String monthlyTransactionComments) {
		this.monthlyTransactionComments = monthlyTransactionComments;
	}

	public Integer getMonthlyTransactionIdentifier() {
		return monthlyTransactionIdentifier;
	}

	public void setMonthlyTransactionIdentifier(
			Integer monthlyTransactionIdentifier) {
		this.monthlyTransactionIdentifier = monthlyTransactionIdentifier;
	}

	public Boolean getMonthlyTransactionModified() {
		return monthlyTransactionModified;
	}

	public void setMonthlyTransactionModified(Boolean monthlyTransactionModified) {
		this.monthlyTransactionModified = monthlyTransactionModified;
	}

	public Float getMonthlyTransactionLimit() {
		return monthlyTransactionLimit;
	}

	public void setMonthlyTransactionLimit(Float monthlyTransactionLimit) {
		this.monthlyTransactionLimit = monthlyTransactionLimit;
	}

}
