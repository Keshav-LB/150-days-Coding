package com.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
	public static void main(String[] args) {
		int []nums = {1,2,3};
		
		List<List<Integer>> result = permute(nums);
		System.out.println(result);
//		System.out.println(permute(nums));
	}
	public static List<List<Integer>> permute(int []nums){
		List<List<Integer>> result = new ArrayList<>();
		backtrack(nums, 0, result);
		return result;
	}
	public static void backtrack(int []nums, int start, List<List<Integer>> result) {
		if(start == nums.length) {
			List<Integer> temp = new ArrayList<>();
			for(int num : nums) {
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
