package com.bridgelabz.ds;

public class SimpleDequeue {
	
	int capacity=10,size,front;
	char ch[]= new char[capacity];
	int rear=capacity-1;
	public void addRear(char data)
	{
		rear=(rear+1)%capacity;
		ch[rear]=data;
		size++;
		System.out.println("Item Inserted: "+data);
	}
	public char removeFront()
	{
		char temp=ch[front];
		front=(front+1)%capacity;
		size--;
		return temp;
	}
	public char removeRear()
	{
		char temp=ch[rear];
		rear=(capacity+rear-1)%capacity;
		size--;
		return temp;
	}
	public int size()
	{
		return size;
	}
}


