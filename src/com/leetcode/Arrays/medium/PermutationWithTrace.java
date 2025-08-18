package com.leetcode.Arrays.medium;

import java.util.*;
import java.util.stream.Collectors;

public class PermutationWithTrace {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, 0, res);
        return res;
    }

    private static void backtrack(int[] nums, int start, List<List<Integer>> res) {
        System.out.println(indent(start) + "enter start=" + start + "  " + Arrays.toString(nums));

        if (start == nums.length) {
            List<Integer> temp = Arrays.stream(nums).boxed().collect(Collectors.toList());
            res.add(temp);
            System.out.println(indent(start) + "ADD " + temp);
            return;
        }

        for (int i = start; i < nums.length; i++) {
            System.out.println(indent(start) + "choose i=" + i + " → swap(" + start + "," + i + ")");
            swap(nums, start, i);

            backtrack(nums, start + 1, res);

            System.out.println(indent(start) + "un-choose i=" + i + " → swap(" + start + "," + i + ")");
            swap(nums, start, i); // restore
        }

        System.out.println(indent(start) + "exit  start=" + start + "  " + Arrays.toString(nums));
    }

    private static void swap(int[] a, int i, int j) {
        int t = a[i]; a[i] = a[j]; a[j] = t;
    }

    private static String indent(int depth) {
        return "  ".repeat(depth);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> ans = permute(nums);
        System.out.println("RESULT: " + ans);
    }
}
