package user;


public class UserPair {

	private String primaryUser;
	private String secondaryUser;
	private String userPaidIdentifier;

	private static final String USER_PAIR_SPERATOR = "-";

	public UserPair() {
		// TODO Auto-generated constructor stub
	}

	public UserPair(String primaryUser, String secondaryUser,
			String userPaidIdentifier) {
		super();
		this.primaryUser = primaryUser;
		this.secondaryUser = secondaryUser;
		this.userPaidIdentifier = generateUniquePairId(primaryUser,
				secondaryUser);
	}

	private String generateUniquePairId(String primaryUser, String secondaryUser) {
		// TODO Auto-generated method stub
		return primaryUser + USER_PAIR_SPERATOR + secondaryUser;
	}

	public String getPrimaryUser() {
		return primaryUser;
	}

	public void setPrimaryUser(String primaryUser) {
		this.primaryUser = primaryUser;
	}

	public String getSecondaryUser() {
		return secondaryUser;
	}

	public void setSecondaryUser(String secondaryUser) {
		this.secondaryUser = secondaryUser;
	}

	public String getUserPaidIdentifier() {
		return userPaidIdentifier;
	}

	public void setUserPaidIdentifier(String userPaidIdentifier) {
		this.userPaidIdentifier = userPaidIdentifier;
	}

}
