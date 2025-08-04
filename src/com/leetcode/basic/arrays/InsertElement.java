package com.leetcode.basic.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertElement {
	public static void main(String[] args) {
		int[] arr ={5,7,8,3,9,1,2};
 		int element = 100;
		int position = 4;
//		int result[] = insertElement(arr, position, element);
//		System.out.println(Arrays.toString(result));
		
		arr = Arrays.copyOf(arr, arr.length+1);
		
		for(int i=arr.length-1;i>=position;i--) {
			arr[i]=arr[i-1];
		}
		arr[position] = element;
		
		for(int num:arr) {
			System.out.print(num+" ");
		}
	}
	public static int[] insertElement(int arr[], int pos, int ele) {
		List<Integer> ls = new ArrayList<>();
		for(int num:arr) {
			ls.add(num);
		}
		ls.add(pos, ele);
		int res_arr[] = new int[ls.size()];
		for(int i=0;i<ls.size();i++) {
			res_arr[i] = ls.get(i);
		}
		return res_arr;
	}
}
