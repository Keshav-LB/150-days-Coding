package com.leetcode.Strings.easy;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
	public static void main(String[] args) {
//		Input: s = "anagram", t = "nagaram"
//		Output: true
//		Input: s = "rat", t = "car"
//		Output: false
		String s1 = "anagram", t1 = "nagaram";
		String s2 = "rat", t2 = "car";
		System.out.println(isAnagram(s1, t1));
		System.out.println(isAnagram(s2, t2));
	}
	
//	//1st method (based on sorting the elements)
//	public static boolean isAnagram(String s, String t) {
//		if(s.length() != t.length()) {
//			return false;
//		}
//		char []sarr = s.toCharArray();
//		char []tarr = t.toCharArray();
//		Arrays.sort(sarr);
//		Arrays.sort(tarr);
//		return Arrays.equals(sarr, tarr);
//	}
	
//	//2nd method(frequency count):
//	public static boolean isAnagram(String s, String t) {
//		if(s.length()!=t.length()) {
//			return false;
//		}
//		int count[] = new int[26];
//		for(int i=0;i<s.length();i++) {
//			count[s.charAt(i) - 'a']++;
//			count[t.charAt(i) - 'a']--;
//		}
//		for(int c : count) {
//			if(c!=0) {
//				return false;
//			}
//		}
//		return true;
//	}
	
	//3rd method (based on unicode char)
	public static boolean isAnagram(String s, String t) {
		if(s.length() != t.length()) return false;
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char c: s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(char c :t.toCharArray()) {
			if(!map.containsKey(c)) return false;
			map.put(c, map.get(c)-1);
			if(map.get(c)==0) map.remove(c);
		}
		
		return map.isEmpty();
	}
}

