package com.manoj.strings;

import java.util.ArrayList;
import java.util.List;

public class ReverseKCharacters {
	// https://leetcode.com/problems/reverse-string-ii/submissions/
	public String reverseStr(final String s, final int k) {
		int i = 0;
		List<String> strList = new ArrayList<String>();
		while (i < s.length()) {
			strList.add(s.substring(i, i + k > s.length() ? s.length() : i + k));
			i = i + k;
		}
		StringBuffer strb = new StringBuffer();
		for (int j = 0; j < strList.size(); j++) {
			if (j % 2 == 0) {
				StringBuilder str = new StringBuilder(strList.get(j));
				strb.append(str.reverse());
			} else {
				strb.append(strList.get(j));
			}
		}
		return strb.toString();
	}

	public String reverseStr1(final String s, final int k) {
		StringBuffer strb = new StringBuffer();
		int j = 0;
		boolean x = true;
		while (j < s.length()) {
			if (x) {
				StringBuilder str = new StringBuilder(s.substring(j, j + k > s.length() ? s.length() : j + k));
				strb.append(str.reverse());
				x = false;
			} else {
				strb.append(s.substring(j, j + k > s.length() ? s.length() : j + k));
				x = true;
			}
			j = j + k;

		}
		return strb.toString();
	}

	public static void main(final String[] args) {
		ReverseKCharacters reverseWordsInString = new ReverseKCharacters();
		System.out.println(reverseWordsInString.reverseStr("abcdefg", 2));
		System.out.println(reverseWordsInString.reverseStr1("abcdefg", 2));
		System.out.println("\n\n");
		System.out.println(reverseWordsInString.reverseStr("sdfsafsaftesfdasfasfwerw", 3));
		System.out.println(reverseWordsInString.reverseStr1("sdfsafsaftesfdasfasfwerw", 3));

	}
}
