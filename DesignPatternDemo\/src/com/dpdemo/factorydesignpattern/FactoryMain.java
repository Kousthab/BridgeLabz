package com.dpdemo.factorydesignpattern;

public class FactoryMain {
	
	public static void main(String[] args) {
		OperatingSystemFactory osf=new OperatingSystemFactory();
		OS obj=osf.getInstance("Open Source");
		obj.spec();
		OS obj2=osf.getInstance("Closed");
		obj2.spec();
		OS obj3=osf.getInstance("Nobody use windows");
		obj3.spec();
	}

}
