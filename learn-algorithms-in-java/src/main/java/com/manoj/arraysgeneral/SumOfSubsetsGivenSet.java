package com.manoj.arraysgeneral;

import java.util.ArrayList;
import java.util.List;

public class SumOfSubsetsGivenSet {
	List<Integer> arrayLst;

	public SumOfSubsetsGivenSet() {
		arrayLst = new ArrayList<Integer>();
	}

	private void subsetSums(final int arr[], final int l, final int r, final int sum) {
		// System.out.println("l value is " + l + " r value is " + r);
		if (l > r) {
			System.out.print(sum + "\t");
			arrayLst.add(sum);
			return;
		}
		subsetSums(arr, l + 1, r, sum + arr[l]);
		subsetSums(arr, l + 1, r, sum);
	}

	public void subSetSum(final int arr[]) {
		int n = arr.length;
		subsetSums(arr, 0, n - 1, 0);
		System.out.println();
	}
}
