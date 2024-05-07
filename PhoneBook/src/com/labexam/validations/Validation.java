package com.labexam.validations;

import java.util.Scanner;
import java.util.regex.Pattern;

import com.labexam.exception.PhoneBookException;

public class Validation {
	private static Pattern Email_Pattern=Pattern.compile( "^[a-zA-Z0-9_+&-]+(?:\\.[a-zA-Z0-9_+&-]+)*@(?:[a-zA-Z0-9-]+\\.)+(com|net|org)$");
	Scanner sc = new Scanner(System.in);
	
	public String validateEmail(String email)/* throws PhoneBookException */{

        while (true) {
                if (!Email_Pattern.matcher(email).matches()) {
                System.err.println("! PLEASE ENTER VALID EMAIL ID");
//                throw new PhoneBookException("! PLEASE ENTER VALID EMAIL ID");
            } else {
                break;
            }
        }
        return email;
	}
}
