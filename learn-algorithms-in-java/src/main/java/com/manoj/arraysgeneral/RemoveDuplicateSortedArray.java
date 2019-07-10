package com.manoj.arraysgeneral;

public class RemoveDuplicateSortedArray {
	// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
	public int removeDuplicates(final int[] nums) {
		int finalLength = 0;
		if (nums.length > 0) {
			int lastItem = nums[0];
			finalLength++;
			for (int i = 0; i < nums.length; i++) {
				if (lastItem != nums[i]) {
					nums[finalLength] = nums[i];
					finalLength++;
					lastItem = nums[i];
				}
			}
		}
		return finalLength;
	}

	public static void main(final String[] args) {
		RemoveDuplicateSortedArray removeDuplicateSortedArray = new RemoveDuplicateSortedArray();
		int[] nums = { 1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4 };
		System.out.println(removeDuplicateSortedArray.removeDuplicates(nums));
		int[] nums2 = {};
		System.out.println(removeDuplicateSortedArray.removeDuplicates(nums2));
		int[] nums3 = { 1 };
		System.out.println(removeDuplicateSortedArray.removeDuplicates(nums3));

	}
}
