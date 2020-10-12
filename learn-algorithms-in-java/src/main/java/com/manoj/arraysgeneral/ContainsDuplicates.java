package com.manoj.arraysgeneral;

public class ContainsDuplicates {

	public boolean containsDuplicate(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean containsDuplicate1(int[] nums) {
		// sets.a
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		ContainsDuplicates containsDuplicates = new ContainsDuplicates();
		int[] nums = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
		System.out.println(containsDuplicates.containsDuplicate(nums));
	}
}