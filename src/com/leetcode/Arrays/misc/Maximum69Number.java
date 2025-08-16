package com.leetcode.Arrays.misc;

public class Maximum69Number {
	public static void main(String[] args) {
		//only one digit allow to flip either 6->9 or 9->6
		int num1 = 9669;
		int num2 = 9996;
		int num3 = 9999;
		
		System.out.println(num1+ " => "+maximum69Number(num1));
		System.out.println(num2+ " => "+maximum69Number(num2));
		System.out.println(num3+ " => "+maximum69Number(num3));
	}
	public static int maximum69Number(int num) {
//		char[] digits = String.valueOf(num).toCharArray();
//		for(int i=0; i< digits.length; i++) {
//			if(digits[i]=='6') {
//				digits[i]='9';
//				break;
//			}
//		}
//		return Integer.parseInt(new String(digits));
		
		return Integer.parseInt(String.valueOf(num).replaceFirst("6", "9"));
	}
}
