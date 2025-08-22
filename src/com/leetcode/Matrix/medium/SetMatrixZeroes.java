package com.leetcode.Matrix.medium;

import java.util.Arrays;

public class SetMatrixZeroes {
	public static void main(String[] args) {
//		Input: matrix = [[1,1,1],
//		                 [1,0,1],
//		                 [1,1,1]]
//		        Output: [[1,0,1],
//		                 [0,0,0],
//		                 [1,0,1]]
//		Input: matrix = [[0,1,2,0],
//		                 [3,4,5,2],
//		                 [1,3,1,5]]
//				Output: [[0,0,0,0],
//				         [0,4,5,0],
//				         [0,3,1,0]]
		
		int[][] matrix1 = {{1,1,1},{1,0,1},{1,1,1}};
		int[][] matrix2 = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		
		setZeroes(matrix1);
		setZeroes(matrix2);	
//		System.out.println(Arrays.deepToString(matrix1));
//		System.out.println(Arrays.deepToString(matrix2));
		display(matrix1);
		display(matrix2);
	}
	public static void display(int[][] matrix) {
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void setZeroes(int[][] matrix) {
		int rowLen = matrix.length;
		int colLen = matrix[0].length;
		boolean firstRow = false;
		boolean firstCol = false;
		//column
		for(int i=0; i<rowLen; i++) {
			if(matrix[i][0]==0) {
				firstCol=true;
				break;
			}
		}
		//row
		for(int i=0; i<colLen; i++) {
			if(matrix[0][i]==0) {
				firstRow=true;
				break;
			}
		}
		//markZeroes
		for(int i=1; i<rowLen; i++) {
			for(int j=1; j<colLen; j++) {
				if(matrix[i][j]==0) {
					matrix[i][0]=0;
					matrix[0][j]=0;
				}
			}
		}
		//set zeroes
		for(int i=1; i<rowLen; i++) {
			for(int j=1; j<colLen; j++) {
				if(matrix[i][0] == 0 || matrix[0][j] == 0) {
					matrix[i][j]=0;
				}
			}
		}
		// update first row
        if (firstRow) {
            for (int j = 0; j < colLen; j++) {
                matrix[0][j] = 0;
            }
        }
        
        // update first column
        if (firstCol) {
            for (int i = 0; i < rowLen; i++) {
                matrix[i][0] = 0;
            }
        }
	}

}
