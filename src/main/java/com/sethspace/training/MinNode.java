package com.sethspace.training;

public class MinNode<E>{
	E value;
	MinNode<E> next;
	MinNode<E> nextMin;
	MinNode (E e){
		this.value = e;
		this.next = null;
		this.nextMin = null;
	}
	public String toString(){
		return value.toString();
	}
}
