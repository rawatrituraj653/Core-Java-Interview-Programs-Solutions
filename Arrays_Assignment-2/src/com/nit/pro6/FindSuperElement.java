package com.nit.pro6;

import java.util.ArrayList;
import java.util.List;

public class FindSuperElement {
	 public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int i,j,temp,count=0;
		List<Integer> list=new ArrayList<>();
		for( i=0;i<arr.length;i++) {
			temp=arr[i];
			count=0;
			for(j=0;j<arr.length;j++) {
				if(temp<arr[j] && temp!=arr[j]) count++;
			}
			if(count>=2 &&!list.contains(arr[i]))
			list.add(arr[i]);
		}
		if(!list.isEmpty()) {
			System.out.println("Super Element are:: "+list);
		}
		else {
			System.out.println("No Super Element Found........");
		}
	}
}
