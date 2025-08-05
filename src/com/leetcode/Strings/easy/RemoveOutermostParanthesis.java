package com.leetcode.Strings.easy;

import java.util.Stack;

public class RemoveOutermostParanthesis {
	public static void main(String[] args) {		
//		Input: s = "(()())(())"
//				Output: "()()()"
//					
//		Input: s = "(()())(())(()(()))"
//				Output: "()()()()(())"
//						
//		Input: s = "()()"
//				Output: ""
		
		String str1 = "(()())(())";
		String str2 = "(()())(())(()(()))";
		String str3 = "()()";
		
		System.out.println(str1+" : "+removeOuterParentheses(str1));
		System.out.println(str2+" : "+removeOuterParentheses(str2));
		System.out.println(str3+" : "+removeOuterParentheses(str3));
		
	}
	
	public static String removeOuterParentheses(String str) {
		StringBuilder result = new StringBuilder();
		char carr[] = str.toCharArray();
		Stack<Character> stack = new Stack<>();
		
		for(char c : carr) {
			if( c == '(') {
				if(!stack.isEmpty()) {
					result.append(c);
				}
				stack.push(c);
			}
			else if(c == ')') {
				stack.pop();
				if(!stack.isEmpty()) {
					result.append(c);
				}
			}
		}
		return result.toString();
	}
}
