package com.full.view;

import static java.lang.System.out;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;

import com.full.pojo.*;

public class ContactView {

	Scanner input = new Scanner(System.in);

	//// ------------------DISPLAY MENU----------------------
	public int displayMainMenu() {
		out.println("\n\n1. Add Contacts");
		out.println("2. View Contacts");
		out.println("3. Exit");
		return getOption();
	}

	public int getOption() {
		out.println("\nEnter your choice: ");
		while (!input.hasNextInt()) {
			out.println("Option should be a number");
			input.next();
		}

		return input.nextInt();
	}

	public void showInvalidOptionMessage() {
		out.println("\n Enter the correct choice");
	}

	//// Asking Names
	public NameDTO getName() {
		NameDTO names = new NameDTO();
		out.println("\nFirst Name* : ");
		names.setFirstName(input.next());
		input.nextLine();
		out.println("Middle Name : ");
		names.setMiddleName(input.nextLine());
		out.println("Last Name : ");
		names.setLastName(input.nextLine());
		out.println("Phonetic Name : ");
		names.setPhoneticName(input.nextLine());
		out.println("Nick Name : ");
		names.setNickName(input.nextLine());
		return names;
	}

	// Asking Phone Number
	public PhoneDTO getPhoneNumber() {

		PhoneDTO phoneNumber = new PhoneDTO();

		out.println("Contact Numbers");
		out.println("---------------\n");

		out.println("\nEnter the number* : ");
		while (!input.hasNextLong()) {
			out.println("Enter only numbers");
			out.println("\nEnter the number* : ");
			input.next();

		}
		phoneNumber.setPhoneNumber(input.nextLong());
		out.println("Enter the number type : ");
		input.nextLine();
		phoneNumber.setPhoneType(input.nextLine().toUpperCase());

		return phoneNumber;
	}

	public char askForAnotherNumber() {

		out.println("Do you want to add another number[y/n] :");
		return input.next().charAt(0);
	}
	///// Asking Email

	public EmailDTO getEmail() {

		EmailDTO emailDTO = new EmailDTO();

		out.println("Contact Emails");
		out.println("--------------\n");

		out.println("Enter the Email* : ");
		emailDTO.setEmailId(input.next());
		out.println("Enter the Email type : ");
		emailDTO.setEmailType(input.next().toUpperCase());

		return emailDTO;
	}

	public char askForAnotherEmail() {

		out.println("Do you want to add another Email[y/n] :");
		return input.next().charAt(0);
	}

	/// Ask for another contact

	public char askForAnotherContact() {

		out.println("Do you want to add another Contact[y/n] : ");
		return input.next().charAt(0);
	}

	//// Print Contact List
	public int printContactList(Contacts contacts) {

		if (contacts.isEmpty()) {
			out.println("Contact list is empty");
			return -1;
		}

		else {
			for (int i = 0; i < contacts.getLength(); i++) {
				out.println(" | " + (i + 1) + " | " + contacts.getContact(i).getNameDTO().getFirstName());
			}

			out.println("\n\nEnter the index number of the contact");
			return input.nextInt() - 1;
		}
	}

	//// Print Contact
	public void printContact(ContactDTO contact) {

		out.println("First Name    : " + contact.getNameDTO().getFirstName());
		out.println("Middle Name   : " + contact.getNameDTO().getMiddleName());
		out.println("Last Name     : " + contact.getNameDTO().getLastName());
		out.println("Phonetic Name : " + contact.getNameDTO().getPhoneticName());
		out.println("Nick Name     : " + contact.getNameDTO().getNickName());
		out.println("\nPhone Numbers ");
		out.println("-------------");

		for (Map.Entry<String, LinkedHashSet<Long>> entry : contact.getPhoneNumbers().entrySet()) {

			for (Long i : entry.getValue())
				out.println(entry.getKey() + " : " + i);
		}

		out.println("\nEmails ");
		out.println("-------");

		for (Map.Entry<String, LinkedHashSet<String>> entry : contact.getEmails().entrySet()) {

			for (String i : entry.getValue())
				out.println(entry.getKey() + " : " + i);

		}

	}

}