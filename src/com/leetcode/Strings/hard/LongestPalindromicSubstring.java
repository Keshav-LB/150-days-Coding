package com.leetcode.Strings.hard;

public class LongestPalindromicSubstring {
	public static void main(String[] args) {
//		Input: s = "babad"
//		Output: "bab"
//		Explanation: "aba" is also a valid answer.
//		
//		Input: s = "cbbd"
//		Output: "bb"
		
		String str1 = "babad";
		String str2 = "cbbd";
		
		System.out.println(str1+" : "+longestPalindrome(str1));
		System.out.println(str2+" : "+longestPalindrome(str2));
	}
	
	public static String longestPalindrome(String s) {
		if(s.length()<1 || s == null) {
			return "";
		}
		
		int start = 0, end = 0;
		
		for(int i=0;i<s.length();i++) {
			//odd length palindrome
			int len1 = expandFromCenter(s,i,i);
			//even length palindrome
			int len2 = expandFromCenter(s, i, i+1);
			
			int len = Math.max(len1, len2);
			
			if(len > end-start) {
				start = i-(len-1)/2;
				end = i+len/2;
			}
		}
		return s.substring(start, end+1);
	}
	
	public static int expandFromCenter(String s, int left, int right) {
		while(left >= 0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
			left--;
			right++;
		}
		return right-left -1;
	}
}
