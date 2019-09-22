package com.nit.duplicate.remove;

import java.util.HashSet;

public class ArraysDuplicateRemove {

	public static void main(String[] args) {
		HashSet<Integer> removeDuplicate = removeDuplicate();
		System.out.println(removeDuplicate);
	}

	private static HashSet<Integer> removeDuplicate() {
		HashSet<Integer> removeDuplicate=new HashSet<>();
		int array[]= {1, 2, 5, 5, 6, 6, 7, 2};
		for(Integer temp:array) {
			removeDuplicate.add(temp);
		}
		return removeDuplicate;
	}
}
