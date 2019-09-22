package com.nit.duplicate.get;

import java.util.HashSet;
/*
 * 
 * date: 16-sep-19
 * author: Rituraj rawat
 *
 * program to get duplicate element from array
 */
public class ArraysDuplicate {

	public static void main(String[] args) {
		
		getDuplicate();
	}
	

	/*
	 * Method for get all duplicate element
	 * from Arrays
	 */
	private static void getDuplicate() {
		HashSet<Integer> temp=new HashSet<>();
		HashSet<Integer> duplicateElement=new HashSet<>();
		int [] arr= {1, 2, 5, 5, 6, 6, 7, 2};
		for(int i:arr) {
			boolean flag=temp.add(i);
			if(!flag) {
				duplicateElement.add(i);
			}
		}
		System.out.println(duplicateElement);
	}
}
