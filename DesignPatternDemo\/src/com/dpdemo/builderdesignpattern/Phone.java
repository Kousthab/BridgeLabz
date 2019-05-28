package com.dpdemo.builderdesignpattern;

public class Phone {
	
	private String os;
	private String processor;
	private double screenSize;
	private String ram;
	private String battery;
	private String camera;
	public Phone(String os, String processor, double screenSize, String ram, String battery, String camera) {
		super();
		this.os = os;
		this.processor = processor;
		this.screenSize = screenSize;
		this.ram = ram;
		this.battery = battery;
		this.camera = camera;
	}
	@Override
	public String toString() {
		return "Phone [os=" + os + ", processor=" + processor + ", screenSize=" + screenSize + ", ram=" + ram
				+ ", battery=" + battery + ", camera=" + camera + "]";
	}
	
	

}
