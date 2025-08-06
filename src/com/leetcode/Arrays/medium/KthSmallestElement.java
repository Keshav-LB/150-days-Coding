package com.leetcode.Arrays.medium;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {
	public static void main(String[] args) {
		int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
		int k = 4;
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int num : nums) {
			pq.add(num);	
			if(pq.size()>k) {
				pq.poll();
			}
		}
		System.out.println(pq.peek());
	}
}
