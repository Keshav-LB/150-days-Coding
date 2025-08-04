package com.leetcode.patterns;

public class Pattern3 {
	public static void main(String[] args) {
//		1 2 3 4 4 3 2 1 
//		1 2 3 - - 3 2 1 
//		1 2 - - - - 2 1 
//		1 - - - - - - 1 
//		1 - - - - - - 1 
//		1 2 - - - - 2 1 
//		1 2 3 - - 3 2 1 
//		1 2 3 4 4 3 2 1 
		
		for(int i=4;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			for(int j=1;j<=(4-i)*2;j++) {
				System.out.print("- ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			for(int j=1;j<=(4-i)*2;j++) {
				System.out.print("- ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
