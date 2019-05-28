package com.cm.model;

public class Doctor {
	
	
	private int id;
	private String name;
	private String specialization;
	private String availability;
	private int amCount=0;
	private int pmCount=0;
	
	public Doctor(){
	}

	
	

	public Doctor(int id, String name, String specialization, String availability, int amCount, int pmCount) {
		super();
		this.id = id;
		this.name = name;
		this.specialization = specialization;
		this.availability = availability;
		this.amCount = amCount;
		this.pmCount = pmCount;
	}




	public int getAmCount() {
		return amCount;
	}

	public void setAmCount(int amCount) {
		this.amCount = amCount;
	}

	public int getPmCount() {
		return pmCount;
	}

	public void setPmCount(int pmCount) {
		this.pmCount = pmCount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", specialization=" + specialization + ", availability="
				+ availability + "]";
	}
	

	
	
	

}
