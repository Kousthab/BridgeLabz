package com.bridgelabz.algorithm;

import java.util.Scanner;

public class MySqrtRunner {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter c: ");
		double c=s.nextDouble();
		MySqrt sqrt=new MySqrt();
		sqrt.mSqrt(c);
		s.close();
		
	}
	
	
	

}
