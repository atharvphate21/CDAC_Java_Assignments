package com.atmpractice.services;

public interface ATMServices {
	public void viewBalance();
	public void withdrawAmount(double withdrawAmount);
	public void depositAmount(double depositAmount);
	public void viewMiniStatement();

}
