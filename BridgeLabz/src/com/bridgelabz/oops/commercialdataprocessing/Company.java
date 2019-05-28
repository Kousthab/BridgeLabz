package com.bridgelabz.oops.commercialdataprocessing;

public class Company {
	
	String compName;
	String shareQuantity;
	String price;
	
	Company(){
		
	}
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	public String getShareQuantity() {
		return shareQuantity;
	}
	public void setShareQuantity(String shareQuantity) {
		this.shareQuantity = shareQuantity;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Company [compName=" + compName + ", shareQuantity=" + shareQuantity + ", price=" + price + "]";
	}
	
	
	
	
	
	

}
