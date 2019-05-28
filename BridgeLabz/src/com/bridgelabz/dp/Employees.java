package com.bridgelabz.dp;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable{
	private List<String> emplist;
	
	Employees(){
		emplist=new ArrayList<String>();
	}
	
	public Employees(List<String> emplist) {
		this.emplist=emplist;
	}
	
	public void loadData() {
		emplist.add("John");
		emplist.add("Jordan");
		emplist.add("Joey");
		emplist.add("Chandler");
		emplist.add("Monica");
	}
	
	public List<String> geEmpList() {
		return emplist;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> temp=new ArrayList<String>();
		for(String s:this.emplist) {
			temp.add(s);
		}
		return new Employees(temp);
	}

}
