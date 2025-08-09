package com.leetcode.Strings.medium;

import java.util.HashMap;

public class RomanToInteger {
	public static void main(String[] args) {
//		Input: s = "III"
//		Output: 3
//		Explanation: III = 3.
//		
//		Input: s = "LVIII"
//		Output: 58
//		Explanation: L = 50, V= 5, III = 3.
//		
//		Input: s = "MCMXCIV"
//		Output: 1994
//		Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
		
		String str = "IV";
		String str1 = "III";
		String str2 = "LVIII";
		String str3 = "MCMXCIV";
		
		System.out.println(str + " : " + romanToInt(str));
		System.out.println(str1 + " : " + romanToInt(str1));
		System.out.println(str2 + " : " + romanToInt(str2));
		System.out.println(str3 + " : " + romanToInt(str3));

	}

	public static int romanToInt(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int result = 0;
		int i = 0;
		
		while(i<s.length()) {
			int currentVal = map.get(s.charAt(i));
			if(i+1 < s.length()) {
				int nextVal = map.get(s.charAt(i+1));
				if(currentVal < nextVal) {
					result += (nextVal - currentVal);
					i+=2;
					continue;
				}
			}
			result+=currentVal;
			i++;
		}
		return result;
	}
}
