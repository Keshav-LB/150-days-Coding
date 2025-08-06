package com.leetcode.Arrays.easy;

public class SecondSmallest {
	public static void main(String[] args) {
		int nums1[] = {1,1,2,4,7,7,5};
		int []nums2 = {10,10,10,10,10};
		System.out.println(secondSmallest(nums1));
		System.out.println(secondSmallest(nums2));
	}
	public static int secondSmallest(int nums[]) {
		if(nums.length<2) {
			return -1;
		}
		
		int min = Integer.MAX_VALUE;
		int secondMin = Integer.MIN_VALUE;
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<min) {
				secondMin = min;
				min = nums[i];
			}
			else if(nums[i]<secondMin && nums[i]!=min) {
				secondMin = nums[i];
			}
		}
		if(secondMin == Integer.MAX_VALUE) {
			return -1;
		}
		return secondMin;
	}
}
