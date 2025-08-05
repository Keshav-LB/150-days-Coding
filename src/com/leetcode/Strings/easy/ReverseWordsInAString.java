package com.leetcode.Strings.easy;

public class ReverseWordsInAString {
	public static void main(String[] args) {
//		Input: s = "the sky is blue"
//		Output: "blue is sky the"
//		
//			Input: s = "  hello world  "
//			Output: "world hello"
//				
//				Input: s = "a good   example"
//				Output: "example good a"
		
		String str1 = "the sky is blue";
		String str2 = "  hello world  ";
		String str3 = "a good   example";
		
		System.out.println(reverseWords(str1));
		System.out.println(reverseWords(str2));
		System.out.println(reverseWords(str3));
	}

	public static String reverseWords(String s) {
		String sarr[] = s.split("\\s+");
		String result = "";
		for(int i=sarr.length-1; i>=0;i--) {
			result += sarr[i]+" ";
		}
		return result.trim();
	}
}
