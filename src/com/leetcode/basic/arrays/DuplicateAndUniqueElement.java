package com.leetcode.basic.arrays;

import java.util.LinkedHashSet;

public class DuplicateAndUniqueElement {
	public static void main(String[] args) {
		int[] arr={4,3,7,1,9,3,7,6,4};
		
		LinkedHashSet<Integer> unique = new LinkedHashSet<>();
		LinkedHashSet<Integer> duplicate = new LinkedHashSet<>();
		
		for(int num:arr) {
			if(!unique.contains(num)) {
				unique.add(num);
			}
			else {
				duplicate.add(num);
			}
		}
		System.out.println("Unique Elements: "+unique);
		System.out.println("Duplicate Elements: "+duplicate);
		
	}
}
