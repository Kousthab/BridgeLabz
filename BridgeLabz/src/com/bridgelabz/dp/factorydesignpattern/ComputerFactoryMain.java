package com.bridgelabz.dp.factorydesignpattern;

public class ComputerFactoryMain {
	
	public static void main(String[] args) {
		ComputerFactory cf=new ComputerFactory();
		Computer c=cf.getComputer("Server", "2gb", "1tb", "i5");
		System.out.println(" Specs: ");
		System.out.println(c);
	}

}
