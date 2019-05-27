package com.manoj.bitmanuplation;

public class Complement {
	// https://leetcode.com/problems/number-complement/
	public static int findComplement(final int num) {
		int complement = 1;
		while (complement < num) {
			complement = complement * 2 + 1;
		}
		// System.out.println(complement);
		// System.out.println("Complement + num " + (complement + num));
		System.out.println(num & 111);
		return complement - num;
	}

	public static int findComplement1(final int num) {
		int complement = 1;
		while (complement < num) {
			complement = complement * 2 + 1;
		}
		System.out.println(complement);
		System.out.println("Complement + num " + (complement + num));

		return complement - num;
	}

	public static void main(final String[] args) {
		System.out.println("Complement value of 0 is " + findComplement(0));
		System.out.println("Complement value of 1 is " + findComplement(1));
		System.out.println("Complement value of 2 is " + findComplement(2));
		System.out.println("Complement value of 3 is " + findComplement(3));
		System.out.println("Complement value of 4 is " + findComplement(4));

	}
}
