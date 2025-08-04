package com.leetcode.basic.Strings;

public class CharExpansion1 {
	public static void main(String[] args) {
//		A1B2C3D4 ---> ABBCCCDDD
		String str = "A1B2C3D4";
		
		for(int i=0;i<str.length();i++) {
			char current = str.charAt(i);
			if(Character.isAlphabetic(current)) {
				System.out.print(current);
			}
			else {
				int num = Character.getNumericValue(current);
				for(int j=1;j<num;j++) {
					System.out.print(str.charAt(i-1));
				}
			}
		}
	
	}
}
