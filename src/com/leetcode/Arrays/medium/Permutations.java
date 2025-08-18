package com.leetcode.Arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
	public static void main(String[] args) {
//		Input: nums = [1,2,3]
//		Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
//				
//		Input: nums = [0,1]
//		Output: [[0,1],[1,0]]
		
		int []nums1 = {1, 2, 3};
		int []nums2 = {0, 1};
		
		System.out.println(permute(nums1));
		System.out.println(permute(nums2));
	}
	public static List<List<Integer>> permute(int []nums){
		List<List<Integer>> result = new ArrayList<>();
		
		backtrack(nums, 0, result);
		return result;
	}
	
	public static void backtrack(int []nums, int start, List<List<Integer>> result) {
		if(start == nums.length) {
			List<Integer> temp = new ArrayList<>();
			for(int num: nums) {
				temp.add(num);
			}
			result.add(temp);
			return;
		}
		
		for(int i=start; i<nums.length; i++) {
			swap(nums, start, i);
			backtrack(nums, start+1, result);
			swap(nums, start, i);
		}
				
	}
	
	public static void swap(int []nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}

