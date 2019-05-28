package com.bridgelabz.ds;

public class GenericNode<T> implements Comparable<T> {
	T data;
	GenericNode<T> next;
	
	GenericNode(){
		data=null;
		next=null;
	}
	
	GenericNode(T d){
		data=d;
	}
	
	GenericNode(T d,GenericNode<T> n){
		data=d;
		next=n;
	}

	@Override
	public int compareTo(T o) {
		if(Integer.parseInt(this.data.toString())<Integer.parseInt(o.toString()))
			return -1;
		else if(Integer.parseInt(this.data.toString())==Integer.parseInt(o.toString()))
			return 0;
		else
			return 1;
			
	}


}
