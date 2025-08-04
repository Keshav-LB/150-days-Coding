package com.leetcode.patterns;

public class Pattern9 {
	public static void main(String[] args) {
//	    1
//	   2 3
//	  4 5 6
//	 7 8 9 10
		int num=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=(4-i);j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(num+++" ");
			}
			System.out.println();
		}
	}
}
