package message;

import java.util.Date;

import user.SimpleUser;

public class MessageText {

	private String rawTextContent;
	private String textDescription;
	private String messageTextIndentifier;
	private boolean startCreating;
	private boolean endCreating;
	private boolean messageTextFinal;
	private boolean messageTextInUsage;
	private SimpleUser mTextPrimaryUser;
	private SimpleUser mTextSecondaryUser;
	private int messageTextSerialNumber;
	private boolean messageTextBlank;
	private Date messageTextDate;

	public String getRawTextContent() {
		return rawTextContent;
	}

	public void setRawTextContent(String rawTextContent) {
		this.rawTextContent = rawTextContent;
	}

	public String getTextDescription() {
		return textDescription;
	}

	public void setTextDescription(String textDescription) {
		this.textDescription = textDescription;
	}

	public String getMessageTextIndentifier() {
		return messageTextIndentifier;
	}

	public void setMessageTextIndentifier(String messageTextIndentifier) {
		this.messageTextIndentifier = messageTextIndentifier;
	}

	public boolean isStartCreating() {
		return startCreating;
	}

	public void setStartCreating(boolean startCreating) {
		this.startCreating = startCreating;
	}

	public boolean isEndCreating() {
		return endCreating;
	}

	public void setEndCreating(boolean endCreating) {
		this.endCreating = endCreating;
	}

	public boolean isMessageTextFinal() {
		return messageTextFinal;
	}

	public void setMessageTextFinal(boolean messageTextFinal) {
		this.messageTextFinal = messageTextFinal;
	}

	public boolean isMessageTextInUsage() {
		return messageTextInUsage;
	}

	public void setMessageTextInUsage(boolean messageTextInUsage) {
		this.messageTextInUsage = messageTextInUsage;
	}

	public SimpleUser getmTextPrimaryUser() {
		return mTextPrimaryUser;
	}

	public void setmTextPrimaryUser(SimpleUser mTextPrimaryUser) {
		this.mTextPrimaryUser = mTextPrimaryUser;
	}

	public SimpleUser getmTextSecondaryUser() {
		return mTextSecondaryUser;
	}

	public void setmTextSecondaryUser(SimpleUser mTextSecondaryUser) {
		this.mTextSecondaryUser = mTextSecondaryUser;
	}

	public int getMessageTextSerialNumber() {
		return messageTextSerialNumber;
	}

	public void setMessageTextSerialNumber(int messageTextSerialNumber) {
		this.messageTextSerialNumber = messageTextSerialNumber;
	}

	public boolean isMessageTextBlank() {
		return messageTextBlank;
	}

	public void setMessageTextBlank(boolean messageTextBlank) {
		this.messageTextBlank = messageTextBlank;
	}

	public Date getMessageTextDate() {
		return messageTextDate;
	}

	public void setMessageTextDate(Date messageTextDate) {
		this.messageTextDate = messageTextDate;
	}

}
