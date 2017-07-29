package accountPackage;


public class Accounts {
	
	private String name;
	
	private String description;
	
	private Integer numberOfAccounts;
	
	private Account[] accountsCollection;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getNumberOfAccounts() {
		return numberOfAccounts;
	}

	public void setNumberOfAccounts(Integer numberOfAccounts) {
		this.numberOfAccounts = numberOfAccounts;
	}

	public Account[] getAccountsCollection() {
		return accountsCollection;
	}

	public void setAccountsCollection(Account[] accountsCollection) {
		this.accountsCollection = accountsCollection;
	}

}
