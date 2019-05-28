package com.bridgelabz.dp.observerdesignpattern;

public class StockObserver implements Observer {
	
	private double IBMPrice;
	private double ApplePrice;
	private double GooglePrice;
	
	private static int observerIDTracker=0;
	private int observerID;
	
	private Subject stockGrabber;
	
	public StockObserver(Subject stockGrabber) {
		this.stockGrabber=stockGrabber;
		this.observerID=++observerIDTracker;
		System.out.println("New Observer: "+this.observerID);
		stockGrabber.register(this);
	}
	
	

	@Override
	public void update(double IBMPrice, double ApplePrice, double GooglePrice) {
		this.IBMPrice=IBMPrice;
		this.ApplePrice=ApplePrice;
		this.GooglePrice=GooglePrice;
		
		printThePrice();
		
	}
	
	public void printThePrice() {
		System.out.println(observerID);
		System.out.println();
		System.out.println("IBM: "+IBMPrice);
		System.out.println("Apple: "+ApplePrice);
		System.out.println("Google: "+GooglePrice);
		System.out.println();
	}

}
