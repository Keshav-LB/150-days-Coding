package com.leetcode.basic.arrays;

public class ArrayDigitMultiplications {
//	arr1[] = {2,4,9} = {249}
//	arr2[] = {3,5} = {35}
//	249*35=8715
	
	public static void main(String[] args) {
		int arr1[] = {2,4,9};
		int arr2[] = {3,5};
		
		int result = multiply(arr1, arr2);
		System.out.println(ArraysToString(arr1)+" * "+ArraysToString(arr2)+" = "+result );
	}
	
	public static int multiply(int arr1[], int arr2[]) {
		String sarr1 = ArraysToString(arr1);
		String sarr2 = ArraysToString(arr2);
		
		return Integer.parseInt(sarr2)*Integer.parseInt(sarr1);
	}
	
	public static String ArraysToString(int []arr) {
		StringBuilder sb = new StringBuilder();
		for(int num: arr) {
			sb.append(num);
		}
		return sb.toString();
	}
	
}
