package userInterface;

public class MISMenuInitializer extends BasicMenuInitializer {

	private BasicFrame basicFrame;

	private static MISMenuInitializer misMenuInitializer;

	public MISMenuInitializer() {
		// TODO Auto-generated constructor stub
	}

	public static MISMenuInitializer getMISInitializeInstance() {
		// TODO Auto-generated method stub
		if (getMisMenuInitializer() == null) {
			MISMenuInitializer misMenuInitializer = new MISMenuInitializer();
			setMisMenuInitializer(misMenuInitializer);
		}
		return getMisMenuInitializer();
	}

	public void initializeMISMenu() {
		initializeBasicMenu((BasicFrame) AllBasicUIComponents
				.getAllUIComponentsMap().get("BASIC_FRAME"));
	}

	public void initializeBasicMenu(BasicFrame basicFrame) {
		super.initializeBasicMenu(basicFrame);
	}

	public BasicFrame getBasicFrame() {
		return basicFrame;
	}

	public void setBasicFrame(BasicFrame basicFrame) {
		this.basicFrame = basicFrame;
	}

	public static MISMenuInitializer getMisMenuInitializer() {
		return misMenuInitializer;
	}

	public static void setMisMenuInitializer(
			MISMenuInitializer misMenuInitializer) {
		MISMenuInitializer.misMenuInitializer = misMenuInitializer;
	}

}
