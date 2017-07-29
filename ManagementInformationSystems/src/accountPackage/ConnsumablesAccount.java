package accountPackage;
public class ConnsumablesAccount extends Account {

	private String accountName;
	private String accountDescription;
	private Integer numberOfAccounts;
	private Accounts connsumablesAccountCollection;
	private Integer serialNumber;

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountDescription() {
		return accountDescription;
	}

	public void setAccountDescription(String accountDescription) {
		this.accountDescription = accountDescription;
	}

	public Integer getNumberOfAccounts() {
		return numberOfAccounts;
	}

	public void setNumberOfAccounts(Integer numberOfAccounts) {
		this.numberOfAccounts = numberOfAccounts;
	}

	public Accounts getConnsumablesAccountCollection() {
		return connsumablesAccountCollection;
	}

	public void setConnsumablesAccountCollection(
			Accounts connsumablesAccountCollection) {
		this.connsumablesAccountCollection = connsumablesAccountCollection;
	}

	public Integer getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}

}
