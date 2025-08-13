package com.leetcode.Arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeArrayElementsbySign {
	public static void main(String[] args) {
//		Input: nums = [3,1,-2,-5,2,-4]
//		Output: [3,-2,1,-5,2,-4]
//		Explanation:
//		The positive integers in nums are [3,1,2]. The negative integers 
//		are [-2,-5,-4].
//		The only possible way to rearrange them such that they satisfy 
//		all conditions is [3,-2,1,-5,2,-4].
//		Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], 
//		[-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions.
//		
//		Input: nums = [-1,1]
//		Output: [1,-1]
//		Explanation:
//		1 is the only positive integer and -1 the only negative integer in nums.
//		So nums is rearranged to [1,-1].
		
		int []nums1 = {3,1,-2,-5,2,-4};
		int []nums2 = {-1,1};
		System.out.println(Arrays.toString(rearrangeArray(nums1)));
		System.out.println(Arrays.toString(rearrangeArray(nums2)));
	}
	public static int[] rearrangeArray(int []nums) {
		List<Integer> positive = new ArrayList<>();
		List<Integer> negative = new ArrayList<>();
		
		for(int i = 0; i<nums.length; i++) {
			if(nums[i]>0) {
				positive.add(nums[i]);
			}
			else {
				negative.add(nums[i]);
			}
		}
		
		int []result = new int[nums.length];
		int i=0, p=0, n=0;
		while(p < positive.size() && n < negative.size()) {
			result[i++] = positive.get(p++);
			result[i++] = negative.get(n++);
		}
		return result;
	}
}
