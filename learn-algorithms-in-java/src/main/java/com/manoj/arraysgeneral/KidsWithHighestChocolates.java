package com.manoj.arraysgeneral;

import java.util.ArrayList;
import java.util.List;

public class KidsWithHighestChocolates {
	// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		int max = 0;
		for (int i = 0; i < candies.length; i++) {
			if (candies[i] > max) {
				max = candies[i];
			}
		}
		List<Boolean> kidsTrue = new ArrayList<Boolean>();
		for (int i = 0; i < candies.length; i++) {
			if (candies[i] + extraCandies >= max) {
				kidsTrue.add(true);
			} else {
				kidsTrue.add(false);
			}
		}
		return kidsTrue;
	}

	public static void main(String[] args) {
		KidsWithHighestChocolates kidsWithHighestChocolates = new KidsWithHighestChocolates();
		int[] chocolates = { 2, 3, 5, 1, 3 };
		System.out.println(kidsWithHighestChocolates.kidsWithCandies(chocolates, 3));
		int[] chocolates1 = {};
		System.out.println(kidsWithHighestChocolates.kidsWithCandies(chocolates1, 3));
	}
}
