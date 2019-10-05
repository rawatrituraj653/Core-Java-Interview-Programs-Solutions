package com.nit.pro6;

import java.util.Arrays;

public class AnagramString {
	public static void main(String[] args) {
		String val1="Credit BAD";
		String val2="Debit Card";
		
		char[] arr1 = val1.toLowerCase().trim().toCharArray();
		char[] arr2 = val2.toLowerCase().trim().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		String str1=new String(arr1);
		String str2=new String(arr2);
		if(str1!=null && str2!=null) {
			if(str1.equals(str2)) {
				System.out.println("Both String are Anagrams...");
				
			}
			else {
				System.out.println("Both String are Not a Anagrams...");
			}
		}
	}
}
