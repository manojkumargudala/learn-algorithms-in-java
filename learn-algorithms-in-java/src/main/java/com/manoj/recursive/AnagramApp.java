package com.manoj.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AnagramApp {
	static int size;
	static int count;
	static int myarraysize;
	static Set<String> anagramString = new HashSet<String>();

	public static void main(final String[] args) throws IOException {
		System.out.print("Enter a word: "); // get word
		String input = getString();
		count = 0;
		char[] arrChar = input.toCharArray();
		for (int j = 0; j < arrChar.length; j++) // put it in array
		{
			char[] arr = Arrays.copyOfRange(arrChar, j, arrChar.length);
			size = arr.length;
			doAnagram(arr.length, arr);
		}
		System.out.println(anagramString.size());
	}

	public static void doAnagram(final int newSize, final char[] myarray) {
		if (newSize == 1) {
			return;
		}
		for (int j = 0; j < newSize; j++) {
			doAnagram(newSize - 1, myarray);
			if (newSize == 2) {
				displayWord(myarray);
			}
			rotate(newSize, myarray);
		}
	}

	public static void rotate(final int newSize, final char[] myarray) {
		int j;
		int position = size - newSize;
		char temp = myarray[position];
		for (j = position + 1; j < size; j++) {
			myarray[j - 1] = myarray[j];
		}
		myarray[j - 1] = temp;
	}

	public static void displayWord(final char[] myarray) {
		String anagram = Arrays.toString(myarray);
		System.out.println(anagram);
		anagramString.add(anagram);
	}

	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
}
