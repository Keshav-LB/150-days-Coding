package com.leetcode.Arrays.hard;

import java.util.Arrays;

public class MissingAndRepeatedElement {
	public static void main(String[] args) {
//		Input: nums = [3, 5, 4, 1, 1]
//		Output: [1, 2]
//		Explanation: 1 appears two times in the array and 2 is missing from nums
		int[] nums1 = { 3, 5, 4, 1, 1 };
		int[] nums2 = { 1, 2, 3, 6, 7, 5, 7 };
		
		System.out.println(Arrays.toString(findMissingRepeatingNumbers(nums1)));
		System.out.println(Arrays.toString(findMissingRepeatingNumbers(nums2)));
	}
	public static int[] findMissingRepeatingNumbers(int[] nums) {
		int n = nums.length;
		
		int sumN = n*(n+1)/2;
		int sumSqN = n*(n+1)*(2*n+1)/6;
		
		int sumNums = 0, sumSqNums=0;
		
		for(int num:nums) {
			sumNums += num;
			sumSqNums += num * num;
		}
		
		int diff = sumNums -sumN;
		int sqDiff = sumSqNums - sumSqN;
		
		int sumAB = sqDiff / diff;
		
		int a = (diff+sumAB)/2;
		int b = a-diff;
		
		return new int[] {a, b};
	}
}

