package com.manoj.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

////////////////////////////////////////////////////////////////
public class AnagramApp {
  static int size;
  static int count;
  static int myarraysize;

  // static char[] arrChar = new char[100];

  public static void main(final String[] args) throws IOException {
    System.out.print("Enter a word: "); // get word
    String input = getString();
    count = 0;
    char[] arrChar = input.toCharArray();
    for (int j = 0; j < arrChar.length; j++) // put it in array
    {
      char[] arr = Arrays.copyOfRange(arrChar, j, arrChar.length);
      size = arr.length; // find its size
      System.out.println(String.copyValueOf(arr) + "\t" + arr.length);
      doAnagram(arr.length, arr); // anagram it
      System.out.println("\n*************************************************");
    }
  } // end main()
    // -----------------------------------------------------------

  public static void doAnagram(final int newSize, final char[] myarray) {
    if (newSize == 1) // if too small,
      return; // go no further
    for (int j = 0; j < newSize; j++) // for each position,
    {
      doAnagram(newSize - 1, myarray); // anagram remaining
      if (newSize == 2) // if innermost,
        displayWord(myarray); // display it
      rotate(newSize, myarray); // rotate word
    }
  }

  // -----------------------------------------------------------
  // rotate left all chars from position to end
  public static void rotate(final int newSize, final char[] myarray) {
    int j;
    int position = size - newSize;
    char temp = myarray[position]; // save first letter
    // System.out.println("before rotating " + String.valueOf(arrChar) + " the size is " + newSize);
    for (j = position + 1; j < size; j++) // shift others left
      myarray[j - 1] = myarray[j];
    myarray[j - 1] = temp; // put first on right
    // System.out.println("after rotating " + String.valueOf(arrChar));
  }

  // -----------------------------------------------------------
  public static void displayWord(final char[] myarray) {

    if (count < 99)
      System.out.print(" ");
    if (count < 9)
      System.out.print(" ");
    System.out.print(++count + " ");
    System.out.print(String.valueOf(myarray) + " ");
    System.out.print(" ");
    System.out.flush();
    if (count % 10 == 0)
      System.out.println(" ");
  }

  // -----------------------------------------------------------
  public static String getString() throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    String s = br.readLine();
    return s;
  }
  // -------------------------------------------------------------
}
