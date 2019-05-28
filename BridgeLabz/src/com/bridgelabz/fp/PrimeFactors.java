package com.bridgelabz.fp;


public class PrimeFactors {
	
	public void primefactors(int number) {
	    int cnt=0;
		if (number<0) {
			System.out.println("Prime factors of negative doesnot exits");
			}
		else if(number==0) {
			System.out.println("prime factors of zero is 0");
		}
		else {
			for(int i=2;i<=number;i++) {
				while(number%i==0) {
					number=number/i;
					System.out.println(i);
					cnt=cnt+1;
				}//System.out.println("Counter:-"+cnt);
			}
		}
	}
		
}

