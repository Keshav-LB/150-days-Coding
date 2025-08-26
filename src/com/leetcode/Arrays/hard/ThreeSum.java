package com.leetcode.Arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public static void main(String[] args) {
//		Input: nums = [-1,0,1,2,-1,-4]
//		Output: [[-1,-1,2],[-1,0,1]]
//		Explanation: 
//			nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
//			nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
//			nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
//		The distinct triplets are [-1,0,1] and [-1,-1,2].
		
//		Input: nums = [0,1,1]
//		Output: []
		
//		Input: nums = [0,0,0]
//		Output: [[0,0,0]]
		int[] nums1 = {-1,0,1,2,-1,-4};
		int[] nums2 = {0,1,1};
		int[] nums3 = {0,0,0};
		
		System.out.println(threeSum(nums1));
		System.out.println(threeSum(nums2));
		System.out.println(threeSum(nums3));
	}
	public static List<List<Integer>> threeSum(int[] nums){
		List<List<Integer>> res = new ArrayList<>();
		Arrays.sort(nums);
				
		for(int i=0; i<nums.length-2; i++) {
			if(i>0 && nums[i] == nums[i-1])	continue;
			
			int left = i+1, right = nums.length-1;
			while(left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				if(sum==0) {
					res.add(Arrays.asList(nums[i], nums[left], nums[right]));
					while(left < right && nums[left] == nums[left+1]) left++;
					while(left < right && nums[right] == nums[right-1]) right--;
					left++;
					right--;
				}
				else if(sum<0) {
					left++;
				}
				else {
					right--;
				}
			}
		}
		
		return res;
	}
}
