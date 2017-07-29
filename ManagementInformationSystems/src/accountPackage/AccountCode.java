package accountPackage;

import java.util.Date;

public class AccountCode {

	private String codeName;

	private Date creationDate;

	private String accountCodeDescription;

	private Integer codeSerialNumber;

	private String accountCodeCreatedBy;

	private String accountCodePrefix;

	private AccountCodeUniqueIdentifier uniqueAccountIdentfier;

	public String getCodeName() {
		return codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getAccountCodeDescription() {
		return accountCodeDescription;
	}

	public void setAccountCodeDescription(String accountCodeDescription) {
		this.accountCodeDescription = accountCodeDescription;
	}

	public Integer getCodeSerialNumber() {
		return codeSerialNumber;
	}

	public void setCodeSerialNumber(Integer codeSerialNumber) {
		this.codeSerialNumber = codeSerialNumber;
	}

	public String getAccountCodeCreatedBy() {
		return accountCodeCreatedBy;
	}

	public void setAccountCodeCreatedBy(String accountCodeCreatedBy) {
		this.accountCodeCreatedBy = accountCodeCreatedBy;
	}

	public String getAccountCodePrefix() {
		return accountCodePrefix;
	}

	public void setAccountCodePrefix(String accountCodePrefix) {
		this.accountCodePrefix = accountCodePrefix;
	}

	public AccountCodeUniqueIdentifier getUniqueAccountIdentfier() {
		return uniqueAccountIdentfier;
	}

	public void setUniqueAccountIdentfier(
			AccountCodeUniqueIdentifier uniqueAccountIdentfier) {
		this.uniqueAccountIdentfier = uniqueAccountIdentfier;
	}

}