package com.leetcode.Arrays.hard;

import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {
	public static void main(String[] args) {
//		Input: n = 3, k = 3
//		Output: "213"
//		Input: n = 4, k = 9
//		Output: "2314"
//		Input: n = 3, k = 1
//		Output: "123"
		
		int n1 = 3, k1 = 3;
		int n2 = 4, k2 = 9;
		int n3 = 3, k3 = 1;
		
		System.out.println(getPermutation(n1,k1));
		System.out.println(getPermutation(n2,k2));
		System.out.println(getPermutation(n3,k3));
	}
	public static String getPermutation(int n, int k) {
		List<Integer> numbers = new ArrayList<>();
		int []fact = new int[n+1];;
		fact[0] = 1;
		
		//precompute factorials
		for(int i=1;i<=n;i++) {
			fact[i] = fact[i-1] * i;
			numbers.add(i);
		}
		
		k--;	// for 0-based indexing
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=n; i>=1; i--) {
			int index = k/fact[i-1];	//find index
			sb.append(numbers.get(index));	//picked number
			numbers.remove(index);	//remove used number
			k=k%fact[i-1];	// update k
		}
		
		return sb.toString();
	}
}

