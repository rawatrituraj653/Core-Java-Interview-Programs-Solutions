package com.nit.second.min.max;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SecondMinMax {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		int[] arr= {1, 2, 5, 9, 6, 4, 7, 2};
		for(Integer temp:arr) {
			list.add(temp);
		}
	list=list.stream().sorted((o1,o2)->o1.compareTo(o2)).collect(Collectors.toList());
	System.out.println("in List Second minimum Element:: "+list.get(1));
	list=list.stream().sorted((o1,o2)->o2.compareTo(o1)).collect(Collectors.toList());
	System.out.println("in List Second Maximum Element:: "+list.get(1));
	}
}
