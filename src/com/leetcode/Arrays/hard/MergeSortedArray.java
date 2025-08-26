package com.leetcode.Arrays.hard;

import java.util.Arrays;

public class MergeSortedArray {
	public static void main(String[] args) {
//		Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//		Output: [1,2,2,3,5,6]
//		Input: nums1 = [1], m = 1, nums2 = [], n = 0
//		Output: [1]
//		Input: nums1 = [0], m = 0, nums2 = [1], n = 1
//		Output: [1]

		int[] nums1 = { 1, 2, 3, 0, 0, 0 }, nums2 = { 2, 5, 6 };
		int m1 = 3, n1 = 3;
		int[] nums3 = { 1 }, nums4 = {};
		int m2 = 1, n2 = 0;
		int[] nums5 = { 0 }, nums6 = { 1 };
		int m3 = 0, n3 = 1;
		
		merge(nums1, m1, nums2, n1);
		merge(nums3, m2, nums4, n2);
		merge(nums5, m3, nums6, n3);
		
		System.out.println(Arrays.toString(nums1));
		System.out.println(Arrays.toString(nums3));
		System.out.println(Arrays.toString(nums5));

	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		int i = m - 1, j = n - 1, k = m + n - 1;

		while (i >= 0 && j >= 0) {
			if (nums1[i] > nums2[j]) {
				nums1[k--] = nums1[i--];
			} else {
				nums1[k--] = nums2[j--];
			}
		}

		// if elements of num2 left
		while (j >= 0) {
			nums1[k--] = nums2[j--];
		}
	}
}
