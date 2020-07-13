package com.manoj.arraysgeneral;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.manoj.common.PrinterFunctions;

public class FindDisappearedNumbers {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> integerList = new ArrayList<Integer>();
		Arrays.parallelSort(nums);
		PrinterFunctions.printArray(nums);
		int numbers = 1;
		for (int i = 0; i < nums.length - 1; i++) {
			if (numbers != nums[i]) {
				integerList.add(i);
			} else {
				numbers++;
			}
		}
		return integerList;
	}

	public static void main(String[] args) {
		FindDisappearedNumbers findDisappearedNumbers = new FindDisappearedNumbers();
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
		List<Integer> find = findDisappearedNumbers.findDisappearedNumbers(nums);
		System.out.println(find);
	}
}
