package com.leetcode.Arrays.medium;

public class StockBuyAndSell {
	public static void main(String[] args) {
//		Input: prices = [7,1,5,3,6,4]
//		Output: 5
//		Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), 
//		profit = 6-1 = 5.
//		Note that buying on day 2 and selling on day 1 is not allowed 
//		because you must buy before you sell.
//		
//		Input: prices = [7,6,4,3,1]
//		Output: 0
//		Explanation: In this case, no transactions are done and the max profit = 0.
		
		int []prices1 = {7,1,5,3,6,4};
		int []prices2 = {7,6,4,3,1};
		System.out.println(maxProfit(prices1));
		System.out.println(maxProfit(prices2));
	}
	public static int maxProfit(int []prices) {
		int minPrice = prices[0];
		int maxProfit = 0;
		for(int i=0;i<prices.length;i++) {
			if(prices[i] < minPrice) {
				minPrice = prices[i];
			}
			else {
				maxProfit = Math.max(maxProfit, prices[i]-minPrice);
			}
		}
		return maxProfit;
	}
}
