package com.leetcode.Arrays.easy;

public class LinearSearch {
	public static void main(String[] args) {
//		Input: nums = [2, 3, 4, 5, 3], target = 3
//		Output: 1
//		Explanation: The first occurence of 3 in nums is at index 1
//		Input: nums = [2, -4, 4, 0, 10], target = 6
//		Output: -1
//		Explanation: The value 6 does not occur in the array, hence output is -1

		int []nums1 = {2,3,4,5,3};
		int target1 = 3;
		int []nums2 = {2,-4,4,0,10};
		int target2 = 6;
		
		System.out.println(linearSearch(nums1, target1));
		System.out.println(linearSearch(nums2, target2));
	}
	public static int linearSearch(int []nums, int target) {
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==target) {
				return i;
			}
		}
		return -1;
	}
}
