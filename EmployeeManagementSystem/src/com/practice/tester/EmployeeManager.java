package com.practice.tester;

import java.util.Scanner;

import com.practice.core.EmployeeService;

public class EmployeeManager {
	
	
//	EmployeeService service = new EmployeeService();
	
	 static boolean ordering= true;
	 public static void menu() {
		 System.out.println("*******************Welcome to EMP**********************"
				 + "\n1. Add Employee "
	        		+ "\n2.View Employee with ID"
	        		+ "\n3.Update Employee"
	        		+ "\n4. Delete Employee"
	        		+ "\n5.View All Employee"
	        		+ "\n6. Exist ");
	 }
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 EmployeeService service = new EmployeeService();
		 do {
			 
			 menu();
			 System.out.println("Enter your choice : ");
			 int choice= sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Add Employee");
				service.addEmp();
				break;
			}
			case 2: {
				System.out.println("view Employee with id");
				service.viewEmp();
				break;
			}
			case 3: {
				System.out.println("Update Employee");
				service.updateEmp();
				break;
			}
			case 4: {
				System.out.println("Delete Employee");
				service.deleteEmp();
				break;
			}
			case 5: {
				System.out.println("View All Employee");
				service.viewAllEmp();
				break;
			}
			case 6: {
				System.out.println("Exit done !! Thank you");
				System.exit(0);
				break;
			}
			default:
//				throw new IllegalArgumentException("Unexpected value: " + key);
				System.err.println("Enter valid Choice");
			}
		} while (ordering);
		 sc.close();
		
	}
}
