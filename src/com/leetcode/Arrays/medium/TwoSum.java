package com.leetcode.Arrays.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String[] args) {
//		Input: nums = [2,7,11,15], target = 9
//		Output: [0,1]
//		Input: nums = [3,2,4], target = 6
//		Output: [1,2]
//		Input: nums = [3,3], target = 6
//		Output: [0,1]
		
		int[] nums1 = {2,7,11,15}, nums2 = {3,2,4}, nums3 = {3,3};
		int target1 = 9, target2 = 6, target3 = 6;
		
		System.out.println(Arrays.toString(twoSum(nums1,target1)));
		System.out.println(Arrays.toString(twoSum(nums2,target2)));
		System.out.println(Arrays.toString(twoSum(nums3,target3)));
		
	}
	public static int[] twoSum(int []nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0;i<nums.length;i++) {
			int complement = target-nums[i];
			
			if(map.containsKey(complement)) {
				return new int[] {map.get(complement), i};
			}
			
			map.put(nums[i], i);
		}
		return new int[] {};
	}
}
