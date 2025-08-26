package com.leetcode.Arrays.hard;

import java.util.HashMap;
import java.util.Map;

public class CountSubarrayWithXORk {
	public static void main(String[] args) {
		int[] nums1 = {4, 2, 2, 6, 4};
        int k1 = 6;
        System.out.println(countSubarrays(nums1, k1)); // Output: 4

        int[] nums2 = {5, 6, 7, 8, 9};
        int k2 = 5;
        System.out.println(countSubarrays(nums2, k2)); // Output: 2
	}
	public static int countSubarrays(int[] nums, int k) {
		Map<Integer, Integer> freq = new HashMap<>();
		int count = 0;
		int prefixXor = 0;
		
		for(int num:nums) {
			prefixXor ^= num;
			
			if(prefixXor == k) {
				count++;
			}
			
			int target = prefixXor ^ k;
			
			if(freq.containsKey(target)) {
				count+=freq.get(target);
			}
			
			freq.put(prefixXor, freq.getOrDefault(prefixXor, 0)+1);
		}
		return count;
	}
}
