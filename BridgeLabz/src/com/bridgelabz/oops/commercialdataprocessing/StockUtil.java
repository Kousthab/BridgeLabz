package com.bridgelabz.oops.commercialdataprocessing;

import java.io.File;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;

public class StockUtil {
	
	public static String SingleStringInput() {
		Scanner scanner =new Scanner(System.in);
//	    System.out.println("Enter the Single String Input");
		String string = scanner.nextLine();
		return string ;
	}
	public static int IntegerInput() {
		Scanner scanner =new Scanner(System.in);
	    System.out.println("Enter the Single String Input");
		int Integer = scanner.nextInt();
		return Integer ;
	}
	public static double doubleInput() {
		Scanner scanner =new Scanner(System.in);
	    System.out.println("Enter the Single String Input");
		double DoubleInput = scanner.nextDouble();
		return DoubleInput;
	}
	public static void writeObjectToJson(List list, String fileName)
	{
		Object[] arr = list.toArray(); 
		
		ObjectMapper om = new ObjectMapper();
		try 
		{

			om.writeValue(new File(fileName), arr);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
}

}
