package com.bridgelabz.ds;

public class DynamicStack<T> extends GenericSLL<T> {
	
	
	@Override
	public void insert(T d) {
		super.insert(d);
	}
	
	
	
	@Override
	public void deleteAtEnd() {
		super.deleteAtEnd();
	}
	
	@Override
	public boolean isEmpty() {
		return super.isEmpty();
	}
	
	@Override
	public void size() {
		super.size();
	}
	
	public void printStack() {
		while(!isEmpty()) {
			deleteAtEnd();
		}
	}
	
	public void peek(){
		GenericNode<T> n=head;
		while(n.next!=null){
			n=n.next;
		}
		System.out.println("Item on top: "+n.data);
	}

}
