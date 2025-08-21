package com.leetcode.Matrix.medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	public static void main(String[] args) {
//		Input: matrix = [[1,2,3,4],
//		                 [5,6,7,8],
//		                 [9,10,11,12]]
//		Output: [1,2,3,4,8,12,11,10,9,5,6,7]
//		Input: matrix =[[1,2,3,4],
//		         [5,6,7,8],
//		         [9,10,11,12],
//		         [13,14,15,16],
//		         [17,18,19,20],
//		         [21,22,23,24]]
//		Output: [1,2,3,4,8,12,16,20,24,23,22,21,17,13,9,5,6,7,11,15,19,18,14,10]
				
		int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrix2 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		int[][] matrix3 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20},{21,22,23,24}};

		System.out.println(spiralOrder(matrix1));
		System.out.println(spiralOrder(matrix2));
		System.out.println(spiralOrder(matrix3));
	}

	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> result = new ArrayList<>();
		int top = 0;
		int bottom = matrix.length - 1;
		int left = 0;
		int right = matrix[0].length - 1;

		while (top <= bottom && left <= right) {
			for (int i = left; i <= right; i++) {
				result.add(matrix[top][i]);
			}
			top++;
			for (int i = top; i <= bottom; i++) {
				result.add(matrix[i][right]);
			}
			right--;
			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					result.add(matrix[bottom][i]);
				}
				bottom--;
			}
			if (left <= right) {
				for (int i = bottom; i >= top; i--) {
					result.add(matrix[i][left]);
				}
				left++;
			}
		}
		return result;
	}
}
