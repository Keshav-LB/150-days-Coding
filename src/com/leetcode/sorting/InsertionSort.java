package com.leetcode.sorting;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
				
		int nums[] = { 64, 34, 25, 12, 22, 11, 90 };

		System.out.println("Before Insertion Sort : " + Arrays.toString(nums));
		System.out.println(" After Insertion Sort : " + Arrays.toString(insertionSort(nums)));
	}

	public static int[] insertionSort(int[] nums) {
		for(int i = 1 ; i < nums.length ; i++) {
			int key = nums[i];
			int j = i-1;
			
			while(j >= 0 && nums[j] > key) {
				nums[j+1] = nums[j];
				j--;
			}
			
			nums[j+1] = key;
		}
		return nums;
	}
	
}
