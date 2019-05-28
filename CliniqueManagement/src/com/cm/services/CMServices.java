package com.cm.services;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

public class CMServices {
	
	@SuppressWarnings("rawtypes")
	public static void writeObjectToJson(List list,String fileName) {
		
		Object[] arr=list.toArray();
		ObjectMapper om=new ObjectMapper();
		try {
			om.writeValue(new File(fileName), arr);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
