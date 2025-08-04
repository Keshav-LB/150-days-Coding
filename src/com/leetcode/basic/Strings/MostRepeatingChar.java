package com.leetcode.basic.Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class MostRepeatingChar {
	public static void main(String[] args) {
		String str = "goooogleformat";
		char carr[] = str.toCharArray();
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
		
		for(char c: carr) {
			lhm.put(c, lhm.getOrDefault(c, 0)+1);
		}
		System.out.println(lhm);
		int count = 0;
		char freq = ' ';
		for(Map.Entry<Character, Integer> entry : lhm.entrySet()) {
			if(entry.getValue()>count) {
				count = entry.getValue();
				freq = entry.getKey();
			}
		}
		
		System.out.println(freq+" is repeating "+count+" times");
	}
}
