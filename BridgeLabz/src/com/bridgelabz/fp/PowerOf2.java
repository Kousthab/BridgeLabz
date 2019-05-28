package com.bridgelabz.fp;

import java.util.Scanner;

public class PowerOf2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit of N:");
		int n=s.nextInt();
		for(int i=1;i<=Math.pow(2, n);i++){
			System.out.print(Math.pow(2, i)+",");
		}
		s.close();
	}

}
