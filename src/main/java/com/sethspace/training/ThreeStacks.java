package com.sethspace.training;

public class ThreeStacks<E> {
	
	E[] stacks;
	
	int[] tops;
	
	int size;
	
	int noOfStacks;
	
	boolean[] flags;
	
	final static int SIZE = 25;
	final static int NO_OF_STACKS = 3;
	
	@SuppressWarnings("unchecked")
	public ThreeStacks(int size,int noOfStacks){
		this.size = size;
		this.noOfStacks = noOfStacks;
		stacks = (E[]) new Object[size];
		tops = new int[noOfStacks];
		flags = new boolean[noOfStacks];
		for(int i=0;i<noOfStacks;i++){
			tops[i] = i;
			flags[i] = false;
		}
	}
	
	public E pop(int whichArray){
		
		int index = tops[whichArray-1];
		if(index!=-1){
			E e = (E)stacks[index];
			for(int i=index;i<=tops[noOfStacks-1];i++)
				stacks[i] = stacks[i+1];
			
			//subtract all tops from the last one to the current one
			for(int i = noOfStacks-1;i>=whichArray-1;i--)
				tops[i]--;
		
		    return e;
		}
		else
			return null;
		
	}
	
	public void push(E e,int whichArray){
		
		//check overflow condition
		if(tops[noOfStacks-1]==size-1)
			return;
		
		int i;
		
		//Check if its the first push of the stack
		if(flags[whichArray-1]==false){
			stacks[tops[whichArray-1]] = e;
			flags[whichArray-1] =true;
			return;
		}
		
		for(i=tops[noOfStacks-1];i>tops[whichArray-1];i--)
			stacks[i+1] = stacks[i];
		
		stacks[i+1] =e;
		for(int j=whichArray-1;j<=noOfStacks-1;j++)
			tops[j]++;
		
	}
	
	public void print(){
		
		//Treat the Stack 1 case first
		
		System.out.print("Stack1:");
		for(int j=tops[0];j>=0;j--)
			if(flags[0]==true)
			System.out.print(stacks[j]);
		System.out.println();
		
		//Treat the rest of the cases
		for(int i=1;i<noOfStacks;i++){
			System.out.print("Stack"+(i+1)+":");
			for(int j = 0;j<=tops[i]-tops[i-1]-1;j++){
				if(flags[i]==true)
					System.out.print(stacks[tops[i]-j]);
			}
			System.out.println();
		}
			
		
		
		
	}
	
	public static void main(String args[]){
		
		
		//instantiate the stacks
		ThreeStacks<Integer> threeStacks = new ThreeStacks<Integer>(SIZE,NO_OF_STACKS);
		
		//Add elements to the stacks
		for(int i=0;i<SIZE/2;i++){
			//First generate a number between 1 and NO_OF_STACKS
			int whichStack = (int)(Math.random()*NO_OF_STACKS)+1;
			//Generate a random number to add to stack
			int number = (int)(Math.random()*10);
			System.out.println("Pushing " + number + " on Stack "+ (whichStack));
			threeStacks.push(number, whichStack);
			threeStacks.print();
		}
		
		//How does the stack look
		threeStacks.print();
		
		//Now pop random numbers
		for(int i=0;i<5;i++){
		int randomPop = (int)((Math.random()*NO_OF_STACKS))+1;
		System.out.println("Popping a number from stack" +randomPop);
		System.out.println(threeStacks.pop(randomPop));
		threeStacks.print();
		}
		
	}
	
}
