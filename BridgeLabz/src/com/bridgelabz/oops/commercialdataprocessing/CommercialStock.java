package com.bridgelabz.oops.commercialdataprocessing;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.oops.JSONUtil;
//wip
public class CommercialStock {
	
	// Buying Shares
		public static int buyShares(int personCashAmount, int priceOfShares, int numberOfShares) {

			int total = priceOfShares * numberOfShares;
			System.out.println("Person has to pay Rs." + total);
			return (personCashAmount - total);
		}

		// sell shares
		public static int sellShares(int personCashAmount, int priceOfShares, int numberOfShares) {
			int total = priceOfShares * numberOfShares;
			System.out.println("Total amount available is." + (total + personCashAmount));
			return (personCashAmount + total);
		}

		public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

			Person person = new Person();
			Company company = new Company();
			ObjectMapper mapper = new ObjectMapper();
			File perFileObj = new File("/person.json");// id,name,ShareQuantity,amount
			File compFileObj = new File("/company.json");// price,company
																											// name,shareQuantity
			List<Person> personList = mapper.readValue(perFileObj, new TypeReference<List<Person>>() {
			});
			
			List<Company> companyList = mapper.readValue(compFileObj, new TypeReference<List<Company>>() {
			});
			

			
			System.out.println("1.Buy Shares");
			System.out.println("2.sell Shares");
			System.out.println("Enter the choice:=");
			int ch = StockUtil.IntegerInput();
			if (ch == 1) {
				System.out.println("Enter the index of person");
				int index=StockUtil.IntegerInput();
				person = personList.get(index);
				System.out.println(person.toString());
				System.out.println("Enter the index of company");
				int index1=StockUtil.IntegerInput();
				company = companyList.get(index1);
				System.out.println(company.toString());
				
				System.out.println("How many shares want to buy?");
				int numberOfShares = StockUtil.IntegerInput();
				if (numberOfShares > Integer.parseInt(company.getShareQuantity())) {
					System.out.println(numberOfShares + " are not available in stock");
				} else {

					int amnt = buyShares(Integer.parseInt(person.getAmt()), Integer.parseInt(company.getPrice()),
							numberOfShares);
					String cash = Integer.toString(amnt);
					int availableShare = Integer.parseInt(company.getShareQuantity());
					availableShare = availableShare - numberOfShares;
					person.setAmt(cash);
					String shareStock = Integer.toString(availableShare);
					company.setShareQuantity(shareStock);
					int availableShare1 = Integer.parseInt(person.getShareQuantity());
					availableShare1 = availableShare1 + numberOfShares;

					String shareStock1 = Integer.toString(availableShare1);
					person.setShareQuantity(shareStock1);
				}
			} else if (ch == 2) {
				System.out.println("Enter the index of person");
				int index=StockUtil.IntegerInput();
				person = personList.get(index);
				System.out.println(person.toString());
				System.out.println("Enter the index of company");
				int index1=StockUtil.IntegerInput();
				company = companyList.get(index1);
				System.out.println(company.toString());
				System.out.println("How many shares want to sell?");
				int numberOfShares = JSONUtil.IntegerInput();
				if (numberOfShares > Integer.parseInt(person.getShareQuantity())) {
					System.out.println(numberOfShares + " are not available in stock");
				} else {
					int amnt = sellShares(Integer.parseInt(person.getAmt()), Integer.parseInt(company.getPrice()),
							numberOfShares);
					String cash = Integer.toString(amnt);
					int availableShare = Integer.parseInt(person.getShareQuantity());
					availableShare = availableShare - numberOfShares;
					person.setAmt(cash);
					String shareStock = Integer.toString(availableShare);
					person.setShareQuantity(shareStock);
					int availableShare1 = Integer.parseInt(company.getShareQuantity());
					availableShare1 = availableShare1 + numberOfShares;
					company.setPrice(cash);
					String shareStock1 = Integer.toString(availableShare1);
					company.setShareQuantity(shareStock1);
				}
			}

			StockUtil.writeObjectToJson(personList, "person.json");
			System.out.println(personList);
			StockUtil.writeObjectToJson(companyList, "company.json");
			System.out.println(companyList);

	}

}
