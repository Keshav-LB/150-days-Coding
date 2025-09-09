package com.leetcode.BinarySearch.hard;

public class ShipWithInDays {
	public static void main(String[] args) {
//		Input: weights = [1,2,3,4,5,6,7,8,9,10], days = 5
//		Output: 15
//		Explanation: A ship capacity of 15 is the minimum to ship all the packages in 5 days 
//		like this:
//			1st day: 1, 2, 3, 4, 5
//			2nd day: 6, 7
//			3rd day: 8
//			4th day: 9
//			5th day: 10
//		Note that the cargo must be shipped in the order given, 
//		so using a ship of capacity 14 and splitting the packages into parts 
//		like (2, 3, 4, 5), (1, 6, 7), (8), (9), (10) is not allowed.
		
		int[] weights1 = {1,2,3,4,5,6,7,8,9,10};
		int days1 = 5;
		int[] weights2 = {3,2,2,4,1,4};
		int days2 = 3;
		int[] weights3 = {1,2,3,1,1};
		int days3 = 4;
		System.out.println(shipWithinDays(weights1, days1));//15
		System.out.println(shipWithinDays(weights2, days2));//6
		System.out.println(shipWithinDays(weights3, days3));//3
	}
	public static int shipWithinDays(int[] weights, int days) {
		int left = 0, right = 0;
		for(int w : weights) {
			left = Math.max(left, w);
			right += w;
		}
		while(left < right) {
			int mid = left + (right - left)/2;
			if(canShip(weights, days, mid)) {
				right = mid;
			}
			else {
				left = mid+1;
			}
		}
		return left;
	}
	public static boolean canShip(int[] weights, int days, int capacity) {
		int current = 0, reqDays = 1;
		for(int w:weights) {
			if(current+w > capacity) {
				reqDays++;
				current = 0;
			}
			current += w;
		}
		return reqDays <= days;
	}
}
