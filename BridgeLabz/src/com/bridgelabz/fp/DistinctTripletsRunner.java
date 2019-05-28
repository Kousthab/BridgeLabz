package com.bridgelabz.fp;

import java.util.List;

public class DistinctTripletsRunner {
	public static void main(String[] args) {
		DistinctTriplets dt=new DistinctTriplets();
		int[] arr={4,2,6,0,1};
		List<List<Integer>> triplets=dt.distinctTrips(arr, 6);
		if(!triplets.isEmpty())
			System.out.println(triplets);
		else
			System.out.println("Pairs not Possible");
		//dt.distinctTrips(arr, 0);
		//System.out.println(dt);
		//dt.distinctTrips(arr);
	
	}

}
