package com.addressbook.services;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public interface AddressBookIntrf {
	
	public void addPerson(String filename) throws JsonParseException,JsonMappingException,IOException;
	public void editPerson()throws JsonParseException,JsonMappingException,IOException;
	public void deletePerson()throws JsonParseException,JsonMappingException,IOException;
	
	public void sortByName()throws JsonParseException,JsonMappingException,IOException;
	public void sortByZip()throws JsonParseException,JsonMappingException,IOException;
	
	public void search()throws JsonParseException,JsonMappingException,IOException;
	
	public void createFile()throws JsonParseException,JsonMappingException,IOException;
	public void saveFile()throws JsonParseException,JsonMappingException,IOException;
	public void openFile()throws JsonParseException,JsonMappingException,IOException;
	public void loadFileName()throws JsonParseException,JsonMappingException,IOException;
	public void closeFile()throws JsonParseException,JsonMappingException,IOException;
	public void saveAs() throws JsonParseException,JsonMappingException,IOException;

}
