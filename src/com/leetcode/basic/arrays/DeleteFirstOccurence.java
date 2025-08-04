package com.leetcode.basic.arrays;

public class DeleteFirstOccurence {
	public static void main(String[] args) {
		int[] arr={2,5,6,3,1,3,9,2,7,3};
//		{2,5,6,1,3,9,2,7,3}
		int ele = 3;
		int result[] = delete(arr, ele);
		for(int num:result) {
			System.out.print(num+" ");
		}
		
	}
	
	public static int[] delete(int arr[], int ele) {
		boolean deleted = false;
		int res_arr[] = new int[arr.length-1];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(!deleted && arr[i]==ele) {
				deleted = true;
				continue;
			}
			if(j<arr.length) {
				res_arr[j++] = arr[i];
			}
		}
		if(deleted == false) {
			System.out.println("Element not found!");
			return arr;
		}
		else
			return res_arr;
		
	}
}
