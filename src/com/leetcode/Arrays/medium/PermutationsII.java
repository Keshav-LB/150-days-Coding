package com.leetcode.Arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsII {
	public static void main(String[] args) {
//		Input: nums = [1,1,2]
//		Output:[[1,1,2], [1,2,1], [2,1,1]]
//		Input: nums = [1,2,3]
//		Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
		
		int []nums1 = {1,1,2};
		int []nums2 = {1,2,3};
		
		System.out.println(permuteUnique(nums1));
		System.out.println(permuteUnique(nums2));
	}
	public static List<List<Integer>> permuteUnique(int[] nums){
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums);
		boolean []used = new boolean[nums.length];
		backtrack(nums, new ArrayList<>(), used, result);
		return result;
	}
	public static void backtrack(int []nums, List<Integer> tempList, boolean[] used, List<List<Integer>> result) {
		if(tempList.size()==nums.length) {
			result.add(new ArrayList<>(tempList));
			return;
		}
		
		for(int i=0; i<nums.length; i++) {
			//skip used element
			if(used[i]) continue;
			
			//skip duplicates
			if(i > 0 && nums[i] == nums[i-1] && !used[i-1]) continue;
			
			tempList.add(nums[i]);
			used[i]=true;
			
			backtrack(nums, tempList, used, result);
			
			//backtrack step
			used[i]=false;
			tempList.remove(tempList.size() - 1);
		}
	}
	
}
