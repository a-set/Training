package com.sethspace.training;

import java.util.ArrayList;
import java.util.List;

public class qArray<E> {
	int front;
	List<E> q;
	
	
	public qArray(){
		q = new ArrayList<E>();
		front = -1;
	}
	
	public E dq(){
		if(front>-1)
			return q.get(front--);
		else
			return null;
	}
	
	public void eQ(E e){
		if(front+1<=25)
			q.add(++front, e);
	}
	
	public static void main(String args[]){
		
		qArray<String> queue = new qArray<String>();
		
		queue.eQ("Anirudh");
		queue.eQ("Rohit");
		queue.eQ("Noopor");
		System.out.println(queue.dq());
		System.out.println(queue.dq());
		System.out.println(queue.dq());
		System.out.println(queue.dq());
		
		
	}
	
	
	
	
	
}
