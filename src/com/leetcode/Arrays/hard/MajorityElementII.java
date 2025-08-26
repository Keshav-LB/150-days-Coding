package com.leetcode.Arrays.hard;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
	public static void main(String[] args) {
//		Input: nums = [3,2,3]
//		Output: [3]
//
//		Input: nums = [1]
//		Output: [1]
//
//		Input: nums = [1,2]
//		Output: [1,2]
		
		int[] nums1 = {3,2,3};
		int[] nums2 = {1};
		int[] nums3 = {1,2};
		int[] nums4 = {1,1,1,2,2,2,3,3,3};
		System.out.println(majorityElement(nums1));
		System.out.println(majorityElement(nums2));
		System.out.println(majorityElement(nums3));
		System.out.println(majorityElement(nums4));
	}
	public static List<Integer> majorityElement(int []nums){
		List<Integer> result = new ArrayList<>();
		int count1 = 0, count2 = 0;
		int maxCount1=0, maxCount2=0;
		
		for(int num: nums) {
			if(num == maxCount1) {
				count1++;
			}
			else if(num == maxCount2) {
				count2++;
			}
			else if(count1 == 0) {
				maxCount1 = num;
				count1 = 1;
			}
			else if(count2 == 0) {
				maxCount2 = num;
				count2 = 1;
			}
			else {
				count1--;
				count2--;
			}
		}
		
		count1 = 0;
		count2 = 0;
		for(int num:nums) {
			if(num==maxCount1) count1++;
			else if(num==maxCount2) count2++;
		}
		if(count1 > nums.length/3) result.add(maxCount1);
		if(count2 > nums.length/3) result.add(maxCount2);
		return result;
	}
}
