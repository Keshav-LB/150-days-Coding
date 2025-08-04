package com.leetcode.basic.programs;

public class SumOfDigits {
	public static void main(String[] args) {
		int num = 123;
		int sum=0,rem;
		while(num>0) {
			rem=num%10;
			sum+=rem;
			num/=10;
		}
		System.out.println("sum of digits : "+sum);
	}
}
