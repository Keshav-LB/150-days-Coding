package com.leetcode.Arrays.medium;

public class MaximumSubarray {
	public static void main(String[] args) {
//		Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//		Output: 6
//		Explanation: The subarray [4,-1,2,1] has the largest sum 6.
//		
//		Input: nums = [5,4,-1,7,8]
//		Output: 23
//		Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
//		
//		Input: nums = [1]
//		Output: 1
		
		int []nums1 = {-2,1,-3,4,-1,2,1,-5,4};
		int []nums2 = {5,4,-1,7,8};
		int []nums3 = {1};
		int []nums4 = {-2, -3, -7, -2, -10, -4};
		
		System.out.println(maxSubArray(nums1));
		System.out.println(maxSubArray(nums2));
		System.out.println(maxSubArray(nums3));
		System.out.println(maxSubArray(nums4));
	}
	public static int maxSubArray(int []nums) {
		int maxSum = nums[0];
		int currentSum = nums[0];
		
		for(int i=1;i<nums.length;i++) {
			currentSum = Math.max(nums[i], currentSum + nums[i]);
			maxSum = Math.max(maxSum, currentSum);
		}
		return maxSum;
	}
}
