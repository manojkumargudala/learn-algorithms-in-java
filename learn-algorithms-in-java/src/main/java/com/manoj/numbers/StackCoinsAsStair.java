package com.manoj.numbers;

public class StackCoinsAsStair {
	public int arrangeCoins(final int n) {
		System.out.println(Math.sqrt(1 + 8 * (double) n));
		return (int) ((-1 + Math.sqrt(1 + 8 * (double) n)) / 2);
	}

	public static void main(final String[] args) {
		StackCoinsAsStair stackCoinsAsStair = new StackCoinsAsStair();
		System.out.println(stackCoinsAsStair.arrangeCoins(500000000));
	}
}
