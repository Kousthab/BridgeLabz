package com.cm.model;

public class Appointment {
	
	private String DoctorName;
	private String patientName;
	private String Date;
	private String time;
	
	public Appointment() {}

	public Appointment(String doctorName, String patientName, String date, String time) {
		super();
		DoctorName = doctorName;
		this.patientName = patientName;
		Date = date;
		this.time = time;
	}

	public String getDoctorName() {
		return DoctorName;
	}

	public void setDoctorName(String doctorName) {
		DoctorName = doctorName;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	

}
