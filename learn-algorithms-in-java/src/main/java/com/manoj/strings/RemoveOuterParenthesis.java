package com.manoj.strings;

public class RemoveOuterParenthesis {
	// https://leetcode.com/problems/remove-outermost-parentheses/submissions/
	public String removeOuterParentheses(final String S) {
		int countOpenparanthesesi = 0;
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == '(') {
				countOpenparanthesesi++;
				if (countOpenparanthesesi == 1) {
					continue;
				}
			}
			if (S.charAt(i) == ')') {
				countOpenparanthesesi--;
			}
			if (countOpenparanthesesi != 0) {
				str.append(S.charAt(i));
			}
		}
		return str.toString();
	}

	public static void main(final String[] args) {
		RemoveOuterParenthesis reverseWordsInString = new RemoveOuterParenthesis();
		System.out.println(reverseWordsInString.removeOuterParentheses("(()())(())"));
		System.out.println("()()()");

		System.out.println("\n\n");
		System.out.println(reverseWordsInString.removeOuterParentheses("(()())(())(()(()))"));
		System.out.println("()()()()(())");

		System.out.println("\n\n");
		System.out.println(reverseWordsInString.removeOuterParentheses("()()"));
		System.out.println("");

		System.out.println("\n\n");

	}
}
