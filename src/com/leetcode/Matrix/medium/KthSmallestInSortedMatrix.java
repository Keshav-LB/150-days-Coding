package com.leetcode.Matrix.medium;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestInSortedMatrix {
	public static void main(String[] args) {
//		Input: matrix = [[1,5,9],[10,11,13],[12,13,15]], k = 8
//		Output: 13
//		Explanation: The elements in the matrix are [1,5,9,10,11,12,13,13,15], 
//		and the 8th smallest number is 13
//		Input: matrix = [[-5]], k = 1
//		Output: -5
		
		int [][]matrix1 = {{1,5,9},{10,11,13},{12,13,15}};
		int k1=8;
		int [][]matrix2 = {{-5}};
		int k2=1;
		
		displayMatrix(matrix1);
		System.out.println();
		System.out.println(k1+"th smallest element: "+kthSmallest(matrix1, k1));
		displayMatrix(matrix2);
		System.out.println();
		System.out.println(k2+"st smallest element: "+kthSmallest(matrix2, k2));
		
	}
	public static void displayMatrix(int matrix[][]){
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix.length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
		}
	}
	public static int kthSmallest(int [][]matrix, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix.length;j++) {
				pq.add(matrix[i][j]);
				
				if(pq.size()>k) {
					pq.poll();
				}
			}
		}
		return pq.peek();
	}
}
