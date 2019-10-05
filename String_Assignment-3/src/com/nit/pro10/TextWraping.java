package com.nit.pro10;

import java.util.Scanner;

public class TextWraping {
	public static void main(String[] args) {
		int count=0;
		String str="ABCDEFGHIJKLIMNOQRSTUVWXYZ";
		String wraps="";
		try (Scanner scan=new Scanner(System.in)){
			System.out.println("Enter Number From where you Want Text Wrapping");
			int wrap= scan.nextInt();
			
			if(wrap>str.length()) {
				System.err.println("Enter Valid Number,This Number Exceed the length Of Giving String");
				return ;
			}
			
			System.out.println("Wrap String is:: ");
			for(int i=0;i<str.length();i++) {
				count++;
			wraps=wraps+str.charAt(i);
			if(count==wrap) {
				System.out.println(wraps);
				count=0;
				wraps="";
			}
		}
		System.out.println(wraps);	
		}catch (Exception e) {
			System.err.println("Enter Number Only" );
			e.printStackTrace();
		}
		
	}
}
