package com.leetcode.Strings.easy;

public class RotateString {
	public static void main(String[] args) {
//		Input: s = "abcde", goal = "cdeab"
//		Output: true
//		Input: s = "abcde", goal = "abced"
//		Output: false
		
		String s = "abcde", goal = "cdeab";
		
		System.out.println(rotateString(s, goal));
	
	}
	public static boolean rotateString(String s, String goal) {
		if(s.length() != goal.length()) {
			return false;
		}
		String rotated = s+s;
		
		return rotated.contains(goal);
	}
}
