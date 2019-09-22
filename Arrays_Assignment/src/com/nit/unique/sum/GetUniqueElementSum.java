package com.nit.unique.sum;

import java.util.HashSet;

public class GetUniqueElementSum {

	public static void main(String[] args) {
		findingSumOfUniqueElement();
	}

	private static void findingSumOfUniqueElement() {
		int sum=0;
		HashSet<Integer> hashSet=new HashSet<>();
		//int arr[]= {1, 6, 4, 3, 2, 2, 3, 8, 1};
		int arr[]={1, 1, 3, 2, 2, 3};
		for(Integer temp:arr) {
			hashSet.add(temp);
		}
		System.out.println(hashSet);
		for(Integer val:hashSet) {
			 sum=sum+val;
		}
		System.out.println("Sum Of All unique Element is ::"+sum);
	}
}
