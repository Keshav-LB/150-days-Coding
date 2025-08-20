package com.leetcode.Arrays.easy;

import java.util.Arrays;

public class Leetcode1299 {
	public static void main(String[] args) {
//		Input: arr = [17,18,5,4,6,1]
//		Output: [18,6,6,6,1,-1]
		
		int []nums1 = {17, 18, 5, 4, 6, 1};
		int []nums2 = {400};
		System.out.println(Arrays.toString(replaceElement(nums1)));
		System.out.println(Arrays.toString(replaceElement(nums2)));
	}
	public static int[] replaceElement(int []nums) {
		int max = -1;
		
		for(int i=nums.length-1; i>=0;i--) {
			int current = nums[i];
			nums[i] = max;
			max = Math.max(max, current);
		}
		
		return nums;
	}
}
