package com.jsondemo;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainJsonDemo {
	
	public static void main(String[] args) throws JSONException, Exception {
		JSONObject obj=JSONUtils.getJSONObjectFromFile("/objDemo.json");
		System.out.println(obj);
		System.out.println();
		String[] names=JSONObject.getNames(obj);
		
		for(String str:names) {
			System.out.println(str+" "+obj.get(str));
		}
		System.out.println();
										//case sensitive will no take "array"
		JSONArray jsonArray=obj.getJSONArray("Array");
		
		for(int i=0;i<jsonArray.length();i++) {
			System.out.println(jsonArray.get(i));
		}
		
		System.out.println();
		
		int number=obj.getInt("Number");
		System.out.println(number);
		System.out.println();
		
		String str=obj.getString("String");
		System.out.println(str);
		System.out.println();
		
		boolean bool=obj.getBoolean("Boolean");
		System.out.println(bool);
		System.out.println();
	}

}
