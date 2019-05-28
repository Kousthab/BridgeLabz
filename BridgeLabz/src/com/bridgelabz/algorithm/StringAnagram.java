package com.bridgelabz.algorithm;

public class StringAnagram {
	public static void main(String[] args) {
		String str1="earth";
		String str2="heart";
		
		boolean rc=AlgoUtility.isAnagram(str1, str2);
		if(rc)
			System.out.println(str1+" and "+str2+" are anagram to each other");
		else
			System.out.println(str1+" and "+str2+" are not anagram to each other");
	}

}
