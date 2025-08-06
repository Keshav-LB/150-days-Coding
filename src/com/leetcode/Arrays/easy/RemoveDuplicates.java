package com.leetcode.Arrays.easy;

import java.util.HashSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
//		Input: nums = [1,1,2]
//		Output: 2, nums = [1,2,_]
//		Input: nums = [0,0,1,1,1,2,2,3,3,4]
//		Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
//		Input: nums = [-2, 2, 4, 4, 4, 4, 5, 5]
//		Output: 4
		
		int []nums1 = {1,1,2};
		int []nums2 = {0,0,1,1,1,2,2,3,3,4};
		int []nums3 = {-2, 2, 4, 4, 4, 4, 5, 5};
		
		System.out.println(removeDuplicates(nums1));
		System.out.println(removeDuplicates(nums2));
		System.out.println(removeDuplicates(nums3));
	}
	public static int removeDuplicates(int nums[]) {
		if(nums.length<1) {
			return 0;
		}
//		//1st method:
//		HashSet<Integer> hs = new HashSet<>();
//		for(int num:nums) {
//			hs.add(num);
//		}
//		return hs.size();
		
		//2nd method:
		int i=0;
		for(int j=1;j<nums.length;j++) {
			if(nums[j]!=nums[i]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i+1;
	}
}
