package com.manoj.arraysgeneral;

import java.util.HashMap;
import java.util.Map.Entry;

public class GoodPairs {
	// https://leetcode.com/problems/number-of-good-pairs/
	public int numIdenticalPairs(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}
		}
		int totalValue = 0;
		for (Entry<Integer, Integer> mapentry : map.entrySet()) {
			totalValue = totalValue + (mapentry.getValue() * (mapentry.getValue() - 1) / 2);
		}
		return totalValue;
	}

	public static void main(String[] args) {
		GoodPairs goodPairs = new GoodPairs();
		int[] chocolates = { 1, 1, 1, 1 };
		System.out.println(goodPairs.numIdenticalPairs(chocolates));
		int[] chocolates1 = { 1 };
		System.out.println(goodPairs.numIdenticalPairs(chocolates1));
	}
}
