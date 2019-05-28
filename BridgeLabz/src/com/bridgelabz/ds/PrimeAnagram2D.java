package com.bridgelabz.ds;

import java.util.ArrayList;

import com.bridgelabz.algorithm.AlgoUtility;

public class PrimeAnagram2D {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		int i=0,counter=100;
		ArrayList<String>[] rows=new ArrayList[10];
		for(int j=0;j<rows.length;j++) {
			rows[j]=new ArrayList<String>();
		}
		while(i<10) {
			for(int num=2;num<=1000;num++) {
				if(AlgoUtility.primeCheck(Integer.toString(num))==true && 
						AlgoUtility.isAnagram(Integer.toString(num),AlgoUtility.rvrse(Integer.toString(num)))==true){
					
							rows[i].add(Integer.toString(num));
							rows[i].add(AlgoUtility.rvrse(Integer.toString(num)));
				}
				if(num==counter) {
					i++;
					counter=counter+100;
				}
			}
		}
		
		for(ArrayList<String> item:rows) {
			System.out.println(item);
		}
	}

}
