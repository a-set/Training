package com.sethspace.training;

public class MergingLinkedLists {

	public static void main(String args[]) {

		long startTime = System.currentTimeMillis();
		
		// Number of elelments in the LinkedList
		final int NUMBER = 10000;

		// Create a sample Linked List
		LinkedList list = new LinkedList();

		// generate a random linked list
		for (int i = 0; i < NUMBER; i++)
			list.appendNode((int) (Math.random() * NUMBER));

		// Print the linkedlist
		//System.out.println("The original linked List is ");
		//printLL(list);

		// Call merge sort and print
		list = mergeSort(list);
		
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
		//printLL(list);

	}// Main

	public static void printLL(LinkedList list){
		Node n = list.head;
		while(n.next !=null){
			System.out.print( n.value + "->" );
			n = n.next;
		}
		//print the last node
		System.out.println(n.value);
	}

	public static LinkedList mergeSort(LinkedList list) {

		// When there is nothing to sort
		if (list.head == null || list.head.next == null) {
			return list;
		}
		

		Node mid = findMeMid(list);
		LinkedList rightList = new LinkedList(mid.next);
		mid.next =null;
		LinkedList leftList  = new LinkedList(list.head);
		
		rightList = mergeSort(rightList);
		leftList = mergeSort(leftList);
		return merge(rightList,leftList);

	}// MergeSort

	public static Node findMeMid(LinkedList list) {
		Node fast = list.head;
		Node slow = fast;

		while (fast.next!=null && fast.next.next != null) {
				fast = fast.next.next;
				slow = slow.next;
		} // while
		//System.out.println("Mid returning value " + slow.value);
		return slow;
	}// findMeMid

	public static LinkedList merge(LinkedList first,LinkedList second) {
		Node i = first.head; // Goes from start to mid
		Node j = second.head; // Goes from mid.next to end
		
		//System.out.println("Merging "+ i.value + "with "+ j.value);
		
		//Create a merged LinkedList holder
		Node k = new Node();
		LinkedList merged = new LinkedList(k);
		
		while (i != null && j != null) {
			if (i.value < j.value) {
				k.next = i;
				i = i.next;
				k = k.next;

			}

			else if (i.value > j.value) {
				k.next = j;
				k = k.next;
				j = j.next;
			}

			else {
				k.next = j;
				k = k.next;
				j = j.next;
				k.next = i;
				k = k.next;
				i = i.next;
			}

		} // while
		if(i==null)
			k.next =j;
		else if(j==null)
			k.next = i;
		
		merged.head = merged.head.next;
		//System.out.println("The merged List is ");
		//printLL(merged);
		return merged;
	}// merge

}// class
