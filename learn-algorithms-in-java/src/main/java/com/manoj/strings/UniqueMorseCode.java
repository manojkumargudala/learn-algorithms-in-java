package com.manoj.strings;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCode {
	public int uniqueMorseRepresentations(String[] words) {
		String[] MORSE_CODES = new String[] { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
				"-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
				"-.--", "--.." };

		Set<String> uniqueCodes = new HashSet<String>();
		for (String word : words) {
			StringBuilder code = new StringBuilder();
			for (char c : word.toCharArray()) {
				code.append(MORSE_CODES[c - 'a']);
			}
			uniqueCodes.add(code.toString());
		}

		return uniqueCodes.size();
	}
}
