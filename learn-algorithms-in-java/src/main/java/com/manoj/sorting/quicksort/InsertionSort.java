package com.manoj.sorting.quicksort;

public class InsertionSort {
  private int numberOfSwaps = 0;
  int[] a1;

  public InsertionSort(final int[] insertionSort) {
    this.a1 = insertionSort;
  }

  public int[] sortTheArray() {
    int i, j, newValue;
    for (i = 1; i < a1.length; i++) {
      newValue = a1[i];
      j = i;
      while (j > 0 && a1[j - 1] > newValue) {
        numberOfSwaps++;
        a1[j] = a1[j - 1];
        j--;
      }
      a1[j] = newValue;
    }
    System.out.println("The Number of swaps to sort the array is  " + numberOfSwaps);
    return a1;
  }
}
