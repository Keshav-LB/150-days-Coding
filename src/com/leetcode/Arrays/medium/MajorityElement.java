package com.leetcode.Arrays.medium;

public class MajorityElement {
	public static void main(String[] args) {
//		Input: nums = [3,2,3]
//		Output: 3
//		Input: nums = [2,2,1,1,1,2,2]
//		Output: 2
		int[] nums1 = {3,2,3};
		int[] nums2 = {2,2,1,1,1,2,2};
		
		System.out.println(majorityElement(nums1));
		System.out.println(majorityElement(nums2));
	}
	public static int majorityElement(int []nums) {
		int count = 0;
		int maxCount = 0;
		
		for(int num : nums) {
			if(count == 0) {
				maxCount = num;
			}
			count += (num == maxCount)?1:-1;
		}
		return maxCount;
	}
}
