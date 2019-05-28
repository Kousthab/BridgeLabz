package com.dpdemo.factorydesignpattern;

public class OperatingSystemFactory {
	
	public OS getInstance(String str) {
		if(str.equals("Open Source"))
			return new Android();
		else if(str.equals("Closed"))
			return new IOS();
		else
			return new Windows();
	}

}
