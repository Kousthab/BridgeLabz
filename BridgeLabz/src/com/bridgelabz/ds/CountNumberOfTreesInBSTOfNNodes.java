package com.bridgelabz.ds;

public class CountNumberOfTreesInBSTOfNNodes {
	
	public static int countTrees(int n) {
		int[] T=new int[n+1];
		T[0]=1;
		T[1]=1;
		for(int i=2;i<=n;i++) {
			for(int j=0;j<i;j++) {
				//Catalin Number
				T[i]+=(T[j]*T[i-j-1]);  
			}
		}
		return T[n];
	}
	public static void main(String[] args) {
		//CountNumberOfTreesInBSTOfNNodes cnt=new CountNumberOfTreesInBSTOfNNodes();
		System.out.println("No of Trees for "+5+" no. of nodes:"+countTrees(5));
	}

}
