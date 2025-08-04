package com.leetcode.patterns;

public class Pattern10 {
	public static void main(String[] args) {
//		  *   *   *  
//		 * * * * * * 
//		*   *   *   *
		int row=3,col=13;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				if((i+j)%4==0 || (i==2 && (i+j)%2==0)) {
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
