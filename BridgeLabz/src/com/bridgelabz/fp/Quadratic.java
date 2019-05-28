package com.bridgelabz.fp;

import java.util.Scanner;

public class Quadratic {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter a,b,c: ");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		System.out.println("Root 1 of x: "+(-b+(Math.sqrt(Math.pow(b, 2)-(4*a*c)))/2*a));
		System.out.println("Root 2 of x: "+(-b-(Math.sqrt(Math.pow(b, 2)-(4*a*c)))/2*a));
		s.close();
	}

}
