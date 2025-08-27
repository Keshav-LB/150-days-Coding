package com.leetcode.sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int nums[] = { 64, 34, 25, 12, 22, 11, 90 };
		
		System.out.println("Before Bubble Sort : "+Arrays.toString(nums));
		System.out.println(" After Bubble Sort : "+Arrays.toString(bubbleSort(nums)));
	}
	public static int[] bubbleSort(int[] nums) {
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums.length-1-i; j++) {
				if(nums[j]>nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		return nums;
	}
}
