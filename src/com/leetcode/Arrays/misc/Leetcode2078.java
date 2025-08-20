package com.leetcode.Arrays.misc;

public class Leetcode2078 {
	public static void main(String[] args) {
//		Input: colors = [1,1,1,6,1,1,1]
//		Output: 3
//		Input: colors = [1,8,3,8,3]
//		Output: 4
//		Input: colors = [0,1]
//		Output: 1
				
		int []colors1 = {1,1,1,6,1,1,1};
		int []colors2 = {1,8,3,8,3};
		int []colors3 = {0, 1};
		int []colors4 = {4,4,4,11,4,4,11,4,4,4,4,4};
		
		System.out.println(maxDistance(colors1));
		System.out.println(maxDistance(colors2));
		System.out.println(maxDistance(colors3));
		System.out.println(maxDistance(colors4));
	}
	public static int maxDistance(int[] colors) {
		
		int max = 0;
		for(int i=colors.length-1; i>=0;i--) {
			if(colors[i]!=colors[0]) {
				max = Math.max(max, i-0);
				break;
			}
		}
		
		for(int i=0; i<colors.length;i++) {
			if(colors[i] != colors[colors.length-1]) {
				max = Math.max(max, (colors.length-1)-i);
				break;
			}
		}
		
		return max;
	}
}
