package com.sethspace.training;



public class TreeNode<E> {
	
	E data;
	TreeNode<E> left;
	TreeNode<E> right;
	
	public TreeNode(){
		data = null;
		left = null;
		right = null;
	}
	
	public TreeNode(E data){
		this.data = data;
	}
	
	public void printTreeInOrder(TreeNode<E> t){
		
		//If the root node is null return
		if(t == null){
			return;
		}
		
		//Print the left node
		printTreeInOrder(t.left);
		//Print the root node
		printNode(t);
		//print the right node
		printTreeInOrder(t.right);
		
	}
	
	public void printNode(TreeNode<E> print){
		System.out.println(print.data);
		}
	
	@SuppressWarnings("unchecked")
	public void printUsingStack(TreeNode<E> e){
		java.util.Stack<TreeNode<E>> s  = new java.util.Stack<TreeNode<E>>();
		
		TreeNode<E> c = e;
		
		//While the left node is not null push into a stack
		while(c.left!=null){
			s.push(c);
			c = c.left;
		}
		
		//pop from the stack
		printNode(s.pop());
		//Move to right
		c = c.right;
	}
	
	public String toString(){
		return this.toString();
	}
	
		
	
}
