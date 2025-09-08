package com.leetcode.BinarySearch.easy;

public class CountOccurrences {
	public static void main(String[] args) {
//		Input: arr = [0, 0, 1, 1, 1, 2, 3], target = 1
//		Output: 3
//		Explanation: The number 1 appears 3 times in the array.
//		
//		Input: arr = [5, 5, 5, 5, 5, 5], target = 5
//		Output: 6
//		Explanation: All elements in the array are 5, so the target appears 6 times.
		
		int[] nums1 = {0, 0, 1, 1, 1, 2, 3};
		int target1 = 1;
		
		int[] nums2 = {5,5,5,5,5,5};
		int target2 = 5;
		
		System.out.println(countOccurrences(nums1, target1));
		System.out.println(countOccurrences(nums2, target2));
		
	}
	public static int countOccurrences(int[] nums, int target) {
//		int count = 0;
//		for(int num : nums) {
//			if(num==target) {
//				count++;
//			}
//		}
//		return count;
		
		int first = findFirst(nums, target);
		if(first == -1) return 0;	//element not found!
		int last = findLast(nums, target);
		return last-first + 1;
	}
	public static int findFirst(int[] nums, int target) {
		int l = 0, h = nums.length-1, ans = -1;
		while(l<=h) {
			int mid = l+(h-l)/2;
			if(nums[mid]==target) {
				ans = mid;
				h = mid-1;
			}
			else if(nums[mid]<target) {
				l = mid+1;
			}
			else {
				h = mid-1;
			}
		}
		return ans;
	}
	public static int findLast(int[] nums, int target) {
		int l = 0, h = nums.length-1, ans = -1;
		while(l<=h) {
			int mid = l+(h-l)/2;
			if(nums[mid]==target) {
				ans = mid;
				l = mid + 1;
			}
			else if(nums[mid]>target) {
				h = mid-1;
			}
			else {
				l = mid+1;
			}
		}
		return ans;
	}
}
