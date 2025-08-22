package com.leetcode.Arrays.medium;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
	public static void main(String[] args) {
//		Input: nums = [1,1,1], k = 2
//		Output: 2
//		Input: nums = [1,2,3], k = 3
//		Output: 2
		int[] nums1 = {1,1,1}, nums2= {1,2,3};
		int k1 = 2, k2 = 3;
		
		System.out.println(subarraySum(nums1, k1));
		System.out.println(subarraySum(nums2, k2));
	}
	public static int subarraySum(int []nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		
		int sum=0, count=0;
		for(int num:nums) {
			sum+=num;
			count+=map.getOrDefault(sum-k, 0);
			map.put(sum, map.getOrDefault(sum, 0)+1);
		}
		return count;
	}
}
