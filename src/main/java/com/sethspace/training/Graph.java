package com.sethspace.training;

import java.util.List;
import java.util.ArrayList;

public class Graph{
	private static final String NEWLINE = System.getProperty("line.separator");
	
	public List<AdjNode> adjLists;
	private final int V;
	private int E;
	
	
	/**
	 * create a V-vertex graph with no edges
	 */
	
	public Graph(int V){
		adjLists = new ArrayList<AdjNode>();
		this.V = V;
		this.E = 0;
		for(int i=0;i<V;i++)
			adjLists.add(new AdjNode(i));
	}
	
	/**
	 * Return the number of vertices
	 */
	public int V(){
		return this.V;
	}
	
	/**
	 * Return the number of edges
	 */
	public int E(){
		return this.E;
	}
	
	/**
	 * Add edge to a graph
	 */
	void addEdge(int v,int w){
		AdjNode vNode = new AdjNode(v);
		AdjNode wNode = new AdjNode(w);
		
		if(v<0 || v>V || w<0 || w>V){
			return;
		}
		
		//Add w to v's adjacency list
		AdjNode oldFirst = adjLists.get(v);
		wNode.next = oldFirst;
		adjLists.add(v, wNode);
		
		//Add v to w's adjacency list
		oldFirst = adjLists.get(w);
		vNode.next = oldFirst;
		adjLists.add(w, vNode);
		
		E++;
	}
	
	/**
	 * Return vertices adjacent to V
	 */
	AdjNode adj(int v){
		return adjLists.get(v);
	}
	
	/**
	 * Prints the graph
	 */
	public String toString(){
		 StringBuilder s = new StringBuilder();
	        s.append(V + " vertices, " + E + " edges " + NEWLINE);
	        for (int v = 0; v < V; v++) {
	            s.append(v + ": ");
	            AdjNode w;
	            for (w = adjLists.get(v);w.next!=null;w = w.next) {
	                s.append(w + " ");
	            }
	            s.append(NEWLINE);
	        }
	        return s.toString();
	}
	
	/**
     * Unit tests the <tt>Graph</tt> data type.
     */
    public static void main(String[] args) {
        Graph G = new Graph(5);
        G.addEdge(0, 2);
        System.out.print(G);
    }
	
	
}