package com.bridgelabz.ds;

import java.util.Map;
import java.util.TreeMap;

public class DynamicHashing extends GenericSLL<Integer> {
	
	
	public void hashTable(int[] nums){
		
		//GenericSLL<Integer> list=new GenericSLL<Integer>();
		//OLL list=new OLL();
		
		TreeMap<Integer, GenericSLL<Integer>> multimap=new TreeMap<Integer,GenericSLL<Integer>>();
		for(int i=0;i<11;i++){
			for(int j=0;j<nums.length;j++){
				if((nums[j]%11)==i){
					//list=oLL(nums[j]);
					multimap.put(i,oLL(nums[j]));
					//multimap.put(i,list.oLL(nums[j]));
				}
			}
			//multimap.put(i, sortedInsert((nums[i]%11)));
		}
		for(Map.Entry<Integer, GenericSLL<Integer>> hash:multimap.entrySet()){
			System.out.println(hash.getKey()+":");
			hash.getValue().show();
			System.out.println();
			
		}
		
	}
	/*public void hashingSearch(GenericSLL<Integer>[] list,String[] nums){
		for(int i=0;i<nums.length;i++){
			int number=Integer.parseInt(nums[i].toString());
			int rem=number%11;
			list[rem].sortedInsert(number);
		}
	}*/
	
	public static void main(String[] args) throws Exception {
		
		String numbers=DSUtility.readFileAsString("/home/abc/eclipse-workspace/abc.txt");
		String[] sarr=numbers.split(",");
		int[] nums=new int[sarr.length];
	
		
		//System.out.println(array[0]);
		//nums[0]=parseInt(numbers.split(",").toString());
		//System.out.println(nums[0]);
		for(int i=0;i<nums.length;i++){
			nums[i]=Integer.parseInt(sarr[i].trim());
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		
		DynamicHashing dh=new DynamicHashing();
		dh.hashTable(nums);
		
		
		
		/*GenericSLL<GenericSLL<Integer>> outerlist=new GenericSLL<GenericSLL<Integer>>();
		GenericSLL<Integer> innerlist=new GenericSLL<Integer>();*/
		
		
		//int[] arr=new int[11];
		//GenericSLL<Integer> list[;
		//GenericSLL<T> arrgenlist=new GenericSLL<T>[11];
		/*for(int i=0;i<11;i++){
			arr[i]=new GenericSLL<Integer>();
		}*/
		
		
	}
	
}
