package com.leetcode.BinarySearch.hard;

public class MinDaysToMakeMBouquets {
	public static void main(String[] args) {
		int[] bloomDay1 = {1,10,3,10,2};
		int m1 = 3, k1 = 1;
		int[] bloomDay2 = {1,10,3,10,2};
		int m2 = 3, k2 = 2;
		int[] bloomDay3 = {7,7,7,7,12,7,7};
		int m3 = 2, k3 = 3;
		
		System.out.println(minDays(bloomDay1, m1, k1));
		System.out.println(minDays(bloomDay2, m2, k2));
		System.out.println(minDays(bloomDay3, m3, k3));
	}
	public static int minDays(int[] bloomDay, int m, int k) {
		long total = (long) m*k;
		if(total > bloomDay.length) return -1; // not enough flowers;
		int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;
		for(int b:bloomDay) {
			low = Math.min(low, b);
			high = Math.max(high, b);
		}
		
		while(low < high) {
			int mid = low+(high-low)/2;
			
			if(canMake(bloomDay, m, k, mid)) {
				high = mid;
			}
			else {
				low = mid+1;
			}
		}
		return low;
	}
	public static boolean canMake(int[] bloomDay, int m, int k, int days) {
		int count = 0;
		int bouquets = 0;
		
		for(int b: bloomDay) {
			if(b<=days) {
				count++;
				if(count == k) {
					bouquets++;
					count = 0;
				}
			}
			else {
				count = 0;
			}
		}
		return bouquets >=m;
	}
}
