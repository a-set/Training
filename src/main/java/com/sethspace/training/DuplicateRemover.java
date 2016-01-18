package com.sethspace.training;

public class DuplicateRemover {

	// An array of LinkedList acts as a Hash Table here
	private static LinkedList[] hashTable;

	public static void main(String args[]) {

		// Create a test linked list
		LinkedList original = createASampleLL();

		// Print the simple linked list
		System.out.println("The Linked List is");
		printLL(original);

		removeDuplicates(original);

		// Print a message
		System.out.println("After removing duplicates");
		// Print the modified LL
		printLL(original);

	}

	public static LinkedList createASampleLL() {

		int[] inputValues = { 1, 4, 5, 23, 42, 67, 78, 91, 93, 23, 4 };

		LinkedList sampleList = new LinkedList(new Node(inputValues[0]));
		sampleList.length = 1;

		for (int i = 1; i < inputValues.length; i++) {

			sampleList.appendNode(inputValues[i]);
			sampleList.length++;
		}

		return sampleList;

	}

	public static void printLL(LinkedList list) {

		Node n = list.head;

		if (n == null)
			System.out.println("List Empty");

		else {
			while (n.next != null) {
				System.out.print(n.value + "--> ");
				n = n.next;
			}
			System.out.print(n.value);
		}
		System.out.println();
	}

	public static void removeDuplicates(LinkedList original) {
		
		//Add head to hashtable
		int hash = calculateHashValue(original.head);
		addToHashTable(hash,original.head.value);
		
		//Set pointers
		Node prepointer = original.head;
		Node pointer = original.head.next;
		
		while(pointer != null){
			if(!addToHashTable(calculateHashValue(pointer),pointer.value)){
				prepointer.next = pointer.next;
				pointer = prepointer.next;
			}
			else{
				prepointer = pointer;
				pointer = pointer.next;
			}
		}
	}

	/**
	 * Calulates the hashvalue as a remainder of 10.
	 **/
	public static int calculateHashValue(Node n) {
		return n.value % 10;
	}

	/**
	 * Adds to the hash table and returns a boolean as the status of addition.
	 * 
	 * @return Returns true if added successfully and returns false if collision
	 **/

	public static boolean addToHashTable(int hash, int value) {

		// Create a Hash table if not available
		if (hashTable == null) {

			hashTable = new LinkedList[10];

		}

		if (isCollision(hash)) {

			// Do a Binary search in the linkedList
			boolean found = searchLL(hashTable[hash],value);

			// If found there are duplicates, so return false , else return true
			if (found){
				
				System.out.println ("Duplicate found  = " + value);
				return false;
			
			}
			else {
				hashTable[hash].insertNode(value);
				System.out.println("inserting into hashTable despite collision ["+hash+"] = "+value );
				return true;
			}
		} else {
			hashTable[hash] = new LinkedList(new Node(value));
			System.out.println("inserting into hashTable["+hash+"] = "+value );
			//hashTable[hash].insertNode(n.value);
			return true;
		}

	}

	private static boolean isCollision(int hash) {
		return hashTable[hash] != null;
	}

	/**
	 * Assumes that the Linked List is sorted and performs a Linear Search
	 * 
	 * @param ll
	 * @return
	 */
	public static boolean searchLL(LinkedList ll,int value){
		Node n = ll.head;
		if(n.value == value)
			return true;
		while(n.next!=null){
			if(n.next.value == value)
				return true;
			n = n.next;
		}
		return false;
	}

}
