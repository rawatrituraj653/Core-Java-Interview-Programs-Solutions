package com.nit.pro3;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharOccurence {
	public static void main(String[] args) {
		int  count = 0;
		Map<Character, Integer> map = new LinkedHashMap<>();
		Map<Character, Integer> map1 = new LinkedHashMap<>();
		String val = "ABCDEFGHIJKLMNOPQRSTAAAA";
		
		char[] arr = val.toLowerCase().trim().toCharArray();
		for(char ch:arr) {
			count=0;
			if(!map.containsKey(ch)) {
				count++;
				map.put(ch, count);
			}
			else {
				Integer value = map.get(ch);
				count=value+1;
				map.remove(ch);
				map.put(ch, count);
			}
		}
	map.forEach((k,v)->{
		if(v>=2)
			map1.put(k, v);});
	
	
	if(!map1.isEmpty()) {
		System.out.println(map1);
	}
	else
	System.out.println("No Duplicate Element Found....");
	}	
}
