package com.bridgelabz.dp.factorydesignpattern;

public abstract class Computer {
	public abstract String getRam();
	public abstract String getHDD();
	public abstract String getCPU();
	@Override
	public String toString() {
		return "Computer [getRam()=" + getRam() + ", getHDD()=" + getHDD() + ", getCPU()=" + getCPU() + "]";
	}
	
	
	
	

}
