package userInterface;

public class MISDialogInitalizer extends BasicAccountInitializer {

	private BasicFrame basicFrame;

	private static MISDialogInitalizer dialogInitalizer;

	public MISDialogInitalizer() {
		// TODO Auto-generated constructor stub
	}

	public static MISDialogInitalizer getMISDialogInitializerInstance() {
		// TODO Auto-generated method stub
		if (getDialogInitalizer() == null) {
			dialogInitalizer = new MISDialogInitalizer();
			setDialogInitalizer(dialogInitalizer);
		}
		return getDialogInitalizer();
	}

	public void initalizeMISDialog(String command) {
		basicFrame = (BasicFrame) AllBasicUIComponents.getAllUIComponentsMap().get(BasicFrame.BASIC_FRAME_STRING);
		if (command.equals(BasicMenuItem.ADD_ACCOUNT_COMMAND)) {
			super.initializeAccountDialog(basicFrame,command);
		} else if (command.equals(BasicMenuItem.VIEW_ACCOUNT_COMMAND)) {
			super.initializeAccountDialog(basicFrame,command);
		}
	}

	public BasicFrame getBasicFrame() {
		return basicFrame;
	}

	public void setBasicFrame(BasicFrame basicFrame) {
		this.basicFrame = basicFrame;
	}

	private static MISDialogInitalizer getDialogInitalizer() {
		return dialogInitalizer;
	}

	private static void setDialogInitalizer(MISDialogInitalizer dialogInitalizer) {
		MISDialogInitalizer.dialogInitalizer = dialogInitalizer;
	}

}
