package com.bridgelabz.oops;

import java.io.Serializable;

public class EmployeeDemo implements Serializable {
	private int empno;
	private String empname;
	public EmployeeDemo() {
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	@Override
	public String toString() {
		return "EmployeeDemo [empno=" + empno + ", empname=" + empname + "]";
	}
	
	

}
