package com.bridgelabz.fp;

import java.util.Random;

public class CouponNumbers {
	
	public void couponnumb(int n) {
		int arr[]= new int[n];
		int n1;
		Random rand =new Random();
		for(int i=0;i<arr.length;i++) {
			 n1=rand.nextInt(1000);
//			System.out.println(arr[i]);
			while(arr[i]!=n1) {
//				 n1=rand.nextInt(20);
				 arr[i]=n1;
	             
			 System.out.println(arr[i]);
			 }
			}

	}

}
