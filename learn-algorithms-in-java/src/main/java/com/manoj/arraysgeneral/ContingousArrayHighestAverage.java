package com.manoj.arraysgeneral;

import java.util.Date;

import com.manoj.common.RandomDataGenerator;

public class ContingousArrayHighestAverage {
	public double findMaxAverage(final int[] nums, final int k) {
		long startTime = (new Date()).getTime();
		double maxAverage = 0;
		boolean firstTime = true;
		for (int i = 0; i < nums.length; i++) {
			if (i + k <= nums.length) {
				double sum = 0;
				for (int j = i; j < i + k; j++) {
					sum = sum + nums[j];
				}
				if (firstTime) {
					maxAverage = sum / k;
					firstTime = false;
				}
				if (maxAverage < sum / k) {
					maxAverage = sum / k;
				}
			} else {
				break;
			}
		}
		System.out.println("Time take is " + ((new Date()).getTime() - startTime));
		return maxAverage;

	}

	public static void main(final String[] args) {
		ContingousArrayHighestAverage contingousArrayHighestAverage = new ContingousArrayHighestAverage();
		int[] nums = { -1 };
		int[] test = new int[300000];
		for (int i = 0; i < 300000; i++) {
			test[i] = RandomDataGenerator.getRandomNumberBetween(-10000, 0);
		}
		System.out.println(contingousArrayHighestAverage.findMaxAverage(nums, 1));
		System.out.println(contingousArrayHighestAverage.findMaxAverage(test, 1));

	}
}
