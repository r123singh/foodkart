package accountPackage;
import java.util.Date;

public class ClosedAccount extends Account {

	private Integer serialNumber;
	
	private Float cloasingBalance;
	
	private Date accountClosingDate;
	
	private String accountCloseDescription;
	
	private String closingAccountType;
	
	private Account transferredToAccount;

	public Integer getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Float getCloasingBalance() {
		return cloasingBalance;
	}

	public void setCloasingBalance(Float cloasingBalance) {
		this.cloasingBalance = cloasingBalance;
	}

	public Date getAccountClosingDate() {
		return accountClosingDate;
	}

	public void setAccountClosingDate(Date accountClosingDate) {
		this.accountClosingDate = accountClosingDate;
	}

	public String getAccountCloseDescription() {
		return accountCloseDescription;
	}

	public void setAccountCloseDescription(String accountCloseDescription) {
		this.accountCloseDescription = accountCloseDescription;
	}

	public String getClosingAccountType() {
		return closingAccountType;
	}

	public void setClosingAccountType(String closingAccountType) {
		this.closingAccountType = closingAccountType;
	}

	public Account getTransferredToAccount() {
		return transferredToAccount;
	}

	public void setTransferredToAccount(Account transferredToAccount) {
		this.transferredToAccount = transferredToAccount;
	}

}
