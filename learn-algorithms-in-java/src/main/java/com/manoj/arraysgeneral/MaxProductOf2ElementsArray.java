package com.manoj.arraysgeneral;

public class MaxProductOf2ElementsArray {
	// https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/

	public int maxProduct(int[] nums) {

		int highest = 0;
		int secondHigest = 0;
		for (int num : nums) {
			if (num > highest) {
				secondHigest = highest;
				highest = num;
			} else if (num > secondHigest) {
				secondHigest = num;
			}
		}
		System.out.println("highest\t" + highest + "\tsecondhight\t" + secondHigest);
		return (highest - 1) * (secondHigest - 1);
	}

	public static void main(String[] args) {
		MaxProductOf2ElementsArray maxProductOf2ElementsArray = new MaxProductOf2ElementsArray();
		int[] nums = { 3, 4, 5, 2 };
		System.out.println(maxProductOf2ElementsArray.maxProduct(nums));
		int[] nums1 = { 1, 5, 5, 4 };
		System.out.println(maxProductOf2ElementsArray.maxProduct(nums1));

	}
}
