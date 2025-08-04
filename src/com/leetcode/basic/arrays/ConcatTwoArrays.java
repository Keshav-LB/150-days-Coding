package com.leetcode.basic.arrays;

import java.util.ArrayList;
import java.util.List;

public class ConcatTwoArrays {
	public static void main(String[] args) {
		int[] arr1 ={6,9,10,8,7};
		int[] arr2 ={5,1,3,4,2,11,12};
		
//		List<Integer> ls = new ArrayList<>();
//		for(int num:arr1) {
//			ls.add(num);
//		}
//		for(int num:arr2) {
//			ls.add(num);
//		}
//		System.out.println(ls);//[6, 9, 10, 8, 7, 5, 1, 3, 4, 2, 11, 12]
//		for(int i=0;i<ls.size();i++) {
//			System.out.print(ls.get(i)+" ");//6 9 10 8 7 5 1 3 4 2 11 12 
//		}
		
		int res_arr[]=new int [arr1.length + arr2.length];
		
		for(int i=0;i<arr1.length;i++) {
			res_arr[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			res_arr[arr1.length + i]=arr2[i];
		}
		
		System.out.println("Concated Array: ");
		for(int num:res_arr) {
			System.out.print(num+" ");
		}

	}
}
