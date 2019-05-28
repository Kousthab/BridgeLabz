package com.bridgelabz.ds;

import java.util.ArrayList;

import com.bridgelabz.algorithm.AlgoUtility;

public class PrimeNumbers2DArray {
	
	public static void main(String[] args) {
		int i=0;int counter=100;
		@SuppressWarnings("unchecked")
		ArrayList<Integer>[] rows=new ArrayList[10];
		for(int j=0;j<rows.length;j++) {
			rows[j]=new ArrayList<Integer>();
		}
		while(i<10) {
			for(int num=0;num<=1000;num++) {
				if(AlgoUtility.primeCheck(Integer.toString(num))==true) {
					rows[i].add(num);
				}
				if(num==counter) {
					i++;
					counter=counter+100;
				}
			}
		}
		for(ArrayList<Integer> item:rows) {
			System.out.println(item);
		}
		
	}

}
