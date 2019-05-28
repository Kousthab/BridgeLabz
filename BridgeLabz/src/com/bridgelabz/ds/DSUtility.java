package com.bridgelabz.ds;

import java.nio.file.Files;
import java.nio.file.Paths;

public class DSUtility {
	public static String readFileAsString(String filename) throws Exception{
		String data="";
		data=new String(Files.readAllBytes(Paths.get(filename)));
		return data;
	}

}
