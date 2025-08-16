package com.leetcode.Arrays.misc;

import java.util.Arrays;

public class PlusOne {
//	Input: digits = [1,2,3]
//	Output: [1,2,4]
//	Explanation: The array represents the integer 123.
//	Incrementing by one gives 123 + 1 = 124.
//	Thus, the result should be [1,2,4].
//	
//	Input: digits = [9]
//	Output: [1,0]
//	Explanation: The array represents the integer 9.
//	Incrementing by one gives 9 + 1 = 10.
//	Thus, the result should be [1,0].
			
	public static void main(String[] args) {
		int []digits1 = {1,2,3};
		int []digits2 = {4,3,2,1};
		int []digits3 = {9};
		int []digits4 = {9, 9, 8, 9};
		
		System.out.println(Arrays.toString(plusOne(digits1)));
		System.out.println(Arrays.toString(plusOne(digits2)));
		System.out.println(Arrays.toString(plusOne(digits3)));
		System.out.println(Arrays.toString(plusOne(digits4)));
	}
	public static int[] plusOne(int[] digits) {
		
		for(int i=digits.length-1; i>=0; i--) {
			if(digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		
		int []newDigits = new int[digits.length+1];
		newDigits[0] = 1;
		return newDigits;

	}
}
