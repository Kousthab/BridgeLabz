package com.bridgelabz.fp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DistinctTriplets {
	int noOftrips=0;
	List<List<Integer>> distinctTrips(int[] nums,int sum){
		
		Arrays.sort(nums);
		List<List<Integer>> list=new ArrayList<>();
		Set<String> set=new HashSet<>();
		List<Integer> pairs=new ArrayList<>();
		
		for(int i=0;i<nums.length;i++){
			int j=i+1;//2nd element posn
			int k=nums.length-1;//last element posn
			
			while(j<k){
				if((nums[i]+nums[j]+nums[k])==sum){
					String str=nums[i]+","+nums[j]+","+nums[k];
					if(!set.contains(str)){
						noOftrips++;
						pairs.add(nums[i]);
						pairs.add(nums[j]);
						pairs.add(nums[k]);
						list.add(pairs);
						pairs=new ArrayList<>();
						set.add(str);
					}
					j++;
					k--;
				}
				else if((nums[i]+nums[j]+nums[k])<sum){
					j++;
				}
				else{//(nums[i]+nums[j]+num[k]>sum)
					k--;
				}
				
				
			}
		}
		System.out.println("No. of Triplets: "+noOftrips);
		return list;
		
		
		
		/*Set<Integer> set=new HashSet<Integer>();
		
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				for(int k=j+1;k<arr.length;k++){
					if((arr[i]+arr[j]+arr[k])==0){
						noOftrips++;
					}
				}
			}
		}
		System.out.println("No of Triplets: "+noOftrips);*/
		
	}
	

}
