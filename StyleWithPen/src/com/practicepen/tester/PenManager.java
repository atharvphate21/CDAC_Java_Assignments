package com.practicepen.tester;

import java.util.Scanner;

import com.practicepen.services.PenService;
import com.practicepen.services.PenServicesImpl;

public class PenManager {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		PenService service = new PenServicesImpl();
			
		do {
			
			
			System.out.println("Welcome to StyleWithPen's Pen Manager");
			System.out.println("1. Add new Pen\n"
					+ "2. update Stock of Pen\n"
					+ "3. Set discount of 20% for all the pens which are not sold in last 3 months\n"
					+ "4. Remove Pens which are never sold once listed in 9 months\n"
					+ "5.Display all Pen \n"
					+ "6. Exit Application");
			
			System.out.println("Enter your choice :");
			int ch= sc.nextInt();
			
			switch (ch) {
			case 1: {
				System.out.println("Add Pen");
				service.addPen();
				break;
			}
			case 2: {
				System.out.println("Update Stock of Pen");
				service.updatePen();
				break;
			}
			
			case 3: {
				System.out.println("Set 20% Discount");
				service.discount();
				break;
			}
			case 4: {
				System.out.println("Remove pen(Not Sold in in 9 months)");
				service.removePen();
				break;
			}
			case 5: {
				System.out.println("Display All Pen");
				service.displayPens();
				break;
			}
			case 6: {
				System.out.println("Thank you for using Pen Manager. Visit Again!!");
				System.exit(0);
				break;
			}
			
			default:
//				throw new IllegalArgumentException("Unexpected value: " + ch);
				System.err.println("Please Enter Valid Choice !!");
			}
		} while (true);

	}

}
