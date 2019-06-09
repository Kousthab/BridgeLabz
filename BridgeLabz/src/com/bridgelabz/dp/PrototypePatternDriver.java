package com.bridgelabz.dp;

import java.util.List;

public class PrototypePatternDriver {
	
	public static void main(String[] args) throws CloneNotSupportedException{
		
		Employees emps=new Employees();
		emps.loadData();
		
		
		Employees emp1=(Employees)emps.clone();
		Employees emp2=(Employees)emps.clone();
		
		List<String> list1=emp1.geEmpList();
		list1.add("qwerty");
		List<String> list2=emp2.geEmpList();
		list2.add("asdfgh");
		
		System.out.println("emps: "+emps.geEmpList());
		System.out.println("emp1: "+list1);
		System.out.println("emp2: "+list2);
		
	}

}
