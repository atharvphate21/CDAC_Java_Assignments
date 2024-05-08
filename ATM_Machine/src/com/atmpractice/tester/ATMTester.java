package com.atmpractice.tester;

import java.util.Scanner;

import com.atmpractice.services.ATMServices;
import com.atmpractice.services.ATMServicesImpl;

public class ATMTester {
	public static void main(String[] args) {
		
		ATMServices service = new ATMServicesImpl();
		int atmNumber=12345;
		int atmPin=123;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter ATM number :");
		int atmnumber=sc.nextInt();
		System.out.println("Enter ATM Pin :"); 
		int atmpin=sc.nextInt();
		
		if((atmNumber==atmnumber) && (atmPin==atmpin)) {
			System.out.println("Validation done");
		
		
		while(true) {
			System.out.println("1.View Available Balance"
					+ "\n2.Withdraw Amount"
					+ "\n3.Deposit Amount"
					+ "\n4.View Ministatement"
					+ "\n5.Exit");
            System.out.println("Enter Choice : ");
            int ch = sc.nextInt();
            if(ch==1) {
            	service.viewBalance();
            }
            else if(ch==2) {
            	System.out.println("Enter Amount :");
            	double withdrawAmount= sc.nextDouble();
            	service.withdrawAmount(withdrawAmount);
            }
            else if(ch==3) {
        		System.out.println("Enter Amount to Deposite :");
        		double depositeAmount=sc.nextDouble();
            	service.depositAmount(depositeAmount);
            }
            else if(ch==4) {
            	
            	service.viewMiniStatement();
            }
            else if(ch==5) {
            	System.out.println("Collect ATM card"
            			+ "\n Thank You, Visit Again!!");
            	System.exit(0);
            }
            else {
            	System.err.println("please enter correct Choice");
            }
            
		}
		}else {
			System.err.println("Incorrect Atm Number or Atmpin/n"
					+ "please try again!!");
		}
		sc.close();
	}
}
