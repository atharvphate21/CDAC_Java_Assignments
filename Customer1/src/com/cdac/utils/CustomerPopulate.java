package com.cdac.utils;

import java.util.ArrayList;
import java.util.List;

import com.cdac.core.Customer;
import static com.cdac.core.Services.*;
public class CustomerPopulate {


	public static List<Customer> populate()
	{
		List<Customer> list=new ArrayList<>();
		list.add(new Customer("yash", "bahirat", "yash@gmail.com", "Pass@123", 10000, GOLD));
		list.add(new Customer("sagar", "takalkar", "sagar@gmail.com", "Pass@123", 20000, PLATINUM));
		list.add(new Customer("sanket", "bhosale", "sanket@gmail.com","Pass@123", 30000, SILVER));
	
		return list;
	}
}
