package com.manoj.stackandqueues;

import java.util.ArrayList;
import java.util.List;

import com.manoj.common.PrinterFunctions;

public class FindOccurences {
	public String[] findOcurrences(final String text, final String first, final String second) {
		String[] words = text.split("\\s+");
		List<String> results = new ArrayList<>();
		for (int i = 0; i < words.length; i++) {
			if (i < words.length - 2) {
				String firstWord = words[i];
				String secondWord = words[i + 1];
				String thirdWord = words[i + 2];
				if (first.equals(firstWord) && second.equals(secondWord)) {
					results.add(thirdWord);
				}
			}
		}
		String[] resultsArrays = new String[results.size()];
		int j = 0;
		for (String result : results) {
			resultsArrays[j] = result;
			j++;
		}
		return resultsArrays;
	}

	public static void main(final String[] args) {
		FindOccurences findOccurences = new FindOccurences();
		PrinterFunctions
				.printArray(findOccurences.findOcurrences("alice is a good girl she is a good student", "a", "good"));
		PrinterFunctions.printArray(findOccurences.findOcurrences("we will we will rock you", "we", "will"));

	}
}
