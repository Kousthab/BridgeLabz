package com.bridgelabz.algorithm;

public class MergeSort {
	void merge(int[] arr,int l,int m,int r){
		
		//declaring size of arrays
		int n1=m-l+1;
		int n2=r-m;
		
		//making arrays with size
		int[] L=new int[n1];
		int[] R=new int[n2];
		
		//populating arrays
		for(int i=0;i<n1;i++){
			L[i]=arr[l+i];
		}
		for(int j=0;j<n2;j++){
			R[j]=arr[m+1+j];
		}
		
		int i=0,j=0;
		
		//counter for resultant array
		int k=l;
		
		//merging with sorted elements
		while(i<n1&&j<n2){
			if(L[i]<=R[j]){
				arr[k]=L[i];
				i++;
			}
			else{
				arr[k]=R[j];
				j++;
			}
			k++;
		}
		
		//adding remaining elements
		while(i<n1){
			arr[k]=L[i];
			i++;
			k++;
		}
		while(j<n2){
			arr[k]=R[j];
			j++;
			k++;
		}
	}
	
	void sort(int[] arr,int l,int r){
		if(l<r){
			int m=(l+r)/2;
			sort(arr,l,m);
			sort(arr,m+1,r);
			merge(arr, l, m, r);
		}		
	}
	
	void printList(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int[] a={50,70,60,5,30,10,20,100,2};
		MergeSort m=new MergeSort();
		m.sort(a, 0, a.length-1);
		System.out.println("After Sorting");
		m.printList(a);
	}

}
