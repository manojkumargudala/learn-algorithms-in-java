package com.manoj.arraysgeneral;

public class Find132Pattern {
	public boolean find132pattern(final int[] nums) {
		for (int i = 0; i < nums.length - 2; i++) {
			int j = i + 1;
			int k = i + 2;
			System.out.println(nums[i] + "\t" + nums[k] + "\t" + nums[j]);
			if (nums[i] < nums[k] && nums[k] < nums[j]) {
				return true;
			}
		}
		return false;
	}

	public static void main(final String[] args) {
		Find132Pattern find132Pattern = new Find132Pattern();
		int[] nums = { 1, 2, 3, 4 };
		System.out.println(find132Pattern.find132pattern(nums));
		int[] nums1 = { 3, 1, 4, 2 };
		System.out.println(find132Pattern.find132pattern(nums1));
		int[] nums2 = { -1, 3, 2, 0 };
		System.out.println(find132Pattern.find132pattern(nums2));
		int[] nums3 = { 3, 5, 0, 3, 4 };
		System.out.println(find132Pattern.find132pattern(nums3));
	}
}
