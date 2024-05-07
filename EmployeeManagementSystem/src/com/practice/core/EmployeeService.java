package com.practice.core;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {
	HashSet<Employee> emp = new HashSet<Employee>();
	
	Employee emp1 = new Employee(01, "Atharv", 23, "SDE", "devloper", 2100000);
	Employee emp2 = new Employee(02, "Suyog", 23, "Doctor", "Medical", 200000);
	Employee emp3 = new Employee(03, "Ishan", 23, "data scientist", "data management", 230000);
	Employee emp4 = new Employee(04, "Yash", 23, "Civil engg", "Civil", 270000);
	Employee emp5 = new Employee(05, "Hitesh", 23, "Civil engg", "MNP", 240000);
	Employee emp6 = new Employee(06, "Hitesh K", 23, "Manager", "management", 250000);
	
	int id;
	String name;
	int age;
	String designation;
	String department;
	double salary;
	boolean found = false;
	
	Scanner sc = new Scanner(System.in);

	public EmployeeService() {
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
		emp.add(emp4);
		emp.add(emp5);
		emp.add(emp6);
		
	}
	
	//view All Employee
	public void viewAllEmp() {
			for (Employee employee : emp) {
				System.out.println(employee);
			}
	}
	
//	view Employee based on id 
	public void viewEmp() {
		System.out.println("Enter id : ");
		id= sc.nextInt();
		for (Employee employee : emp) {
			if(employee.getId()==id) {
				System.out.println(employee);
				found = true;
			}
		}
		
		if(!found) {
			System.err.println("Employee with this id not present");
		}
	}
	
	
//	update the employee
	public void updateEmp() {
		
		boolean found= false;
		System.out.println("Enter id : ");
		id=sc.nextInt();
		for (Employee employee : emp) {
			if(employee.getId()==id) {
				System.out.println("update name :");
				name = sc.next();
				System.out.println("update salary :");
				salary= sc.nextDouble();
				employee.setName(name);
				employee.setSalary(salary);
				
				System.out.println("Employee details Updated successfully!!");
				System.out.println(employee);
				found=true;
				}
		}
		if(!found) {
			System.err.println("Employee with this id not present");
		}
	}
	
//	delete the employee
	public void deleteEmp() {
		boolean found = false;
		System.out.println("Enter id : ");
		id = sc.nextInt();
		Employee deleteEmployee = null;
		for (Employee employee : emp) {
			if(employee.getId()==id) {
				deleteEmployee=employee;
				found=true;
			}
		}
		if(!found) {
			System.err.println("Employee with this id not present");
		}
		else {
			emp.remove(deleteEmployee);
			System.out.println("Employee deleted successfully");
		}
	}
	
//	add Employee
	public void addEmp() {
		System.out.println("enter id :");
		id= sc.nextInt();
		System.out.println("enter name :");
		name= sc.next();
		System.out.println("enter age :");
		age= sc.nextInt();
		System.out.println("enter designation :");
		designation= sc.next();
		System.out.println("enter department :");
		department= sc.next();
		System.out.println("enter salary :");
		salary= sc.nextDouble();
		
		Employee newEmp = new Employee(id, name, age, designation, department, salary);
		emp.add(newEmp);
		
		System.out.println("Employee addes successfully");
		}
	
}
