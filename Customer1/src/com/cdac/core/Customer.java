package com.cdac.core;

import java.time.LocalDate;

public class Customer {

	private static int autoincrement=1;
	private int id;
	private String fname;
	private String lname;
	private String email;
	private String pswd;
	private LocalDate date;
	private Services plan;
	private double wallet;

	
	public Customer(String fname, String lname,String email, String pswd,double amount,Services plan) {
		super();
		this.id = autoincrement++;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.pswd = pswd;
		this.date = LocalDate.now();
		this.wallet=amount;
		this.plan=plan;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", pswd=" + pswd
				+ ", date=" + date + ", plan=" + plan + ", wallet=" + wallet + "]";
	}
	public String getPswd() {
		return pswd;
	}
	public String getEmail() {
		return email;
	}
	public Customer(String email,String password) {
		super();
		this.email = email;
		this.pswd = password;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Customer)
		{
			Customer c=(Customer)obj;
			return this.getEmail().equals(c.getEmail());
		}
		return false;
	}
	public void setWallet(double wallet) {
		this.wallet = wallet;
	}
	public Services getPlan() {
		return plan;
	}
	public void setPlan(Services plan) {
		this.plan = plan;
	}
	public double getWallet() {
		return wallet;
	}
	public String getFname() {
		return fname;
	}
	
	
	

}
