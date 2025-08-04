package com.leetcode.patterns;

public class Pattern7 {
	public static void main(String[] args) {
//		1 1 1 
//		1 0 1 
//		1 1 1
		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				if(i==1||i==3||j==1||j==3) {
					System.out.print("1 ");
				}
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
		System.out.println("----------------------");
		
//	    *     
//	    *     
//	* * * * * 
//	    *     
//	    *  
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==3||j==3) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
