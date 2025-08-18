package com.leetcode.Strings.misc;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations {
	public static void main(String[] args) {
		String s = "abc";
		char []carr = s.toCharArray();
		List<List<Character>> result = permute(carr);
		System.out.println(result);
	}
	public static List<List<Character>> permute(char[] carr){
		List<List<Character>> result = new ArrayList<List<Character>>();
		backtrack(carr, 0, result);
		return result;
	}
	public static void backtrack(char []carr, int start, List<List<Character>> result) {
		if(start == carr.length) {
			List<Character> temp = new ArrayList<Character>();
			for(char c : carr) {
				temp.add(c);
			}
			result.add(temp);
			return;
		}
		for(int i=start; i<carr.length;i++) {
			swap(carr, start, i);
			backtrack(carr, start+1, result);
			swap(carr, start, i);
		}
	}
	public static void swap(char []carr, int i, int j) {
		char temp = carr[i];
		carr[i] = carr[j];
		carr[j] = temp;
	}
}
