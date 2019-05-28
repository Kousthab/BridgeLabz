package com.addressbook.model;

public class Person {
	
	private String name;
	private String phnNo;
	private Address address;
	
	public Person() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhnNo() {
		return phnNo;
	}
	public void setPhnNo(String phnNo) {
		this.phnNo = phnNo;
	}
	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", phnNo=" + phnNo + ", address=" + address + "]";
	}

}
