package com.manoj.sorting.quicksort;

public class QuickSort {
    private int numberOfSwaps = 0;
    int[] a1;

    public QuickSort(final int[] array) {
	this.a1 = array;
    }

    public int[] sortTheArray() {
	sort();
	System.out.println("Nubmer of swaps done are " + numberOfSwaps);
	return a1;
    }

    public void sort() {
	sort(0, a1.length - 1);
    }

    public void sort(final int lowValue, final int highValue) {
	if (lowValue >= highValue)
	    return;
	int p = partition(lowValue, highValue);
	sort(lowValue, p);
	sort(p + 1, highValue);
    }

    private int partition(final int low, final int high) {
	int pivot = a1[low];

	// Middle element
	// int middle = (low + high) / 2;
	// int pivot = a[middle];

	int i = low - 1;
	int j = high + 1;
	while (i < j) {
	    i++;
	    while (a1[i] < pivot)
		i++;
	    j--;
	    while (a1[j] > pivot)
		j--;
	    if (i < j)
		swap(i, j);
	}
	return j;
    }

    private void swap(final int i, final int j) {
	numberOfSwaps++;
	int temp = a1[i];
	a1[i] = a1[j];
	a1[j] = temp;

    }
}