package com.manoj.numbers;

public class ClumsyFactorial {
	public int clumsy(final int N) {
		if (N == 0) {
			return 0;
		}
		if (N == 1) {
			return N;
		}
		if (N == 2) {
			return N * N - 1;
		}
		if (N == 3) {
			return N * (N - 1) / (N - 2);
		}
		int sum = N * (N - 1) / (N - 2) + (N - 3);
		for (int i = N - 4; i > 0; i = i - 4) {
			int blockSum = i;
			if (i - 1 > 0) {
				blockSum = blockSum * (i - 1);
			}
			if (i - 2 > 0) {
				blockSum = blockSum / (i - 2);
			}
			if (i - 3 > 0) {
				blockSum = blockSum + (i - 3);
			}
			sum = sum - blockSum;
		}
		return sum;
	}

	public static void main(final String[] args) {
		ClumsyFactorial clumsyFactorial = new ClumsyFactorial();
		System.out.println(clumsyFactorial.clumsy(10));
	}
}
