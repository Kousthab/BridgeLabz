package com.bridgelabz.dp.observerdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class StockGrabber implements Subject {
	
	List<Observer> observers;
	private double IBMPrice;
	private double ApplePrice;
	private double GooglePrice;
	
	public StockGrabber() {
		observers=new ArrayList<Observer>();
	}

	@Override
	public void register(Observer newObserver) {
		observers.add(newObserver);
		
	}

	@Override
	public void unregister(Observer deleteObserver) {
		int observerIndex=observers.indexOf(deleteObserver);
		System.out.println("Deleted Observer: "+(observerIndex+1));
		observers.remove(observerIndex);
		
	}

	@Override
	public void notifyObserver() {
		for(Observer observer:observers) {
			observer.update(IBMPrice, ApplePrice, GooglePrice);
		}
		
	}
	
	public void setIBMPrice(double newIBMPrice) {
		this.IBMPrice=newIBMPrice;
		notifyObserver();
	}
	
	public void setApplePrice(double newApplePrice) {
		this.ApplePrice=newApplePrice;
		notifyObserver();
	}
	
	public void setGooglePrice(double newGooglePrice) {
		this.GooglePrice=newGooglePrice;
		notifyObserver();
	}

}
