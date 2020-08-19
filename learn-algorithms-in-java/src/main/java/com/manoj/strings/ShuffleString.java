package com.manoj.strings;

public class ShuffleString {
	public String restoreString(String s, int[] indices) {
		char[] correctString = new char[indices.length];
		for (int i = 0; i < indices.length; i++) {
			correctString[indices[i]] = s.charAt(i);
		}
		return new String(correctString);
	}

	public static void main(String[] args) {
		ShuffleString shuffleString = new ShuffleString();
		int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };
		System.out.println(shuffleString.restoreString("codeleet", indices));
	}
}
