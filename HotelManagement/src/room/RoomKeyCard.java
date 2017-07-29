package room;

public class RoomKeyCard {

	private int cardIdentifier;
	private String cardDesription;
	private String cardCodenumber;
	private boolean cardSwiped;
	private String cardPassword;

	public int getCardIdentifier() {
		return cardIdentifier;
	}

	public void setCardIdentifier(int cardIdentifier) {
		this.cardIdentifier = cardIdentifier;
	}

	public String getCardDesription() {
		return cardDesription;
	}

	public void setCardDesription(String cardDesription) {
		this.cardDesription = cardDesription;
	}

	public String getCardCodenumber() {
		return cardCodenumber;
	}

	public void setCardCodenumber(String cardCodenumber) {
		this.cardCodenumber = cardCodenumber;
	}

	public boolean isCardSwiped() {
		return cardSwiped;
	}

	public void setCardSwiped(boolean cardSwiped) {
		this.cardSwiped = cardSwiped;
	}

	public String getCardPassword() {
		return cardPassword;
	}

	public void setCardPassword(String cardPassword) {
		this.cardPassword = cardPassword;
	}

}
