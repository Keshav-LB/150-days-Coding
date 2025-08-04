package com.leetcode.basic.arrays;

public class SegregateArrays {
	public static void main(String[] args) {
		int[] arr = {1, 0, 1, 0, 0, 1, 1, 0, 0, 1};
		
		int left = 0;
		int right = arr.length-1;
		
		while(left<right) {
			while(arr[left]==0 && left < right) {
				left++;
			}
			while(arr[right]==1 && left < right) {
				right--;
			}
			if(left<right) {
				arr[left] = arr[left]^arr[right];
				arr[right] = arr[left]^arr[right];
				arr[left] = arr[left]^arr[right];
				left++;
				right--;
			}
		}
		
		for(int num:arr) {
			System.out.print(num+" ");
		}
	}
}
