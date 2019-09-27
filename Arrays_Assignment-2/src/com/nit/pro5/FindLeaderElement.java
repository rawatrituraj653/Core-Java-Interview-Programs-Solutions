package com.nit.pro5;

import java.util.*;
public class FindLeaderElement {

	public static void main(String[] args) {
		int []arr={ 6, 3, 2, 1, 7, 5,6, 7, 7, 7, 7, 7, 7, 8, 6 };
		int i,j,count=0,len=arr.length;
		ArrayList<Integer> al=new ArrayList<>();
		for(i=0;i<len;i++){
			count=0;
			for(j=0;j<len;j++){
				if(arr[i]==arr[j])count++;
			}
			if(count>=len/2){
				if(!al.contains(arr[i]))
				al.add(arr[i]);
			}
		}

		if(!al.isEmpty()){
			System.out.println("Leader Element are: "+al);
		}
		else{
			System.out.println("Leader Element Doesn't Exist.....");
		}

	}
}	
