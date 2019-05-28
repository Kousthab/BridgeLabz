package com.bridgelabz.algorithm;

public class InsertionSort {
	static int[] insSort(int a[]){
		int n=a.length;
		int value;
		int hole;
		for(int i=1;i<n;i++){
			value=a[i];
			hole=i;
			while(hole>0&&a[hole-1]>value){
				a[hole]=a[hole-1];
				hole--;
			}
			a[hole]=value;
		}
		return a;
	}
	static String[] insSortString(String s[]){
		int n=s.length;
		String sval;
		int hole;
		for(int i=1;i<n;i++){
			sval=s[i];
			hole=i;
			while(hole>0&&(((s[hole-1].compareTo(sval))>0))){
				s[hole]=s[hole-1];
				hole--;
			}
			s[hole]=sval;
		}
		return s;
	}
	public static void main(String[] args) {
		int[] arr={100,10,8,70,5,90,6};
		insSort(arr);
		System.out.println("Sorted Array");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("------------------------------------");
		String sarr[]={"z","a","c","d","o","i","b"};
		insSortString(sarr);
		System.out.println("Sorted String Array");
		for(int i=0;i<sarr.length;i++){
			System.out.print(sarr[i]+" ");
		}
	}

}
