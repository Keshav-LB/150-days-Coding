package com.leetcode.BinarySearch.medium;

import java.util.ArrayList;
import java.util.Arrays;

public class FindRotations {
	public static void main(String[] args) {
//		Input : nums = [4, 5, 6, 7, 0, 1, 2, 3]
//		Output: 4
//		Explanation: The original array should be [0, 1, 2, 3, 4, 5, 6, 7]. 
//		So, we can notice that the array has been rotated 4 times.
		
//		Input: nums = [3, 4, 5, 1, 2]
//		Output: 3
//		Explanation: The original array should be [1, 2, 3, 4, 5]. 
//		So, we can notice that the array has been rotated 3 times.
		
		//int[] nums1 = {4, 5, 6, 7, 0, 1, 2, 3};
		//int[] nums2 = {3, 4, 5, 1, 2};
		//int[] nums3 = {8, 9, 10, 11, 4, 5, 6};
		
		ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 0, 1, 2, 3));
		ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(3, 4, 5, 1, 2));
		ArrayList<Integer> nums3 = new ArrayList<>(Arrays.asList(8, 9, 10, 11, 4, 5, 6));
		
		System.out.println(findKRotation(nums1));
		System.out.println(findKRotation(nums2));
		System.out.println(findKRotation(nums3));
		
	}
	public static int findKRotation(ArrayList<Integer> nums) {
		int low = 0, high = nums.size()-1;
		
		while(low<high) {
			int mid = low+(high-low)/2;
			
			if(nums.get(mid) > nums.get(high)) {
				low = mid+1;
			}
			else {
				high = mid;
			}
		}
		return low;
	}
}
