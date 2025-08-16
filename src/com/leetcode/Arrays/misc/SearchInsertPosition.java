package com.leetcode.Arrays.misc;

public class SearchInsertPosition {
//		Input: nums = [1,3,5,6], target = 5
//		Output: 2
//		Input: nums = [1,3,5,6], target = 2
//		Output: 1
//		Input: nums = [1,3,5,6], target = 7
//		Output: 4
	public static void main(String[] args) {
		int[] nums1 = {1,3,5,6};
		int target1 = 5;
		int[] nums2 = {1,3,5,6};
		int target2 = 2;
		int[] nums3 = {1,3,5,6};
		int target3 = 7;
		
		System.out.println(searchInsert(nums1, target1));
		System.out.println(searchInsert(nums2, target2));
		System.out.println(searchInsert(nums3, target3));
	}
	public static int searchInsert(int []nums, int target) {
		//O(n) time complexity : linearSearch
//		for(int i=0; i<nums.length;i++) {
//			if(nums[i]>=target) {
//				return i;
//			}
//		}
//		return nums.length;
		
		//O(log n) : Binary Search
		int left = 0, right = nums.length-1;
		while(left<=right) {
			int mid = left + (right-left)/2;
			
			if(nums[mid] == target) {
				return mid;
			}
			else if(nums[mid] < target) {
				left = mid+1;
			}
			else {
				right = mid-1;
			}
		}
		return left;
	}
}
