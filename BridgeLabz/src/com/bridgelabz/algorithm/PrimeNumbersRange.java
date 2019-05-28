package com.bridgelabz.algorithm;

public class PrimeNumbersRange {
	public static void main(String[] args) {
		String[] pnos=AlgoUtility.primeNosWithinRange(0, 1000);
		for(String nos:pnos)
		{
			System.out.print(nos+" ");
		}
	}

}
