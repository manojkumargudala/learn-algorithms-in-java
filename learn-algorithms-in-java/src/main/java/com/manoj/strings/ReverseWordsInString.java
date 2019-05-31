package com.manoj.strings;

public class ReverseWordsInString {
	public String reverseWords(final String s) {
		if (s != null) {
			String[] str = s.split("\\s+");
			StringBuffer strbuf = new StringBuffer();
			for (String st : str) {
				StringBuilder stringBuilder = new StringBuilder(st);
				strbuf.append(stringBuilder.reverse());
				strbuf.append(" ");
			}
			return strbuf.toString().trim();
		}
		return s;
	}

	public static void main(final String[] args) {
		ReverseWordsInString reverseWordsInString = new ReverseWordsInString();
		System.out.println(reverseWordsInString.reverseWords("").length());
		System.out.println(reverseWordsInString.reverseWords(" ").length());
	}
}
