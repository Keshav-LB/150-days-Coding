package com.leetcode.BinarySearch.medium;

public class NthRootOfaNum {
	public static void main(String[] args) {
//		Input: N = 3, M = 27
//		Output: 3
//				Explanation: The cube root of 27 is equal to 3.
//		Input: N = 4, M = 69
//		Output:-1
//				Explanation: The 4th root of 69 does not exist. So, the answer is -1.
		
		int n1 = 3, m1 = 27;
		int n2 = 4, m2 = 69;
		System.out.println(nthRoot(n1, m1));//3
		System.out.println(nthRoot(n2, m2));//-1
		System.out.println(nthRoot(2, 16)); // 4
        System.out.println(nthRoot(5, 243)); // 3
		
	}
	public static int nthRoot(int n, int m) {
		int low = 1, high = m;
		while(low<=high) {
			int mid = low+(high-low)/2;
			
			long power = power(mid, n, m);
			
			if(power==m) {
				return mid;
			}
			else if(power < m) {
				low = mid+1;
			}
			else {
				high = mid -1;
			}
		}
		return -1;
	}
	//helper function to cal mid^n(but stops if exceed m)
	public static long power(int base, int exp, int limit) {
		long res = 1;
		for(int i=1; i<=exp; i++) {
			res *= base;
			if(res > limit) return res;
		}
		return res;
	}
}
