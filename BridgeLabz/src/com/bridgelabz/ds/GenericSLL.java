package com.bridgelabz.ds;

public class GenericSLL<T> {
	GenericNode<T> head;
	GenericSLL<T> gsll;
	
	public void insert(T d){
		GenericNode<T> node=new GenericNode<T>(d,null);
		if(head==null){
			head=node;
		}
		else{
			GenericNode<T> n=head;
			while(n.next!=null){
				n=n.next;
			}
			n.next=node;
			System.out.println("Item Inserted: "+n.data);
		}
	}
	
	public void insertAtStart(T d){
		GenericNode<T> node=new GenericNode<T>(d,null);
		node.next=head;
		head=node;
	}
	
	public void insertAt(T d,int pos){
		GenericNode<T> node =new GenericNode<T>(d,null);
		if(pos==0){
			insertAtStart(d);
		}
		else{
			GenericNode<T> n=head;
			for(int i=1;i<pos-1;i++){
				n=n.next;
			}
			node.next=n.next;
			n.next=node;
		}
	}
	
	public void sortedInsert(T d){
		GenericNode<T> node=new GenericNode<T>(d,null);
		
		if(head==null || (((head.compareTo(node.data)==0))||(head.compareTo(node.data)==1))){
			node.next=head;
			head=node;
		}
		else{
			GenericNode<T> node1=head;
			while(node1.next!=null&&((node1.next.compareTo(node.data))==-1))
				node1=node1.next;
			node.next=node1.next;
			node1.next=node;
		}
	}
	
	GenericSLL<T> oLL(T d){
		gsll=new GenericSLL<T>();
		gsll.sortedInsert(d);
		return gsll;
	}
	
	/*public GenericSLL(int length) {
		for(int i=0;i<length;i++){
			
		}
	}*/
	
	public void deleteAtStart(){
		System.out.println("Deleted Item: "+head.data);
		head=head.next;
	}
	public void delete(T d){
		GenericNode<T> n=head;
		GenericNode<T> n1=null;
		GenericNode<T> n2=null;
		if(head.data.equals(d)){
			deleteAtStart();
		}
		else{
			while((n.data.equals(d))==false){
				n1=n;
				n=n.next;
			}
			n2=n1.next;
			n1.next=n2.next;
			System.out.println("Deleted Item: "+n2.data);
		}
	}
	
	public void deleteAt(int pos){
		if(pos==1){
			deleteAtStart();
		}
		else{
			GenericNode<T> n=head;
			GenericNode<T> n1=null;
			for(int i=1;i<pos-1;i++){
				n=n.next;
			}
			n1=n.next;
			n.next=n1.next;
			System.out.println("Deleted Item: "+n1.data);
		}
		
	}
	
	public void deleteAtEnd(){
		GenericNode<T> n=head;
		GenericNode<T> n1=null;
		while(n.next!=null){
			n1=n;
			n=n.next;
		}
		n1.next=null;
		System.out.print(n.data+" ");
		//return n.data;
	}
	
	public void show(){
		GenericNode<T> n=head;
		System.out.println("Singly Linked List: ");
		if(head==null){
			System.out.println("Empty SLL");
		}
		else{
			while(n!=null){
				System.out.print(n.data+"->");
				n=n.next;
			}
			System.out.print("NULL");
		}
	}
	
	public void size(){
		GenericNode<T> n=head;
		int size=0;
		if(n==null){
			System.out.println("Empty SLL");
		}
		else{
			while(n!=null){
				size++;
				n=n.next;
			}
			System.out.println("Size of Singly Linked List: "+size);
		}
	}
	
	public boolean isEmpty(){
		if(head!=null)
			return false;
		return true;
	}
	
	public boolean search(T d){
		GenericNode<T> n=head;
		while(n!=null){
			if(n.data.equals(d))
				return true;
			n=n.next;
		}
		return false;
	}
	
	public int index(T d){
		GenericNode<T> n=head;
		int pos=0;
		while(n!=null){
			if(n.data.equals(d))
				return pos;
			pos++;
			n=n.next;
		}
		return pos;
	}
	
	
	//MergeSort
	
	GenericNode<T> getMiddle(GenericNode<T> n){
		if(n==null)
			return n;
		GenericNode<T> fastptr=n.next;
		GenericNode<T> slowptr=n;
		while(fastptr!=null){
			fastptr=fastptr.next;
			if(fastptr!=null){
				slowptr=slowptr.next;
				fastptr=fastptr.next;
			}
		}
		return slowptr;
	}
	
	GenericNode<T> sortedMerge(GenericNode<T> a,GenericNode<T> b){
		
		GenericNode<T> result=null;
		if(a==null)
			return b;
		if(b==null)
			return a;
		//problem in here
		if((a.compareTo(b.data))==0||(a.compareTo(b.data))==-1){
			result=a;
			sortedMerge(a.next, b);
		}
		else{
			result=b;
			sortedMerge(a, b.next);
		}
		return result;
	}


	GenericNode<T> mergeSort(GenericNode<T> n){
		if(n==null||n.next==null){
			return n;
		}
		GenericNode<T> mid=getMiddle(n);
		GenericNode<T> nextToMid=mid.next;
		
		GenericNode<T> left=mergeSort(n);
		GenericNode<T> right=mergeSort(nextToMid);
		
		GenericNode<T> sortedResult=sortedMerge(left, right);
		return sortedResult;
		
	}

	

	
	

	



	
	
	
	
	

}
