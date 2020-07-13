package com.manoj.strings;

public class PalindromSentence {
//https://leetcode.com/problems/valid-palindrome/

	public boolean isPalindrome(String s) {
		if (s != null) {
			s = s.replaceAll("[^A-Za-z0-9]", "");
			s = s.toLowerCase();
			System.out.println(s);
			int first = 0;
			int last = s.length() - 1;
			while (first <= last) {
				if (s.charAt(first) != s.charAt(last))
					return false;
				first++;
				last--;

			}
			return true;
		}
		return false;

	}

	public String toLowerCase(String str) {
		if (str != null) {
			return str.toLowerCase();
		} else
			return str;
	}

	public static void main(String[] args) {
		PalindromSentence palindromSentence = new PalindromSentence();
		System.out.println(palindromSentence.isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(palindromSentence.toLowerCase("A man, a plan, a canal: Panama"));
		System.out.println(palindromSentence.toLowerCase(null));

	}

}
