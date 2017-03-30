package com.full.pojo;

import java.util.ArrayList;

public class Contacts {

	private ArrayList<ContactDTO> contactsList = new ArrayList<>();

	public int getLength() {
		return contactsList.size();
	}

	public ContactDTO getContact(int index) {
		return contactsList.get(index);
	}

	public void addContact(ContactDTO contactDTO) {
		contactsList.add(contactDTO);
	}

	public boolean isEmpty() {
		return contactsList.isEmpty();
	}
}
