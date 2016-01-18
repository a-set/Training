package com.sethspace.training;


public class MinStack<E extends Comparable<E>> {
	
	MinNode<E> top;
	MinNode<E> min;
	
	public static final  int  SIZE = 25;
	
	public static void main(String args[]){
		MinStack<Integer> minStack = new MinStack<Integer>();
		
		
		for(int i=0;i<SIZE;i++)
			minStack.push(new MinNode<Integer>(new Integer((int)(Math.random()*100))));
		
		System.out.println("The generated stack is :");
		System.out.println(minStack);
		
		System.out.println(minStack.pop().value);
		System.out.println(minStack);
		for(int i=0;i<5;i++){
			System.out.println(minStack.popMin().value);
			System.out.println(minStack);
		}
		
	}
	
	public String toString(){
		
		StringBuilder sb = new StringBuilder();
		MinNode<E> i = (MinNode<E>) top;
		while(i.next !=null){
			sb.append(i.value + "->");
			i = i.next;
		}
		sb.append(i.value);
		return sb.toString();
	}
	
	
	
	public void push(MinNode<E> a){
		if(min==null||top==null){
			min =a;
			top =a;
		}
		else{
			//Setting top
			a.next =top;
			top = a;
			
			//Setting new Min order
			MinNode<E> i = (MinNode<E>) min;
			if(a.value.compareTo((E) i.value)<0){
				min.nextMin = i;
				min =a;
				return;
			}
			else{
				while(i.nextMin!=null&&i.nextMin.value.compareTo(a.value)<=0)
					i = i.nextMin;
				if(i.nextMin!=null){
					a.nextMin = i.nextMin;
					i.nextMin = a;
				}
				else
					i.nextMin =a;
				
			}
		}
	}
	
	public MinNode<E> popMin(){
		MinNode<E> popper =  min;
		if(min!=null)
			min = min.nextMin;
		return popper;
	}
	
	public MinNode<E> pop(){
		MinNode<E> popper =  top;
		if(top!=null)
			top = top.next;
		return popper;
	}
}
