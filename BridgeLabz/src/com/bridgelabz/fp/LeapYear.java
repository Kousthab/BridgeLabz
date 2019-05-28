package com.bridgelabz.fp;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a year: ");
		int yr=s.nextInt();
		if(yr>999&&yr<10000){
			if(yr%4==0&&yr%100==0&&yr%400==0){
						System.out.println(yr+" is Leap Year");}
			else{
				System.out.println(yr+" is not leap year");}
		}
		else{
			System.out.println("year should be a four digit number");}
		s.close();
	}

}
