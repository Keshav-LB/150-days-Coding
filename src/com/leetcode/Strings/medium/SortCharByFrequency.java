package com.leetcode.Strings.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharByFrequency {
	
	public static void main(String[] args) {
//		Input: s = "tree"
//		Output: "eert"
//		Input: s = "cccaaa"
//		Output: "aaaccc"
//		Input: s = "Aabb"
//		Output: "bbAa"
		String str1 = "tree";
		String str2 = "cccaaa";
		String str3 = "Aabb";
		
		System.out.println(frequencySort(str1));
		System.out.println(frequencySort(str2));
		System.out.println(frequencySort(str3));
	}
	
	public static String frequencySort(String str) {
		
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i=0;i<str.length();i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
		}
		
		PriorityQueue<Map.Entry<Character, Integer>>  pq = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
		pq.addAll(map.entrySet());
		
		StringBuilder sb = new StringBuilder();
		while(!pq.isEmpty()) {
			Map.Entry<Character, Integer> entry = pq.poll();
			char c = entry.getKey();
			int count = entry.getValue();
			for(int i=0;i<count;i++) {
				sb.append(c);
			}
		}
		
		return sb.toString();
		
	}
	
	
}

