package com.labexam.tester;

import java.util.Scanner;

import com.labexam.services.ContactServiceImpl;
import com.labexam.services.ContactServices;

public class PhoneBookManager {

	public static void main(String[] args) {
		
		try (Scanner sc= new Scanner(System.in)){
			
			System.out.println("Welcome to Phone Manager");
			ContactServices contact = new ContactServiceImpl();
			do {
				System.out.println("1. Add new contact \n"
						+ "2. Display All Contacts \n"
						+ "3. Update Contact details  for given name and Date of Birth \n"
						+ "4. Remove all contacts are above 80 years\n"
						+ "5. Exit\n");
				
				System.out.println("Enter you choice :");
				int ch= sc.nextInt();
				
				switch (ch) {
				case 1: {
					System.out.println("Add new contact \n");
					contact.addContact();
					break;
				}
				case 2: {
					System.out.println("Display All Contacts \n");
					contact.displayAllContact();
					break;
				}
				case 3: {
					System.out.println("Update Contact details  for given name and Date of Birth \n");
					contact.updateContact();
					break;
				}
				case 4: {
					System.out.println("Remove all contacts are above 80 years\n");
					contact.removeContact();
					break;
				}
				case 5: {
					System.out.println("Thank you for using Phone Manager . Visit Again!!");
					System.exit(0);
					break;
				}
				
				default:
//					throw new IllegalArgumentException("Unexpected value: " + ch);
					
					System.err.println("Enter valid choice");
				}
			} while (true);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
	

	}

}
