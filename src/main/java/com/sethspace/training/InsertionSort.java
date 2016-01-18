package com.sethspace.training;

import java.util.List;

public class InsertionSort<T> extends SortingAlgorithm<T> {
	
	public InsertionSort(SortingOrder sortingOrder) {
		super(sortingOrder);
	}

	@Override
	public List<? extends Comparable<T>> performSort(List<? extends Comparable<T>> list) {
		
		int i,j;
		
		for(i=1;i<list.size();i++){
			j=i;
			while( j>0 && list.get(j).compareTo((T) list.get(j-1)) <0){
				BasicOperations.swap((List<Object>)list,j,j-1);
				j = j -1;
			}
				
		}
		
		return list;
	}
}
