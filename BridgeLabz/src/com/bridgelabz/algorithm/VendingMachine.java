package com.bridgelabz.algorithm;

import java.util.Scanner;

public class VendingMachine {
	void change(int amt){
		int[] notes={2000,1000,500,100,50,10,5,2,1};
		int[] noOfNotes=new int[notes.length];
		for(int i=0;i<noOfNotes.length;i++){
			if(amt>=notes[i]){
				noOfNotes[i]=amt/notes[i];
				amt=amt-(noOfNotes[i]*notes[i]);
			}
		}
		System.out.println("Your Change:");
		for(int i=0;i<noOfNotes.length;i++){
			System.out.println(noOfNotes[i]+"---->"+notes[i]);
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Amount: ");
		int amount=s.nextInt();
		VendingMachine v=new VendingMachine();
		v.change(amount);
		s.close();
	}

}
