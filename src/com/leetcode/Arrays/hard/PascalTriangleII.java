package com.leetcode.Arrays.hard;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {
	public static void main(String[] args) {
//		Input: rowIndex = 3
//		Output: [1,3,3,1]
//		Input: rowIndex = 1
//		Output: [1,1]
//		Input: rowIndex = 0
//		Output: [1]
		
		int n1 = 0, n2 = 1, n3 = 3, n4 = 5;
		System.out.println(getRow(n1)); //[1]
		System.out.println(getRow(n2)); //[1,1]
		System.out.println(getRow(n3)); //[1,3,3,1]
		System.out.println(getRow(n4)); //[1,5,10,10,5,1]
	}
	public static List<Integer> getRow(int n){
		List<Integer> row = new ArrayList<>();
		row.add(1);
		
		for(int i=1; i<=n; i++) {
			//build new row in reverse to avoid overriding values
			for(int j=i-1; j>0; j--) {
				row.set(j, row.get(j)+row.get(j-1));
			}
			row.add(1);
		}
		return row;
	}
	
}
