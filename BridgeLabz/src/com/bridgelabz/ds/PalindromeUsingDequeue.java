package com.bridgelabz.ds;

import java.util.Scanner;

class PalindromeUsingDequeue {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter word :");
		String word=sc.nextLine();
		SimpleDequeue d=new SimpleDequeue();
		for(int i=0;i<word.length();i++)
			d.addRear(word.charAt(i));
		char frontValue='\0',rearValue='\0';
		
		while(d.size()>1)
		{
			frontValue=d.removeFront();
			rearValue=d.removeRear();
			if(frontValue!=rearValue)
				break;	
		}
		
		if(frontValue==rearValue)
			System.out.println("Word is Palindrome.");
		else
			System.out.println("Word is not Palindrome.");
		sc.close();
	}

}
