 package com.nit.get.third;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GettingThirdElement {

	public static void main(String[] args) {
		
		getThirdBiggest();
	}

	private static void getThirdBiggest() {
		List< Integer> list=new ArrayList<>();
		//int [] arr= {6, 8, 1, 9, 2, 1, 10};
		int [] arr1= { 6, 8, 1, 9, 2, 1, 10, 12};
		if(arr1.length>=3) {
		 for(Integer temp:arr1) {
			list.add(temp);
		}
	list=list.stream().
			sorted((o1,o2)->o2.compareTo(o1))
			.collect(Collectors.toList());
	System.out.println(list.get(2));
		}else {
			System.out.println("Send Me AtLeast 3 Elements....");
		}
	}
	
	
}
