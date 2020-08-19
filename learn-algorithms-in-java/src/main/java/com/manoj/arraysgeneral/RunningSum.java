package com.manoj.arraysgeneral;

import com.manoj.common.PrinterFunctions;

public class RunningSum {
	// https://leetcode.com/problems/running-sum-of-1d-array/
	public int[] runningSum(int[] nums) {
		int previous = 0;
		int[] ruuningsum = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			ruuningsum[i] = previous + nums[i];
			previous = ruuningsum[i];
		}
		return ruuningsum;
	}

	public static void main(final String[] args) {
		RunningSum runn = new RunningSum();
		int[] test = { 9, 4, 3, 1, 7, 12, 6 };
		PrinterFunctions.printArray(runn.runningSum(test));
		int[] test1 = {};
		PrinterFunctions.printArray(runn.runningSum(test1));
		int[] test2 = { 1 };
		PrinterFunctions.printArray(runn.runningSum(test2));
		int[] test3 = { 1, 2 };
		PrinterFunctions.printArray(runn.runningSum(test3));
	}
}
