package com.leetcode.Arrays.medium;

public class RotateArrayByK {
	public static void main(String[] args) {
//		Input: nums = [1,2,3,4,5,6,7], k = 3
//		Output: [5,6,7,1,2,3,4]
//		Input: nums = [-1,-100,3,99], k = 2
//		Output: [3,99,-1,-100]

		int[] nums1 = { 1, 2, 3, 4, 5, 6, 7 };
		int k1 = 3;
		int[] nums2 = { -1, -100, 3, 99 };
		int k2 = 2;

		int[] nums3 = { 1, 2, 3, 4, 5, 6, 7 };
		int k3 = 4;
		int[] nums4 = { -1, -100, 3, 99 };
		int k4 = 2;
		
		//edge case:
		int[] nums5 = { -1 };
		int k5 = 2;		//o/p:-1;
		int[] nums6 =  {1,2};
		int k6 = 7;		//o/p:2 1;

		System.out.println("Right Rotation: ");
		rotateRight(nums1, k1);
		rotateRight(nums2, k2);
		rotateRight(nums5, k5);
		rotateRight(nums6, k6);
		System.out.println("Left Rotation: ");
		rotateLeft(nums3, k3);
		rotateLeft(nums4, k4);
	}

	public static void rotateRight(int[] nums, int k) {
		k = k % nums.length;
		reverse(nums, 0, nums.length - k - 1);
		reverse(nums, nums.length - k, nums.length - 1);
		reverse(nums, 0, nums.length - 1);
		for (int num : nums) {
			System.out.print(num + " ");
		}
		System.out.println();

	}

	public static void rotateLeft(int[] nums, int k) {
		k=k%nums.length;
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
		reverse(nums, 0, nums.length - 1);
		for (int num : nums) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	public static void reverse(int[] nums, int i, int j) {
		while (i < j) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			i++;
			j--;
		}
	}
}
