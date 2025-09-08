package com.leetcode.sorting;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] nums1 = {10, 80, 90, 60, 30, 20};
		int[] nums2 = {6, 3, 5, 4, 2, 1, 9};
		int[] nums3 = {10, 16, 8, 12, 15, 6, 3, 9, 5};
		System.out.println("Before Quick Sort : "+Arrays.toString(nums1));
		System.out.println(" After Quick Sort :"+Arrays.toString(sort(nums1)));
		System.out.println("------------------------------------------------------------------");
		System.out.println("Before Quick Sort : "+Arrays.toString(nums2));
		System.out.println(" After Quick Sort :"+Arrays.toString(sort(nums2)));
		System.out.println("------------------------------------------------------------------");
		System.out.println("Before Quick Sort : "+Arrays.toString(nums3));
		System.out.println(" After Quick Sort :"+Arrays.toString(sort(nums3)));
		System.out.println("------------------------------------------------------------------");
	}
	public static int[] sort(int[] nums) {
		int n = nums.length;	
		quickSort(nums, 0, n-1);
		return nums;
	}
	public static void quickSort(int[] nums, int low, int high) {
		if(low < high) {
			int pi = partition(nums, low, high);
			
			quickSort(nums, low, pi -1);
			quickSort(nums, pi+1, high);
		}
	}
	
	public static int partition(int[] nums, int low, int high) {
		int pivot = nums[high];
		
		int i = low - 1;
		
		for(int j = low; j<=high-1; j++) {
			if(nums[j]<pivot) {
				i++;
				swap(nums, i, j);
			}
		}
		swap(nums, i+1, high);
		return i+1;
	}
	public static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
	}
}
