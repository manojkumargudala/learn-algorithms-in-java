package com.manoj.sorting.quicksort;

public class BubbleSort {
  private int numberOfSwaps = 0;
  int[] a1;

  public BubbleSort(final int[] bubbleSort) {
    this.a1 = bubbleSort;
  }

  public int[] sortTheArray() {
    bubbleSort();
    System.out.println("Nubmer of swaps done are " + numberOfSwaps);
    return a1;
  }

  private void bubbleSort() {
    int length = a1.length;
    int counter, index;
    for (counter = 0; counter < length - 1; counter++) {
      for (index = 0; index < length - 1 - counter; index++) {
        if (a1[index] > a1[index + 1]) {
          swap(index, index + 1);
        }
      }
    }
  }

  private void swap(final int i, final int j) {
    numberOfSwaps++;
    int temp = a1[i];
    a1[i] = a1[j];
    a1[j] = temp;

  }

}
