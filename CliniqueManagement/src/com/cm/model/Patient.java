package com.cm.model;

public class Patient {
	
	private int id;
	private String name;
	private int age;
	private long phnNo;
	
	public Patient() {
	}
	
	
	
	


	public Patient(int id, String name, int age, long phnNo) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.phnNo = phnNo;
	}






	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", age=" + age + ", phnNo=" + phnNo + "]";
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
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

	public long getPhnNo() {
		return phnNo;
	}

	public void setPhnNo(long phnNo) {
		this.phnNo = phnNo;
	}




	
	
	
	

}
