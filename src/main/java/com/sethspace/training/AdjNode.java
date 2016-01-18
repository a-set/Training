package com.sethspace.training;

public class AdjNode {
	Integer value;
	AdjNode next;
	
	public AdjNode(int value){
		this.value = value;
		this.next = null;
	}
	
	public String toString(){
		return value.toString();
	}
	
}
