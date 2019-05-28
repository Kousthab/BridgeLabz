package com.cm.services;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public interface CMIntrf {
	
	public void add() throws JsonParseException,JsonMappingException,IOException;
	public void search()throws JsonParseException,JsonMappingException,IOException;
	public void display()throws JsonParseException,JsonMappingException,IOException;
	
	public void addDoctor(String doctorFileName)throws JsonParseException,JsonMappingException,IOException;
	public void editDoctor()throws JsonParseException,JsonMappingException,IOException;
	public void deleteDoctor()throws JsonParseException,JsonMappingException,IOException;
	
	public void addPatient(String patientFileName)throws JsonParseException,JsonMappingException,IOException;
	public void editPatient()throws JsonParseException,JsonMappingException,IOException;
	public void deletePatient()throws JsonParseException,JsonMappingException,IOException;
	
	public void searchDoctorByName()throws JsonParseException,JsonMappingException,IOException;
	public void searchDoctorByID()throws JsonParseException,JsonMappingException,IOException;
	public void searchDoctorBySpecialization()throws JsonParseException,JsonMappingException,IOException;
	public void searchDoctorByAvailibility()throws JsonParseException,JsonMappingException,IOException;
	
	public void searchPatientByName()throws JsonParseException,JsonMappingException,IOException;
	public void searchPatientById()throws JsonParseException,JsonMappingException,IOException;
	public void searchPatientByPhnNo()throws JsonParseException,JsonMappingException,IOException;
	
	
	public void displayDoctors()throws JsonParseException,JsonMappingException,IOException;
	public void displayPatients()throws JsonParseException,JsonMappingException,IOException;
	
	public void createFile()throws JsonParseException,JsonMappingException,IOException;
	public void saveFile()throws JsonParseException,JsonMappingException,IOException;
	
	public void appointment() throws JsonParseException, JsonMappingException, IOException;
	public void fixAppoint()throws JsonParseException,JsonMappingException,IOException;

}
