package accountPackage;
import java.io.Serializable;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final AtomicInteger count=new AtomicInteger(0);
	private  int accountIdentifier;
	private String description;
	private String name;
	private Date startDate;
	private Float balance;
	private String accountCode;
	
	public Account() {
		accountIdentifier=count.incrementAndGet();
	}
	
	public String getAccountCode() {
		return accountCode;
	}

	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Float getBalance() {
		return balance;
	}

	public void setBalance(Float balance) {
		this.balance = balance;
	}

	public int getAccountIdentifier() {
		return accountIdentifier;
	}

	public void setAccountIdentifier(int accountIdentifier) {
		this.accountIdentifier = accountIdentifier;
	}

}
