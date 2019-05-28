package com.bridgelabz.fp;

import java.util.Scanner;

public class StopWatch {
	
	public static void main(String[] args) throws Exception {
		Scanner s=new Scanner(System.in);
		long start=System.currentTimeMillis();
		System.out.println("Enter the seconds to stop:-");
		int n=s.nextInt();
		Thread.sleep(n*1000);
		long end=System.currentTimeMillis();
		double elapsed=(end-start);
		System.out.println("elasped Time:"+elapsed);
		s.close();
	}

}
