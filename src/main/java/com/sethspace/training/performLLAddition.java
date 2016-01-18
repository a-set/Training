package com.sethspace.training;

public class performLLAddition {

	public static void main(String args[]) {

		LinkedList[] list = new LinkedList[2];
		
		// Number of elelments in the LinkedList
		final int NUMBER = 10;

		for(int j= 0;j<2;j++){
		// Create a sample Linked List
		list[j] = new LinkedList();

		// generate a random linked list
		for (int i = 0; i < NUMBER; i++)
			list[j].appendNode((int) (Math.random() * NUMBER));

		// Print the linkedlist
		System.out.println("The original linked List" + j + " is ");
		printLL(list[j]);
		}
		
		//Peform the addition
		System.out.println("The sum of the two digits is ");
		printLL(LLAdder(list[0],list[1]));

	}
	
	public static void printLL(LinkedList list) {
		Node n = list.head;
		while (n.next != null) {
			System.out.print(n.value + "->");
			n = n.next;
		}
		// print the last node
		System.out.println(n.value);
	}

	public static LinkedList LLAdder(LinkedList one, LinkedList two) {
		int sum;
		int carryover = 0;
		LinkedList c = new LinkedList();
		Node a = one.head;
		Node b = two.head;

		while (a.next != null && b.next != null) {
			carryover = performAddition(a.value, b.value, carryover, c);
			a = a.next;
			b = b.next;
		}

		// If they were of same length
		if (a.next == null && b.next == null) {
			carryover = performAddition(a.value, b.value, carryover, c);
			if (carryover > 0)
				c.appendNode(1);
		}

		// if a is bigger
		if (a.next != null) {
			while (a.next == null) {
				carryover = performAddition(a.value, 0, carryover, c);
				a = a.next;
			}
			carryover = performAddition(a.value, 0, carryover, c);
			if (carryover > 0)
				c.appendNode(1);

		} // If a was bigger

		// if b is bigger
		if (b.next != null) {
			while (a.next == null) {
				carryover = performAddition(0, b.value, carryover, c);
				b = b.next;
			}
			carryover = performAddition(0, b.value, carryover, c);
			if (carryover > 0)
				c.appendNode(1);

		} // If b was bigger
		return c;
	}// Method

	// adds two digits a and b and any previous carryover and appends
	// to the supplied list and returns the new carryover
	private static int performAddition(int a, int b, int carryover, LinkedList c) {
		int sum = a + b + carryover;
		c.appendNode(sum % 10);
		return sum / 10;
	}

}
