package com.leetcode.BinarySearch.medium;

import java.util.Arrays;

public class FloorAndCeilInSortedArray {
	public static void main(String[] args) {
//		Input : nums =[3, 4, 4, 7, 8, 10], x= 5
//		Output: 4 7
//		Explanation: The floor of 5 in the array is 4, and the ceiling of 5 in the array is 7.
//		
//		Input : nums =[3, 4, 4, 7, 8, 10], x= 8
//		Output: 8 8
//		Explanation: The floor of 8 in the array is 8, and the ceiling of 8 in the array is also 8.
		
		int[] nums = {3, 4, 4, 7, 8, 10};
		int x1 = 5, x2 = 8, x3 = 2;
		
		System.out.println(Arrays.toString(getFloorAndCeil(nums, x1)));
		System.out.println(Arrays.toString(getFloorAndCeil(nums, x2)));
		System.out.println(Arrays.toString(getFloorAndCeil(nums, x3)));
	}
	public static int[] getFloorAndCeil(int[] nums, int x) {
		
//		int floor = -1, ceil = -1;
//		for(int i=0; i<nums.length; i++) {
//			if(nums[i]==x) {
//				return new int[] {x, x};
//			}
//			else if(nums[i]<x) {
//				floor = nums[i];
//			}
//			else if(nums[i]>x) {
//				ceil = nums[i];
//				break;
//			}
//		}
//		return new int[] {floor, ceil};
		
		int low = 0, high = nums.length - 1;
        int floor = -1, ceil = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == x) {
                return new int[]{nums[mid], nums[mid]};
            } else if (nums[mid] < x) {
                floor = nums[mid]; // candidate floor
                low = mid + 1;
            } else {
                ceil = nums[mid]; // candidate ceil
                high = mid - 1;
            }
        }
        return new int[]{floor, ceil};
	}
}
