package com.leetcode.BinarySearch.medium;

public class SearchInRotatedSortedArray {
	public static void main(String[] args) {
//		Input: nums = [4,5,6,7,0,1,2], target = 0
//		Output: 4
//		
//		Input: nums = [4,5,6,7,0,1,2], target = 3
//		Output: -1
//		
//		Input: nums = [1], target = 0
//		Output: -1
		
		int[] nums1 = {4,5,6,7,0,1,2};
		int target1 = 0;
		int[] nums2 = {4,5,6,7,0,1,2};
		int target2 = 3;
		int[] nums3 = {1};
		int target3 = 0;
		
		System.out.println(search(nums1, target1));
		System.out.println(search(nums2, target2));
		System.out.println(search(nums3, target3));
	}
	public static int search(int[] nums, int target) {
		int l = 0, h = nums.length-1;
		while(l<=h) {
			int mid = l+(h-l)/2;
			if(nums[mid]==target) return mid;
			
			//left half
			if(nums[l]<=nums[mid]) {
				if(nums[l] <= target && target < nums[mid]) {
					h = mid-1;
				}
				else {
					l=mid+1;
				}
			}
			
			//right half
			else {
				if(nums[mid] < target && target <= nums[h]) {
					l = mid+1;
				}
				else {
					h = mid-1;
				}
			}
		}
		return -1;
	}
}
