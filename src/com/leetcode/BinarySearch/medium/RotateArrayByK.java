package com.leetcode.BinarySearch.medium;

import java.util.Arrays;

public class RotateArrayByK {
	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		System.out.println(Arrays.toString(rotateArrayByK(nums, k)));
	}
	public static int[] rotateArrayByK(int[] nums, int k) {
		reverseArray(nums, 0, k);
		reverseArray(nums, k+1, nums.length-1);
		reverseArray(nums, 0, nums.length-1);
		return nums;
	}
	public static void reverseArray(int[] nums, int i, int j) {
		while(i<j) {
			swap(nums, i, j);
			i++;
			j--;
		}
	}
	public static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
