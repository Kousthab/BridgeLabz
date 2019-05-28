package com.bridgelabz.algorithm;

public class MergeSortString {
	void merge(String[] s,int l,int m,int r){
		
		//declaring size of arrays
		int n1=m-l+1;
		int n2=r-m;
		
		//making arrays with size
		String L[]=new String[n1];
		String R[]=new String[n2];
		
		//populating arrays
		for(int i=0;i<n1;i++){
			L[i]=s[l+i];
		}
		for(int j=0;j<n2;j++){
			R[j]=s[m+1+j];
		}
		
		int i=0,j=0;
		//counter for resultant array
		int k=l;
		
		//merging
		while(i<n1 && j<n2){
			if(L[i].compareToIgnoreCase(R[j])<0){
				s[k]=L[i];
				i++;
			}
			else{
				s[k]=R[j];
				j++;
			}
			k++;
		}
		
		//adding remaining elements
		while(i<n1){
			s[k]=L[i];
			i++;
			k++;
		}
		while(j<n2){
			s[k]=R[j];
			j++;
			k++;
		}
	}
	
	void sort(String s[],int l,int r){
		if(l<r){
			int mid=(l+r)/2;
			sort(s, l, mid);
			sort(s, mid+1, r);
			merge(s, l, mid, r);
		}
	}
	
	void printList(String s[]){
		for(int i=0;i<s.length;i++){
			System.out.print(s[i]+" ");
		}
	}
	public static void main(String[] args) {
		String s[]={"abc","john","joey","chandler","jordan_belfort","zmehk","monica"};
		MergeSortString ms=new MergeSortString();
		ms.sort(s, 0, s.length-1);
		System.out.println("After Sorting");
		ms.printList(s);
	}

}
