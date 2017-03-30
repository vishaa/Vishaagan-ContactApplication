package com.full.main;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

import com.full.pojo.ContactDTO;
import com.full.pojo.Contacts;
import com.full.pojo.EmailDTO;
import com.full.pojo.PhoneDTO;
import com.full.view.ContactView;

public class ContactController {

	public static void main(String[] args) {

		ContactView contactView = new ContactView();
		ContactController contactController = new ContactController();
		Contacts contacts = new Contacts();

		/// Main Menu Controller
		while (true) {

			switch (contactView.displayMainMenu()) {

			case 1:
				contactController.addContactMenu(contactView, contacts);
				break;
			case 2:
				contactController.viewContactMenu(contactView, contacts);
				break;
			case 3:
				System.exit(0);
				break;
			default:
				contactView.showInvalidOptionMessage();
			}
		}
	}

	// AddContact Menu Controller
	public void addContactMenu(ContactView contactView, Contacts contacts) {

		do {
			ContactDTO contactDTO = new ContactDTO();
			contactDTO.setNameDTO(contactView.getName());
			contactDTO.setPhoneNumbers(getPhoneNumbers(contactView));
			contactDTO.setEmails(getEmails(contactView));
			contacts.addContact(contactDTO);
		} while (Character.toLowerCase(contactView.askForAnotherContact()) == 'y');
	}

	// Getting PhoneNumber one by one
	public Map<String, LinkedHashSet<Long>> getPhoneNumbers(ContactView contactView) {

		Map<String, LinkedHashSet<Long>> phoneNumbers = new HashMap<String, LinkedHashSet<Long>>();
		LinkedHashSet<Long> phoneSet;

		do {

			PhoneDTO phoneNumber = contactView.getPhoneNumber();

			if (!(phoneNumbers.containsKey(phoneNumber.getPhoneType()))) {
				phoneSet = new LinkedHashSet<>();
				phoneSet.add(phoneNumber.getPhoneNumber());
				phoneNumbers.put(phoneNumber.getPhoneType(), phoneSet);
			} else {
				phoneSet = phoneNumbers.get(phoneNumber.getPhoneType());
				phoneSet.add(phoneNumber.getPhoneNumber());
			}

		} while (Character.toLowerCase(contactView.askForAnotherNumber()) == 'y');

		return phoneNumbers;
	}

	/// Getting Emails one by one
	public Map<String, LinkedHashSet<String>> getEmails(ContactView contactView) {

		Map<String, LinkedHashSet<String>> emails = new HashMap<String, LinkedHashSet<String>>();
		LinkedHashSet<String> mailSet = null;

		EmailDTO emailDTO;

		do {

			emailDTO = contactView.getEmail();
			if (!(emails.containsKey(emailDTO.getEmailType()))) {
				mailSet = new LinkedHashSet<>();
				mailSet.add(emailDTO.getEmailId());
				emails.put(emailDTO.getEmailType(), mailSet);
			} else {
				mailSet = emails.get(emailDTO.getEmailType());
				mailSet.add(emailDTO.getEmailId());
				emails.put(emailDTO.getEmailType(), mailSet);
			}

		} while (Character.toLowerCase(contactView.askForAnotherEmail()) == 'y');

		return emails;
	}

	///// ViewContact Menu Controller
	public void viewContactMenu(ContactView contactView, Contacts contacts) {

		int index = contactView.printContactList(contacts);
		if (index >= 0)
			contactView.printContact(contacts.getContact(index));
	}

}
