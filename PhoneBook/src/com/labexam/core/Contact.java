package com.labexam.core;

import java.time.LocalDate;

public class Contact {
	private String phoneNumber;
	private String Name;
	private LocalDate dob;
	private String email;
	
	
	
	public Contact(String phoneNumber, String name, LocalDate dob, String email) {
		this.phoneNumber = phoneNumber;
		Name = name;
		this.dob = dob;
		this.email = email;
	}
	
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Contact [phoneNumber=" + phoneNumber + ", Name=" + Name + ", dob=" + dob + ", email=" + email + "]";
	}
	
	
	
}
