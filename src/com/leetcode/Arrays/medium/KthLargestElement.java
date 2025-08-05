package com.leetcode.Arrays.medium;

import java.util.PriorityQueue;

public class KthLargestElement {
	public static void main(String[] args) {
		int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
		int k = 5;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int num : nums) {
			pq.add(num);
			if(pq.size()>k) {
				pq.poll();
			}
		}
		
		System.out.println(k+" largest element : "+pq.peek());
	}
}
