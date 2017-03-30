package com.full.pojo;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class ContactDTO {

	private NameDTO nameDTO;
	private Map<String, LinkedHashSet<Long>> phoneNumbers = new HashMap<String, LinkedHashSet<Long>>();
	private Map<String, LinkedHashSet<String>> emails = new HashMap<String, LinkedHashSet<String>>();

	public NameDTO getNameDTO() {
		return nameDTO;
	}

	public void setNameDTO(NameDTO nameDTO) {
		this.nameDTO = nameDTO;
	}

	public Map<String, LinkedHashSet<Long>> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(Map<String, LinkedHashSet<Long>> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public Map<String, LinkedHashSet<String>> getEmails() {
		return emails;
	}

	public void setEmails(Map<String, LinkedHashSet<String>> emails) {
		this.emails = emails;
	}

}
