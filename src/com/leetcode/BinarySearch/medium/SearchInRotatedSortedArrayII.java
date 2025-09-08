package com.leetcode.BinarySearch.medium;

public class SearchInRotatedSortedArrayII {
	public static void main(String[] args) {
//		Input: nums = [2,5,6,0,0,1,2], target = 0
//				Output: true
//		Input: nums = [2,5,6,0,0,1,2], target = 3
//				Output: false
		
		int nums1[] = {2, 5, 6, 0, 0, 1, 2};
		int target1 = 0;
		int nums2[] = {2, 5, 6, 0, 0, 1, 2};
		int target2 = 3;
		
		System.out.println(search(nums1, target1));
		System.out.println(search(nums2, target2));
	}
	public static boolean search(int[] nums, int target) {
		int low = 0, high = nums.length-1;
		while(low<=high) {
			int mid = low+(high-low)/2;
			if(nums[mid]==target) return true;
			//skip duplicates
			if(nums[low]==nums[mid] && nums[mid]==nums[high]) {
				low++;
				high--;
			}
			
			else if(nums[low]<=nums[mid]) {
				if(nums[low]<=target && target <nums[mid]) {
					high = mid-1;
				}
				else {
					low = mid+1;
				}
			}
			else {
				if(nums[mid]<target && target <=nums[high]) {
					low = mid+1;
				}
				else {
					high = mid-1;
				}
			}
		}
		return false;
	}
}
