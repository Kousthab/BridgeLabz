package com.bridgelabz.dp.observerdesignpattern;

public class GrabStocks {
	
	
	public static void main(String[] args) {
		
		StockGrabber stockGrabber1=new StockGrabber();
		StockObserver stockObserver=new StockObserver(stockGrabber1);
		
		stockGrabber1.setIBMPrice(456);
		stockGrabber1.setApplePrice(852);
		stockGrabber1.setGooglePrice(491);
		
		
		StockGrabber stockGrabber2=new StockGrabber();
		StockObserver stockObserve2=new StockObserver(stockGrabber2);
		
		stockGrabber1.setIBMPrice(123);
		stockGrabber1.setApplePrice(951);
		stockGrabber1.setGooglePrice(753);
		
	}
	

}
