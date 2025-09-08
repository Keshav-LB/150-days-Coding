package com.leetcode.BinarySearch.medium;

public class MinElementInRotatedSortedArray {
	public static void main(String[] args) {
//		Input: nums = [3,4,5,1,2]
//				Output: 1
//				Explanation: The original array was [1,2,3,4,5] rotated 3 times.
//		Input: nums = [4,5,6,7,0,1,2]
//				Output: 0
//				Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.
//		Input: nums = [11,13,15,17]
//				Output: 11
//				Explanation: The original array was [11,13,15,17] and it was rotated 4 times.
		
		int []nums1 = {3,4,5,1,2};
		int []nums2 = {4,5,6,7,0,1,2};
		int []nums3 = {11,13,15,17};
		
		System.out.println(findMin(nums1));
		System.out.println(findMin(nums2));
		System.out.println(findMin(nums3));
	}
	public static int findMin(int[] nums) {
		int low = 0, high = nums.length-1;
		
		while(low<high) {
			int mid = low+(high-low)/2;
			if(nums[mid]>nums[high]) {
				low = mid+1;
			}
			else {
				high = mid;
			}
		}
		return nums[low];
	}
}
