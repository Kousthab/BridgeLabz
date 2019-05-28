package com.bridgelabz.ds;

public class OLL {
	GenericSLL<Integer> gsll=new GenericSLL<Integer>();
	GenericSLL<Integer> oLL(int d){
		gsll.sortedInsert(d);
		return gsll;
		
	}

}
