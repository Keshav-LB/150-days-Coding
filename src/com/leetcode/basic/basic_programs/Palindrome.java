package com.leetcode.basic.basic_programs;

public class Palindrome {
	public static void main(String[] args) {
		int num = 15351;
		int temp=num;
		int rem, rev=0;
		while(num>0) {
			rem = num%10;
			rev=rev*10+rem;
			num/=10;
		}
		if(temp==rev)
			System.out.print("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}
}
