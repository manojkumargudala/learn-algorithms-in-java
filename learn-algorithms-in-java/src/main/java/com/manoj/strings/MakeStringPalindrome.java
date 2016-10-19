package com.manoj.strings;

public class MakeStringPalindrome {
  public String palindrome(final String baseString) {

    char[] input = baseString.toCharArray();

    int start = 0;
    int end = input.length - 1;

    if (isPalindrome(input, start, end))
      return "";
    else {
      start++;
      while (start < end) {
        if (isPalindrome(input, start, end)) {
          break;
        }
        start++;

      }
      char[] toReturn = new char[start];
      for (int i = 0; i < toReturn.length; i++) {
        toReturn[i] = input[--start];
        // start--;
      }
      return new String(toReturn);

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

  public boolean isPalindrome(final char[] input, int start, int end) {
    boolean isPalindrome = true;
    while (start < end) {
      if (input[start] != input[end]) {
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
