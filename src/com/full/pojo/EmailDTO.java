package com.full.pojo;

public class EmailDTO {

	private String emailId;
	private String emailType;

	public EmailDTO() {
		super();
	}

	public EmailDTO(String emailId, String emailType) {
		super();
		this.emailId = emailId;
		this.emailType = emailType;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getEmailType() {
		return emailType;
	}

	public void setEmailType(String emailType) {
		this.emailType = emailType;
	}

}
