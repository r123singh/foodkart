package userInterface;

import java.awt.MenuBar;

public class BasicMenuBar extends MenuBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BasicMenuBar() {
		// TODO Auto-generated constructor stub
	}

	public BasicMenuBar(BasicFrame basicFrame) {
		basicFrame.setMenuBar(this);
	}

}
