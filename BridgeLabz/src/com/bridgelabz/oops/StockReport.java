package com.bridgelabz.oops;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;

public class StockReport {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String path="/home/user/BridgeLabz-workspace/jsonFiles/stock.json";
		File file=new File(path);
		
		
		ObjectMapper objectMapper=new ObjectMapper();
		try {
			
			//creating tree for properties
			JsonNode rootNode=objectMapper.readTree(file);
			JsonNode stock=rootNode.get("Stock");
			
			//creating the node for sub properties
			System.out.println("==========Stocks==========");
			for(JsonNode node:stock) {
				String shareName=node.path("Stock_Name").asText();
				int share=node.path("Number_Of_Shares").asInt();
				int price=node.path("Share_Prize").asInt();
				
				System.out.println("Stock_Name:"+shareName+"\nNumber_Of_Shares: "+share+"\nShare_Prize: "+price);
				System.out.println("total: "+price*share+" Rs"+"\n");
			}
			
		} catch (JsonProcessingException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		sc.close();
	}

}
