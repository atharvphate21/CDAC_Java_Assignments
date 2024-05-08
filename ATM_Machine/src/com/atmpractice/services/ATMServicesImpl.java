package com.atmpractice.services;

import java.util.HashMap;
import java.util.Map;

import com.atmpractice.core.ATM;

public class ATMServicesImpl implements ATMServices {
	
	ATM atm= new ATM();
	Map<Double, String> miniStatement = new HashMap<>();

	@Override
	public void viewBalance() {
		System.out.println("Available Balance is :" + atm.getBalance());
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount<= atm.getBalance()) {
			miniStatement.put(withdrawAmount, "Amount withdrew");
			atm.setBalance(atm.getBalance()-withdrawAmount);
			System.out.println("Collect you cash");
			System.out.println(withdrawAmount+ " withdrew successfully!!");
			viewBalance();
		}else {
			System.err.println("Insufficient Balance");
			System.err.println("Available Balance is: " + atm.getBalance());
		}
	}

	@Override
	public void depositAmount(double depositAmount) {
		miniStatement.put(depositAmount, "Amount d");
		atm.setBalance(atm.getBalance()+depositAmount);
		System.out.println(depositAmount+"deposited successfully");
		viewBalance();
	}

	@Override
	public void viewMiniStatement() {
		for(Map.Entry<Double, String> m:miniStatement.entrySet()) {
			System.out.println(m.getKey()+" "+ m.getValue());
		}
	}
	

}
