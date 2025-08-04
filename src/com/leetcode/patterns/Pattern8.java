package com.leetcode.patterns;

public class Pattern8 {
	public static void main(String[] args) {
//		2 
//		3 5 
//		7 11 13 
//		17 19 23 29
		
		int num=2;
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;) {
				if(isPrime(num)) {
					System.out.print(num+" ");
					j++;
				}
				num++;
			}
			System.out.println();
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
