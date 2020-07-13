package com.manoj.arraysgeneral;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicates1 {
	// https://leetcode.com/problems/contains-duplicate-ii/
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		Map<Integer, Integer> positions = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (positions.containsKey(nums[i])) {
				System.out.println(positions.get(nums[i]));
				if (i - positions.get(nums[i]) <= k) {
					return true;
				} else {
					positions.put(nums[i], i);
				}
			} else {
				positions.put(nums[i], i);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		ContainsDuplicates1 containsDuplicates1 = new ContainsDuplicates1();
		int[] nums = { 1, 0, 1, 1 };
		System.out.println(containsDuplicates1.containsNearbyDuplicate(nums, 1));
	}
}
