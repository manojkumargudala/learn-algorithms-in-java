package com.manoj.arraysgeneral;

class Combination {

	static void combinationUtil(final int arr[], final int data[], final int start, final int end, final int index,
			final int r) {
		if (index == r) {
			for (int j = 0; j < r; j++) {
				System.out.print(data[j] + " ");
			}
			System.out.println("");
			return;
		}

		for (int i = start; i <= end && end - i + 1 >= r - index; i++) {
			data[index] = arr[i];
			combinationUtil(arr, data, i + 1, end, index + 1, r);
		}
	}

	static void printCombination(final int arr[], final int n, final int r) {
		int data[] = new int[r];

		combinationUtil(arr, data, 0, n - 1, 0, r);
	}

	public static void main(final String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int r = 4;
		int n = arr.length;
		printCombination(arr, n, r);
	}
}
