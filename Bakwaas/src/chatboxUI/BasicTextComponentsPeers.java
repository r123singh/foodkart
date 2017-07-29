package chatboxUI;

public class BasicTextComponentsPeers {

	public BasicTextComponentsPeers() {
		// TODO Auto-generated constructor stub
	}

	private BasicChatTextbox basicChatTextbox;
	private BasicChatArea basicChatArea;

	public BasicTextComponentsPeers(BasicChatTextbox basicChatTextbox,
			BasicChatArea basicChatArea) {
		super();
		this.basicChatTextbox = basicChatTextbox;
		this.basicChatArea = basicChatArea;
	}

	public BasicChatTextbox getBasicChatTextbox() {
		return basicChatTextbox;
	}

	public void setBasicChatTextbox(BasicChatTextbox basicChatTextbox) {
		this.basicChatTextbox = basicChatTextbox;
	}

	public BasicChatArea getBasicChatArea() {
		return basicChatArea;
	}

	public void setBasicChatArea(BasicChatArea basicChatArea) {
		this.basicChatArea = basicChatArea;
	}

}
