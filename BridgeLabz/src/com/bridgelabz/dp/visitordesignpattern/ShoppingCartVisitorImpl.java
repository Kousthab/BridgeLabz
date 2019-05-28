package com.bridgelabz.dp.visitordesignpattern;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

	
	int cost;
	@Override
	public int visit(Book book) {
		if(book.getPrice()>50) {
			cost=book.getPrice()-book.getPrice()*(5/100);
		}
		else {
			cost=book.getPrice();
		}
		System.out.println("Book ISBN no: "+book.getIsbn()+" Cost: "+cost);
		return cost;
	}

	@Override
	public int visit(Fruit fruit) {
		cost=fruit.getWeight()*fruit.getPricePerKg();
		System.out.println("Fruit: "+fruit.getName()+" Cost: "+cost);
		return cost;
	}

}
