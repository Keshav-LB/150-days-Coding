package com.leetcode.basic.arrays;

public class MissingElementInArray {
	public static void main(String[] args) {
		int[] arr = {6, 3, 1, 5, 2, 7};
		int n=7;
		findMissing(arr, n);
	}
	public static void findMissing(int arr[], int n) {
		int expected_sum = n*(n+1)/2;
		int actual_sum = 0;
		for(int num :arr) {
			actual_sum +=num;
		}
		int missing_element = expected_sum - actual_sum;
		System.out.println("Missing Element: "+missing_element);
	}
	
}
