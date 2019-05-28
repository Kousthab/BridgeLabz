package com.addressbook.controller;



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import com.addressbook.services.*;
public class AddressBookDriver {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException,Exception{
		AddressBookIntrf implObj = new AddressBookMethodsImpl();
		implObj.loadFileName();
		do
		{
			System.out.println("1.Create");
			System.out.println("2.Open");
			System.out.println("3.Save");
			System.out.println("4.Close");
			System.out.println("5.Add a Person");
			System.out.println("6.Delete a Person");
			System.out.println("7.Edit a Person");
			System.out.println("8.Save as");
			System.out.println("9.Sort");
			System.out.println("10.Quit Program");
			System.out.println("Enter the Choice:=");
			int ch = JSONUtil.IntegerInput();
			switch(ch)
			{
				case 1:
						implObj.createFile();
						break;
				case 2:
						implObj.openFile();
						break;
				case 3:
						implObj.saveFile();
						System.out.println("File is Saved!");
						break;
				case 4:
						implObj.closeFile();
						break;	
				case 5 :
						System.out.println("Enter the File Name:=>");
						String fileName = JSONUtil.SingleStringInput();
						implObj.addPerson(fileName);
						implObj.sortByName();
						break;
				case 6 :
						implObj.deletePerson();
						System.out.println("Person is Deleted!");
						break;
				case 7 :
							implObj.editPerson();
							break;
				case 8 :
							implObj.saveAs();
							break;
				case 9:
					System.out.println("1.SortbyName");
					System.out.println("2.SortbyZipCode");
					int ch1=JSONUtil.IntegerInput();
					switch(ch1) {
					case 1:
						implObj.sortByName();
						System.out.println("PersonSorted");
						break;
					case 2:
						implObj.sortByZip();
						System.out.println("PersonSorted");
						break;
					default:
						System.out.println("Invalid ");
					}
					break;
				case 10 :
					BufferedWriter bw = new BufferedWriter(new FileWriter(new File("maintainFileName.txt")));
					for(int i=0; i<AddressBookMethodsImpl.fileList.size(); i++) {
						bw.write(AddressBookMethodsImpl.fileList.get(i)+" ");
					}
						System.out.println("Program Quited!");
						return;
						
			}
		}while(true);
	}

}
