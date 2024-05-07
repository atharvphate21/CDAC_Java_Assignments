package com.labexam.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.xml.validation.Validator;

import com.labexam.core.Contact;
import com.labexam.validations.Validation;

public class ContactServiceImpl implements ContactServices {
	Validation validator = new Validation();
	;
	Scanner sc= new Scanner(System.in);
	ArrayList<Contact> contactList= new ArrayList<>();
	Contact c1= new Contact("7415826685", "Atharv", LocalDate.parse("2001-02-25"), validator.validateEmail("atharvphate@gmail.com") );
	Contact c2= new Contact("7415254652", "Suyog", LocalDate.parse("1955-02-25"), validator.validateEmail("suyogt@gmail.com"));
	Contact c3= new Contact("3216465685", "Hitesh", LocalDate.parse("1933-02-25"), validator.validateEmail("hitesh@gmail.com"));
	Contact c4= new Contact("3165168785", "Yash", LocalDate.parse("1944-02-25"), validator.validateEmail("yashs@gmail.com"));
	Contact c5= new Contact("8951165685", "Ishan", LocalDate.parse("1940-02-25"), validator.validateEmail("ishanl@gmail.com"));

	
	
	String number;
	String name;
	LocalDate dob;
	String email;
	boolean found= false;
	
	public ContactServiceImpl() {
		contactList.add(c1);
		contactList.add(c2);
		contactList.add(c3);
		contactList.add(c4);
		contactList.add(c5);
		
	}
	
	
	@Override
	public void addContact() {
		System.out.println("Enter Phone number :");
		number= sc.next();
		System.out.println("Enter Name :");
		name = sc.next();
		System.out.println("Enter Date of Birth :");
		dob= LocalDate.parse(sc.next());
		System.out.println("Enter Email Id :");
		email= validator.validateEmail(sc.next());
		
		Contact newContact = new Contact(number, name, dob, email);
		contactList.add(newContact);
		System.out.println("Phone Number Added Successfully");
	}

	@Override
	public void displayAllContact() {
		for (Contact contact : contactList) {
			System.out.println(contact);
		}
	}

	@Override
	public void updateContact() {
		
	}

	@Override
	public void removeContact() {
//		for (Contact contact : contactList) {
//			if(contact.getDob().plusMonths(80).isBefore(LocalDate.now())) {
//				contactList.remove(contact);
//				System.out.println(contact);
//			}
//		}
		
		Iterator<Contact>it = contactList.iterator();
		while(it.hasNext()) {
			Contact p = it.next();
			
				if(p.getDob().plusYears(80).isBefore(LocalDate.now())) {
					it.remove();
					System.out.println(p);
				}
		}
	}

}
