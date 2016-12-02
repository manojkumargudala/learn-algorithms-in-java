package com.manoj.sorting.quicksort;

import java.util.Random;
import java.util.Scanner;

public class MainClass {
  public static int NUMBER_OF_ELEMENTS = 10000;
  public static boolean DISPLAY_ARRAY_VALUES = true;
  int[] array;

  public static void main(final String[] args) {
    MainClass mnc = new MainClass();
    mnc.array = mnc.setArrayFileds(NUMBER_OF_ELEMENTS);
    while (true) {
      displayOptions();
      int choice = mnc.getInputValue();
      if (choice == 1) {
        mnc.array = mnc.setArrayFileds(NUMBER_OF_ELEMENTS);
      } else if (choice == 2) {
        System.out.println("Started bubble sort on the array");
        displayArrary(mnc.array, "before");
        int bubbleSort[] = copy(mnc.array);
        BubbleSort bs = new BubbleSort(bubbleSort);
        long beforeBubleSort = timeNow();
        int sortedArray[] = bs.sortTheArray();
        long afterBubleSort = timeNow();
        displayArrary(sortedArray, "after");
        System.out.println("The total time took to do the buble sort is nanosecs "
            + (afterBubleSort - beforeBubleSort));
      } else if (choice == 3) {
        System.out.println(
            "Started insertion sort on the array, This is done taking the inputs from the randomly genrated array");
        displayArrary(mnc.array, "before");
        int insertionSort[] = copy(mnc.array);
        InsertionSort ic = new InsertionSort(insertionSort);
        long beforeInsertionSort = timeNow();
        int sortedArray[] = ic.sortTheArray();
        long afterInsertionSort = timeNow();
        displayArrary(sortedArray, "after");
        System.out.println("The total time took to do the insertion sort is nanosecs "
            + (afterInsertionSort - beforeInsertionSort));
      } else if (choice == 4) {
        System.out.println("Started quick sort on the array");
        displayArrary(mnc.array, "before");
        int quickSort[] = copy(mnc.array);
        QuickSort qc = new QuickSort(quickSort);
        long beforeQuickSort = timeNow();
        int sortedArray[] = qc.sortTheArray();
        long afterQuickSort = timeNow();
        displayArrary(sortedArray, "after");
        System.out.println("The total time took to do the quick sort is nanosecs "
            + (afterQuickSort - beforeQuickSort));
      } else if (choice == 0) {
        break;
      } else {
        System.out.println("Ïnvalid Option choose from the following options");
      }
    }
  }

  private static int[] copy(final int[] array2) {
    int[] a = new int[array2.length];
    for (int i = 0; i < array2.length; i++) {
      a[i] = array2[i];
    }
    return a;
  }

  private int[] setArrayFileds(final int numberOfElements) {
    Random r = new Random();
    int temp;
    int arr[] = new int[numberOfElements];
    for (int i = 0; i < numberOfElements; i++) {
      temp = r.nextInt(999) + 1;
      arr[i] = temp;
    }
    return arr;
  }

  private int getInputValue() {
    @SuppressWarnings("resource")
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    return num;
  }

  private static long timeNow() {
    return System.nanoTime();
  }

  private static void displayArrary(final int[] sortedArray, final String string) {
    if (DISPLAY_ARRAY_VALUES) {
      String arrayString = "";
      for (int i : sortedArray) {
        arrayString = new Integer(i).toString() + "\t" + arrayString;
      }
      System.out.println(arrayString);
    }
  }

  private static void displayOptions() {
    System.out.println("You have the following options to do");
    System.out.println("1: Reset the filelds in array");
    System.out.println("2: Do a buble sort on the array");
    System.out.println("3: Do a insertion sort on the array");
    System.out.println("4: Do a quick sort on the array");
    System.out.println("0: do nothing just quit");
    System.out.println("Enter your choice : ");
  }
}
