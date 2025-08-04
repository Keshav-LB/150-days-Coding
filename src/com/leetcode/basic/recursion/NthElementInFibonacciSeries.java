package com.leetcode.basic.recursion;

public class NthElementInFibonacciSeries {
	public static void main(String[] args) {
		int a=0,b=1,c;
		System.out.print(a+" ");
		for(int i=2;i<=10;i++) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		int pos =5;
		int element = findNthElementInFiboSeries(pos);
		System.out.println();
		System.out.println("Element found at position "+pos+" is: "+element);
	}
	public static int findNthElementInFiboSeries(int pos) {
		if(pos==0)
			return 0;
		if(pos==1)
			return 1;
		return findNthElementInFiboSeries(pos-1)+findNthElementInFiboSeries(pos-2);
	}
}
