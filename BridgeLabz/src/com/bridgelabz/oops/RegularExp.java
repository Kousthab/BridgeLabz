package com.bridgelabz.oops;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Pattern;

public class RegularExp {
	public static void main(String[] args) {
		String bio = "Hello <<name>>, We have your full\n"
				+ "name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx.\n"
				+ "Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";
		System.out.println(bio);
		String pattern = "[a-zA-Z]+";//string pattern for name
		System.out.println("Enter the name of ");
		String name = JSONUtil.SingleStringInput();
		System.out.println("Enter your fullname:-");
		String fullname = JSONUtil.SingleStringInput();
		Pattern r = Pattern.compile(pattern);
		if (Pattern.matches(pattern, name)) {
			bio = bio.replaceAll("<<name>>", name);
			bio = bio.replaceAll("<<full name>>", fullname);
		}
		System.out.println("Please Enter your Mobile Number");
		String numbers = JSONUtil.SingleStringInput();
		if (Pattern.matches("[789][0-9]{9}", numbers)) //String pattern for phn number
		{
			bio = bio.replaceAll("x{10}", numbers);
		}
	  String pattern1 = "MM/dd/yyyy HH:mm:ss";
		DateFormat df = new SimpleDateFormat(pattern1);
       java.util.Date today = Calendar.getInstance().getTime();        
	    String todayAsString = df.format(today);

		// Print it!
		System.out.println("Today is: " + todayAsString);
         
			bio = bio.replaceAll("01/01/2016", todayAsString);
			
			
		System.out.println("===================================");
		System.out.println(bio);
	}

}
