package com.leetcode.basic.programs;

public class GreatestAmong3nums {
	public static void main(String[] args) {
		int a=13,b=45,c=32;
		
		int max = (a>b)?((a>c)?a:c):
						((b>c)?b:c);
		System.out.println("max = "+max);
	}
}
