package com.bridgelabz.fp;
import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of times to flip a coin(Positive number only): ");
		int n=s.nextInt();
		double rand=0.0;double heads=0.0,tails=0.0;
		for(int i=0;i<n;i++){
			rand=Math.random();
			if(rand<0.5)
				tails++;
			else
				heads++;
		}
		System.out.println("Percentage of heads:"+((heads/n)*100));
		System.out.println("Percentage of tails:"+((tails/n)*100));
		s.close();
		
	}

}
