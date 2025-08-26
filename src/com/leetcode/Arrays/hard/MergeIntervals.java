package com.leetcode.Arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
	public static void main(String[] args) {
//		Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
//				Output: [[1,6],[8,10],[15,18]]
//		Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
//				
//		Input: intervals = [[1,4],[4,5]]
//				Output: [[1,5]]
//		Explanation: Intervals [1,4] and [4,5] are considered overlapping.
		
		int[][] intervals1 = {{1,3},{2,6},{8,10},{15,18}};
		int[][] intervals2 = {{1,4},{4,5}};
		
		System.out.println(Arrays.deepToString(merge(intervals1)));
		System.out.println(Arrays.deepToString(merge(intervals2)));
	}
//	public static int[][] merge(int[][] intervals){
//		
//		Arrays.sort(intervals, (a,b)->a[0]-b[0]);
//		
//		List<int[]> result = new ArrayList<>();
//		for(int[] interval : intervals) {
//			if(result.isEmpty() || result.get(result.size()-1)[1] < interval[0]) {
//				result.add(interval);
//			}
//			else {
//				result.get(result.size()-1)[1] = Math.max(result.get(result.size()-1)[1], interval[1]);
//			}
//		}
//		return result.toArray(new int[result.size()][]);
//	}
	public static int[][] merge(int[][] intervals){
		Arrays.sort(intervals, (a,b)->a[0]-b[0]);
		
		List<int[]> result = new ArrayList<>();
		for(int[] interval:intervals) {
			if(result.isEmpty() || result.get(result.size()-1)[1]<interval[0]) {
				result.add(interval);
			}
			else {
				result.get(result.size()-1)[1] = Math.max(result.get(result.size()-1)[1], interval[1]);
			}
		}
		return result.toArray(new int[result.size()][]);
	}
}
