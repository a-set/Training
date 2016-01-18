package com.sethspace.training;

public class LinkedList{

	Node head;
	int length;
	Node end;

	public LinkedList(Node head){
		
		this.head = head;
		this.length = 1;
		this.end = head;

	}
	
	public LinkedList(){
		this.head =null;
		this.length =0;
		this.end = null;
	}
	
	public void appendNode(int n){
		
		Node toAdd = new Node(n);
		this.end = toAdd;
		
		if(head !=null){
			Node pointer = head;
			while(pointer.next!=null){
				pointer = pointer.next;
			}
			pointer.next  = toAdd;
		}
		else
			this.head = toAdd;
		
		length++;
	}
	
	public void appendNode(Node toAdd){
		this.end = toAdd;

		if (head != null) {
			Node pointer = head;
			while (pointer.next != null) {
				pointer = pointer.next;
			}
			pointer.next = toAdd;
		} else
			this.head = toAdd;
		
		toAdd.next = null;
		length++;
		
	}
	
	public void appendCircularNode(Node toAdd){
		this.end = toAdd;

		if (head != null) {
			Node pointer = head;
			while (pointer.next != null) {
				pointer = pointer.next;
			}
			pointer.next = toAdd;
		} else
			this.head = toAdd;
		
		length++;
		
	}
	
	
	/**
	 * This method makes sure that the LinkedList is always sorted
	 * @param value
	 */
	public Node insertNode(int value){
		
		Node toInsert = new Node(value);
		
		//Is it smaller than the head value
		if(toInsert.value < head.value){
			toInsert.next = head;
			head = toInsert;
			length++;
			return toInsert;
		}
		
		//If not then iterate through the linked list starting from the second element
		Node pointer = head.next;
		Node prepointer = head;
		
		while(pointer != null){
			if(value<pointer.value){
				prepointer.next = toInsert;
				toInsert.next = pointer;
				length++;
				return toInsert;
			}
			prepointer = pointer;
			pointer = pointer.next;
		}
		
		//Its an append operation
		prepointer.next = toInsert;
		length++;
		return toInsert;
	}


	public void deleteNode(Node n){

		
		Node pointer = n;

		if(this.length==0){
			System.out.println("Empty LinkedList nothing to delete");
			return;
		}
		
		//is the node a head node ?
		if( pointer.value == n.value){
			this.head = n.next;
			this.length--;
			return;			
		}


		while(pointer.next!=null){
			if(pointer.next.value == n.value){
							
				pointer.next = pointer.next.next;
				this.length--;
				return;
			}
				
			
		}		

	}

}