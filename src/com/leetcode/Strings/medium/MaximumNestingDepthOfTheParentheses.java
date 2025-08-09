package com.leetcode.Strings.medium;

public class MaximumNestingDepthOfTheParentheses {
	public static void main(String[] args) {
//		Input: s = "(1+(2*3)+((8)/4))+1"
//		Output: 3
//		Input: s = "(1)+((2))+(((3)))"
//		Output: 3
//		Input: s = "()(())((()()))"
//		Output: 3
		
		String str1 = "(1+(2*3)+((8)/4))+1";
		String str2 = "(1)+((2))+(((3)))";
		String str3 = "()(())((()()))";
		
		System.out.println(str1+" max_Depth: "+maxDepth(str1));
		System.out.println(str1+" max_Depth: "+maxDepth(str2));
		System.out.println(str1+" max_Depth: "+maxDepth(str3));
	}
	
	public static int maxDepth(String s) {
		int depth = 0;
		int maxDepth = 0;
		
		for(char c : s.toCharArray()) {
			if( c == '(') {
				depth++;
				maxDepth = Math.max(maxDepth, depth);
			}
			else if(c == ')' ) {
				depth--;
			}
		}
		return maxDepth;
	}
}
