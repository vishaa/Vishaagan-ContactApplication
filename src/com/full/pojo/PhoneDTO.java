package com.full.pojo;

public class PhoneDTO {

	private long phoneNumber;
	private String phoneType;

	public PhoneDTO() {
		super();
	}

	public PhoneDTO(long phoneNumber, String phoneType) {
		this.phoneNumber = phoneNumber;
		this.phoneType = phoneType;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

}
