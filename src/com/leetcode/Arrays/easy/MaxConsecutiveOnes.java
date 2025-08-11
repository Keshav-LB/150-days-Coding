package com.leetcode.Arrays.easy;

public class MaxConsecutiveOnes {
	public static void main(String[] args) {
//		Input: nums = [1,1,0,1,1,1]
//		Output: 3
//		Input: nums = [1,0,1,1,0,1]
//		Output: 2
		
		int []nums1 = {1,1,0,1,1,1};
		int []nums2 = {1,0,1,1,0,1};
		
		System.out.println(findMaxConsecutiveOnes(nums1));
		System.out.println(findMaxConsecutiveOnes(nums2));
	}
	public static int findMaxConsecutiveOnes(int []nums) {
		int count = 0;
		int maxCount = 0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==1) {
				count++;
				maxCount= Math.max(maxCount, count);
			}
			else {
				if(nums[i]==0) {
					count = 0;
				}
			}
		}
		return maxCount;
	}
}
