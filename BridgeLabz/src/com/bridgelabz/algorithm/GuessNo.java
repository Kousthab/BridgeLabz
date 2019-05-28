package com.bridgelabz.algorithm;
//code wip
public class GuessNo {
	
	void guessNo(int n){
		int mid=0;
		int start=0;
		int end=n;
		while(start<=end){
			mid=(start+end)/2;
			System.out.println("Your number is greater than "+mid+" ?");
			if(mid==n){
				System.out.println("Your number is "+mid);
				break;
			}
			else if(AlgoUtility.inputInt()==0){
				end=mid;
				System.out.println("Your number is less than "+ mid);
			}
			else if(AlgoUtility.inputInt()==1){
				start=mid+1;
				System.out.println("Your number is "+mid);
			}
			else{
				System.out.println("your number not found");
			}
		}
	}
	public static void main(String[] args) {
		GuessNo gn=new GuessNo();
		gn.guessNo(AlgoUtility.inputInt());
	}

}
