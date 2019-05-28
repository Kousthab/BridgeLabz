package com.cm.controller;


import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.cm.services.CMIntrf;
import com.cm.services.CMIntrfImpl;
import com.cm.services.JSONUtil;



public class CliniqueManagementDriver {
	
	//wip
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		CMIntrf iclinic=new CMIntrfImpl();
		do {
		System.out.println("1.Add to list");
		System.out.println("2.Dispaly");
		System.out.println("3.Search");
		System.out.println("4.Appointment");
		System.out.println("5.Exit");
		System.out.println("6.Save");
		System.out.println("7.CreateNewFile");
		System.out.println("Enter the Choice:-");
		int ch=JSONUtil.IntegerInput();
		switch(ch) {
		case 1:
			System.out.println("Adding to list");
			iclinic.add();
	
			break;
		case 2:
			System.out.println("Display to list");
			iclinic.display();
			break;
		case 3:
			System.out.println("Searching");
			iclinic.search();
			break;
		case 4:
			System.out.println("Appointment");
			iclinic.searchDoctorByAvailibility();;
			iclinic.appointment();
			iclinic.fixAppoint();
			break;
		case 5:
			System.out.println("Exit");
			break;
		case 6:
			System.out.println("saving the file");
			
		   iclinic.saveFile();
		   break;
		case 7:
			System.out.println("Create new file");
			iclinic.createFile();
			break;
		case 8:
			System.out.println("Program is Quited");
			return;
			
		}
	}while(true);

	}
	
	

}
