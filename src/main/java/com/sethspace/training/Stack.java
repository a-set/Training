package com.sethspace.training;

public class Stack {
	
	Node top;
	final static int size =25;
	int length =0;
	
	public static void main(String args[]){
		Stack stack = new Stack();
		stack.push(new Node(25));
		stack.push(new Node(27));
		stack.push(new Node(28));
		System.out.println(stack.pop().value);
		System.out.println(stack.pop().value);
		System.out.println(stack.peek().value);
		System.out.println(stack.pop().value);
		System.out.println(stack.pop());
	}
	
	
	public Node pop(){
		if(top==null||size==0)
			return null;
		Node n = top;
		length--;
		top=top.next;
		return n;
	}
	
	public void push(Node n){
		if(length==25)
			return;
		else{
			n.next = top;
			top=n;
			length++;
		}
	}
	
	public Node peek(){
		return top;
	}
}
