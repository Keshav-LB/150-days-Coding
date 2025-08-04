package com.leetcode.basic.Strings;

public class CharContractions {
	public static void main(String[] args) {
//		ABBCCCDDD ---> A1B2C3D4
		String str = "ABBCCCDDDD";
		String res = "";
		
		for(int i=0;i<str.length();i++) {
			char current = str.charAt(i);
			res +=current;
			int count = 1;
			while(i+1<str.length() && str.charAt(i+1)==current) {
				i++;
				count++;
			}
			res+=count;
		}
		System.out.println(res);
	}
}
