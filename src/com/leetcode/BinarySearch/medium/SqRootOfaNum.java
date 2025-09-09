package com.leetcode.BinarySearch.medium;

public class SqRootOfaNum {
	public static void main(String[] args) {
//		Input: n = 36
//		Output: 6
//		Explanation: 6 is the square root of 36.
//		Input: n = 28
//		Output: 5
//		Explanation: The square root of 28 is approximately 5.292. So, the floor value will be 5.
		
		int n1 = 36, n2 = 28;
		System.out.println(floorSqrt(n1));
		System.out.println(floorSqrt(n2));
	}
	public static long floorSqrt(int n) {
		if(n==0 || n==1) return n;
		int low = 1, high = n, ans=0;
		while(low <= high) {
			int mid = low+(high-low)/2;
			
			if((long)mid * mid == n) {
				return mid;
			}
			else if((long)mid*mid < n) {
				ans = mid; //possible answer
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		return ans;
	}
}
