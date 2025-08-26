package com.leetcode.Arrays.hard;

import java.util.HashMap;

public class LongestSubArrayWithSumZero {
	public static void main(String[] args) {
		int[] nums1 = {9, -3, 3, -1, 6, -5};
		int n1 = 6;
		int[] nums2 = {6, -2, 2, -8, 1, 7, 4, -10};
		int n2 = 8;
		int[] nums3 = {1, 0, -5};
		int n3 = 3;
		int[] nums4 = {1, 3, -5, 6, -2};
		int n4 = 3;
		
		System.out.println(longestSubArray(nums1, n1));//5
		System.out.println(longestSubArray(nums2, n2));//8
		System.out.println(longestSubArray(nums3, n3));//1
		System.out.println(longestSubArray(nums4, n4));//0
	}
	
	public static int longestSubArray(int[] nums, int n) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int sum=0, maxLen = 0;
		for(int i=0; i<n; i++) {
			sum+=nums[i];
			if(sum==0) {
				maxLen = i+1;
			}
			if(map.containsKey(sum-0)) {{
				maxLen = Math.max(maxLen, i-map.get(sum-0));
			}
			}
			if(!map.containsKey(sum)) {
				map.put(sum, i);
			}
		}
		return maxLen;
	}
	
}
