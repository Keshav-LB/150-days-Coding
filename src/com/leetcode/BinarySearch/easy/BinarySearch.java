package com.leetcode.BinarySearch.easy;

public class BinarySearch {
	public static void main(String[] args) {
		int[] nums = {3,6,8,12,14,17,25,29,31,36,42,47,53,55,62};
		int key1 = 42, key2 = 12, key3 = 30;
		System.out.println(binarySearch(nums, key1));
		System.out.println(binarySearch(nums, key2));
		System.out.println(binarySearch(nums, key3));
		
	}
	public static int binarySearch(int[] nums, int key) {
		int low = 1, high = nums.length;
		while(low<=high) {
			int mid = (low+high)/2;
			if(key == nums[mid]) {
				return mid;
			}
			else if(key < nums[mid]) {
				high = mid-1;
			}
			else {
				low = mid+1;
			}
		}
		return 0;
	}
}
