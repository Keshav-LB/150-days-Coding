package com.leetcode.Strings.medium;

public class StringToInteger {
	public static void main(String[] args) {
//		Input: s = "42"
//		Output: 42
//		
//		Input: s = " -042"
//		Output: -42
//		
//		Input: s = "1337c0d3"
//		Output: 1337
//		
//		Input: s = "0-1"
//		Output: 0
//		
//		Input: s = "words and 987"
//		Output: 0

		String str1 = "42";
		String str2 = " -042";
		String str3 = "1337c0d3";
		String str4 = "0-1";
		String str5 = "words and 987";
		
		System.out.println(str1 + " :"+myAtoi(str1));
		System.out.println(str2 + " :"+myAtoi(str2));
		System.out.println(str3 + " :"+myAtoi(str3));
		System.out.println(str4 + " :"+myAtoi(str4));
		System.out.println(str5 + " :"+myAtoi(str5));
	}
	public static int myAtoi(String s) {
		int i=0;
		int sign = 1;
		long result = 0;
		
		//skip whitespaces
		while(i<s.length() && s.charAt(i) == ' ') {
			i++;
		}
		
		//handle sign
		if(i<s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
			sign = (s.charAt(i) == '-')?-1:1;
			i++;
		}
		
		//read digits
		while(i<s.length() && Character.isDigit(s.charAt(i))) {
			//result = result * 10 + (s.charAt(i) - '0');
			int num = Character.getNumericValue(s.charAt(i));
			result = result*10 + num;
			
			//check overflow
			if(sign == 1 && result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
			if(sign == -1 && result <Integer.MIN_VALUE)	return Integer.MIN_VALUE;
			
			i++;
		}
		
		return (int)result*sign;
	}
}
