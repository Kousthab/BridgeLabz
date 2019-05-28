package com.addressbook.model;



public class Address {
	
	private String streetName;
	private String buildingName;
	private String zipCode;
	private String city;
	private String state;
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Address() {
		
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", buildingName=" + buildingName + ", zipCode=" + zipCode
				+ ", city=" + city + ", state=" + state + "]";
	}

	
	

}
