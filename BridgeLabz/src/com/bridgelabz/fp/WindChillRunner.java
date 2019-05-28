package com.bridgelabz.fp;

import java.util.Scanner;

public class WindChillRunner {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Temp in Farenheit: ");
		float temp=s.nextFloat();
		System.out.println("Enter the Wind Speed in m/h: ");
		float speed=s.nextFloat();
		WindChill windchill=new WindChill();
		windchill.windchill(temp, speed);
		s.close();
		
	}

}
