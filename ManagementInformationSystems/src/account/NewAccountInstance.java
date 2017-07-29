package account;

public class NewAccountInstance {

	private static NewAccountInstance newAccountInstance=null;
	private String code;
	private String name;
	private String description;

	public static NewAccountInstance getAccountInstance() {
		if (newAccountInstance == null) {
			newAccountInstance = new NewAccountInstance();
			return newAccountInstance;
		}
		return newAccountInstance;

	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

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

}
