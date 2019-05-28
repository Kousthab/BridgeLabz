package com.bridgelabz.algorithm;

public class MySqrt {
	
	public void mSqrt(double c) {
		double t,epsilon;
		
		epsilon=1e-15;
		System.out.println(epsilon);
		t=c;
		while(Math.abs(t-c/t)>epsilon*t) {
			t=(c/t+t)/2.00;
		}
		System.out.println(t);
		
		
	}

}
