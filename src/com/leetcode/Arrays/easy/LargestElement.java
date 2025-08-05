package com.leetcode.Arrays.easy;

public class LargestElement {
	public static void main(String[] args) {
//		Input: nums = [3, 3, 6, 1]
//		Output: 6
//		Input: nums = [3, 3, 0, 99, -40]
//		Output: 99
		
		int []nums1 = {3,3,6,1};
		int []nums2 = {3,3,0,99,-40};
		int []nums3 = {3,2,1,5,4,6};
		
		System.out.println(findLargest(nums1));
		System.out.println(findLargest(nums2));
		System.out.println(findLargest(nums3));
	}
	public static int findLargest(int []nums) {
		int max = nums[0];
		for(int i=1;i<nums.length;i++) {
			if(nums[i]>max) {
				max = nums[i];
			}
		}
		return max;
	}
}
