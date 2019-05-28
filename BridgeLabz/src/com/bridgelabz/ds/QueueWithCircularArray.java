package com.bridgelabz.ds;

public class QueueWithCircularArray {
	static int size=100;
	int front;
	int rear;
	int carr[] =new int[size];
	
	public QueueWithCircularArray() {
		front=rear=-1;
	}
	
	boolean isEmpty(){
		if(front==-1 && rear==-1)
			return true;
		else
			return false;
	}
	
	boolean isFull(){
		//if(rear>=size-1)
		//for circular arrangement of array
		if(((rear+1)%size)==front)
			return true;
		else
			return false;
	}
	
	void enque(int x){
		if(isFull()){
			System.out.println("Queue is Full");
			return;}
		else if(isEmpty())
			rear=front=0;
		else
			rear=(rear+1)%size;
			//rear=rear+1;//in circular array next posn would be n=(n+1)%size
		carr[rear]=x;
		System.out.println("Item inserted: "+x);
	}
	
	int dequeue(){
		if(isEmpty()){
			System.out.println("No elements in queue");
			//return 0;
		}
		else if(front==rear){
			front=rear=-1;
		}
		else
			//front=front+1;
			System.out.println("Item deleted: "+carr[front]);
			front=(front+1)%size;
			return carr[front];
		
	}

}
