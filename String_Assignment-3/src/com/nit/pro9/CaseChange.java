package com.nit.pro9;

public class CaseChange {
	public static void main(String[] args) {
		String val="Www.TekLeads.com";
		String newStr="";
		for (int i = 0; i <val.length(); i++) {		
			int rev=val.charAt(i);
			if(rev<=90 && rev>=65) {
				rev=rev+32;
			}
			else if(rev<=122 && rev>=90){
				rev=rev-32;
			}
			newStr=newStr+(char)rev;
		}
		System.out.println("Ols String is:: "+val);
		System.out.println("New String is:: "+newStr);
	}
}
