package com.manoj.numbers;

public class GuesNumber {

	public int guessNumber(final int n) {
		int low = 1;
		int high = n;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			int res = guess(mid);
			if (res == 0) {
				return mid;
			} else if (res < 0) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

	public int guess(final int n) {
		System.out.println("Checking for number " + n);
		int guessNumber = 1702766719;
		// guessNumber = 10;

		if (n == guessNumber) {
			return 0;
		} else if (n < guessNumber) {
			return 1;
		} else {
			return -1;
		}
	}

	public static void main(final String[] args) {
		GuesNumber guesNumber = new GuesNumber();
		System.out.println(guesNumber.guessNumber(2126753390));
		// System.out.println(guesNumber.guessNumber(20));

	}
}
