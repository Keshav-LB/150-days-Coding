package com.leetcode.Arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithSumK {
	public static void main(String[] args) {
//		Input: nums = [10, 5, 2, 7, 1, 9],  k=15
//		Output: 4
//		Input: nums = [-3, 2, 1], k=6
//		Output: 0
		
		int []nums1 = {10, 5, 2, 7, 1, 9}, nums2 = {-3,2,1};
		int k1 = 15, k2=6;
		
		System.out.println(longestSubarray(nums1, k1));
		System.out.println(longestSubarray(nums2, k2));
	}
	public static int longestSubarray(int []nums, int k) {
		Map<Integer, Integer> map = new HashMap<>(); // prefix_sum -> first_index
        int sum = 0, maxLen = 0;
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            // Case 1: sum == k
            if (sum == k) {
                maxLen = i + 1;
            }

            // Case 2: sum - k found before
            if (map.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - map.get(sum - k));
            }

            // Store first occurrence of sum
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        System.out.println(map);
        return maxLen;
	}
}
