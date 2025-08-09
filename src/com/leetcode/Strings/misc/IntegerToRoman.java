package com.leetcode.Strings.misc;

public class IntegerToRoman {
	public static void main(String[] args) {
//		Input: num = 3749
//		Output: "MMMDCCXLIX"
//		Input: num = 58
//		Output: "LVIII"
//		Input: num = 1994
//		Output: "MCMXCIV"
		
		int num1 = 3749;
		int num2 = 58;
		int num3 = 1994;
		
		System.out.println(num1 + " : "+integerToRoman(num1));
		System.out.println(num2 + " : "+integerToRoman(num2));
		System.out.println(num3 + " : "+integerToRoman(num3));
	}
	public static String integerToRoman(int num) {
		int[] values =    {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	    String[] symbols ={"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	    
	    StringBuilder sb = new StringBuilder();
	    
	    for(int i=0; i<values.length; i++) {
	    	while(num >= values[i]) {
	    		num -= values[i];
	    		sb.append(symbols[i]);	    		
	    	}
	    }
	    return sb.toString();
	}
}
