package com.leetcode.BinarySearch.medium;

public class SingleElemInSortedArray {
	public static void main(String[] args) {
//		Input: nums = [1,1,2,3,3,4,4,8,8]
//				Output: 2
//		Input: nums = [3,3,7,7,10,11,11]
//				Output: 10
		
		int[] nums1 = {1,1,2,3,3,4,4,8,8};
		int[] nums2 = {3,3,7,7,10,11,11};
		System.out.println(singleNonDuplicate(nums1));
		System.out.println(singleNonDuplicate(nums2));
	}
	public static int singleNonDuplicate(int[] nums) {
//		int ans = 0;
//		for(int num : nums) {
//			ans^=num;
//		}
//		return ans;
		
//		 O(log n) time and O(1) space.
		int low = 0, high = nums.length-1;
		while(low<high) {
			int mid = low+(high-low)/2;
			//check mid is even
			if(mid%2==1) {
				mid--;
			}
			
			if(nums[mid]==nums[mid+1]) {
				low = mid+2;
			}
			else {
				high = mid;
			}
		}
		return nums[low];
		
	}
}
