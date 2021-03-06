package com.manoj.sorting.bubblesort;

class ArrayBub {
  private final long[] a; // ref to array a
  private int nElems; // number of data items
  // --------------------------------------------------------------

  public ArrayBub(final int max) // constructor
  {
    a = new long[max]; // create the array
    nElems = 0; // no items yet
  }

  // --------------------------------------------------------------
  public void insert(final long value) // put element into array
  {
    a[nElems] = value; // insert it
    nElems++; // increment size
  }

  // --------------------------------------------------------------
  public void display() // displays array contents
  {
    for (int j = 0; j < nElems; j++) // for each element,
      System.out.print(a[j] + ","); // display it
    System.out.println("");
  }

  // --------------------------------------------------------------
  public void bubbleSort() {
    int out, in;
    for (out = nElems - 1; out > 1; out--) // outer loop (backward)
      for (in = 0; in < out; in++) // inner loop (forward)
        if (a[in] > a[in + 1]) // out of order?
          swap(in, in + 1); // swap them
  } // end bubbleSort()
    // --------------------------------------------------------------

  public void selectionSort() {
    int out, in, min;
    for (out = 0; out < nElems - 1; out++) // outer loop
    {
      min = out; // minimum
      for (in = out + 1; in < nElems; in++) // inner loop
        if (a[in] < a[min]) // if min greater,
          min = in; // we have a new min
      swap(out, min); // swap them
    } // end for(out)
  } // end selectionSort()

  private void swap(final int one, final int two) {
    long temp = a[one];
    a[one] = a[two];
    a[two] = temp;
  }
  // --------------------------------------------------------------
}
