package com.bridgelabz.oops;

import java.io.IOException;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JSONUtil {
	
	public static ObjectMapper objectMapper;
	static {
		objectMapper=new ObjectMapper();
	}
	public static String javaToJson(Object object) {
		String jsonResult="";
		
		try {
			jsonResult=objectMapper.writeValueAsString(object);
		} catch (JsonGenerationException e) {
			System.out.println("Exception occured while converting Java Object into Json"+e.getMessage());
			
		} catch (JsonMappingException e) {
			System.out.println("Exception occured while converting Java Object into Json"+e.getMessage());
		} catch (IOException e) {
			System.out.println("Exception occured while converting Java Object into Json"+e.getMessage());
		}
	return jsonResult;
	}
	
	public static<T> T jsonToJava(String jsonString,Class<T> cls){
		T result=null;
		
		try {
			result=objectMapper.readValue(jsonString,cls);
		} catch (JsonParseException e) {
			System.out.println("Exception Occured while converting the json to java"+e.getMessage());
			
		} catch (JsonMappingException e) {
			System.out.println("Exception Occured while converting the json to java"+e.getMessage());
		} catch (IOException e) {
			System.out.println("Exception Occured while converting the json to java"+e.getMessage());
		}
	return result;
	}
	
	public static String SingleStringInput() {
		Scanner scanner =new Scanner(System.in);
		String string = scanner.nextLine();
		return string ;
	}
	public static int IntegerInput() {
		Scanner scanner =new Scanner(System.in);
		int Integer = scanner.nextInt();
		return Integer ;
	}
	public static double doubleInput() {
		Scanner scanner =new Scanner(System.in);
		double DoubleInput = scanner.nextDouble();
		return DoubleInput;
	}

}
