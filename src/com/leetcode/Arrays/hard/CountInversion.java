package com.leetcode.Arrays.hard;

public class CountInversion {
	public static void main(String[] args) {
		
		int[] nums1 = {1, 2, 3, 4, 5};
		int[] nums2 = {5, 4, 3, 2, 1};
		int[] nums3 = {5, 3, 2, 1, 4};
		
		System.out.println(mergeSortAndCount(nums1, 0, nums1.length-1));//0
		System.out.println(mergeSortAndCount(nums2, 0, nums2.length-1));//10
		System.out.println(mergeSortAndCount(nums3, 0, nums3.length-1));//7
	}
	public static int mergeSortAndCount(int[] arr, int l, int r) {
        int count = 0;
        if (l < r) {
            int m = (l + r) / 2;

            // Left half
            count += mergeSortAndCount(arr, l, m);

            // Right half
            count += mergeSortAndCount(arr, m + 1, r);

            // Merge step and count inversions
            count += mergeAndCount(arr, l, m, r);
        }
        return count;
    }

    private static int mergeAndCount(int[] arr, int l, int m, int r) {
        int[] left = new int[m - l + 1];
        int[] right = new int[r - m];

        for (int i = 0; i < left.length; i++)
            left[i] = arr[l + i];
        for (int j = 0; j < right.length; j++)
            right[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l, swaps = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
                swaps += (left.length - i); // ✅ important step
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }

        return swaps;
    }
}
