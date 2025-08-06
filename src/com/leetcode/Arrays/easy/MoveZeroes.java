package com.leetcode.Arrays.easy;

import java.util.Arrays;

public class MoveZeroes {
	public static void main(String[] args) {
//		Input: nums = [0,1,0,3,12]
//		Output: [1,3,12,0,0]
//		Input: nums = [0]
//		Output: [0]	
		
		int []nums1 = {0,1,0,3,12};
		int []nums2 = {0};
		moveZeroes(nums1);
		moveZeroes(nums2);
	}
	public static void moveZeroes(int []nums) {
//		//1st method:
//		int j=-1;
//		for(int i=0;i<nums.length;i++) {
//			if(nums[i]==0) {
//				j=i;
//				break;
//			}
//		}
//		if(j==-1) {
//			for(int num:nums) {
//				System.out.print(num+" ");
//			}
//		}
//		for(int i=j+1;i<nums.length;i++) {
//			if(nums[i]!=0) {
//				int temp = nums[i];
//				nums[i]=nums[j];
//				nums[j]=temp;
//				j++;
//			}
//		}
//		for(int num:nums) {
//			System.out.print(num+" ");
//		}
//		System.out.println();
		
		//2nd method: 
		int n = 0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0) {
				nums[n] = nums[i];
				n++;
			}
		}
		while(n<nums.length) {
			nums[n]=0;
			n++;
		}
		for(int num: nums) {
			System.out.print(num+" ");
		}
		System.out.println();
	}
}
