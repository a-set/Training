package com.sethspace.training;

public class HashTable {
	LinkedList[] list = new LinkedList[10];

	private int hashValue(Node a){
	  return a.value%10;
	}

	public void addToHashTable(Node a) {
		if(list[hashValue(a)]==null)
			list[hashValue(a)] = new LinkedList();
		list[hashValue(a)].appendNode(a);
	}

	public boolean contains(Node a) {
		if (list[hashValue(a)] == null)
			return false;
		else {
			Node i = list[hashValue(a)].head;
			while (i != null) {
				if (i == a)
					return true;
				i = i.next;
			}
			return false;
		}
	}

}
