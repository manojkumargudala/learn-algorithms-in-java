package com.manoj.arraysgeneral;

import com.manoj.common.PrinterFunctions;

public class SuffleArray {
	// https://leetcode.com/problems/shuffle-the-array/
	public int[] shuffle(int[] nums, int n) {
		int[] suffledArray = new int[nums.length];
		int sufflediterator = 0;
		for (int i = 0; i < n; i++) {
			suffledArray[sufflediterator] = nums[i];
			suffledArray[sufflediterator + 1] = nums[i + n];
			sufflediterator = sufflediterator + 2;
		}
		return suffledArray;
	}

	public int[] shuffle1(int[] nums, int n) {
		int secondNumber = nums[0];
		int iteratorNum = 0;
		for (int i = 0; i < nums.length; i += 2) {
			nums[i] = secondNumber;
			secondNumber = nums[i + 1];
			nums[i + 1] = nums[i + n];
			System.out.println(secondNumber);
			PrinterFunctions.printArray(nums);
		}
		return nums;
	}

	public static void main(String[] args) {
		SuffleArray suffleArray = new SuffleArray();
		int[] chocolates = { 2, 5, 1, 3, 4, 7 };
		PrinterFunctions.printArray(suffleArray.shuffle(chocolates, 3));
		PrinterFunctions.printArray(suffleArray.shuffle1(chocolates, 3));
		int[] chocolates1 = { 1, 2, 3, 4, 4, 3, 2, 1 };
		PrinterFunctions.printArray(suffleArray.shuffle(chocolates1, 4));
		PrinterFunctions.printArray(suffleArray.shuffle1(chocolates1, 4));
	}
}
