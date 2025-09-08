package com.leetcode.BinarySearch.easy;

public class SearchInsertPosition {
	public static void main(String[] args) {
//		Input: nums = [1,3,5,6], target = 5
//		Output: 2
//		Input: nums = [1,3,5,6], target = 2
//		Output: 1
//		Input: nums = [1,3,5,6], target = 7
//		Output: 4
		
		int[] nums = {1,3,5,6};
		int target1 = 5, target2 = 2, target3 = 7;
		System.out.println(searchInsert(nums, target1));
		System.out.println(searchInsert(nums, target2));
		System.out.println(searchInsert(nums, target3));
	}
	public static int searchInsert(int[] nums, int target) {
		
//		1st method: O(n) time complexity
//		for(int i=0; i<nums.length; i++) {
//			if(nums[i]>=target) {
//				return i;
//			}
//		}
//		return nums.length;
		
//		2nd method: O(logN) time complexity
		int low = 0, high = nums.length-1;
		int ans = nums.length;
		while(low<=high) {
			int mid = (low+high)/2;
			if(nums[mid]>=target) {
				ans = mid;
				high = mid-1;
			}
			else {
				low = mid+1;
			}
		}
		return ans;
	}
}
