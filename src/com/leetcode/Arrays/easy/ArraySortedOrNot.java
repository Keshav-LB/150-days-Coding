package com.leetcode.Arrays.easy;

public class ArraySortedOrNot {
	public static void main(String[] args) {
//		Input : nums = [1, 2, 3, 4, 5]
//		Output : true
//		Input : nums = [1, 2, 1, 4, 5]
//		Output : false
		
		int nums1[] = { 1, 2, 3, 4, 5 };
		int nums2[] = { 1, 2, 1, 4, 5 };
		
		System.out.println(isSorted(nums1));
		System.out.println(isSorted(nums2));
	}
	public static boolean isSorted(int []nums) {
		for(int i=1;i<nums.length;i++) {
			if(nums[i]<nums[i-1]) {
				return false;
			}
		}
		return true;
	}
}
