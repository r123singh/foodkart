package transactionPackage;

import java.util.Date;

import accountPackage.Account;
import accountPackage.AccountMovement;

public class Transaction {

	private Integer transactionIdentifier;

	private Account sourceAccount;

	private Account destinationAccount;

	private AccountMovement accountMovement;

	private Date transactionStartDate;

	private String transactionComment;

	private Boolean transactionSuccess;

	private Boolean transactionFailure;

	private Date transactionEndDate;

	private String transactionInitiator;

	private Float transactionAmount;

	private String transactionStatus;

	public Integer getTransactionIdentifier() {
		return transactionIdentifier;
	}

	public void setTransactionIdentifier(Integer transactionIdentifier) {
		this.transactionIdentifier = transactionIdentifier;
	}

	public Account getSourceAccount() {
		return sourceAccount;
	}

	public void setSourceAccount(Account sourceAccount) {
		this.sourceAccount = sourceAccount;
	}

	public Account getDestinationAccount() {
		return destinationAccount;
	}

	public void setDestinationAccount(Account destinationAccount) {
		this.destinationAccount = destinationAccount;
	}

	public AccountMovement getAccountMovement() {
		return accountMovement;
	}

	public void setAccountMovement(AccountMovement accountMovement) {
		this.accountMovement = accountMovement;
	}

	public Date getTransactionStartDate() {
		return transactionStartDate;
	}

	public void setTransactionStartDate(Date transactionStartDate) {
		this.transactionStartDate = transactionStartDate;
	}

	public String getTransactionComment() {
		return transactionComment;
	}

	public void setTransactionComment(String transactionComment) {
		this.transactionComment = transactionComment;
	}

	public Boolean getTransactionSuccess() {
		return transactionSuccess;
	}

	public void setTransactionSuccess(Boolean transactionSuccess) {
		this.transactionSuccess = transactionSuccess;
	}

	public Boolean getTransactionFailure() {
		return transactionFailure;
	}

	public void setTransactionFailure(Boolean transactionFailure) {
		this.transactionFailure = transactionFailure;
	}

	public Date getTransactionEndDate() {
		return transactionEndDate;
	}

	public void setTransactionEndDate(Date transactionEndDate) {
		this.transactionEndDate = transactionEndDate;
	}

	public String getTransactionInitiator() {
		return transactionInitiator;
	}

	public void setTransactionInitiator(String transactionInitiator) {
		this.transactionInitiator = transactionInitiator;
	}

	public Float getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(Float transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

}
