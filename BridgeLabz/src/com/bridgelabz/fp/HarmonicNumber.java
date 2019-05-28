package com.bridgelabz.fp;

import java.util.Scanner;

public class HarmonicNumber {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit of N");
		int n=s.nextInt();
		float h=0;
		for(int i=1;i<=n;i++){
			h=h+(float)1/i;
			System.out.print(h+" ");
		}
		//System.out.println("Nth value: "+h);
		s.close();
	}

}
