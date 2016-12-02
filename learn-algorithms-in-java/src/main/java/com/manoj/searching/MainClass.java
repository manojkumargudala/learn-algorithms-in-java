package com.manoj.searching;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainClass {
    public static int NUMBER_OF_ELEMENTS = 10000;
    public static boolean DISPLAY_FULL_LIST_ARRAY_VALUES = false;
    int[] array;

    public static void main(String[] args) {
	MainClass mnc = new MainClass();
	mnc.array = mnc.setArrayFileds(NUMBER_OF_ELEMENTS);
	int[] sortedArray = mnc.sortedArray(mnc.array);
	while (true) {
	    displayOptions();
	    int choice = mnc.getInputValue();
	    if (choice == 1) {
		mnc.array = mnc.setArrayFileds(NUMBER_OF_ELEMENTS);
		displayArrary(mnc.array);
	    } else if (choice == 2) {
		System.out
			.println("Please enter you key which you want to do binary search :");
		int key = mnc.getInputValue();
		displayArrary(mnc.array);
		long beforeBinarySerch = timeNow();
		BinarySearch.searchItem(sortedArray, key);
		long afterBinarySearch = timeNow();
		System.out
			.println("The total time took to do the binary search is nanosecs "
				+ (afterBinarySearch - beforeBinarySerch));
	    } else if (choice == 3) {
		System.out
			.println("Please enter you key which you want to do sequential search :");
		int key = mnc.getInputValue();
		displayArrary(mnc.array);
		long beforeSequentialSearch = timeNow();
		SequentialSearch.searchItem(mnc.array, key);
		long afterSequentialSearch = timeNow();
		System.out
			.println("The total time took to do the sequential search is nanosecs "
				+ (afterSequentialSearch - beforeSequentialSearch));

	    } else if (choice == 0) {
		break;
	    } else {
		System.out
			.println("Ïnvalid Option choose from the following options");
	    }
	}
    }

    private int[] sortedArray(int[] array2) {
	Arrays.sort(array2);
	return array2;
    }

    private int[] setArrayFileds(int numberOfElements) {
	Random r = new Random();
	int temp;
	int arr[] = new int[numberOfElements];
	for (int i = 0; i < numberOfElements; i++) {
	    temp = r.nextInt(NUMBER_OF_ELEMENTS-1) + 1;
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

    private static void displayOptions() {
	System.out.println("You have the following options to do");
	System.out.println("1: Reset the filelds in array");
	System.out.println("2: Do a binary Search");
	System.out.println("3: Do a sequential search");
	System.out.println("0: do nothing just quit");
	System.out.println("Enter your choice : ");

    }

    private static void displayArrary(int[] sortedArray) {
	String arrayString = "";
	if (DISPLAY_FULL_LIST_ARRAY_VALUES) {
	    for (int i : sortedArray) {
		arrayString = new Integer(i).toString() + "\t" + arrayString;
	    }

	} else {
	    for (int i = 0; i <= 10; i++) {
		arrayString = arrayString
			+ new Integer(sortedArray[i]).toString() + "\t";
	    }
	    arrayString = arrayString + "................\t";
	    for (int i = (sortedArray.length - 10); i < sortedArray.length; i++) {
		arrayString = arrayString + new Integer(i).toString() + "\t";
	    }
	}
	System.out.println(arrayString);
    }
}
