package com.leetcode.basic.recursion;

public class Factorial {
	public static void main(String[] args) {
		int n=5;
		int sum = fact(n);
		System.out.println("Factorial of "+n+" is: "+sum);
	}
	public static int fact(int num) {
		if(num<0)
			return -1;
		if(num==0)
			return 1;
		return num*fact(num-1);
	}
}
