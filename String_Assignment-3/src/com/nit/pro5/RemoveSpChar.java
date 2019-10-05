package com.nit.pro5;


public class RemoveSpChar {
	public static void main(String[] args) {
		String val="$ja!va$&st%arA@##$BCDBS**&#(*";
		System.out.println("String With SPL. Char:: "+val);
		char[] array = val.toCharArray();
		System.out.print("After Removing Spl. Char::  ");
		for (char c : array) {
			int temp=c;
			if((temp<=122 && temp>=97)||(temp<=90 && temp>=65))
			System.out.print(c);
		}
	}
}
