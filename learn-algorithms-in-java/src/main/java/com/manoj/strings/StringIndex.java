package com.manoj.strings;

public class StringIndex {
	public int strStr(String haystack, String needle) {
		if (needle.length() == 0) {
			return 0;
		}
		for (int i = 0; i < haystack.length(); i++) {
			if (haystack.charAt(i) == needle.charAt(0)) {
				boolean check = false;
				for (int j = 0; j < needle.length(); j++) {
					if (i + j >= haystack.length() || haystack.charAt(i + j) != needle.charAt(j)) {
						// System.out.println(haystack.charAt(i + j) + "\t" + needle.charAt(j));
						check = false;
						break;
					}
					check = true;
				}
				if (check) {
					return i;
				}
				System.out.println("Check this ");
			}
		}
		return -1;
	}

	public int strStrSub(String haystack, String needle) {
		if (needle.length() == 0) {
			return 0;
		}
		for (int i = 0; i < haystack.length(); i++) {
			if (i + needle.length() <= haystack.length())
				System.out.println(haystack.substring(i, i + needle.length()));
			if (haystack.substring(i, i + needle.length()).equals(needle)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		StringIndex stringIndex = new StringIndex();
		System.out.println(stringIndex.strStr("tsestst", "t"));
		System.out.println(stringIndex.strStrSub("tsestst", "t"));
	}
}
