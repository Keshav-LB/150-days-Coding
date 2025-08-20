package com.leetcode.Arrays.misc;

public class Leetcode1855 {
	public static void main(String[] args) {
		int[] nums1 = {55,30,5,4,2}, nums2 = {100,20,10,10,5};
		int[] nums3 = {2,2,2}, nums4 = {10,10,1};
		int[] nums5 = {30,29,19,5}, nums6 = {25,25,25,25,25};
		
		System.out.println(maxDistance(nums1, nums2));
		System.out.println(maxDistance(nums3, nums4));
		System.out.println(maxDistance(nums5, nums6));
	}
	public static int maxDistance(int[] nums1, int[] nums2) {
		//BruteForce O(n*m)
//		int n = nums1.length, m = nums2.length;
//		int max = 0;
//		
//		for(int i=0; i<n; i++) {
//			for(int j=i; j<m;j++) {
//				if(nums1[i]<=nums2[j]) {
//					max = Math.max(max, j-i);
//				}
//			}
//		}
//		return max;
		
		//two pointers approach O(m+n)
		int n = nums1.length, m = nums2.length;
		int i=0, j=0, max=0;
		
		while(i < n && j < m) {
			if(nums1[i]<=nums2[j]) {
				max = Math.max(max, j-i);
				j++;
			}
			else {
				i++;
				if(i>j) j=i;
			}
		}
		return max;
		
	}
}
