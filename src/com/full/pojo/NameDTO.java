package com.full.pojo;

public class NameDTO {

	private String firstName;
	private String middleName;
	private String lastName;
	private String phoneticName;
	private String nickName;

	public NameDTO() {
		super();
	}

	public NameDTO(String firstName, String middleName, String lastName, String phoneticName, String nickName) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneticName = phoneticName;
		this.nickName = nickName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneticName() {
		return phoneticName;
	}

	public void setPhoneticName(String phoneticName) {
		this.phoneticName = phoneticName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
}
