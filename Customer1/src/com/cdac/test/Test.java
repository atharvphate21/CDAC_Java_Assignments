package com.cdac.test;

import static com.cdac.utils.CustomerPopulate.populate;
import static com.cdac.utils.CustomerValidation.changePassword;
import static com.cdac.utils.CustomerValidation.registerCustomer;
import static com.cdac.utils.CustomerValidation.signin;

import java.util.List;
import java.util.Scanner;

import com.cdac.core.Customer;
public class Test {


	public static void main(String[] args) {
		
		
		
		try(Scanner sc=new Scanner(System.in))
		{
			List<Customer> list=populate();
			boolean exit=true;
			
			
			while(exit)
			{
				try {
				System.out.println("1.Register Customer 2.Sign in 3. Display 4. chnge password 5.unsubscribe");
				switch (sc.nextInt()) 
				{
				case 1:
				{
					System.out.println("fname, lname, email, pswd, amount,service");
					list.add(registerCustomer(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(),sc.next()));					
					System.out.println("Customer register");
				}break;
				case 2:
				{
					System.out.println("Enter email and password");
					Customer c=signin(new Customer (sc.next(),sc.next()),list);	
					System.out.println("Welcome "+c.getFname());
					
//						System.out.println("1.Select service");
//						for(Services s:Services.values())
//						{
//							System.out.println(s);
//						}
//						System.out.println("Enter Service");
//						c=selectService(sc.next(),c);
//						list.add(list.indexOf(c), c);
//					
				
				}
					break;
				case 3:
				{
					for(Customer c:list)
					{
						System.out.println(c);
					}
				}break;
				case 4:
				{
					System.out.println("enter Email,Password,New Password");
					changePassword(new Customer(sc.next(),sc.next()),sc.next(),list);
					System.out.println("Password chamged");
					
				}break;
				
				case 5:
				{
					System.out.println("Enter email and password");
					Customer c=signin(new Customer (sc.next(),sc.next()),list);	
					list.remove(c);
					System.out.println("unscribed Successfully");
					
				}break;
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
	}
}
	}
