package transactionPackage;

import accountPackage.Account;

public class ScheduledTransaction extends Transaction {

	private String scheduledTransactionIdentier;

	private String scheduledTransactionRemarks;

	private Integer scheduledTransactionAmount;

	private Account destinationAccount;

	private Account sourceAccount;

	private Integer scheduleFrequency;

	private Boolean scheduledTransactionOnHold;

	private Boolean scheduledTransactionModified;

	public String getScheduledTransactionIdentier() {
		return scheduledTransactionIdentier;
	}

	public void setScheduledTransactionIdentier(
			String scheduledTransactionIdentier) {
		this.scheduledTransactionIdentier = scheduledTransactionIdentier;
	}

	public String getScheduledTransactionRemarks() {
		return scheduledTransactionRemarks;
	}

	public void setScheduledTransactionRemarks(
			String scheduledTransactionRemarks) {
		this.scheduledTransactionRemarks = scheduledTransactionRemarks;
	}

	public Integer getScheduledTransactionAmount() {
		return scheduledTransactionAmount;
	}

	public void setScheduledTransactionAmount(Integer scheduledTransactionAmount) {
		this.scheduledTransactionAmount = scheduledTransactionAmount;
	}

	public Account getDestinationAccount() {
		return destinationAccount;
	}

	public void setDestinationAccount(Account destinationAccount) {
		this.destinationAccount = destinationAccount;
	}

	public Account getSourceAccount() {
		return sourceAccount;
	}

	public void setSourceAccount(Account sourceAccount) {
		this.sourceAccount = sourceAccount;
	}

	public Integer getScheduleFrequency() {
		return scheduleFrequency;
	}

	public void setScheduleFrequency(Integer scheduleFrequency) {
		this.scheduleFrequency = scheduleFrequency;
	}

	public Boolean getScheduledTransactionOnHold() {
		return scheduledTransactionOnHold;
	}

	public void setScheduledTransactionOnHold(Boolean scheduledTransactionOnHold) {
		this.scheduledTransactionOnHold = scheduledTransactionOnHold;
	}

	public Boolean getScheduledTransactionModified() {
		return scheduledTransactionModified;
	}

	public void setScheduledTransactionModified(
			Boolean scheduledTransactionModified) {
		this.scheduledTransactionModified = scheduledTransactionModified;
	}

}
