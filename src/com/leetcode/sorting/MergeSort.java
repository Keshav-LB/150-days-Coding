package com.leetcode.sorting;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int nums[] = { 64, 34, 25, 12, 22, 11, 90 };

		System.out.println("Before Merge Sort : " + Arrays.toString(nums));
		System.out.println(" After Merge Sort : " + Arrays.toString(mergeSort(nums, 0, nums.length-1)));
	}
	public static int[] mergeSort(int[] nums, int left, int right) {
		if(left < right) {
			int mid = (left+right)/2;
			//sort left
			mergeSort(nums, left, mid);
			//sort right
			mergeSort(nums, mid+1, right);
			//merge two halves
			merge(nums, left, mid, right);
		}
		return nums;
	} 
	public static void merge(int[] nums, int left, int mid, int right) {
		//sizes of sub arrays
		int n1 = mid-left+1;
		int n2 = right-mid;
		
		//Temp arrays
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		//Copy data into temp arrays
		for(int i=0; i<n1; i++) {
			L[i] = nums[left+i];
		}
		for(int j=0; j<n2; j++) {
			R[j] = nums[mid+1+j];
		}
		
		//merge process
		int i=0, j=0;
		int k = left;
		
		while(i < n1 && j < n2) {
			if(L[i] <= R[j]) {
				nums[k++] = L[i++];
			}
			else {
				nums[k++] = R[j++];
			}
		}
		
		//Copy remaining elements of L[]
		while(i<n1) {
			nums[k++] = L[i++];
		}
		
		//Copy remaining elements of R[]
		while(j<n2) {
			nums[k++] = R[j++];
		}
	}
}
