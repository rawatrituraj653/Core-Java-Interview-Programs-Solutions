package com.nit.pro4;

import java.util.ArrayList;

public class NonRepeatingChar {

	public static void main(String[] args) {
		String str="simiplest";
		ArrayList<Character> list=new ArrayList<>();
		int count=0;
		char non;
		for (int i = 0; i <=str.length()-1; i++) {
			non=str.charAt(i);
			count=-1;
			for(int j=i;j<=str.length()-1;j++) {
				if(non==str.charAt(j)) {
					count++;
				}
			}
			if(count<1) {
				list.add(non);
			break;
			}
		}
		if(!list.isEmpty()) 
			System.out.println("THis is the non repeating Element:: "+list.get(0));
		else 
			System.out.println("There is Non repeating  Character");
		
		
	}
}
