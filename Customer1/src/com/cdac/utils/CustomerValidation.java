package com.cdac.utils;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cdac.Exception.CustomerException;
import com.cdac.core.Customer;
import com.cdac.core.Services;

public class CustomerValidation {


	
	public static Customer registerCustomer(String fname, String lname,String email, String pswd,double amount,String service) throws CustomerException
	{
		validateEmail(email);
		validatePswd(pswd);
		Services ser= validateServices(service);
		validateamount(ser, amount);
		return new Customer(fname, lname, email, pswd, amount-ser.getPlan(), ser);
		
	}
	public static void validateEmail(String email) throws CustomerException
	{
		   String regex = "^[A-Za-z0-9+_.-]+@(.+)$";  
		    if(!Pattern.matches(regex,email))
		    	
		throw new CustomerException("invalid Email id");
	}
	public static void validatePswd(String pswd) throws CustomerException
	{
		String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$";
		    if(!Pattern.matches(regex,pswd))
		    	
		throw new CustomerException("invalid pswd id");
	}
	{
		
	}
	public static Services validateServices(String plan)
	{
		return Services.valueOf(plan.toUpperCase());
		
	}
	public static void validateamount(Services service,double amount) throws CustomerException
	{
		if(service.getPlan()>amount)
			throw new CustomerException("insufficent funds");
			
	}
	public static Customer signin(Customer dummy,List<Customer> list) throws CustomerException
	{
		Customer orignal=list.get(validateEmail(dummy, list));
		System.out.println(orignal);
		System.out.println("validate signin");
		if(validatePassword(dummy, orignal))
				{
			return orignal;
				}
		 throw new CustomerException("Invalid password");
	}
	public static boolean validatePassword(Customer dummy,Customer orignal) throws CustomerException
	{
		if(dummy.getPswd().equals(orignal.getPswd()))
		{
	return true;
		}
 throw new CustomerException("Invalid password");
	}
	
	public static int validateEmail(Customer c,List<Customer> list) throws CustomerException
	{
		int index=list.indexOf(c);
		
		System.out.println("index :"+index);

		if(index>=0)
		{
			return index;
		}
		else
		{
		 throw new CustomerException("Invalid Email");
		}
	}
	
	public static void changePassword(Customer c,String newpassword,List<Customer> list) throws CustomerException
	{
		int index=validateEmail(c,list);
		validatePassword(c,list.get(index));
		list.get(index).setPswd(newpassword);
	}
	
}
