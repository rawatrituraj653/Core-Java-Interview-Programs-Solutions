package com.nit.pro7;

import java.util.Stack;

public class ParenthesisMatch {
	private static char temp,pop;
	public static void main(String[] args) {
		String str="[()]{}{[()()]()}";
		String Msg=isMatched(str);
		System.out.println(Msg);
	}
	private static String isMatched(String str) {
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<str.length();i++) {
			temp=str.charAt(i);
			if(temp=='(' || temp=='{' || temp=='[') {
				stack.push(temp);
			}
			else {
				if(stack.isEmpty()) {
					return "Not Matching"; 
				}else {
					pop=stack.pop();
					if(temp==')' && pop!='(') 
						return "Not Matching";
					else if(temp=='}' && pop!='{') 
						return "Not Matching";
					else if(temp==']' && pop!='[')
						return "Not Matching";
				}
			}
		}
		if(stack.isEmpty())
			return "Matching";
		else
			return "Not Matching";	
	}
}