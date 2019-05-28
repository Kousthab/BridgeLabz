package com.bridgelabz.ds;

public class BinarySearchTree {
	
Node root;
	
	public void addNode(int key,String name){
		Node newNode=new Node(key, name);
		
		if(root==null){
			root=newNode;
		}
		else{
			Node focusNode=root;
			Node parent;
			
			while(true){
				parent=focusNode;
				
				if(key<focusNode.key){
					focusNode=focusNode.leftChild;
					if(focusNode==null){
						parent.leftChild=newNode;
						return;
					}
				}
				else{
					focusNode=focusNode.rightChild;
					if(focusNode==null){
						parent.rightChild=newNode;
						return;
						
					}
				}
				
			}
		}
		
	}
	
	public void inorderTraverse(Node focusNode){
		
		if(focusNode!=null){
			inorderTraverse(focusNode.leftChild);
			System.out.println(focusNode);
			inorderTraverse(focusNode.rightChild);
		}
	}
	
	public void preorderTraverse(Node focusNode){
		if(focusNode!=null){
			System.out.println(focusNode);
			preorderTraverse(focusNode.leftChild);
			preorderTraverse(focusNode.rightChild);
		}
	}
	
	public void postorderTraverse(Node focusNode){
		if(focusNode!=null){
			postorderTraverse(focusNode.leftChild);
			postorderTraverse(focusNode.rightChild);
			System.out.println(focusNode);
		}
	}
	
	public Node findNode(int key){
		Node focusNode=root;
		while(focusNode.key!=key){
			if(key<focusNode.key){
				focusNode=focusNode.leftChild;
			}
			else{
				focusNode=focusNode.rightChild;
			}
		}
		return focusNode;
		
	}
	
	
	public static void main(String[] args) {
		
		BinarySearchTree bt=new BinarySearchTree();
		bt.addNode(100, "CEO");
		bt.addNode(30, "secretary");
		bt.addNode(55, "Assistant");
		bt.addNode(120, "Manager");
		bt.addNode(150, "Leader");
		bt.addNode(190, "Innovation Lead");
		
		bt.inorderTraverse(bt.root);
		System.out.println("---------------------------------------------");
		bt.preorderTraverse(bt.root);
		System.out.println("---------------------------------------------");
		bt.postorderTraverse(bt.root);
		System.out.println("----------------------------------------------");
		
		System.out.println("find 150");
		System.out.println(bt.findNode(150));
		
	}

}

class Node{
	int key;
	String name;
	
	Node leftChild;
	Node rightChild;
	
	Node(int key,String name){
		this.key=key;
		this.name=name;
		
	}
	
	public String toString(){
		return name+" has a key "+key;
	}
}
