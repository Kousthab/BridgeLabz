package com.bridgelabz.algorithm;

import java.nio.file.Files;
import java.nio.file.Paths;

public class BinarySearchWordFromFile {
	
	public static String readFileAsString(String filename)throws Exception{
		String data="";
		data=new String(Files.readAllBytes(Paths.get(filename)));
		return data;
	}
	public static int bsString(String[] arr,String x){
		int l=0;
		int r=arr.length;
		while(l<=r){
			int mid=l+(r-l)/2;
			int res=arr[mid].compareTo(x);
			if(res==0)
				return mid;
			if(res>0)
				l=mid+1;
			else
				r=mid-1;
		}
		return -1;
	}
		


	public static void main(String[] args) throws Exception {
		
		
		String d=readFileAsString("/home/user/BridgeLabz-workspace/mno.txt");
		String[] a=d.trim().split("\\W+");
		String x="xyz";
		//Arrays.sort(a);
		int r=bsString(a, x);
		if(r==-1)
			System.out.println("String not found");
		else
			System.out.println("String "+x+" found at position: "+r);
	}

}
