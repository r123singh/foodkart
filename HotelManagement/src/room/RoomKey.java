package room;

public class RoomKey {

	private int keyIdentifier;
	private String keyDescription;
	private String keyCode;
	private int keySerial;
	private String keyPassword;

	public int getKeyIdentifier() {
		return keyIdentifier;
	}

	public void setKeyIdentifier(int keyIdentifier) {
		this.keyIdentifier = keyIdentifier;
	}

	public String getKeyDescription() {
		return keyDescription;
	}

	public void setKeyDescription(String keyDescription) {
		this.keyDescription = keyDescription;
	}

	public String getKeyCode() {
		return keyCode;
	}

	public void setKeyCode(String keyCode) {
		this.keyCode = keyCode;
	}

	public int getKeySerial() {
		return keySerial;
	}

	public void setKeySerial(int keySerial) {
		this.keySerial = keySerial;
	}

	public String getKeyPassword() {
		return keyPassword;
	}

	public void setKeyPassword(String keyPassword) {
		this.keyPassword = keyPassword;
	}

}
