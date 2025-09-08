package com.leetcode.BinarySearch.easy;

public class UpperBound {
	public static void main(String[] args) {
//		Input : n= 4, nums = [1,2,2,3], x = 2
//		Output:3
//		Explanation:
//		Index 3 is the smallest index such that arr[3] > x.
//		
//		Input : n = 5, nums = [3,5,8,15,19], x = 9
//		Output: 3
//		Explanation:
//		Index 3 is the smallest index such that arr[3] > x.
		
//		****if not found return array size
		
		int[] nums1 = {1,2,2,3};
		int x1 = 2;
		int[] nums2 = {3,5,8,15,19};
		int x2 = 9;
		
		System.out.println(lowerBound(nums1, x1));
		System.out.println(lowerBound(nums2, x2));
	}
	public static int lowerBound(int[] nums, int x) {
		int low = 0, high = nums.length-1;
		int ans = nums.length;
		while(low<=high) {
			int mid = (low+high)/2;
			if(nums[mid] > x) {
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
