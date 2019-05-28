package com.dpdemo.builderdesignpattern;

public class Shop {
	
	public static void main(String[] args) {
		Phone p=(Phone)new PhoneBuilder().setOs("Android").setScreenSize(5.5).getPhone();
		System.out.println(p);
	}

}
