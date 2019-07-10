package com.manoj.strings;

public class StringCompression {
	// https://leetcode.com/problems/string-compression/
	public int compress(final char[] chars) {

		int length = 0;
		int lastCharacterCount = 0;
		char lastCharacter = 0;
		for (int i = 0; i < chars.length; i++) {

			if (lastCharacter != chars[i]) {
				lastCharacter = chars[i];
				length = length + 1;
				lastCharacterCount = 0;
			} else {
				lastCharacterCount = lastCharacterCount + 1;
				if (lastCharacterCount >= 10) {
					lastCharacterCount = 0;
					length = length + 1;
				}
			}
			if (nextCharacterIsNotEqual(chars, i)) {
				length = length + 1;
			}

		}

		return length;
	}

	private boolean nextCharacterIsNotEqual(final char[] chars, final int i) {
		if (i + 1 >= chars.length) {
			return false;
		} else {
			if (chars[i] == chars[i + 1]) {
				return true;
			} else {
				return false;
			}
		}
	}

	public static void main(final String[] abs) {
		StringCompression stringCompression = new StringCompression();
		char[] chars = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
		System.out.println(stringCompression.compress(chars));
		char[] chars1 = { 'a', 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'c', 'c', 'c', 'a', 'a', 'b', 'b', 'c', 'c',
				'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c' };
		System.out.println(stringCompression.compress(chars1));
		char[] chars3 = { 'a', 'b', 'c' };
		System.out.println(stringCompression.compress(chars3));
		char[] chars2 = { 'a' };
		System.out.println(stringCompression.compress(chars2));
	}
}
