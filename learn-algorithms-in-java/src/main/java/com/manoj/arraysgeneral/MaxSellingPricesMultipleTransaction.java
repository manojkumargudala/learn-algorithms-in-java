package com.manoj.arraysgeneral;

public class MaxSellingPricesMultipleTransaction {
	// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/submissions/
	public int maxProfit1(final int[] prices) {
		int result = 0;
		if (prices != null && prices.length > 1) {
			int currentPrice = prices[1] - prices[0] > 0 ? prices[0] : -1;
			result = prices[1] - prices[0] > 0 ? -prices[0] : 0;
			for (int i = 1; i < prices.length - 1; i++) {
				if (prices[i] - prices[i + 1] < 0) {
					if (currentPrice == -1) {
						currentPrice = prices[i];
						result -= prices[i];
					}
				} else if (prices[i] - prices[i + 1] > 0) {
					if (currentPrice >= 0) {
						currentPrice = -1;
						result += prices[i];
					}
				}
			}
			if (currentPrice >= 0 && currentPrice < prices[prices.length - 1]) {
				result += prices[prices.length - 1];
			}
		}
		return result;
	}

	public int maxProfit(final int[] prices) {
		if (prices != null && prices.length == 0) {
			return 0;
		}
		int result = 0;
		int buy = prices[0];
		int sell = -1;
		for (int i = 0; i < prices.length; i++) {
			if (buy > prices[i]) {
				buy = prices[i];
			} else {
				sell = prices[i];
			}
			if (i == prices.length - 1 || prices[i] > prices[i + 1]) {
				result = result + (sell - buy);
				if (i == prices.length - 1) {
					break;
				}
				buy = prices[i + 1];
				sell = 0;
			}
		}
		return result;
	}

	public static void main(final String[] args) {
		MaxSellingPricesMultipleTransaction maxSellingPrices = new MaxSellingPricesMultipleTransaction();

		int[] prices = { 100, 1, 1, 1, 3, 4, 5, 1, 5, 9, 3 };
		System.out.println(maxSellingPrices.maxProfit1(prices));
		System.out.println(maxSellingPrices.maxProfit(prices));

		int[] prices1 = { 9, 8, 7, 6, 5, 400, 3, 2, 1 };
		System.out.println(maxSellingPrices.maxProfit1(prices1));
		System.out.println(maxSellingPrices.maxProfit(prices1));

		int[] prices2 = { 7, 1, 5, 3, 6, 4 };
		System.out.println(maxSellingPrices.maxProfit1(prices2));
		System.out.println(maxSellingPrices.maxProfit(prices2));

		int[] prices3 = {};
		System.out.println(maxSellingPrices.maxProfit1(prices3));
		System.out.println(maxSellingPrices.maxProfit(prices3));
		int[] prices4 = { 1 };
		System.out.println(maxSellingPrices.maxProfit1(prices4));
		System.out.println(maxSellingPrices.maxProfit(prices4));

		int[] prices5 = { 1, 9, 8, 7, 6, 5, 400, 3, 2, 1 };
		System.out.println(maxSellingPrices.maxProfit1(prices5));
		System.out.println(maxSellingPrices.maxProfit(prices5));
	}
}
