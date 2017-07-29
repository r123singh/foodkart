package accountPackage;
public class CleaningAccount extends Account {

	private String accountName;	
	private String accountDescription;
	private Integer numberOfAccounts;
	private Accounts cleaningAccountsCollection;
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

	public Accounts getCleaningAccountsCollection() {
		return cleaningAccountsCollection;
	}

	public void setCleaningAccountsCollection(
			Accounts cleaningAccountsCollection) {
		this.cleaningAccountsCollection = cleaningAccountsCollection;
	}

	public Integer getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}

}
