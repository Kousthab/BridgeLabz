package com.bridgelabz.ds;

import com.bridgelabz.algorithm.AlgoUtility;

public class PrimeAnagramStack {
	public static void main(String[] args) {
		DynamicStack<String> ds=new DynamicStack<String>();
		
		
		for(int num=2;num<=1000;num++) {
			if(AlgoUtility.primeCheck(Integer.toString(num))==true && 
					AlgoUtility.isAnagram(Integer.toString(num),AlgoUtility.rvrse(Integer.toString(num)))==true){
				
				
				ds.insert(Integer.toString(num));
			}
		}
		ds.peek();
		//ds.deleteAtEnd();
		//ds.printStack();
	}
}
	
	


