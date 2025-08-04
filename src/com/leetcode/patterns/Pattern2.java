package com.leetcode.patterns;

public class Pattern2 {
	public static void main(String[] args) {
//		1 2 3 4 
//		1 2 3 4 
//		1 2 3 4 
//		1 2 3 4 
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("-------------------");
		
//		4 4 4 4 
//		3 3 3 3 
//		2 2 2 2 
//		1 1 1 1
		
		for(int i=4;i>=1;i--) {
			for(int j=1;j<=4;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("--------------------");
		
//		D D D D 
//		C C C C 
//		B B B B 
//		A A A A 
		
		for(char c = 'D'; c>='A';c--) {
			for(int i=1;i<=4;i++) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
		System.out.println("--------------------");
		
//		* * * * 
//		* - - * 
//		* - - * 
//		* * * *
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i==1 || i==4 || j==1 || j==4) {
					System.out.print("*"+" ");
				}
				else
					System.out.print("-"+" ");
			}
			System.out.println();
		}
		System.out.println("--------------------");
		
//		4 3 2 1 
//		4 3 2 1 
//		4 3 2 1 
//		4 3 2 1 
		for(int i=1;i<=4;i++) {
			for(int j=4;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
