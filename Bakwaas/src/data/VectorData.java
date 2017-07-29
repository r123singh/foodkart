package data;

import java.util.Vector;

public class VectorData extends Vector {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userPairIdentifier;

	public VectorData(String pairId) {
		// TODO Auto-generated constructor stub
		this.userPairIdentifier = pairId;
	}

	public String getUserPairIdentifier() {
		return userPairIdentifier;
	}

	public void setUserPairIdentifier(String userPairIdentifier) {
		this.userPairIdentifier = userPairIdentifier;
	}

}
