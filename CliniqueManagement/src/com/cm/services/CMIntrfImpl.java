package com.cm.services;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.cm.services.JSONUtil;
import com.cm.model.Appointment;
import com.cm.model.Doctor;
import com.cm.model.Patient;

public class CMIntrfImpl implements CMIntrf {
	
	public static List<String> fileList=new ArrayList<String>();
	ObjectMapper objectMapper=new ObjectMapper();
	
	List<Doctor> doctorList=new ArrayList<Doctor>();
	List<Patient> patientList=new ArrayList<Patient>();
	List<Appointment> appointmentList=new ArrayList<Appointment>();

	@Override
	public void add() throws JsonParseException, JsonMappingException, IOException {
		System.out.println("1.Add Doctor");
		System.out.println("2.Add Patient");
		System.out.println("3.To get at main menu");
		/*System.out.println("3.Delete Doctor");
		System.out.println("4.Delete Patient");
		System.out.println("5.Edit Doctor");
		System.out.println("6.Edit Patient");
		System.out.println("7.To get at main menu");*/
		System.out.println("Enter the Choice:=>");
		int ch = JSONUtil.IntegerInput();
		switch (ch) {
		case 1:
			System.out.println("Enter the File Name:=>");
			String doctorFileName = JSONUtil.SingleStringInput();
			addDoctor(doctorFileName);
			break;
		case 2:
			System.out.println("Enter the File Name:=>");
			String patientFileName = JSONUtil.SingleStringInput();
			addPatient(patientFileName);
			break;
		/*case 3:
			deleteDoctor();
			System.out.println("Doctor is Deleted");
			break;
		case 4:
			deletePatient();
			System.out.println("Patient is Deleted");
			break;
		case 5:
			editDoctor();
			System.out.println("Doctor is edited");
			break;
		case 6:
			editPatient();
			System.out.println("Patient is edited");
			break;*/
		case 3:
			return;
		}
		
	}

	@Override
	public void search() throws JsonParseException, JsonMappingException, IOException {
		//wip2
		System.out.println("1.Doctor to search");
		System.out.println("2.Patient to search");
		int ch = JSONUtil.IntegerInput();
		switch (ch) {
		case 1:
			System.out.println("Doctor.........");
			System.out.println("1.DOCTORID ");
			System.out.println("2.DoctorName ");
			System.out.println("3.DoctorAvailablity");
			System.out.println("4.DoctorSpecialization ");

			int ch1 = JSONUtil.IntegerInput();
			switch (ch1) {
			case 1:
				System.out.println("Searching doctor by id");
				searchDoctorByID();
				break;
			case 2:
				System.out.println("Searching Doctor by Name");
				searchDoctorByName();
				break;
			case 3:
				System.out.println("Searching Doctor by Avaliablilty");
				searchDoctorByAvailibility();
				break;
			case 4:
				System.out.println("Searching Doctor by Specilaization");
				searchDoctorBySpecialization();
				break;
			}
			break;
		case 2:

			System.out.println("Patient........");
			System.out.println("1.PatientID ");
			System.out.println("2.PatientName ");
			System.out.println("3.Patientphnumber");
			int ch2 = JSONUtil.IntegerInput();
			switch (ch2) {
			case 1:
				System.out.println("Searching Patient by id");
				searchPatientById();
				break;
			case 2:
				System.out.println("Searching Patient by Name");
				searchPatientByName();
				break;
			case 3:
				System.out.println("Searching Patient by PhoneNumber");
				searchPatientByPhnNo();
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
	public void display() throws JsonParseException, JsonMappingException, IOException {
		System.out.println("1.Display Doctors");
		System.out.println("2.Display Patients");
		int ch=JSONUtil.IntegerInput();
		switch(ch) {
			case 1:
				System.out.println("Doctors:");
				displayDoctors();
				break;
			case 2:
				System.out.println("Patients");
				displayPatients();
				break;
			default:
				System.out.println("Invalid Choice");
				return;
		}
		
	}

	@Override
	public void addDoctor(String doctorFileName) throws JsonParseException, JsonMappingException, IOException {
		File doctorFileObject=new File(doctorFileName+".json");
		if(doctorFileObject.length()==0) {
			Doctor doc=new Doctor();
			
			System.out.println("Enter Doctor ID: ");
			doc.setId(JSONUtil.IntegerInput());
			
			System.out.println("Enter Doctor Name: ");
			doc.setName(JSONUtil.SingleStringInput());
			
			System.out.println("Enter Specialization: ");
			doc.setSpecialization(JSONUtil.SingleStringInput());
			
			System.out.println("Enter Availibity: ");
			doc.setAvailability(JSONUtil.SingleStringInput());
			
			doctorList.add(doc);
			System.out.println("Doctor Details: ");
			System.out.println(doctorList);
		}
		else {
			List<Doctor> doctorFileList=objectMapper.readValue(doctorFileObject,new TypeReference<List<Doctor>>(){});
			doctorList.addAll(doctorFileList);
			
			Doctor doc=new Doctor();
			
			System.out.println("Enter Doctor ID: ");
			doc.setId(JSONUtil.IntegerInput());
			
			System.out.println("Enter Doctor Name: ");
			doc.setName(JSONUtil.SingleStringInput());
			
			System.out.println("Enter Specialization: ");
			doc.setSpecialization(JSONUtil.SingleStringInput());
			
			System.out.println("Enter Availibity: ");
			doc.setAvailability(JSONUtil.SingleStringInput());
			
			doctorList.add(doc);
			System.out.println("Doctor Details: ");
			System.out.println(doctorList);
		}
		
	}

	@Override
	public void editDoctor() throws JsonParseException, JsonMappingException, IOException {
		//wip
		System.out.println("Editting Doctor ");
		System.out.println("Enter File Name From Which Doctor has to be Edited:=>");
		String fileName = JSONUtil.SingleStringInput();
		fileName = fileName+".json";
		File docFileObject = new File(fileName);
		if(docFileObject.length()==0)
		{
			System.out.println("File is Empty!");
		}
		else
		{
			System.out.println("Enter Name of Doctor to be Edited");
			String name = JSONUtil.SingleStringInput();
			List<Doctor> docFileList = objectMapper.readValue(docFileObject, new TypeReference<List<Doctor>>() {});
			doctorList.addAll(docFileList);
			System.out.println(doctorList);
			for(int i=0;i<doctorList.size();i++)
			{
				if(name.equals(((Doctor) doctorList.get(i)).getName()))
				{	
					System.out.println("1.Name");
					System.out.println("2.Specialization");
					System.out.println("3.Availability");
					System.out.println("Enter Choice What You Have to Edit?");
					int ch = JSONUtil.IntegerInput();
					switch(ch)
					{
						case 1:
								System.out.println("Enter Name to Replace:=>");
								String nameToReplace = JSONUtil.SingleStringInput();
								docFileList.get(i).setName(nameToReplace);
								break;
						case 2:
							System.out.println("Enter Specialization to Replace:=>");
							String specToReplace = JSONUtil.SingleStringInput();
							docFileList.get(i).setSpecialization(specToReplace);
							break;
						case 3:
								System.out.println("Enter Availability to Replace:=>");
								String avalToReplace = JSONUtil.SingleStringInput();
								doctorList.get(i).setAvailability(avalToReplace);
								break;
					}
					break;
				}	
				else
				{
					System.out.println("Doctor Not Found!");
				}
			}
			
		}
		
	}

	@Override
	public void deleteDoctor() throws JsonParseException, JsonMappingException, IOException {
		System.out.println("Enter File Name From Which Doctor has to be Deleted:=>");
		String fileName = JSONUtil.SingleStringInput();
		String path = fileName + ".json";
		File doctorFileObject = new File(path);
		if (doctorFileObject.length() == 0) {
			System.out.println("File is Empty!");
		} else {
			doctorList.clear();
			doctorList = objectMapper.readValue(doctorFileObject, new TypeReference<List<Doctor>>() {
			});
			System.out.println("Enter Name of Doctor to be deleted");
			String name = JSONUtil.SingleStringInput();
			for (int i = 0; i < doctorList.size(); i++) {
				if (name.equals(((Doctor) doctorList.get(i)).getName())) {
					doctorList.remove(i);
					break;
				}
			}
			CMServices.writeObjectToJson(doctorList, fileName + ".json");
		}
		
	}

	@Override
	public void addPatient(String patientFileName) throws JsonParseException, JsonMappingException, IOException {
		File patientFileObject=new File(patientFileName+".json");
		if(patientFileObject.length()==0) {
			Patient patn=new Patient();
			
			System.out.println("Enter Patient ID: ");
			patn.setId(JSONUtil.IntegerInput());
			
			System.out.println("Enter Patient Name: ");
			patn.setName(JSONUtil.SingleStringInput());
			
			System.out.println("Enter Age: ");
			patn.setAge(JSONUtil.IntegerInput());
			
			System.out.println("Enter Phone No: ");
			patn.setPhnNo(JSONUtil.longInput());
			
			patientList.add(patn);
			System.out.println("Patient Details: ");
			System.out.println(patn);
		}
		else {
			List<Patient> patnFileList=objectMapper.readValue(patientFileObject,new TypeReference<List<Patient>>(){});
			patientList.addAll(patnFileList);
			
			Patient patn=new Patient();
			
			System.out.println("Enter Patient ID: ");
			patn.setId(JSONUtil.IntegerInput());
			
			System.out.println("Enter Patient Name: ");
			patn.setName(JSONUtil.SingleStringInput());
			
			System.out.println("Enter Age: ");
			patn.setAge(JSONUtil.IntegerInput());
			
			System.out.println("Enter Phone No: ");
			patn.setPhnNo(JSONUtil.longInput());
			
			patientList.add(patn);
			System.out.println("Patient Details: ");
			System.out.println(patn);
		}
		
	}

	@Override
	public void editPatient() throws JsonParseException, JsonMappingException, IOException {
		//wip
		System.out.println("Editting Person ");
		System.out.println("Enter File Name From Which person has to be Edited:=>");
		String fileName = JSONUtil.SingleStringInput();
		fileName = fileName+".json";
		File patientFileObject = new File(fileName);
		if(patientFileObject.length()==0)
		{
			System.out.println("File is Empty!");
		}
		else
		{
			System.out.println("Enter Name of Patient to be Edited");
			String name = JSONUtil.SingleStringInput();
			List<Patient> patientFileList = objectMapper.readValue(patientFileObject, new TypeReference<List<Patient>>() {});
			patientList.addAll(patientFileList);
			System.out.println(patientList);
			for(int i=0;i<patientList.size();i++)
			{
				if(name.equals(((Patient) patientList.get(i)).getName()))
				{	
					System.out.println("1.Name");
					System.out.println("2.Phone number");
					System.out.println("Enter Choice What You Have to Edit?");
					int ch = JSONUtil.IntegerInput();
					switch(ch)
					{
						case 1:
								System.out.println("Enter Name to Replace:=>");
								String nameToReplace = JSONUtil.SingleStringInput();
								patientFileList.get(i).setName(nameToReplace);
								break;
						case 2:
							System.out.println("Enter Phone Number to Replace:=>");
							long phNumber = JSONUtil.longInput();
							patientFileList.get(i).setPhnNo(phNumber);
							break;
					}
					break;
				}	
				else
				{
					System.out.println("Patient Not Found!");
				}
			}
			
		}
		
	}

	@Override
	public void deletePatient() throws JsonParseException, JsonMappingException, IOException {
		System.out.println("Enter the name of the File from which Patient Has to be deleted=>");
		String fileName=JSONUtil.SingleStringInput();
		String path=fileName+".json";
		File patnFileObject=new File(path);
		if(patnFileObject.length()==0) {
			System.out.println("File is Empty");
		}
		else {
			patientList.clear();
			patientList=objectMapper.readValue(patnFileObject, new TypeReference<List<Patient>>() {});
			System.out.println("Enter the name of the Patient to be deleted: ");
			String name=JSONUtil.SingleStringInput();
			for(int i=0;i<patientList.size();i++) {
				if (name.equals(((Patient) patientList.get(i)).getName())){
					patientList.remove(i);
					break;
				}
			}
			CMServices.writeObjectToJson(patientList, fileName);
		}
		
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void searchDoctorByName() throws JsonParseException, JsonMappingException, IOException {
		int cnt = 0, i;
		System.out.println("Enter the File Name from which has to be deleted:=>");
		String fileName = JSONUtil.SingleStringInput();
		String path = fileName + ".json";
		File doctorFileObject = new File(path);
		if (doctorFileObject.length() == 0) {
			System.out.println("File is Empty");
		} else {
			System.out.println("Enter the name Doctor has to be searched:=>");
			String name = JSONUtil.SingleStringInput();
			doctorList.clear();
			List doctorFileList = objectMapper.readValue(doctorFileObject, new TypeReference<List<Doctor>>() {
			});
			doctorList.addAll(doctorFileList);
			for (i = 0; i < doctorList.size(); i++) {
				if (name.equals(doctorList.get(i).getName())) {
					cnt++;
					break;
				}
			}
			if (cnt > 0) {
				System.out.println("Doctor Found!");
				System.out.println("Doctors Report is:=>" + doctorList.get(i));
			} else {
				System.out.println("Doctor not Found");
			}
		}
		
	}

	@SuppressWarnings({"unchecked","rawtypes"})
	@Override
	public void searchDoctorByID() throws JsonParseException, JsonMappingException, IOException {
		int cnt = 0, i;
		System.out.println("Enter the File Name from which has to be deleted:=>");
		String fileName = JSONUtil.SingleStringInput();
		String path = fileName + ".json";
		File doctorFileObject = new File(path);
		if (doctorFileObject.length() == 0) {
			System.out.println("File is Empty");
		} else {
			System.out.println("Enter the ID Doctor has to be searched:=>");
			int id = JSONUtil.IntegerInput();
			doctorList.clear();
			List doctorFileList = objectMapper.readValue(doctorFileObject, new TypeReference<List<Doctor>>() {
			});
			doctorList.addAll(doctorFileList);
			for (i = 0; i < doctorList.size(); i++) {
				if (id==(doctorList.get(i).getId())) {
					cnt++;
					break;
				}
			}
			if (cnt > 0) {
				System.out.println("Doctor id Found!");
				System.out.println("Doctors Report is:=>" + doctorList.get(i));
			} else {
				System.out.println("Doctor not Found");
			}
		}
		
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void searchDoctorBySpecialization() throws JsonParseException, JsonMappingException, IOException {
		int cnt = 0, i;
		System.out.println("Enter the File Name from which has to be deleted:=>");
		String fileName = JSONUtil.SingleStringInput();
		String path = fileName + ".json";
		File doctorFileObject = new File(path);
		if (doctorFileObject.length() == 0) {
			System.out.println("File is Empty");
		} else {
			System.out.println("Enter the Specialization of Doctor has to be searched:=>");
			String spec = JSONUtil.SingleStringInput();
			doctorList.clear();
			List doctorFileList = objectMapper.readValue(doctorFileObject, new TypeReference<List<Doctor>>() {
			});
			doctorList.addAll(doctorFileList);
			for (i = 0; i < doctorList.size(); i++) {
				if (spec.equals(doctorList.get(i).getSpecialization())) {
					cnt++;
					break;
				}
			}
			if (cnt > 0) {
				System.out.println("Doctor Found!");
				System.out.println("Doctors Report is:=>" + doctorList.get(i));
			} else {
				System.out.println("Doctor not Found");
			}
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public void searchDoctorByAvailibility() throws JsonParseException, JsonMappingException, IOException {
		int cnt = 0, i;
		System.out.println("Enter the File Name from which has to be deleted:=>");
		String fileName = JSONUtil.SingleStringInput();
		String path = fileName + ".json";
		File doctorFileObject = new File(path);
		if (doctorFileObject.length() == 0) {
			System.out.println("File is Empty");
		} else {
			System.out.println("Enter the Availability of Doctor has to be searched:=>");
			String aval = JSONUtil.SingleStringInput();
			doctorList.clear();
			@SuppressWarnings("rawtypes")
			List doctorFileList = objectMapper.readValue(doctorFileObject, new TypeReference<List<Doctor>>() {
			});
			doctorList.addAll(doctorFileList);
			for (i = 0; i < doctorList.size(); i++) {
				if (aval.equals(doctorList.get(i).getAvailability())) {
					cnt++;
					break;
				}
			}
			if (cnt > 0) {
				System.out.println("Doctor Found!");
				System.out.println("Doctors Report is:=>" + doctorList.get(i));
			} else {
				System.out.println("Doctor not Found");
			}
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public void searchPatientByName() throws JsonParseException, JsonMappingException, IOException {
		int cnt = 0, i;
		System.out.println("Enter the File Name from which has to be deleted:=>");
		String fileName = JSONUtil.SingleStringInput();
		String path = fileName + ".json";
		File patientFileObject = new File(path);
		if (patientFileObject.length() == 0) {
			System.out.println("File is Empty");
		} else {
			System.out.println("Enter the Name of Patient has to be searched:=>");
			String pname = JSONUtil.SingleStringInput();
			patientList.clear();
			@SuppressWarnings("rawtypes")
			List patientFileList = objectMapper.readValue(patientFileObject, new TypeReference<List<Patient>>() {
			});
			patientList.addAll(patientFileList);
			for (i = 0; i < patientList.size(); i++) {
				if (pname.equals(patientList.get(i).getName())) {
					cnt++;
					break;
				}
			}
			if (cnt > 0) {
				System.out.println("Patient Found!");
				System.out.println("Patient's Report is:=>" + patientList.get(i));
			} else {
				System.out.println("Patient not Found");
			}
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public void searchPatientById() throws JsonParseException, JsonMappingException, IOException {
		int cnt = 0, i;
		System.out.println("Enter the File Name from which has to be deleted:=>");
		String fileName = JSONUtil.SingleStringInput();
		String path = fileName + ".json";
		File patientFileObject = new File(path);
		if (patientFileObject.length() == 0) {
			System.out.println("File is Empty");
		} else {
			System.out.println("Enter the ID of Patient has to be searched:=>");
			int pid = JSONUtil.IntegerInput();
			patientList.clear();
			@SuppressWarnings("rawtypes")
			List patientFileList = objectMapper.readValue(patientFileObject, new TypeReference<List<Patient>>() {
			});
			patientList.addAll(patientFileList);
			for (i = 0; i < patientList.size(); i++) {
				if (pid==(patientList.get(i).getId())) {
					cnt++;
					break;
				}
			}
			if (cnt > 0) {
				System.out.println("Patient Found!");
				System.out.println("Patient's Report is:=>" + patientList.get(i));
			} else {
				System.out.println("Patient not Found");
			}
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public void searchPatientByPhnNo() throws JsonParseException, JsonMappingException, IOException {
		int cnt = 0, i;
		System.out.println("Enter the File Name from which has to be deleted:=>");
		String fileName = JSONUtil.SingleStringInput();
		String path = fileName + ".json";
		File patientFileObject = new File(path);
		if (patientFileObject.length() == 0) {
			System.out.println("File is Empty");
		} else {
			System.out.println("Enter the PhoneNo of Patient has to be searched:=>");
			long phnNo = JSONUtil.longInput();
			patientList.clear();
			@SuppressWarnings("rawtypes")
			List patientFileList = objectMapper.readValue(patientFileObject, new TypeReference<List<Patient>>() {
			});
			patientList.addAll(patientFileList);
			for (i = 0; i < patientList.size(); i++) {
				if (phnNo==(patientList.get(i).getPhnNo())) {
					cnt++;
					break;
				}
			}
			if (cnt > 0) {
				System.out.println("Patient Found!");
				System.out.println("Patient's Report is:=>" + patientList.get(i));
			} else {
				System.out.println("Patient not Found");
			}
		}
		
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void displayDoctors() throws JsonParseException, JsonMappingException, IOException {
		System.out.println("Enter the file name from which Doctors to display");
		String fileName=JSONUtil.SingleStringInput();
		String path=fileName+".json";
		File doctorFileObject=new File(path);
		if(doctorFileObject.length()==0) {
			System.out.println("File is Empty");
		}
		else {
			doctorList.clear();
			List docFileList=objectMapper.readValue(doctorFileObject, new TypeReference<List<Doctor>>(){});
			doctorList.addAll(docFileList);
			for(int i=0;i<doctorList.size();i++) {
				System.out.println(doctorList.get(i));
			}
			
		}
		
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void displayPatients() throws JsonParseException, JsonMappingException, IOException {
		System.out.println("Enter the file name from which Patients to Display");
		String fileName=JSONUtil.SingleStringInput();
		String path=fileName+".json";
		File patnFileObject=new File(path);
		if(patnFileObject.length()==0) {
			System.out.println("File is Empty");
		}
		else {
			patientList.clear();
			List patnFileList=objectMapper.readValue(patnFileObject, new TypeReference<List<Patient>>(){});
			patientList.addAll(patnFileList);
			for(int i=0;i<patientList.size();i++) {
				System.out.println(patientList.get(i));
			}
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
		System.out.println("1.Save Patient");
		System.out.println("2.Save Doctor");
		System.out.println("Enter Choice:");
		int ch=JSONUtil.IntegerInput();
		switch(ch) {
			case 1:
				System.out.println("Enter Patient File Name: ");
				String fileName1=JSONUtil.SingleStringInput();
				CMServices.writeObjectToJson(patientList, fileName1+".json");
				patientList.clear();
				break;
			case 2:
				System.out.println("Enter Doctor FileName: ");
				String fileName2=JSONUtil.SingleStringInput();
				CMServices.writeObjectToJson(doctorList, fileName2+".json");
				doctorList.clear();
				break;
			default:
				System.out.println("Invalid Choice");
		}
		/*System.out.println("Saving the Person");
		System.out.println("Enter File Name: ");
		String fileName=JSONUtil.SingleStringInput();
		/*CMServices.writeObjectToJson(personArraylist, filename+".json");
		personArraylist.clear();*/
		
		
	}

	@Override
	public void fixAppoint() throws JsonParseException, JsonMappingException, IOException {
		/*System.out.println("Enter Doctor's Id");
		String did=JSONUtil.SingleStringInput();
		System.out.println("Enter Patient's ID");
		String pid=JSONUtil.SingleStringInput();
		System.out.println("Enter Patient's Phone Number: ");
		String pph=JSONUtil.SingleStringInput();*/
		System.out.println("Enter DoctorId");
        int doctorId = JSONUtil.IntegerInput();
        System.out.println("Enter PatientId");
        int patientId = JSONUtil.IntegerInput();
        System.out.println("Enter Availibility");
        String avail = JSONUtil.SingleStringInput();
        System.out.println("Enter Patient Phone Number");
        long patientphone = JSONUtil.longInput();
        Doctor objtemp = (Doctor) doctorList.stream().filter(i -> i.getId() == doctorId).collect(Collectors.toList())
                .get(0);
        Patient objtemp2 = (Patient) patientList.stream().filter(i -> i.getId()== patientId)
                .collect(Collectors.toList()).get(0);
        if (objtemp == null || objtemp2 == null || !(objtemp2.getPhnNo()==(patientphone))) {
            System.out.println("Invalid Details");
            return;
        }
        if (objtemp.getAvailability().equals(avail)) {
            if (objtemp.getAvailability().equalsIgnoreCase("AM")) {
                if (objtemp.getAmCount() > 5) {
                    System.out.println("Doctor Already Have Appointments");
                    return;
                } else {
                    for (int i = 0; i < doctorList.size(); i++) {
                        if (doctorList.get(i).getId()==doctorId) {
                            int temp = doctorList.get(i).getAmCount();
                            doctorList.get(i).setAmCount(temp + 1);
                        }
                    }
                }
            } else if (objtemp.getAvailability().equalsIgnoreCase("PM")) {
                if (objtemp.getPmCount() > 5) {
                    System.out.println("Doctor Already Have Appointments");
                    return;
                } else {
                    for (int i = 0; i < doctorList.size(); i++) {
                        if (doctorList.get(i).getId() == doctorId) {
                            int temp = doctorList.get(i).getPmCount();
                            doctorList.get(i).setPmCount(temp + 1);
                        }
                    }
                }
            }
        }

        appointmentList.add(new Appointment());
        System.out.println("Appointment Fixed");
    }

	@Override
	public void appointment() throws JsonParseException, JsonMappingException, IOException {
		System.out.println("Enter the File Name from appointment:=>");
		String fileName = JSONUtil.SingleStringInput();
		//String path = fileName + ".json";
		File appointmentFileObject = new File(fileName + ".json");
		if (appointmentFileObject.length() == 0) {
			Appointment a = new Appointment();
			System.out.println("Enter the Doctors Name:=>");
			a.setDoctorName(JSONUtil.SingleStringInput());
			System.out.println("Enter the Patients Name:=>");
			a.setPatientName(JSONUtil.SingleStringInput());
			System.out.println("Enter the Date:=>");
			a.setDate(JSONUtil.SingleStringInput());
			System.out.println("Enter the Time:=>");
			a.setTime(JSONUtil.SingleStringInput());
			System.out.println("Appointment details:=>");
			System.out.println(a);
			appointmentList.add(a);
			CMServices.writeObjectToJson(appointmentList, fileName + ".json");
		} else if (appointmentFileObject.length() <= 50) {
			List<Appointment> appointmentFileList = objectMapper.readValue(appointmentFileObject,
					new TypeReference<List<Appointment>>() {
					});
			Appointment a = new Appointment();
			appointmentList.addAll(appointmentFileList);
			System.out.println("Enter the Doctor Name:=>");
			a.setDoctorName(JSONUtil.SingleStringInput());
			System.out.println("Enter the Patients name:=>");
			a.setPatientName(JSONUtil.SingleStringInput());
			System.out.println("Enter the Date:=>");
			a.setDate(JSONUtil.SingleStringInput());
			System.out.println("Enter the Time:=>");
			a.setTime(JSONUtil.SingleStringInput());
			System.out.println(a);
			appointmentList.add(a);
			CMServices.writeObjectToJson(appointmentList, fileName + ".json");
		} else {
			System.out.println("Appointment Is not Available");
		}
		
	}
		
		
	}


