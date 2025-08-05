package com.leetcode.Strings.easy;

public class LargestOddNumberInString {
	public static void main(String[] args) {
//		Input: num = "52"
//		Output: "5"
//		Input: num = "4206"
//		Output: ""
//		Input: num = "35427"
//		Output: "35427"
		
		String num1 = "52";
		String num2 = "4206";
		String num3 = "35427";
		String num4 = "5347";
		String num5 = "00214638";
		
		System.out.println(num1+" : "+largestOddNumber(num1));
		System.out.println(num2+" : "+largestOddNumber(num2));
		System.out.println(num3+" : "+largestOddNumber(num3));
		System.out.println(num4+" : "+largestOddNumber(num4));
		System.out.println(num5+" : "+largestOddNumber(num5));
	}
	public static String largestOddNumber(String num) {
		num = num.replaceFirst("^0+", "");	//replace leading zeroes
		for(int i=num.length()-1; i >= 0; i--) {
			char ch = num.charAt(i);
			if((Integer.parseInt(String.valueOf(ch))) % 2 != 0) {
				return num.substring(0, i+1);
			}
		}
		return "";
	}
}
