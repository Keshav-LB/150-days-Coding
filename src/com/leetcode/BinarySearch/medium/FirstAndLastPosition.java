package com.leetcode.BinarySearch.medium;

import java.util.Arrays;

public class FirstAndLastPosition {
	public static void main(String[] args) {
//		Input: nums = [5,7,7,8,8,10], target = 8
//			Output: [3,4]
//		Input: nums = [5,7,7,8,8,10], target = 6
//			Output: [-1,-1]
//		Input: nums = [], target = 0
//			Output: [-1,-1]
		
		int nums1[] = {5,7,7,8,8,10};
		int target1 = 8;
		int nums2[] = {5,7,7,8,8,10};
		int target2 = 6;
		int nums3[] = {};
		int target3 = 0;
		
		System.out.println(Arrays.toString(searchRange(nums1, target1)));
		System.out.println(Arrays.toString(searchRange(nums2, target2)));
		System.out.println(Arrays.toString(searchRange(nums3, target3)));
	}
	public static int[] searchRange(int[] nums, int target) {
		int first = findFirstIndex(nums, target);
		int last = findLastIndex(nums, target);
		return new int[] {first, last};
	}
	public static int findFirstIndex(int[] nums, int target) {
		int low = 0, high = nums.length-1, ans = -1;
		while(low<=high) {
			int mid = low+(high-low)/2;
			if(nums[mid] == target) {
				ans = mid;
				high = mid-1;
			}
			else if(nums[mid]<target) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		return ans;
	}
	public static int findLastIndex(int[] nums, int target) {
		int low = 0, high = nums.length-1, ans = -1;
		while(low<=high) {
			int mid = low+(high-low)/2;
			if(nums[mid] == target) {
				ans = mid;
				low = mid+1;
			}
			else if(nums[mid]<target) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		return ans;
	}
}
