package com.manoj.strings;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmail {
	// https://leetcode.com/problems/unique-email-addresses/
	public int numUniqueEmails(final String[] emails) {
		Set<String> test = new HashSet<String>();
		for (String email : emails) {
			String localName = email.substring(0, email.indexOf("@")).replaceAll("\\.", "");
			localName = localName.substring(0,
					localName.indexOf("+") == -1 ? localName.length() : localName.indexOf("+"));
			test.add(localName + email.substring(email.indexOf("@"), email.length()));
		}
		return test.size();

	}

	public static void main(final String[] args) {
		UniqueEmail uniqueEmail = new UniqueEmail();
		String[] emails = { "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com",
				"testemail+david@lee.tcode.com" };

		System.out.println(uniqueEmail.numUniqueEmails(emails));
	}
}
