package com.nit.max.min;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MinMaxValue {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		int[]arr= {1, 2, 5, 5, 6, 6, 7, 2};
		for(Integer temp:arr) {
			list.add(temp);
		}
		
	Optional<Integer> max=list.stream().max((o1,o2)->o1.compareTo(o2));
	System.out.println("Maximum Value: "+max.get());
	Optional<Integer> min=list.stream().min((o1,o2)->o1.compareTo(o2));
	System.out.println("Minimum Value: "+min.get());
	}
}
