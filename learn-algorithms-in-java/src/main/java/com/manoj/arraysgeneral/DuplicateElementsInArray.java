package com.manoj.arraysgeneral;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElementsInArray {
	public List<Integer> findDuplicates(int[] nums) {
		List<Integer> duplicateInteger = new ArrayList<Integer>();
		Set<Integer> setInteger = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (!setInteger.add(nums[i])) {
				duplicateInteger.add(nums[i]);
			}
		}

		return duplicateInteger;
	}
}
