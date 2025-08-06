package com.leetcode.Arrays.misc;

public class ArrayIsSortedAndRotated {
	public static void main(String[] args) {
//		Input: nums = [3,4,5,1,2]
//		Output: true
//		Explanation: [1,2,3,4,5] is the original sorted array.
//		You can rotate the array by x = 3 positions to begin on the element of value 3: [3,4,5,1,2].
//		
//		Input: nums = [2,1,3,4]
//		Output: false
//		Explanation: There is no sorted array once rotated that can make nums.
		
		int []nums1 = {3,4,5,1,2};
		int []nums2 = {2,1,3,4};
		
		System.out.println(check(nums1));
		System.out.println(check(nums2));
	}
	
	public static boolean check(int nums[]) {
		if(nums.length < 2) {
			return true;
		}
		int count = 0;
		for(int i=0;i<nums.length;i++) {
			int next = (i+1)%nums.length;
			if(nums[i]>nums[next]) {
				count++;
			}
		}
		return count<=1;
		
	}
}
