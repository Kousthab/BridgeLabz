package com.bridgelabz.fp;

import java.util.Scanner;

public class Distance {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter x: ");
		int x=s.nextInt();
		System.out.println("Enter y: ");
		int y=s.nextInt();
		System.out.println("Euclidean Distance from the origin(0,0): ");
		double dis=Math.sqrt((Math.pow(x, 2)+Math.pow(y, 2)));
		System.out.print(dis);
		s.close();
		
	}

}
