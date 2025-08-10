package com.leetcode.Arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnionOfTwoSortedArrays {
	public static void main(String[] args) {
//		Input: nums1 = [1, 2, 3, 4, 5], nums2 = [1, 2, 7]
//		Output: [1, 2, 3, 4, 5, 7]
//		Explanation: The elements 1, 2 are common to both, 3, 4, 5 are from nums1 
//		and 7 is from nums2
//		
//		Input: nums1 = [3, 4, 6, 7, 9, 9], nums2 = [1, 5, 7, 8, 8]
//		Output: [1, 3, 4, 5, 6, 7, 8, 9]
//		Explanation: The element 7 is common to both, 3, 4, 6, 9 are from nums1 
//		and 1, 5, 8 is from nums2
		
		int []nums1 = {1,2,3,4,5};
		int []nums2 = {1,2,7};
		
		int []nums3 = {3, 4, 6, 7, 9, 9};
		int []nums4 = {1, 5, 7, 8, 8};
		
		System.out.println(Arrays.toString(unionArray(nums1, nums2)));
		System.out.println(Arrays.toString(unionArray(nums3, nums4)));
	}
	public static int[] unionArray(int []nums1, int []nums2) {
		List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            int val;
            if (nums1[i] < nums2[j]) {
                val = nums1[i++];
            } else if (nums1[i] > nums2[j]) {
                val = nums2[j++];
            } else { // equal
                val = nums1[i];
                i++;
                j++;
            }

            if (result.isEmpty() || result.get(result.size() - 1) != val) {
                result.add(val);
            }
        }

        // Remaining elements from nums1
        while (i < nums1.length) {
            if (result.isEmpty() || result.get(result.size() - 1) != nums1[i]) {
                result.add(nums1[i]);
            }
            i++;
        }

        // Remaining elements from nums2
        while (j < nums2.length) {
            if (result.isEmpty() || result.get(result.size() - 1) != nums2[j]) {
                result.add(nums2[j]);
            }
            j++;
        }

        // Convert List to array
        return result.stream().mapToInt(Integer::intValue).toArray();
	}
}
