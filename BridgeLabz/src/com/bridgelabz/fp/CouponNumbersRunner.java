package com.bridgelabz.fp;

import java.util.Scanner;

public class CouponNumbersRunner {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter N");
		int n=s.nextInt();
		CouponNumbers couponnumbers=new CouponNumbers();
		couponnumbers.couponnumb(n);
		s.close();
	}

}
