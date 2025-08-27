package com.leetcode.sorting;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] nums = { 65, 25, 12, 22, 11 };
		
		System.out.println("Before Selection Sort : "+Arrays.toString(nums));
		System.out.println(" After Selection Sort : "+Arrays.toString(selectionSort(nums)));
	}
	public static int[] selectionSort(int[] nums) {
		for(int i=0; i<nums.length; i++) {
			int minIndex = i;
			//find min element
			for(int j=i+1; j<nums.length;j++) {
				if(nums[j]<nums[minIndex]) {
					minIndex = j;
				}
			}
			//swap
			int temp = nums[i];
			nums[i] = nums[minIndex];
			nums[minIndex] = temp;
		}
		return nums;
	}
}

