package com.manoj.searching;

public class SequentialSearch {
    public static void searchItem(int[] array, int key) {
	boolean found = false;
	int k = 0;
	while (!found && k < array.length) {
	    if (array[k] == key) {
		found = true;
	    } else
		k += 1;
	}
	if (found) {
	    System.out.println("Found in position " + k);
	    System.out
		    .println("Number of comparisions done to check the key are "
			    + k);

	} else
	    System.out.println("The number is not found");
    }
}
