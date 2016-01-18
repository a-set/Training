package com.sethspace.training;

import java.util.List;

public class BasicOperations {
	
	/**
	 * Finds the minimum element in the given list
	 * @param list
	 * @return
	 */
	public static Object findMin(List<Object> list){
		//TODO
		return null;
	}
	
	/**
	 * Finds the Maximum element in the given list
	 * @param list
	 * @return
	 */
	public static Object findMax(List<Object> list){
		return null;
	}
	
	/**
	 * Takes a list and two indices and swaps the objects at those indices
	 * @param list
	 * @param o1 The index of the first object
	 * @param o2 The index of the second object
	 */
	public static void swap(List<Object> list,int o1,int o2){
		Object obj;
		obj = list.get(o1);
		list.add(o1,list.get(o2));
		list.add(o2, obj);
	}
	
}
