package com.leetcode.BinarySearch.hard;

public class KokoEatingBananas {
	public static void main(String[] args) {
//		Input: piles = [3,6,7,11], h = 8
//				Output: 4
//		Input: piles = [30,11,23,4,20], h = 5
//				Output: 30
//		Input: piles = [30,11,23,4,20], h = 6
//				Output: 23		
		
		int[] piles1 = {3, 6, 7, 11};
		int h1 = 8;
		int[] piles2 = {30, 11, 23, 4, 20};
		int h2 = 5;
		int[] piles3 = {30, 11, 23, 4, 20};
		int h3 = 6;
		
		System.out.println(minEatingSpeed(piles1, h1));
		System.out.println(minEatingSpeed(piles2, h2));
		System.out.println(minEatingSpeed(piles3, h3));
	}
	public static int minEatingSpeed(int[] piles, int h) {
		int low = 1, high = 0;
		
		for(int pile:piles) {
			high = Math.max(high, pile);
		}
		while(low<high) {
			int mid = low + (high-low)/2;
			
			if(canEatAll(piles, mid, h)) {
				high = mid;
			}
			else {
				low = mid+1;
			}
		}
		return low;
	}
	public static boolean canEatAll(int[] piles, int speed, int h) {
		long hours = 0;
		for(int pile:piles) {
			hours+=(pile + speed -1)/speed;
			if(hours > h) return false;
		}
		return hours<=h;
	}
}
