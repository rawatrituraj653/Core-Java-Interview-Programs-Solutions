package com.nit.pro8;

public class WordOcurrence {
		public static void main(String[] args) {
			String give="ABCDCDCD";
			String subStr="CDC";
			int len=subStr.length();
			String tempStr="";
			int count=0,present=0;
			System.out.println(give.length());
			for (int i = 0; i <give.length(); i++) {
				count++;
				tempStr=tempStr+give.charAt(i);
				if(count==len) {
					if(tempStr.equals(subStr)) {
						present++;
					}
					
					tempStr="";
					count=count-1;
					i=i-(len-count);
					count=0;
				}
			}
			if(present!=0) {
				System.out.println("In given String '"+give+"' This  Substring '"+subStr+"' comes '"+present+"' times" );
			}
			else {
				System.err.println("Not Present That Substring in given String");
			}
	}
}
