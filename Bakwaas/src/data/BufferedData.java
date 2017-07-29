package data;

import java.util.HashMap;

import user.UserPair;

public class BufferedData extends HashMap {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static BufferedData bufferedDataMap;

	private static String primaryUser = "user1";
	private static String secondaryUser = "user2";
	private static UserPair userPair;

	public static BufferedData getBufferMapInstance() {
		if (bufferedDataMap == null) {
			bufferedDataMap = new BufferedData();
			userPair = new UserPair(primaryUser, secondaryUser, null);

		}
		return bufferedDataMap;
	}

	public void initializeMap() {
		// TODO Auto-generated method stub
		VectorData uniquePairVector=new VectorData(userPair.getUserPaidIdentifier());
		this.put(userPair.getUserPaidIdentifier(), uniquePairVector);
	}
	
	public static UserPair getUserPair() {
		return userPair;
	}

	public static void setUserPair(UserPair userPair) {
		BufferedData.userPair = userPair;
	}

}
