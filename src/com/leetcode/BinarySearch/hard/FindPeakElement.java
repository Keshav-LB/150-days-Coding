package com.leetcode.BinarySearch.hard;

public class FindPeakElement {
	public static void main(String[] args) {
//		Input: nums = [1,2,3,1]
//		Output: 2
//		Explanation: 3 is a peak element and your function should return the index number 2.
//				
//		Input: nums = [1,2,1,3,5,6,4]
//		Output: 5
//		Explanation: Your function can return either index number 1 where the peak element is 2, 
//				or index number 5 where the peak element is 6.
		
		int[] nums1 = {1,2,3,1};
		int[] nums2 = {1,2,1,3,5,6,4};
		
		System.out.println(findPeakElement(nums1));
		System.out.println(findPeakElement(nums2));
	}
	public static int findPeakElement(int[] nums) {
		int low = 0, high = nums.length-1;
		while(low<high) {
			int mid = low+(high-low)/2;
			if(nums[mid]<nums[mid+1]) {
				low= mid+1;
			}
			else {
				high = mid;
			}
		}
		return low;
	}
}
