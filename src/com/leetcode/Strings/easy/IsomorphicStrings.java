package com.leetcode.Strings.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicStrings {
	public static void main(String[] args) {
//		Input: s = "egg", t = "add"
//		Output: true
//		Input: s = "foo", t = "bar"
//		Output: false
		
		String s1 = "egg", t1 = "add";
		String s2 = "apple" , t2 = "bbnbm";
		
		System.out.println(isIsomorphic(s1,t1));
		System.out.println(isIsomorphic(s2,t2));
		
	}
	public static boolean isIsomorphic(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
		
		Map<Character, Character> map = new HashMap<>();
		Set<Character> mapped = new HashSet<>();
		
		for(int i=0; i<s.length(); i++) {
			char c1 = s.charAt(i);
			char c2 = t.charAt(i);
			
			if(map.containsKey(c1)) {
				if(map.get(c1) != c2) {
					return false;
				}
			}
			else {
				if(mapped.contains(c2)) {
					return false;
				}
				map.put(c1, c2);
				mapped.add(c2);
			}
		}
		return true;
	}
}
