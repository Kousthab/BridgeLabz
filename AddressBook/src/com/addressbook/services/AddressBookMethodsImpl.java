package com.addressbook.services;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.addressbook.model.*;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class AddressBookMethodsImpl implements AddressBookIntrf {
	
	ObjectMapper objectMapper=new ObjectMapper();
	List<Person> personArraylist=new ArrayList<Person>();
	List<Address> addressArrayList=new ArrayList<Address>();
	public static List<String> fileList=new ArrayList<String>();

	@Override
	public void addPerson(String filename) throws JsonParseException, JsonMappingException, IOException {
		File personFileObject=new File(filename+".json");
		if(personFileObject.length()==0) {
			Person person=new Person();
			Address address=new Address();
			System.out.println("Enter the Name: ");
			String name=JSONUtil.SingleStringInput();
			person.setName(name);
		
			System.out.println("Enter the PhnNo: ");
			String phnNo=JSONUtil.SingleStringInput();
			person.setPhnNo(phnNo);
		
			System.out.println("Enter the Street No: ");
			String street=JSONUtil.SingleStringInput();
			address.setStreetName(street);
		
			System.out.println("Enter BuildingName: ");
			String building=JSONUtil.SingleStringInput();
			address.setBuildingName(building);
		
			System.out.println("Enter the city: ");
			String city=JSONUtil.SingleStringInput();
			address.setCity(city);
		
			System.out.println("Enter State: ");
			String state=JSONUtil.SingleStringInput();
			address.setState(state);
		
			System.out.println("Enter ZipCode: ");
			String zip=JSONUtil.SingleStringInput();
			address.setZipCode(zip);
			
			person.setAddress(address);
			personArraylist.add(person);
			
			System.out.println("Person Details");
			System.out.println(person);
		}
		else {
			List<Person> personlist=objectMapper.readValue(personFileObject,new TypeReference<List<Person>>(){});
			personArraylist.addAll(personlist);
			
			Person p1=new Person();
			Address a=new Address();
			System.out.println("Enter the Name: ");
			String name=JSONUtil.SingleStringInput();
			p1.setName(name);
		
			System.out.println("Enter the PhnNo: ");
			String phnNo=JSONUtil.SingleStringInput();
			p1.setPhnNo(phnNo);
		
			System.out.println("Enter the Street No: ");
			String street=JSONUtil.SingleStringInput();
			a.setStreetName(street);
		
			System.out.println("Enter BuildingName: ");
			String building=JSONUtil.SingleStringInput();
			a.setBuildingName(building);
		
			System.out.println("Enter the city: ");
			String city=JSONUtil.SingleStringInput();
			a.setCity(city);
		
			System.out.println("Enter State: ");
			String state=JSONUtil.SingleStringInput();
			a.setState(state);
		
			System.out.println("Enter ZipCode: ");
			String zip=JSONUtil.SingleStringInput();
			a.setZipCode(zip);
			
			p1.setAddress(a);
			personArraylist.add(p1);
			
			System.out.println("Person Details");
			System.out.println(p1);
			
		}
	}

	@Override
	public void editPerson() throws JsonParseException, JsonMappingException, IOException {
		System.out.println("Editting Person ");
		System.out.println("Enter File Name From Which person has to be Edited:=>");
		String fileName = JSONUtil.SingleStringInput();
		fileName = fileName+".json";
		File personFileObject = new File(fileName);
		if(personFileObject.length()==0)
		{
			System.out.println("File is Empty!");
		}
		else
		{
			System.out.println("Enter Name of Person to be Edited");
			String name = JSONUtil.SingleStringInput();
			List<Person> personFileList = objectMapper.readValue(personFileObject, new TypeReference<List<Person>>() {});
			personArraylist.addAll(personFileList);
			System.out.println(personArraylist);
			for(int i=0;i<personArraylist.size();i++)
			{
				if(name.equals(((Person) personArraylist.get(i)).getName()))
				{	
					System.out.println("1.Name");
					System.out.println("2.Address");
					System.out.println("3.Phone Number");
					System.out.println("Enter Choice What You Have to Edit?");
					int ch = JSONUtil.IntegerInput();
					switch(ch)
					{
						case 1:
								System.out.println("Enter Name to Replace:=>");
								String nameToReplace = JSONUtil.SingleStringInput();
								personArraylist.get(i).setName(nameToReplace);
								break;
						case 2:
								System.out.println("Enter Address to Replace:=>");
								 System.out.println("1.Search Person by Zip Code");
								 System.out.println("2.Search Person By State");
								 System.out.println("3.Searching Person by City");
								 int ch1=JSONUtil.IntegerInput();
								 switch(ch1) {
								 case 1:
									 System.out.println("Enter the zip code");
									 String ZipCodeToReplace = JSONUtil.SingleStringInput();
										personArraylist.get(i).getAddress().setZipCode(ZipCodeToReplace);
									 
									 break;
								 case 2:
									 System.out.println("Enter the State ");
									 String state = JSONUtil.SingleStringInput();
									personArraylist.get(i).getAddress().setState(state);
									 break;
								 case 3:
									 System.out.println("Enter the Person City");
									 String city = JSONUtil.SingleStringInput();
										personArraylist.get(i).getAddress().setCity(city);
									 break;
								default:
									System.out.println("Invalid");
								 }
								break;
						case 3:
								System.out.println("Enter Address to Replace:=>");
								String phNumberToReplace = JSONUtil.SingleStringInput();
								personArraylist.get(i).setPhnNo(phNumberToReplace);
								break;
					}
					break;
				}	
				else
				{
					System.out.println("Person Not Found!");
				}
			}
			
		}
		
	}

	@Override
	public void deletePerson() throws JsonParseException, JsonMappingException, IOException {
		System.out.println("Enter the File From Which Person to delete");
		String fileName=JSONUtil.SingleStringInput();
		String path=fileName+".json";
		File personObject=new File(path);
		if(personObject.length()==0) {
			System.out.println("file is empty");
		}
		else {
			personArraylist.clear();
			personArraylist=objectMapper.readValue(personObject,new TypeReference<List<Person>>() {});
			System.out.println("Enter the Person to delete");
			String name=JSONUtil.SingleStringInput();
			for(int i=0;i<personArraylist.size();i++) {
				if(name.equals(((Person)personArraylist.get(i)).getName())) {
					
					personArraylist.remove(i);
					break;
				}
			}
		jsonServices.writeObjectToJson(personArraylist, fileName+".json");
		
		}
		
	}

	@Override
	public void sortByName() throws JsonParseException, JsonMappingException, IOException {
		Name name=new Name();
		 Collections.sort(personArraylist, name); 
	     for (Person n1: personArraylist) { 
	         System.out.println(n1); }
	    System.out.println(personArraylist);
		
	}

	@Override
	public void sortByZip() throws JsonParseException, JsonMappingException, IOException {
		//Address ad=new Address();
		ZipCode zipCode=new ZipCode();
		 Collections.sort(addressArrayList, zipCode); 
	    for (Address n2: addressArrayList) { 
	        System.out.println(n2);}
	    System.out.println(addressArrayList);
		
	}

	@Override
	public void search() throws JsonParseException, JsonMappingException, IOException {
		System.out.println("1.Search Person by Name");
		 System.out.println("2.Search Person by PhoneNumber");
		 System.out.println("3.Search Person by Address");
		 int ch=JSONUtil.IntegerInput();
		 switch(ch) {
		 case 1:
			 System.out.println("Enter The Person Name");
			break;
		 case 2:
			System.out.println("Enter the Person PhoneNUmber");
			break;
		 case 3:
			 System.out.println("1.Search Person by Zip Code");
			 System.out.println("2.Searching Person by State");
			 System.out.println("3.Searching Person by City");
			 int ch1=JSONUtil.IntegerInput();
			 switch(ch1) {
			 case 1:
				 System.out.println("Enter the zip code");
				 
				 
				 break;
			 case 2:
				 System.out.println("Enter the State ");
				 break;
			 case 3:
				 System.out.println("Enter the Person City");
				 break;
			default:
				System.out.println("Invalid");
			 }
			 break;
		default:
			System.out.println("Invalid");
			 
		 }
		
	}

	@Override
	public void createFile() throws JsonParseException, JsonMappingException, IOException {
		System.out.println("Enter File Name:");
		String fileName=JSONUtil.SingleStringInput();
		String path=fileName+".json";
		try {
			File file=new File(path);
			boolean created=file.createNewFile();
			if(created)
				System.out.println("File Created Successfully");
			else
				System.out.println("File Creation failed");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		fileList.add(fileName);
		
		
	}

	@Override
	public void saveFile() throws JsonParseException, JsonMappingException, IOException {
		System.out.println("Saving File");
		System.out.println("Saving the Person");
		System.out.println("Enter File Name: ");
		String filename=JSONUtil.SingleStringInput();
		jsonServices.writeObjectToJson(personArraylist, filename+".json");
		personArraylist.clear();
		
	}

	@Override
	public void openFile() throws JsonParseException, JsonMappingException, IOException {
		System.out.println("Opening the file");
		
		System.out.println(fileList);
		System.out.println("Enter File Name to open:=>");
		String fileName = JSONUtil.SingleStringInput();
		fileName = fileName + ".json";
		File personFileObject = new File(fileName);
		List<Person> fileList = objectMapper.readValue(personFileObject, new TypeReference<List<Person>>() {});
		System.out.println("File is Opened!");
		System.out.println(fileList.size() + " Persons are There!");
		for (int i = 0; i < fileList.size(); i++) {
			System.out.println(fileList.get(i));
		}
		
		
	}

	@SuppressWarnings("resource")
	@Override
	public void loadFileName() throws JsonParseException, JsonMappingException, IOException {
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("maintainFileName.txt")));
			String temp;
			while((temp = br.readLine()) != null) {
				String tm[] = temp.split(" ");
				for(int i=0; i<tm.length; i++) {
					fileList.add(tm[i]);
				}
			}
			System.out.println(fileList);
			//br.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		
	}

	@Override
	public void closeFile() throws JsonParseException, JsonMappingException, IOException {
		
	}

	@Override
	public void saveAs() throws JsonParseException, JsonMappingException, IOException {
		System.out.println("Enter the File Name:=>");
		String fileName = JSONUtil.SingleStringInput();
		String path = fileName + ".txt";
		boolean created =false;
		try
		{
			File personTextFileObject = new File(path);
			created =  personTextFileObject.createNewFile();
		} 
		catch (IOException e)
		{
			System.out.println("Exception Occurred:");
			e.printStackTrace();
		}
		if (created)
			try {
				{
					fileList.add(fileName);
					File personJsonFileObject = new File(fileName+".json");
					List<Person> personFileList = objectMapper.readValue(personJsonFileObject,new TypeReference<List<Person>>() {});
					jsonServices.writeObjectToJson(personFileList, path);
					System.out.println("File has been created successfully");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		else {
			System.out.println("File already present at the specified location");
		}
		
	}
	
	

}
