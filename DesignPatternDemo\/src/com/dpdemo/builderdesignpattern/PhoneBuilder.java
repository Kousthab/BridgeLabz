package com.dpdemo.builderdesignpattern;

public class PhoneBuilder {
	
	
	private String os;
	private String processor;
	private double screenSize;
	private String ram;
	private String battery;
	private String camera;
	
	public PhoneBuilder setOs(String os) {
		this.os=os;
		return this;
	}
	
	public PhoneBuilder setProcessor(String processor) {
		this.processor=processor;
		return this;
	}
	
	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize=screenSize;
		return this;
	}
	
	public PhoneBuilder setRam(String ram) {
		this.ram=ram;
		return this;
	}
	
	public PhoneBuilder setBattery(String battery) {
		this.battery=battery;
		return this;
	}
	
	public PhoneBuilder setCamera(String camera) {
		this.camera=camera;
		return this;
	}
	
	public Phone getPhone() {
		return new Phone(os, processor, screenSize, ram, battery, camera);
	}

}
