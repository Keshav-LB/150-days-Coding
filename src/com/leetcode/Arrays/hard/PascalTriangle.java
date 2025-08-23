package com.leetcode.Arrays.hard;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	public static void main(String[] args) {
//		Input: numRows = 5
//		Output:[[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]	
//				 [1]
//				[1,1]
//			   [1,2,1]
//			  [1,3,3,1]
//			 [1,4,6,4,1]
//		Input: numRows = 1
//		Output: [[1]]
		int numRows1 = 5, numRows2 = 1;
		
		System.out.println(generate(numRows1));
		System.out.println(generate(numRows2));
	}
	public static List<List<Integer>> generate(int numRows){
		  List<List<Integer>> triangle = new ArrayList<>();

	        // First row is always [1]
	        triangle.add(new ArrayList<>());
	        triangle.get(0).add(1);

	        // Build rows from 2nd row onwards
	        for (int i = 1; i < numRows; i++) {
	            List<Integer> row = new ArrayList<>();
	            List<Integer> prevRow = triangle.get(i - 1);

	            // First element is always 1
	            row.add(1);

	            // Middle elements
	            for (int j = 1; j < i; j++) {
	                row.add(prevRow.get(j - 1) + prevRow.get(j));
	            }

	            // Last element is always 1
	            row.add(1);

	            triangle.add(row);
	        }
	        return triangle;
	}
}
