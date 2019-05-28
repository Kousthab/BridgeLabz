package com.bridgelabz.ds;

public class DStackRunnerDemo {
	public static void main(String[] args) {
		DynamicStack<Integer> dstack=new DynamicStack<Integer>();
		dstack.insert(45);
		dstack.insert(2);
		dstack.insert(6);
		dstack.insert(50);
		dstack.deleteAtEnd();
		dstack.peek();
	}

}
