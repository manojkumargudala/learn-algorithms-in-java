package com.manoj.arraysgeneral;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SameSumSubSetArrays {
	public HashMap<Integer, List<List<Integer>>> uniquePairs(final int[] nums) {
		HashMap<Integer, List<List<Integer>>> result = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int sum = nums[i] + nums[j];
				if (!result.containsKey(sum)) {
					result.put(sum, new ArrayList<>());
				}
				result.get(sum).add(Arrays.asList(nums[i], nums[j]));
			}
		}
		return result;
	}

	public static void main(final String[] args) {
		int[] test = { 9, 4, 3, 1, 7, 12, 6 };
		SameSumSubSetArrays prac = new SameSumSubSetArrays();
		HashMap<Integer, List<List<Integer>>> printMe = prac.uniquePairs(test);
		for (Integer a : printMe.keySet()) {
			if (printMe.get(a).size() > 1) {
				String result = printMe.get(a).toString();
				System.out.println("result is " + result);
			}
		}
	}
}