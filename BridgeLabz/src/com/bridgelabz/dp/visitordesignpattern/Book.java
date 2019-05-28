package com.bridgelabz.dp.visitordesignpattern;

public class Book implements ItemElement {
	
	private int price;
	private String isbn;
	
	
	
	
	
	
	public Book(int price, String isbn) {
		super();
		this.price = price;
		this.isbn = isbn;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	@Override
	public int accept(ShoppingCartVisitor shoppingCartVisitor) {
		return shoppingCartVisitor.visit(this);
	}
	
	

}
