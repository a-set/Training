package com.sethspace.training;

public class FindNFromLast {

	final static int NUMBER = 10;
	public static void main(String args[]) {

		// Number of elelments in the LinkedList
		

		// Create a sample Linked List
		LinkedList list = new LinkedList();

		Node corruptNode = new Node(0);
		// generate a random linked list
		for (int i = 0; i < NUMBER; i++){
			Node n = new Node((int) (Math.random() * NUMBER));
			list.appendNode(n);
			if(i==5)
				corruptNode =n;
		}
		list.appendNode(corruptNode);
		
		
		// Print the linkedlist
		System.out.println("The original linked List is ");
		printLL(list);
		
		//Find the corrupt node
		System.out.println("The Corrupt Node is " + findTheCorruptedNode(list).value);
		
		
		
		// Find the Nth element from the end
		// int n = 6 ;
		// System.out.println("The " + n + " th element from the last is " +
		// getNthElement(list, n).value);

		// Insert a node in the linkedlist
		//Node inserted = list.insertNode(0);
		//System.out.println("The fabricated linked List is ");
		//printLL(list);
		//System.out.println("Deleting node " + inserted.value);
		//DeleteANodeWhenNotGivenAccess(inserted);
		//printLL(list);

	}

	public static void printLL(LinkedList list) {
		Node n = list.head;
		int i=0;
		while (n.next != null && i < NUMBER) {
			System.out.print(n.value + "->");
			n = n.next;
			i++;
		}
		// print the last node
		System.out.println(n.value);
	}

	public static int findTheNthFromLast(LinkedList list, int n) {

		Node leading = list.head;
		Node trailing = list.head;
		int i = 1;
		while (i <= n) {
			if (leading.next != null) {
				leading = leading.next;
				i++;
			} else
				break;
		} // While

		if (i != n + 1)
			System.out.println("the list size is small");

		while (leading != null) {
			leading = leading.next;
			trailing = trailing.next;
		}

		return trailing.value;

	}// method

	// Using recursion
	public static Node getNthElement(LinkedList list, int n) {
		if (n == list.length)
			return list.head;
		else
			return getNthElement(list, n + 1).next;
	}

	// Delete a node when not given access, only works with elements in the
	// middle
	public static void DeleteANodeWhenNotGivenAccess(Node middle) {

		if (middle.next != null) {
			middle.value = middle.next.value;
			middle.next = middle.next.next;
		}
	}

	// Find the corrupted node
	public static Node findTheCorruptedNode(LinkedList list) {
		Node i = list.head;
		HashTable table = new HashTable();
		while (i != null) {
			if (!table.contains(i))
				table.addToHashTable(i);
			else
				break;
			i = i.next;
		}
		return i;
	}

}
