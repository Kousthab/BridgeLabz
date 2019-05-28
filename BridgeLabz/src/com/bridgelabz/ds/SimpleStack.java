package com.bridgelabz.ds;

public class SimpleStack {
	static int max=100;
	int top;
	int[] arr=new int[max];
	char[] ch=new char[max];
	SimpleStack() {
		top=-1;
	}
	
	boolean isEmpty(){
		return (top<0);
	}
	
	boolean push(int x){
		if(top>=max-1){
			System.out.println("Stack is full");
			return false;
		}
		else{
			arr[++top]=x;
			System.out.println(x+ "inserted");
			return true;
		}
	}
	
	boolean cpush(char c){
		if(top>=max+1){
			System.out.println("Stack is full");
			return false;
		}
		else{
			ch[++top]=c;
			//System.out.println(c+ "Character Inserted");
			return true;
		}
	}
	
	void pop(){
		if(top==-1){
			System.out.println("Stack underflow");
		}
		else{
			int a=arr[top--];
			System.out.println("Popped Item "+a);
		}
	}
	
	char cpop(){
		char c=0;
		if(top==-1){
			System.out.println("Stack underflow");
		}
		else{
				c=ch[top];
				top--;
				//System.out.println("Popped Item : "+c);
		}
		return c;
	}
	
	int peek(){
		return arr[top];
	}
	
	void size(){
		System.out.println("Size of Stack: "+(top+1));
	}
	
	public static void main(String[] args) {
		SimpleStack s=new SimpleStack();
		s.push(5);
		s.push(1);
		s.push(15);
		s.pop();
		System.out.println("Item on Top: "+s.peek());
		s.size();
	}

}
