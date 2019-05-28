package com.bridgelabz.ds;

public class RunnerDemo {
	public static void main(String[] args) {
		//USLL<String> usll=new USLL<String>();
		GenericSLL<Integer> usll=new GenericSLL<Integer>();
		
		/*usll.insert(5);
		usll.insert(11);
		usll.insert(3);
		usll.insert(89);
		usll.insert(1);
		usll.show();*/
		System.out.println();
		/*System.out.println();
		usll.mergeSort(usll.head);
		usll.show();*/
		//System.out.println(usll.head.data.compareTo(usll.head.next.data));
		
		usll.sortedInsert(11);
		usll.sortedInsert(5);
		usll.sortedInsert(6);
		usll.sortedInsert(1);
		usll.sortedInsert(2);
		
		usll.show();




		
		/*usll.mergeSort(usll.head);
		usll.show();*/
		/*usll.insertAtStart("John");
		usll.insert("Joey");
		usll.insert("Jordan_Belfort");
		usll.insertAtStart("Chandler");
		usll.show();
		usll.delete("Jordan_Belfort");
		usll.show();
		usll.delete("Chandler");
		usll.show();
		System.out.println();
		System.out.println(usll.search("John"));
		System.out.println(usll.search("Joey"));
		System.out.println(usll.index("Joey"));
		/*usll.deleteAtEnd();
		usll.show();
		System.out.println();
		usll.delete("Chandler");
		usll.show();
		usll.delete("John");
		usll.show();*/
		/*usll.insertAt("monica", 3);
		usll.show();
		System.out.println();
		usll.deleteAt(1);
		usll.show();
		usll.size();
		System.out.println();
		usll.deleteAtStart();
		usll.deleteAtStart();
		usll.deleteAtStart();
		usll.show();
		usll.size();
		usll.deleteAtStart();
		usll.size();
		usll.insert("Kristofer");
		usll.insert("John");
		System.out.println("is list empty: "+usll.isEmpty());
		usll.show();
		System.out.println("is item available? "+usll.search("zmehk"));
		System.out.println("Item at position: "+usll.index("Kristofer"));*/
		/*usll.delete("Joey");
		usll.show();*/
		/*System.out.println();
		usll.deleteAtStart();
		usll.deleteAtEnd();
		usll.show();
		System.out.println();
		usll.deleteAtStart();
		usll.show();*/
		
	}
	
	

}
