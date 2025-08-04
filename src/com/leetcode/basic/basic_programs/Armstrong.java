package com.leetcode.basic.basic_programs;

public class Armstrong {
	public static void main(String[] args) {
		int num = 153,sum=0;
		int temp=num;
		while(num>0) {
			int rem = num%10;
			sum+=Math.pow(rem, 3);
			num/=10;
		}
		if(temp == sum) {
			System.out.print("Armstrong num.");
		}
		else {
			System.out.println("Not a Armstrong");
		}
	}
}
