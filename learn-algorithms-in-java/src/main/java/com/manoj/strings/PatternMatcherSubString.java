package com.manoj.strings;

public class PatternMatcherSubString {

	public int searchUsingString(final String pat, final String txt) {
		if (pat == null || txt == null || pat.length() == 0 || txt.length() == 0) {
			System.out.println("Empty string are found");
			return -1;
		}
		int m = pat.length();
		int n = txt.length();
		int j;
		for (int i = 0; i <= n - m; i++) {
			for (j = 0; j < m; j++) {
				if (txt.charAt(i + j) != pat.charAt(j))
					break;
			}
			if (j == m)
				return i; // found at offset i
		}
		return n; // not found
	}

	// return offset of first match or N if no match
	public static int search2(final String pat, final String txt) {
		int m = pat.length();
		int n = txt.length();
		int i, j;
		for (i = 0, j = 0; i < n && j < m; i++) {
			if (txt.charAt(i) == pat.charAt(j))
				j++;
			else {
				i -= j;
				j = 0;
			}
		}
		if (j == m)
			return i - m; // found
		else
			return n; // not found
	}

	/***************************************************************************
	 * char[] array versions.
	 ***************************************************************************/

	// return offset of first match or n if no match
	public static int searchUsingChars(final char[] pattern, final char[] text) {
		int m = pattern.length;
		int n = text.length;

		for (int i = 0; i <= n - m; i++) {
			int j;
			for (j = 0; j < m; j++) {
				if (text[i + j] != pattern[j])
					break;
			}
			if (j == m)
				return i; // found at offset i
		}
		return n; // not found
	}

	// return offset of first match or n if no match
	public static int search2(final char[] pattern, final char[] text) {
		int m = pattern.length;
		int n = text.length;
		int i, j;
		for (i = 0, j = 0; i < n && j < m; i++) {
			if (text[i] == pattern[j])
				j++;
			else {
				i -= j;
				j = 0;
			}
		}
		if (j == m)
			return i - m; // found
		else
			return n; // not found
	}

	public static void main(final String[] args) {
		String pat = "bracabracadabra";
		String txt = "abacadabrabracabracadabrabrabracad";
		char[] pattern = pat.toCharArray();
		char[] text = txt.toCharArray();
		PatternMatcherSubString ptrnsubstrng = new PatternMatcherSubString();
		int offset1a = ptrnsubstrng.searchUsingString(pat, txt);
		int offset2a = search2(pat, txt);
		int offset1b = searchUsingChars(pattern, text);
		int offset2b = search2(pattern, text);

		// print results
		System.out.println("text:    " + txt);

		// from brute force search method 1a
		System.out.print("pattern: ");
		for (int i = 0; i < offset1a; i++)
			System.out.print(" ");
		System.out.println(pat);

		// from brute force search method 2a
		System.out.print("pattern: ");
		for (int i = 0; i < offset2a; i++)
			System.out.print(" ");
		System.out.println(pat);

		// from brute force search method 1b
		System.out.print("pattern: ");
		for (int i = 0; i < offset1b; i++)
			System.out.print(" ");
		System.out.println(pat);

		// from brute force search method 2b
		System.out.print("pattern: ");
		for (int i = 0; i < offset2b; i++)
			System.out.print(" ");
		System.out.println(pat);
	}

}
