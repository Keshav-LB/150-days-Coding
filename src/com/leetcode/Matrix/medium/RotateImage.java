package com.leetcode.Matrix.medium;

import java.util.Arrays;

public class RotateImage {
	public static void main(String[] args) {
//		Input: matrix = [[1,2,3],
//		                 [4,5,6],
//		                 [7,8,9]]
//		Output: [[7,4,1],[8,5,2],[9,6,3]]
//		Input: matrix = [[5,1,9,11],
//		                 [2,4,8,10],
//		                 [13,3,6,7],
//		                 [15,14,12,16]]
//		Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
		
		int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] matrix2 = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
		
		rotate(matrix1);
		rotate(matrix2);
		System.out.println(Arrays.deepToString(matrix1));
		System.out.println(Arrays.deepToString(matrix2));
		
	}
	public static void rotate(int[][] matrix) {
		//swap rows and col
		for(int i=0;i<matrix.length; i++) {
			for(int j=i; j<matrix.length; j++) {
				int temp = matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
		}
		//reverse each row
		for(int i=0;i<matrix.length;i++) {
			int start=0;
			int end = matrix.length-1;
			
			while(start<end) {
				int temp = matrix[i][start];
				matrix[i][start] = matrix[i][end];
				matrix[i][end] = temp;
				start++;
				end--;
			}
		}
	}
}
