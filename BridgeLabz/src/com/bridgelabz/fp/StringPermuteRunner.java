package com.bridgelabz.fp;

public class StringPermuteRunner {
	public static void main(String[] args) {
		String str="aabc";
		char[] input=str.toCharArray();
		System.out.println("PErmutations are:");
		StringPermutation sp=new StringPermutation();
		sp.permute(input);
	}

}
