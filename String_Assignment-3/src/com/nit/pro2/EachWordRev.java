package com.nit.pro2;

public class EachWordRev {

	public static void main(String[] args) {
		String str = "java programming language";
		String[] splits = str.split(" ");
		String revStr="";
		for (int i = 0; i < splits.length; i++) {
			String str1=splits[i];
			String revWord="";
			for(int j=str1.length()-1;j>=0;j--) {
				revWord=revWord+str1.charAt(j);
	
			}
			
			revStr=revStr+revWord+" ";
			
		}
		
		System.out.println("Original String :: "+str);
		System.out.println("Reverse String :: "+revStr);
	}
}