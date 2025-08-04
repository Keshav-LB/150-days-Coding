package com.leetcode.basic.arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class MostRepeatingElement {
	public static void main(String[] args) {
		int[] arr = { 3, 5, 1, 7, 1, 4, 4, 8, 1, 2, 1, 4, 3, 1 };
		
		Map<Integer, Integer> lhm = new LinkedHashMap<>();
		
		for(int num:arr) {
			lhm.put(num, lhm.getOrDefault(num, 0)+1);
		}
		System.out.println(lhm);
		int count=0;
		int freq=-1;
		
		for(Map.Entry<Integer, Integer>entry:lhm.entrySet()) {
			if(entry.getValue()>count) {
				count = entry.getValue();
				freq = entry.getKey();
			}
		}
		
		System.out.println("Element "+freq+" is repeating "+count+" times");
	}
}
