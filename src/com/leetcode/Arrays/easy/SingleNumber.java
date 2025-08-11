package com.leetcode.Arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
	public static void main(String[] args) {
//		Input: nums = [2,2,1]
//		Output: 1
//		Input: nums = [4,1,2,1,2]
//		Output: 4
		
		int nums1[] = {2,2,1};
		int nums2[] = {4,1,2,1,2};
		
		System.out.println(singleNumber(nums1));
		System.out.println(singleNumber(nums2));
	}
	public static int singleNumber(int []nums) {
//		Map<Integer,Integer> map = new HashMap<>();
//		for(int num:nums) {
//			map.put(num, map.getOrDefault(num, 0)+1);
//		}
//		System.out.println(map);
//		int freq = -1;
//		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
//			if(entry.getValue()==1) {
//				freq = entry.getKey();
//			}
//		}
//		return freq;
		
		int result = 0;
		for(int num: nums) {
			result ^=num;
		}
		return result;
	}	
}
