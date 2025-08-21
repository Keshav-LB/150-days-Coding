package com.leetcode.Arrays.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
	public static void main(String[] args) {
//		Input: nums = [100,4,200,1,3,2]
//		Output: 4
//		Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. 
//		Therefore its length is 4.
//		Input: nums = [0,3,7,2,5,8,4,6,0,1]
//		Output: 9
//		Input: nums = [1,0,1,2]
//		Output: 3
		
		int[] nums1 = {100,4,200,1,3,2};
		int[] nums2 = {0,3,7,2,5,8,4,6,0,1};
		int[] nums3 = {1,0,1,2};
		
		System.out.println(longestConsecutive(nums1));
		System.out.println(longestConsecutive(nums2));
		System.out.println(longestConsecutive(nums3));
	}
	public static int longestConsecutive(int[] nums) {
		Set<Integer> hs = new HashSet<>();
		for(int num: nums) {
			hs.add(num);
		}
		int longest=0;
		
		for(int num: hs) {
			if(!hs.contains(num-1)) {
				int current = num;
				int max = 1;
				while(hs.contains(current+1)) {
					current++;
					max++;
				}
				longest = Math.max(max, longest);
			}
		}
		return longest;
		
	}
}
