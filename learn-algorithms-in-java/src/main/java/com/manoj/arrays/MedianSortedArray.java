package com.manoj.arrays;

import com.manoj.common.PrinterFunctions;

public class MedianSortedArray {

	public static double findMedianSortedArrays(final int[] nums1, final int[] nums2) {
		int[] finalArray = new int[nums1.length + nums2.length];
		int index1 = 0;
		int index2 = 0;
		for (int i = 0; i < finalArray.length; i++) {
			if (index1 < nums1.length && index2 < nums2.length && nums1[index1] < nums2[index2]) {
				System.out.println(nums1[index1] + " " + nums2[index2]);
				finalArray[i] = nums1[index1];
				index1++;
			} else if (index1 < nums1.length && index2 < nums2.length && nums1[index1] > nums2[index2]) {
				System.out.println(nums1[index1] + " " + nums2[index2]);
				finalArray[i] = nums2[index2];
				index2++;
			} else if (index1 < nums1.length) {
				finalArray[i] = nums1[index1];
				index1++;
			} else if (index2 < nums2.length) {
				finalArray[i] = nums2[index2];
				index2++;
			}
			System.out.println("index1 " + index1 + " index2 " + index2);
			PrinterFunctions.printArray(finalArray);
		}
		PrinterFunctions.printArray(finalArray);
		if (finalArray.length % 2 != 0) {
			return finalArray[finalArray.length / 2];
		} else {
			if (finalArray.length == 2) {
				return (finalArray[0] + finalArray[1]) / 2.0;
			} else {
				System.out.println(finalArray.length / 2);
				return (finalArray[finalArray.length / 2] + finalArray[(finalArray.length / 2) - 1]) / 2.0;
			}

		}
	}

	public static void main(final String[] args) {
		int[] nums1 = { 1, 2, 5, 9 };
		int[] nums2 = { 3, 4, 6, 7, 8, 10 };
		System.out.println(MedianSortedArray.findMedianSortedArrays(nums1, nums2));
		int[] nums3 = { 1, 2 };
		int[] nums4 = { 3, 4 };
		System.out.println(MedianSortedArray.findMedianSortedArrays(nums3, nums4));
		int[] nums5 = {};
		int[] nums6 = { 3, 4 };
		System.out.println(MedianSortedArray.findMedianSortedArrays(nums5, nums6));
	}
}
