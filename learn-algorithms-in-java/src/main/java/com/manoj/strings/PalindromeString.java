package com.manoj.strings;

public class PalindromeString {
	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		String str = (new Integer(x)).toString();
		int first = 0;
		int last = str.length()-1;
		while (first <= last) {
			if (str.charAt(first) != str.charAt(last))
				return false;
			first++;
			last--;

		}
		return true;
	}

	public static void main(String[] args) {
		PalindromeString palindromeString = new PalindromeString();
		System.out.println(palindromeString.isPalindrome(101));
	}
}
