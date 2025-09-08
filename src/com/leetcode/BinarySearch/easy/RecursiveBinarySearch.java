package com.leetcode.BinarySearch.easy;

public class RecursiveBinarySearch {
	public static void main(String[] args) {
		int[] nums = {3,6,8,12,14,17,25,29,31,36,42,47,53,55,62};
		int key1 = 42, key2 = 12, key3 = 30;
		System.out.println(recursiveBinarySearch(nums, 0, nums.length-1, key1));
		System.out.println(recursiveBinarySearch(nums, 0, nums.length-1, key2));
		System.out.println(recursiveBinarySearch(nums, 0, nums.length-1, key3));
	}
	public static int recursiveBinarySearch(int[] nums, int low, int high, int key) {
		if(low==high) {
			if(nums[low]==key) return low;
			else return 0;
		}
		else {
			int mid = (low+high)/2;
			if(key==nums[mid]) return mid;
			else if(key<nums[mid]) return recursiveBinarySearch(nums, low, mid-1, key);
			else	return recursiveBinarySearch(nums, mid+1, high, key);
		}
	}
}
