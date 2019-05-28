package com.bridgelabz.fp;

import java.util.Scanner;

public class PrimeFactorsRunner {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the for getting prime Factors: ");
		int no=s.nextInt();
		//int[] arr=new int[100];
		System.out.println("Prime Factors of "+no+" are:");
		PrimeFactors primefactors=new PrimeFactors();
		primefactors.primefactors(no);
		
		s.close();

	}
}
