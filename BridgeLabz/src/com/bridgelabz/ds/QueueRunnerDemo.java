package com.bridgelabz.ds;

public class QueueRunnerDemo {
	
	public static void main(String[] args) {
		QueueWithCircularArray qa=new QueueWithCircularArray();
		qa.enque(50);
		qa.enque(4);
		qa.enque(9);
		qa.enque(5);
		System.out.println();
		//qa.dequeue();
		//qa.dequeue();
		//qa.dequeue();
		qa.dequeue();
		qa.dequeue();
		qa.dequeue();
		qa.dequeue();
		qa.dequeue();
		qa.dequeue();
		qa.dequeue();
		qa.dequeue();
		qa.dequeue();
		System.out.println(qa.isEmpty());
		//qa.dequeue();
	}

}
