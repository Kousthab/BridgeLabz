package com.bridgelabz.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class AlgoUtility {
	public static boolean isAnagram(String str1,String str2){
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		
		int n1=ch1.length;
		int n2=ch2.length;
		
		if(n1!=n2)
			return false;
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		for(int i=0;i<n1;i++){
			if(ch1[i]!=ch2[i])
				return false;
		}
		
		return true;
	}
	
	public static boolean primeCheck(String n) {
		for(int i=2;i<=Integer.parseInt(n)/2;i++)
			if(Integer.parseInt(n)%i==0)
				return false;
		return true;
	}
	public static String rvrse(String str) {
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		/*if(rev.equals(str))
			return true;
		else
			return false;*/
		return rev;
	}
	
	public static String[] primeNosWithinRange(int low,int high){
		int chk;
		//int index=0;
		ArrayList<String> primelist=new ArrayList<String>();
		//String[] starr;
		//System.out.println("Prime numbers between 0 to 1000 are:");
		for(int i=low;i<=high;i++){
			chk=0;
			for(int j=2;j<=i/2;j++){
				if(i%j==0){
					chk++;
					break;
				}
			}
			if(chk==0&&i!=1) {
				primelist.add(Integer.toString(i));
				//System.out.print(i+" ");
				//System.out.print(primelist);
			}
		}
		String[] primenos=primelist.toArray(new String[primelist.size()]);
		/*for(int i=0;i<primenos.length;i++) {
			System.out.print(primenos[i]+" ");
		}*/
		/*for(String pnos:primelist) {
			System.out.print(pnos+" ");
		}*/
		return primenos;
	}
	
	public static void primeNosWithinRangeAnagramPlaindrome(int low,int high){
		
		String[] primenosArray=primeNosWithinRange(low, high);
		for(int i=0;i<primenosArray.length;i++) {
			for(int j=i+1;j<primenosArray.length;j++) {
				String str1=primenosArray[i].toString();
				String str2=primenosArray[j].toString();
				if(isAnagram(str1, str2))
					System.out.println(str1+" "+str2);
			}
		}
		
		
		/*int chk,r=0,rev=0,num;
		for(num=low;num<=high;num++){
			chk=0;
			for(int i=2;i<=num/2;i++){
				if(num%i==0){
					chk++;
					break;
				}
			}
			if(chk==0&&num!=1){
				System.out.print(num+" ");
				int temp=num;
				while(num>0){
					r=num%10;
					rev=rev*10+r;
					num=num/10;
					
					}
				if(rev==temp){
					System.out.println("Reverse of prime no "+temp+" is :"+rev);
				}
				
			}
			
		}*/
	}
	
	public static int bs(int[] arr,int no){
		int l=0;
		int r=arr.length-1;
		System.out.println("length: "+r);
		for(int i=0;i<r;i++){
			System.out.print(arr[i]+" ");
		}
		//int mid=0;
		while(l<=r){
			int mid=l+(r-l)/2;
			if(arr[mid]==no)
				return mid;
			if(arr[mid]<no)
				l=mid+1;
			else
				r=mid-1;
		}
		return -1;
	}
	
	//for taking integer input
	public static int inputInt(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Integer: ");
		int n=s.nextInt();
		s.close();
		return n;
	}
	public static void dayOfWeek(int m,int d,int y){
		int x,y0,m0,d0;
		y0=(y-(14-m))/12;
		x=y0+(y0/4)-(y0/100)+(y0/400);
		m0=m+(12*((14-m)/12))-2;
		d0=(d+x+(31*m0)/12)%7;
		
		HashMap<Integer, String> day=new HashMap<Integer, String>();
		day.put(1, "Sunday");
		day.put(2, "Monday");
		day.put(3, "Tuesday");
		day.put(4, "Wednesday");
		day.put(5, "Thursday");
		day.put(6, "Friday");
		day.put(7, "Saturday");
		
		if(day.containsKey(d0)){
			String s=day.get(d0);
			System.out.println("Day is "+s);
		}
		/*HashMap<Integer, String> month=new HashMap<Integer,String>();
		month.put(1, "Jan");
		month.put(2, "Feb");
		month.put(3, "Mar");
		month.put(4, "Apr");
		month.put(5, "May");
		month.put(6, "Jun");
		month.put(7, "Jul");
		month.put(8, "Aug");
		month.put(9, "Sept");
		month.put(10, "Oct");
		month.put(11, "Nov");
		month.put(12, "Dec");*/
	}
	public static void tempConvoCtoF(int c){
		int f=(c*(9/5))+32;
		System.out.println(c+ "to Farenheit: "+f);
	}
	public static void tempConvoFtoC(int f){
		int c=(f-32)*(5/9);
		System.out.println(f+ "to Celcious: "+c);
	}
	public static int toBinary(int d){
		int[] bin=new int[1000];int[] binno=new int[1000];
		int i=0;
		while(d>0){
			bin[i]=d%2;
			i++;
			d=d/2;
		}
		for(int j=bin.length-1,k=0;j>=0;j--,k++){
			binno[k]=bin[j];
		}
		int fn=intArrToInt(binno);
		return fn;
	}
	
	public static int toDec(int b){
		int r,res=0;
		int n=0;
		while(b>0){
			r=b%10;
			res=(int)(res+(r*Math.pow(2, n)));
			n++;
			b=b/10;
		}
		return res;
	}
	
	public static void monthlyPayments(float P,float Y,float R) {
	    float n,r,payments;
	    r=R/(12*100);
	    n=12*Y;
	    float p1=(float)Math.pow((1+r),(-n));
	    payments=(P*r)/(1-(p1));
	    System.out.println(payments);
		
	}
	
	public static int intArrToInt(int[] arr){
		StringBuilder sb=new StringBuilder();
		for(int x:arr){
			sb.append(x);
		}
		int finalNo=Integer.parseInt(sb.toString());
		return finalNo;
	}
	public static void main(String[] args) {
		
		
		System.out.println("-------------------------------------------------------------");
		primeNosWithinRange(0,1000);
		System.out.println("--------------------------------------------------------------");
		//primeNosWithinRangeAnagramPlaindrome(0, 100);
		
		int a[]={10,30,50,70,90,110};
		int pos=bs(a,90);
		System.out.println("Position:"+pos);
		
		
		/*System.out.println("Enter month day and year: ");
		int m=s.nextInt();
		int d=s.nextInt();
		int y=s.nextInt();
		dayOfWeek(m, d, y);
		System.out.println("--------------------------------------");
		System.out.println("Enter a Decimal number: ");
		int deci=s.nextInt();
		int bin=toBinary(deci);
		System.out.println("Binary Representation of "+deci+" :"+bin);
		System.out.println("----------------------------------------------");
		System.out.println();*/
		primeNosWithinRangeAnagramPlaindrome(0, 1000);
		//System.out.println("Reverse of qbcd is: "+rvrse("qbcd"));
		//s.close();
		
	}

}
