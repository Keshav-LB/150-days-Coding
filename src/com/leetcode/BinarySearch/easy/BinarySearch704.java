package com.leetcode.BinarySearch.easy;

public class BinarySearch704 {
	public static void main(String[] args) {
		int[] nums1 = {-1,0,3,5,9,12};
		int target1 = 9;
		int[] nums2 = {-1,0,3,5,9,12};
		int target2 = 2;
		
		System.out.println(search(nums1, target1));
		System.out.println(search(nums2, target2));
		
	}
	public static int search(int[] nums, int target) {
		int l=0, h=nums.length-1;
		while(l<=h) {
			int mid = (l+h)/2;
			if(target==nums[mid]) {
				return mid;
			}
			else if(target<nums[mid]) {
				h = mid-1;
			}
			else {
				l = mid+1;
			}
		}
		return -1;
	}
}
