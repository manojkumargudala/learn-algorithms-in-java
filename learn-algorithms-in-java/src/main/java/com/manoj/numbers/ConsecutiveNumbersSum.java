package com.manoj.numbers;

import java.util.Date;

public class ConsecutiveNumbersSum {
	// https://leetcode.com/problems/consecutive-numbers-sum/submissions/
	public int consecutiveNumbersSum(final int N) {
		int numberOfCombinations = 1;
		for (int i = 1; i <= N / 2 + 1; i++) {
			int sum = i;
			for (int j = i + 1; j <= N / 2 + 3; j++) {
				sum = sum + j;
				if (sum == N) {
					numberOfCombinations++;
					break;
				}
				if (sum > N) {
					break;
				}
			}

		}
		return numberOfCombinations;
	}

	public int consecutiveNumbersSum2(final int N) {
		int res = 0;
		double NN = N;
		int maxTerms = (int) (Math.sqrt(1 + 8 * NN) - 1) / 2;
		System.out.println(maxTerms);
		for (int n = 1; n <= maxTerms; n++) {
			int temp = N - (n - 1) * n / 2;
			if (temp > 0 && temp % n == 0) {
				res++;
			}
		}
		return res;
	}

	public static void main(final String[] args) {
		long currentTime = (new Date()).getTime();
		ConsecutiveNumbersSum consecutiveNumbersSum = new ConsecutiveNumbersSum();
		System.out.println(consecutiveNumbersSum.consecutiveNumbersSum(65581200));
		System.out.println((new Date()).getTime() - currentTime);
		currentTime = (new Date()).getTime();
		System.out.println(consecutiveNumbersSum.consecutiveNumbersSum2(65581200));
		System.out.println((new Date()).getTime() - currentTime);
	}
}
