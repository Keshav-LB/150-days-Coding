package com.leetcode.Strings.easy;

public class LongestCommonPrefix {
	public static void main(String[] args) {
//		Input: strs = ["flower","flow","flight"]
//		Output: "fl"
//		Input: strs = ["dog","racecar","car"]
//		Output: "" There is no common prefix
		
		String sarr1[] = {"flower","flow","flight"};
		String sarr2[] = {"dog","racecar","car"};
		
		System.out.println("Found Prefix: "+longestCommonPrefix(sarr1));
		System.out.println("Found Prefix: "+longestCommonPrefix(sarr2));
		
	}
	public static String longestCommonPrefix(String[] strs) {
		if(strs == null || strs.length == 0) {
			return "";
		}
		
		String prefix = strs[0];
		
		for(int i=1;i<strs.length;i++) {
			while(strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length()-1);
				if(prefix.isEmpty()) {
					return "";
				}
			}
		}
		return prefix;
	}
}
