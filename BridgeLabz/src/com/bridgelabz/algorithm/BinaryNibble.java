package com.bridgelabz.algorithm;

public class BinaryNibble {
	static void nibbleSwap(int no){
		int b=AlgoUtility.toBinary(no);
		String strnum=String.format("%08d", b);
		int[] binNo=new int[strnum.length()];
		for(int i=0;i<binNo.length;i++){
			binNo[i]=strnum.charAt(i)-'0';
		}
		System.out.println("Before nibble swap of Decimal Number: "+no+" :");
		for(int i=0;i<binNo.length;i++){
			System.out.print(binNo[i]);
		}
		System.out.println();
		
		//resultant array
		int[] binNo2=new int[strnum.length()];
		
		//taking second half of binNo array and put it in resultant array from start to half 
		for(int i=0,k=binNo.length/2;i<binNo2.length/2&&k<binNo.length;i++,k++){
			binNo2[i]=binNo[k];
		}
		
		//taking first half of binNo array and put it in resultant array from half to end
		for(int j=binNo.length/2,l=0;j<binNo.length&&l<binNo.length/2;j++,l++){
			binNo2[j]=binNo[l];
		}
		
		int fn=AlgoUtility.intArrToInt(binNo2);
		int nibbleDec=AlgoUtility.toDec(fn);
		System.out.println("After NibbleSwap");
		System.out.println(fn);
		System.out.println("Corresponding Decimal Value: "+nibbleDec);
	}
	public static void main(String[] args) {
		int n=200;
		nibbleSwap(n);
	}

}
