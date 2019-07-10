package com.manoj.strings;

import org.apache.commons.lang3.StringUtils;

public class ReverseStringWithRecurssion {
	// https://leetcode.com/problems/reverse-string/

	public void reverseString(final char[] s) {
		helper(0, s.length - 1, s);
	}

	private static void helper(final int startIndex, final int endIndex, final char[] str) {

		if (str == null || startIndex > str.length / 2 || endIndex < str.length / 2) {
			return;
		}
		// System.out.println(
		// "replacing " + startIndex + "value " + str[startIndex] + "with " +
		// endIndex + "value " + str[endIndex]);
		char temp = str[startIndex];
		str[startIndex] = str[endIndex];
		str[endIndex] = temp;
		helper(startIndex + 1, endIndex - 1, str);
	}

	public static void main(final String[] args) {
		ReverseStringWithRecurssion reverseWordsInString = new ReverseStringWithRecurssion();
		char[] s = { 'A', ' ', 'm', 'a', 'n', ',', ' ', 'a', ' ', 'p', 'l', 'a', 'n', ',', ' ', 'a', ' ', 'c', 'a', 'n',
				'a', 'l', ':', ' ', 'P', 'a', 'n', 'a', 'm', 'a' };
		System.out.println(StringUtils.reverse(new String(s)));
		reverseWordsInString.reverseString(s);
		System.out.println(s);
	}
}
