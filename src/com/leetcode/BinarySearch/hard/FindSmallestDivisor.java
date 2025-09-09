package com.leetcode.BinarySearch.hard;

public class FindSmallestDivisor {
	public static void main(String[] args) {
		int[] nums1 = {1,2,5,9};
		int threshold1 = 6;
		int[] nums2 = {44,22,33,11,1};
		int threshold2 = 5;
		
		System.out.println(smallestDivisor(nums1, threshold1));//5
		System.out.println(smallestDivisor(nums2, threshold2));//44
	}
	public static int smallestDivisor(int[] nums, int threshold) {
		int low = 1, high = 0;
		
		for(int num:nums) {
			high = Math.max(high, num);
		}
		
		while(low<high) {
			int mid = low+(high-low)/2;
			
			if(canDivide(nums, mid, threshold)) {
				high = mid;
			}
			else {
				low = mid+1;
			}
		}
		return low;
	}
	public static boolean canDivide(int[] nums, int divisor, int threshold) {
		int sum = 0;
		for(int num:nums) {
			sum+=(num+divisor-1)/divisor;
			if(sum > threshold) return false;
		}
		return sum<=threshold;
	}
}
