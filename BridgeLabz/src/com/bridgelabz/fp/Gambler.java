package com.bridgelabz.fp;

import java.util.Random;

import com.bridgelabz.algorithm.AlgoUtility;

public class Gambler {
	
	public static Random random() {
    	Random rand =new Random();
    	return rand;
}
	
	public void gambler(int goal) {
		int total_money=1;
		while(total_money<goal) {
			if(total_money==0) {
				break;
			}
			 int n1=AlgoUtility.inputInt();
			 Random rand =random();
			 int n=rand.nextInt(2);
			 System.out.println(n);
			 if (n1==n) {
				 System.out.println("Gambler won");
				 total_money+=1;
				 System.out.println("Total_money :- "+total_money);
			 }
			 else if(n!=n1) {
				 System.out.println("Gambler lost");
				 total_money-=1;
				 System.out.println("Total_money :-"+total_money);
				 
			 }
		}
		
	}

}
