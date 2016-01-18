package com.sethspace.training;

import java.util.List;

public abstract class SortingAlgorithm<T> {
	
	protected SortingOrder sortingOrder;
	
	/**
	 * Simple constructor to set the sorting order
	 * @param sortingOrder
	 */
	public SortingAlgorithm(SortingOrder sortingOrder){
		this.sortingOrder = sortingOrder;
	}
	
	/**
	 * All sorting algorithms must implement perform sort method.
	 * This also ensures that object being sorted must implement comparable
	 * interface
	 * @param list
	 * @return
	 */
	abstract public List<? extends Comparable<T>> performSort(List<? extends Comparable<T>> list);
	
}
