package com.bridgelabz.ds;

//wip
public class BankingCashCounterUsingQueue {
	
	int range=5;
	int bal=100000;
	
	void withdraw(int x){
		if(x>bal){
			System.out.println("Not Enough Balance");
		}
		else{
			bal=bal-x;
			
		}
		
	}
}
