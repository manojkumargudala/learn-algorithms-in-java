package com.manoj.arraysgeneral;

public class SearchIndexPosition {
//https://leetcode.com/problems/search-insert-position/

	public int searchInsert(int[] nums, int target) {

		int low = 0;
		int high = nums.length - 1;
		int mid = 0;
		if (nums.length < 0)
			return 0;
		if (target < nums[0]) {
			return 0;
		}
		while (low <= high) {
			mid = low + (high - low) / 2;
			int res = nums[mid];
			System.out.println(res);
			if (res == target) {
				return mid;
			} else if (res > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return mid + 1;
	}

	public int searchInsert1(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {

			if (target <= nums[i]) {
				return i;
			}
		}

		// last index
		return nums.length;
	}

	public int firstBadVersion(int n) {
		for (int i = 0; i < n; i++) {

		}
		return 0;
	}

	public boolean isBadVersion(int version) {
		return true;
	}

	public static void main(String[] args) {
		SearchIndexPosition removeDuplicateSortedArray = new SearchIndexPosition();
		int[] nums = { 1, 3 };
		System.out.println(removeDuplicateSortedArray.searchInsert1(nums, 0));
	}
}
