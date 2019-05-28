package com.bridgelabz.fp;
import java.util.Map;
import java.util.TreeMap;

public class StringPermutation {
	
	void permute(char[] input){
		Map<Character, Integer> countmap=new TreeMap<>();
		for(char ch:input){
			
			//initialize to 1 w.r.t every character using lambda
			countmap.compute(ch,(key,val)->{
				if(val==null){
					return 1;
				}
				else{
					return val+1;
				}
			});
		}
		
		char[] strchar=new char[countmap.size()];
		int[] count=new int[countmap.size()];
		int index=0;
		for(Map.Entry<Character, Integer> entry:countmap.entrySet()){
			strchar[index]=entry.getKey();
			count[index]=entry.getValue();
			index++;
		}
		char[] result=new char[input.length];
		permuteUtil(strchar, count, result, 0);
		
	}
	
	void permuteUtil(char[] strchar,int[] count,char[] result,int level){
		
		if(result.length==level){
			//printFunc
			printArray(result);
			return;
		}
		for(int i=0;i<strchar.length;i++){
			if(count[i]==0){
				continue;
			}
			result[level]=strchar[i];
			count[i]--;
			permuteUtil(strchar, count, result, level+1);
			count[i]++;
		}
		
		
	}
	
	void printArray(char[] input){
		for(char ch:input){
			System.out.print(ch);
		}
		System.out.println();
	}
	
	

}
