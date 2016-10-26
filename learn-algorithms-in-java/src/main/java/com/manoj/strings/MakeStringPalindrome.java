package com.manoj.strings;

public class MakeStringPalindrome {
  public String palindrome(final String baseString) {
    int start = 0;
    int end = baseString.length() - 1;
    if (isPalindrome(baseString, start, end))
      return "";
    else {
      start++;
      while (start < end) {
        if (isPalindrome(baseString, start, end)) {
          break;
        }
        start++;
      }
      // System.out.println("start value us " + start);
      int loopEnd = start;
      StringBuilder str = new StringBuilder();
      for (int i = 0; i < loopEnd; i++) {
        str.append(baseString.charAt(--start));
      }
      return str.toString();
    }
  }

  public String leastPalindrome(final String baseString) {
    String start = palindrome(baseString);
    String reverse = palindrome(new StringBuilder(baseString).reverse().toString());
    if (start.length() > reverse.length()) {
      return reverse;
    } else {
      return start;
    }
  }

  public boolean isPalindrome(final String input, int start, int end) {
    boolean isPalindrome = true;
    while (start < end) {
      if (input.charAt(start) != input.charAt(end)) {
        isPalindrome = false;
        break;
      }
      start++;
      end--;
    }
    return isPalindrome;

  }

  public static void main(final String[] args) {

    MakeStringPalindrome test = new MakeStringPalindrome();
    System.out.println(test.leastPalindrome("NITI"));
    System.out.println(test.leastPalindrome("aaab"));

    System.out.println(test.leastPalindrome("baaa"));

    System.out.println(test.palindrome("abb"));
    System.out.println(test.palindrome("abc"));
    System.out.println(test.palindrome("abcde"));
    System.out.println(test.palindrome("abcaba"));
    System.out.println(test.palindrome("system"));



  }
}
