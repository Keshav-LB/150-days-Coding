package com.leetcode.basic.programs;

public class FirstNPrimeNumbers {
	
	public static void main(String[] args) {
		int num=20;
		for(int i=1;i<=num;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
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
