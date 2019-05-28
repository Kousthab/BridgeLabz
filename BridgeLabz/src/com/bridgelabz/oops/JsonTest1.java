package com.bridgelabz.oops;

public class JsonTest1 {
	
	public static void main(String[] args) {
		
		EmployeeDemo emp1=new EmployeeDemo();
		emp1.setEmpno(200);
		emp1.setEmpname("John");
		
		String res1=JSONUtil.javaToJson(emp1);
		System.out.println(res1);
		System.out.println("======================");
		
		EmployeeDemo emp2=JSONUtil.jsonToJava(res1, EmployeeDemo.class);
		System.out.println(emp2);
		
	}
	

}
