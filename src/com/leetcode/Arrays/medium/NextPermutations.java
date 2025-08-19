package com.leetcode.Arrays.medium;

import java.util.Arrays;
import java.util.List;

public class NextPermutations {
	public static void main(String[] args) {
//		Input: nums = [1,2,3]
//		Output: [1,3,2]
//		Input: nums = [3,2,1]
//		Output: [1,2,3]
//		Input: nums = [1,1,5]
//		Output: [1,5,1]
		
		int []nums1 = {1, 2, 3};
		int []nums2 = {3, 2, 1};
		int []nums3 = {1,1,5};
		int []nums4 = {1, 2};
		
		nextPermutation(nums1);
        nextPermutation(nums2);
        nextPermutation(nums3);
        nextPermutation(nums4);
        
        System.out.println(Arrays.toString(nums1)); // [1,3,2]
        System.out.println(Arrays.toString(nums2)); // [1,2,3]
        System.out.println(Arrays.toString(nums3)); // [1,5,1]
        System.out.println(Arrays.toString(nums4)); // [2,1]
	}
	public static void nextPermutation(int []nums){
		int n = nums.length;
		int i= n-2;
		// Step 1: find first decreasing element
		while(i >=0 && nums[i]>=nums[i+1]) {
			i--;
		}
		if(i >= 0) {
			// Step 2: find element just larger than nums[i]
			int j = n-1;
			while(j>=0 && nums[j] <=nums[i]) {
				j--;
			}
			// Step 3: swap pivot and successor
			swap(nums, i, j);
		}
		// Step 4: reverse suffix
		reverse(nums, i+1, n-1);
	}
	public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
	public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}

