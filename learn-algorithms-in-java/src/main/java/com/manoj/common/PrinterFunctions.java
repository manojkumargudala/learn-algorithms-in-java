package com.manoj.common;

public class PrinterFunctions {
  public static void printArray(final int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + "\t");
    }
    System.out.println();
  }
}
