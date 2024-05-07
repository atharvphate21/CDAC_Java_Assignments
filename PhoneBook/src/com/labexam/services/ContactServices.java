package com.labexam.services;

import com.labexam.exception.PhoneBookException;

public interface ContactServices {
	public void addContact() throws PhoneBookException;
	public void displayAllContact();
	public void updateContact();
	public void removeContact();
}
