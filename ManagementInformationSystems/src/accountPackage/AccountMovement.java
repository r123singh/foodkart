package accountPackage;
import java.util.Date;

public class AccountMovement {

	private Account fromAccount;

	private Account toAccount;

	private Date accountMovementDate;

	private String accountMoveDescription;

	private Float amountTransferred;

	private Integer serialNumber;

	private String accountMovementInitiator;

	private Boolean movementSuccessfull;

	private Boolean movementFailure;

	public Account getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(Account fromAccount) {
		this.fromAccount = fromAccount;
	}

	public Account getToAccount() {
		return toAccount;
	}

	public void setToAccount(Account toAccount) {
		this.toAccount = toAccount;
	}

	public Date getAccountMovementDate() {
		return accountMovementDate;
	}

	public void setAccountMovementDate(Date accountMovementDate) {
		this.accountMovementDate = accountMovementDate;
	}

	public String getAccountMoveDescription() {
		return accountMoveDescription;
	}

	public void setAccountMoveDescription(String accountMoveDescription) {
		this.accountMoveDescription = accountMoveDescription;
	}

	public Float getAmountTransferred() {
		return amountTransferred;
	}

	public void setAmountTransferred(Float amountTransferred) {
		this.amountTransferred = amountTransferred;
	}

	public Integer getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getAccountMovementInitiator() {
		return accountMovementInitiator;
	}

	public void setAccountMovementInitiator(String accountMovementInitiator) {
		this.accountMovementInitiator = accountMovementInitiator;
	}

	public Boolean getMovementSuccessfull() {
		return movementSuccessfull;
	}

	public void setMovementSuccessfull(Boolean movementSuccessfull) {
		this.movementSuccessfull = movementSuccessfull;
	}

	public Boolean getMovementFailure() {
		return movementFailure;
	}

	public void setMovementFailure(Boolean movementFailure) {
		this.movementFailure = movementFailure;
	}

}
