package com.manoj.searching;

public class BinarySearch {

    public static void searchItem(int[] array, int key) {
	int start, end, midPt = 0;
	start = 0;
	end = array.length - 1;
	boolean flag = true;
	int numberOfComparisions = 0;
	while (flag == true && start <= end) {
	    midPt = (start + end) / 2;
	    if (array[midPt] == key) {
		flag = false;
	    } else if (array[midPt] < key) {
		numberOfComparisions++;
		start = midPt + 1;
	    } else {
		end = midPt - 1;
	    }
	}
	if (!flag) {
	    System.out
		    .println("Number of comparisions done to check the key are "
			    + numberOfComparisions);
	    System.out.println("Found the element at" + midPt);
	} else {
	    System.out.println("Element is not found");
	}
    }
}