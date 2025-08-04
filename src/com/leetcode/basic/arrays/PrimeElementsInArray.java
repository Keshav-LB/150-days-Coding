package com.leetcode.basic.arrays;

public class PrimeElementsInArray {
	public static void main(String[] args) {
		int[] arr={5,9,13,3,17,20,4};
		for(int num:arr) {
			if(isPrime(num)) {
				System.out.print(num+" ");
			}
		}
	}
	public static boolean isPrime(int num) {
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
}
