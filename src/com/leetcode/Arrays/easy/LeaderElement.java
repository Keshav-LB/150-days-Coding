package com.leetcode.Arrays.easy;

import java.util.ArrayList;
import java.util.Collections;

public class LeaderElement {
	public static void main(String[] args) {
		int []nums1 = {1,2,5,3,1,2};
		int []nums2 = {-3,4,5,1,-4,-5};
		
		System.out.println(leaders(nums1));
		System.out.println(leaders(nums2));
	}
	public static ArrayList<Integer> leaders(int []nums){
		
		ArrayList<Integer> result = new ArrayList<>();
		int leader = nums[nums.length-1];
		result.add(leader);
		for(int i=nums.length-2;i>=0;i--) {
			if(nums[i]>leader) {
				leader = nums[i];
				result.add(leader);
			}
		}
		Collections.reverse(result);
		return result;
	}
}
