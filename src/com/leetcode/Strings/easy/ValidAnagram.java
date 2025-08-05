package com.leetcode.Strings.easy;

import java.util.HashMap;

public class ValidAnagram {
	public static void main(String[] args) {
//		Input: s = "anagram", t = "nagaram"
//		Output: true
//		Input: s = "rat", t = "car"
//		Output: false
		String s = "anagram", t = "nagaram";
		System.out.println(isAnagram(s, t));	
	}

	public static boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		
//		//1st method:
//		int[] count = new int[26];
//		for (int i = 0; i < s.length(); i++) {
//			count[s.charAt(i) - 'a']++;
//			count[t.charAt(i) - 'a']--;
//		}
//		for (int c : count) {
//			if (c != 0)
//				return false;
//		}
//		return true;
		
		//2nd method:
		HashMap<Character, Integer> countMap = new HashMap<>();
		for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
		for (char c : t.toCharArray()) {
            if (!countMap.containsKey(c)) 
            	return false;

            countMap.put(c, countMap.get(c) - 1);
            if (countMap.get(c) == 0) {
                countMap.remove(c);  // Clean up if count becomes 0
            }
        }
		return countMap.isEmpty();
	}
}
