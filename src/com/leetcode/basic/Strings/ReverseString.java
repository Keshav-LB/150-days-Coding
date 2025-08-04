package com.leetcode.basic.Strings;

public class ReverseString {
	public static void main(String[] args) {
////		hello
////		olleh 
//		String str = "Hello";		
////		StringBuilder sb = new StringBuilder(str);
////		sb.reverse();
////		System.out.println(sb);
//		String rev = "";
//		for(int i=str.length()-1;i>=0;i--) {
//			rev+=str.charAt(i);
//		}
//		System.out.println(rev);
		
		System.out.println("----------------");
		
////		Input: Hello keshav!
////		Output: keshav! Hello
//		String str = "Hello keshav!";
//		String rev = "";
//		String sarr[] = str.split(" ");
//		for(int i=sarr.length-1;i>=0;i--) {
//			rev +=sarr[i]+" ";
//		}
//		System.out.println(rev);
		
		System.out.println("----------------");
		
//		This is java 
//		sihT si avaj		
		String str = "This is java";
		String rev = "";
		String sarr[] = str.split(" ");
		for(String s:sarr) {
			char carr[] = s.toCharArray();
			for(int i=carr.length-1;i>=0;i--) {
				rev+=carr[i];
			}
			rev+=" ";
		}
		System.out.println(rev);
		
	}
}
