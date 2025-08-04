package com.leetcode.basic.programs;

public class SwapOfTwoNum {
	public static void main(String[] args) {
		int a=15;
		int b=32;
		
		System.out.println("Before Swapping : a = "+a+ " and b = "+b);
//		int temp = a;
//		a=b;
//		b=temp;
		
//		a=a+b;
//		b=a-b;
//		a=a-b;
		
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After Swapping : a = "+a+ " and b = "+b);
		
	}
}
