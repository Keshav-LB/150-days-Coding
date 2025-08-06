package com.leetcode.Arrays.easy;

public class MissingNumber {
	public static void main(String[] args) {
//		Input: nums = [9,6,4,2,3,5,7,0,1]
//		Output: 8
//		Input: nums = [3,0,1]
//		Output: 2
//		Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
//					 2 is the missing number in the range since it does not appear in nums.
		
		int nums1[] = {9,6,4,2,3,5,7,0,1};
		int nums2[] = {3,0,1};
		
		System.out.println(missingNumber(nums1));
		System.out.println(missingNumber(nums2));
	}
	public static int missingNumber(int []nums) {
		int n = nums.length;
		int expectedSum = n*(n+1)/2;
		int actualSum = 0;
		for(int num : nums) {
			actualSum+=num;
		}
		return expectedSum-actualSum;
	}
}
