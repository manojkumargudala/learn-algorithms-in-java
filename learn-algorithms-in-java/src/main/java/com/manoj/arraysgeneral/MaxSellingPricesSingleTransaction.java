package com.manoj.arraysgeneral;

public class MaxSellingPricesSingleTransaction {
	// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
	public int maxProfit(final int[] prices) {
		if (prices != null && prices.length == 0) {
			return 0;
		}
		int buy = prices[0];
		int sell = 0;
		int buyIndex = -1;
		int sellIndex = -1;
		for (int i = 0; i < prices.length; i++) {
			if (buy > prices[i]) {
				buy = prices[i];
				buyIndex = i;
			}
			if (sell < prices[i]) {
				sell = prices[i];
				sellIndex = i;
			}
		}
		if (buyIndex > sellIndex) {
			return 0;
		}
		return sell - buy;
	}

	public static void main(final String[] args) {
		MaxSellingPricesSingleTransaction maxSellingPrices = new MaxSellingPricesSingleTransaction();

		int[] prices = { 100, 1, 3, 4, 5, 1, 5, 9, 3 };
		System.out.println(maxSellingPrices.maxProfit(prices));
		System.out.println("*********");
		int[] prices1 = { 4, 9, 8, 7, 6, 5, 400, 3, 2, 6 };
		System.out.println(maxSellingPrices.maxProfit(prices1));
		System.out.println("*********");

		int[] prices2 = { 7, 1, 5, 3, 6, 4 };
		System.out.println(maxSellingPrices.maxProfit(prices2));
		System.out.println("*********");

		int[] prices3 = {};
		System.out.println(maxSellingPrices.maxProfit(prices3));
		System.out.println("*********");

		int[] prices4 = { 1 };
		System.out.println(maxSellingPrices.maxProfit(prices4));
	}
}
