package chatboxUI;

import java.awt.Dialog;
import java.awt.Frame;

public class BasicChatDialog extends Dialog {

	private int dialogXreference = 20;
	private int dialogYreference = 100;
	private int dialogHeight = 400;
	private int dialogWidth = 400;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int HGAP = 10;
	public static final int VGAP = 30;

	public BasicChatDialog(Frame owner, String title) {
		// TODO Auto-generated constructor stub
		super(owner, title);
		setBounds(dialogXreference, dialogYreference, dialogWidth, dialogHeight);
	}
	
}
