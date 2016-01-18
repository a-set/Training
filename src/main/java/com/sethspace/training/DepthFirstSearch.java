package com.sethspace.training;

public class DepthFirstSearch {

	/**
	 * Count of vertices connected to a given vertex
	 */
	private int count;
	
	/**
	 * Array showing if a vertex was visited before or not
	 */
	private boolean[] marked;
	
	public DepthFirstSearch(Graph G,int s){
		count =0;
		marked = new boolean[G.V()];
		search(G,s);
		}
	
	public void search(Graph G, int s){
		count ++;
		marked[s] = true;
		AdjNode i = G.adjLists.get(s);
		while(i!=null){
			if(!marked[i.value])
				search(G,i.value);
			i= i.next;
		}
	}
}
