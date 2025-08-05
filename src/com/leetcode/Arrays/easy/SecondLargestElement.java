package com.leetcode.Arrays.easy;

public class SecondLargestElement {
	public static void main(String[] args) {
//		Input: nums = [8, 8, 7, 6, 5]
//		Output: 7
//		Input: nums = [10, 10, 10, 10, 10]
//		Output: -1
		
		int []nums1 = {8,8,7,6,5};
		int []nums2 = {10,10,10,10,10};
		int []nums3 = {3};
		
		System.out.println(secondLargest(nums1));
		System.out.println(secondLargest(nums2));
		System.out.println(secondLargest(nums3));
	}
	public static int secondLargest(int []nums) {
		if(nums.length<2) {
			return -1;
		}
		
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>max) {
				secondMax = max;
				max = nums[i];
			}
			else if(nums[i]>secondMax && nums[i] != max) {
				secondMax = nums[i];
			}
		}
		if(secondMax == Integer.MIN_VALUE) {
			return -1;
		}
		
		return secondMax;
	}
}
