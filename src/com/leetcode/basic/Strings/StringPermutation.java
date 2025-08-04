package com.leetcode.basic.Strings;

public class StringPermutation {
	public static void main(String[] args) {
		String str = "ABC";
		int left = 0;
		int right = str.length()-1;
		stringPermutation(str, left, right);
	}
	public static void stringPermutation(String str, int left, int right) {
		if(left == right) {
			System.out.println(str);
		}
		else {
			for(int i=left; i<=right; i++) {
				str = swap(str, left, i);
				stringPermutation(str, left+1, right);
				str = swap(str, left, i);
			}
		}
	}
	public static String swap(String str, int i, int j) {
		char carr[] = str.toCharArray();
		char temp = carr[i];
		carr[i] = carr[j];
		carr[j] = temp;
		return String.valueOf(carr);
	}
}
