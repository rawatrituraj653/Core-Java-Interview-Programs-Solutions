package com.nit.pro1;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
	
		System.out.println("Enter String For Reversing ");
		try (Scanner scan=new Scanner(System.in);){
		String val=scan.next();
		char[] arr = val.toCharArray();
		char[] rev=new char[arr.length];
		
		System.out.println("Giving String is:: "+val);
		for(int i=arr.length-1;i>=0;i--) {
			rev[(arr.length-1)-i]=arr[i];
		}
		
		String revStr=new String(rev);
		System.out.println("Reverse String is:: "+revStr);
		}catch (Exception e) {
			System.err.println("Enter String For Reversing");
		}
	}
}
