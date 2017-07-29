package userInterface;

public class BasicFrameInitializer {

	private BasicFrame basicFrame;
	private boolean isInitialized;
	private boolean FRAME_RESIZABLE = false;
	private boolean FRAME_VISIBLE = true;

	public BasicFrameInitializer() {
		// TODO Auto-generated constructor stub
		this.isInitialized = false;
	}

	public void initializeBasicFrame() {
		// TODO Auto-generated method stub
		setInitialized(false);
		BasicFrame basicFrame = new BasicFrame();
		
		constructLoginLabel(basicFrame);
		constructLoginNameTextField(constructLoginNameLabel(basicFrame),basicFrame);
		constructLoginPasswordTextField(constructLoginPasswordLabel(basicFrame),basicFrame);
		constructLoginButton(basicFrame);

		AllBasicUIComponents.getAllUIComponentsMap().put("BASIC_FRAME",basicFrame);
		basicFrame.setLayout(null);
		basicFrame.setResizable(FRAME_RESIZABLE);
		basicFrame.setVisible(FRAME_VISIBLE);
		setInitialized(true);
	}

	private void constructLoginButton(BasicFrame basicFrame) {
		// TODO Auto-generated method stub
		LoginButton loginButton = new LoginButton(basicFrame);
		basicFrame.add(loginButton);
		AllBasicUIComponents.getAllUIComponentsMap().put("LOGIN_BUTTON",loginButton);
	}

	private void constructLoginPasswordTextField(
			LoginPasswordLabel loginPasswordLabel, BasicFrame basicFrame) {
		// TODO Auto-generated method stub
		LoginPasswordTextField loginPasswordTextField = new LoginPasswordTextField(loginPasswordLabel);
		basicFrame.add(loginPasswordTextField);
		AllBasicUIComponents.getAllUIComponentsMap().put("LOGIN_PASSWORD_TEXT",loginPasswordTextField);

	}

	private LoginPasswordLabel constructLoginPasswordLabel(BasicFrame basicFrame) {
		// TODO Auto-generated method stub
		LoginPasswordLabel loginPasswordLabel = new LoginPasswordLabel(basicFrame);
		loginPasswordLabel.decorateLabel();
		basicFrame.add(loginPasswordLabel);
		AllBasicUIComponents.getAllUIComponentsMap().put("LOGIN_PASSWORD_LABEL",loginPasswordLabel);
		return loginPasswordLabel;
	}

	private void constructLoginNameTextField(LoginNameLabel loginNameLabel,
			BasicFrame basicFrame) {
		// TODO Auto-generated method stub
		LoginNameTextField loginNameTextField = new LoginNameTextField(
				loginNameLabel);
		basicFrame.add(loginNameTextField);
		AllBasicUIComponents.getAllUIComponentsMap().put("LOGIN_NAME_TEXT",loginNameTextField);
	}

	private LoginNameLabel constructLoginNameLabel(BasicFrame basicFrame) {
		// TODO Auto-generated method stub
		LoginNameLabel loginNameLabel = new LoginNameLabel(basicFrame);
		loginNameLabel.decorateLabel();
		basicFrame.add(loginNameLabel);
		AllBasicUIComponents.getAllUIComponentsMap().put("LOGIN_NAME_LABEL",loginNameLabel);
		return loginNameLabel;
	}

	private void constructLoginLabel(BasicFrame basicFrame) {
		// TODO Auto-generated method stub
		LoginLabel loginLabel = new LoginLabel(basicFrame);
		loginLabel.decorateLabel();
		basicFrame.add(loginLabel);
		AllBasicUIComponents.getAllUIComponentsMap().put("LOGIN_LABEL",loginLabel);
	}

	public boolean isInitialized() {
		return isInitialized;
	}

	public void setInitialized(boolean isInitialized) {
		this.isInitialized = isInitialized;
	}

	public BasicFrame getBasicFrame() {
		return basicFrame;
	}

	public void setBasicFrame(BasicFrame basicFrame) {
		this.basicFrame = basicFrame;
	}

}
