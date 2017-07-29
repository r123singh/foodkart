package accountPackage;


public class WaterAccount extends Account {

	private String accountName;
	private String serialNumber;
	private String accountDescription;
	private Integer numberOfAccounts;
	private Accounts waterAccountCollection;

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
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

	public Accounts getWaterAccountCollection() {
		return waterAccountCollection;
	}

	public void setWaterAccountCollection(Accounts waterAccountCollection) {
		this.waterAccountCollection = waterAccountCollection;
	}

}
