package com.leetcode.Arrays.medium;

import java.util.Arrays;

public class SortColors {
	public static void main(String[] args) {
//		Input: nums = [2,0,2,1,1,0]
//		Output: [0,0,1,1,2,2]
//		Input: nums = [2,0,1]
//		Output: [0,1,2]
		
		int []nums1 = {2,0,2,1,1,0};
		int []nums2 = {2,0,1};
		int []nums3 = {0,1,0,1,0,1};
		
		sortColors(nums1);
		sortColors(nums2);
		sortColors(nums3);
	}
	public static void sortColors(int []nums) {
		int low = 0, mid = 0, high = nums.length-1;
		
		while(mid <= high) {
			if(nums[mid] == 0) {
				swap(nums, low, mid);
				low++;
				mid++;
			}
			else if(nums[mid] == 1) {
				mid++;
			}
			else {
				swap(nums, mid, high);
				high--;
			}
		}
		System.out.println(Arrays.toString(nums));
	}
	public static void swap(int []nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
