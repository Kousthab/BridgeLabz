package com.bridgelabz.algorithm;

public class BubbleSort {
	static int[] bsort(int a[]){
		int temp=0;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		return a;
	}
	
	static String[] bsortString(String s[]){
		String temp;
		for(int i=0;i<s.length;i++){
			for(int j=i+1;j<s.length;j++){
				if((s[i].compareToIgnoreCase(s[j]))>0){
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		return s;
	}
	public static void main(String[] args) {
		int[] a={50,70,10,20,90,150,100};
		bsort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("------------------------------");
		String s[]={"john","joey","chandler","Jordan_Belfort","Monica"};
		bsortString(s);
		for(int i=0;i<s.length;i++){
			System.out.print(s[i]+" ");
		}
	}

}
