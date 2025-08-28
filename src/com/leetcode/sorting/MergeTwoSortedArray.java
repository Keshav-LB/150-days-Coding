package com.leetcode.sorting;

import java.util.Arrays;

public class MergeTwoSortedArray {
	public static void main(String[] args) {
		int[] num1 = {2,8,15,18};
		int[] num2 = {5,9,12,17};
		
		System.out.println(" After Merging : " + Arrays.toString(merge(num1, num2)));
	}
	public static int[] merge(int[] num1, int[] num2) {
		int m = num1.length;
		int n = num2.length;
		int[] num = new int[m+n];
		int i=0, j=0, k=0;
		
		while(i<m && j<n) {
			if(num1[i]<num2[j]) {
				num[k++] = num1[i++];
			}
			else {
				num[k++] = num2[j++];
			}
		}
		while(i<m) {
			num[k++] = num1[i++];
		}
		while(j<n) {
			num[j++] = num2[j++];
		}
		
		return num;
	}
}
