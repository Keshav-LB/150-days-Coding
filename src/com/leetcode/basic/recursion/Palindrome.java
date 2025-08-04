package com.leetcode.basic.recursion;

public class Palindrome {
	public static void main(String[] args) {
		int num=121;
		int temp = num;
		int rev=0;
		
		if(isPalindrome(num, temp, rev)) {
			System.out.println("Palindrome!");
		}
		else
			System.out.println("Not a Palindrome!");
	}
	
	public static boolean isPalindrome(int num, int temp, int rev) {
		if(num == 0) {
			return temp==rev;
		}
		rev=rev*10+num%10;
		return isPalindrome(num/10, temp, rev);
	}
}
