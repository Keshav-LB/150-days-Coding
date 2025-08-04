package com.leetcode.basic.Strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueAndDuplicateChars {
	public static void main(String[] args) {
		String str = "google";
		Set<Character> unique = new LinkedHashSet<>();
		Set<Character> duplicate = new LinkedHashSet<>();
		
		for(int i=0;i<str.length();i++) {
			char current = str.charAt(i);
			if(!unique.contains(current)) {
				unique.add(current);
			}
			else
				duplicate.add(current);
		}
		
		System.out.println("Unique : "+unique);
		System.out.println("Duplicate : "+duplicate);
	}
}
