package com.manoj.strings;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindromeSubString {
  List<String> stringList = new ArrayList<String>();

  public String longestPalindrome(final String s) {
    if (s == null || s.length() <= 1)
      return s;

    int len = s.length();
    int maxLen = 1;
    boolean[][] dp = new boolean[len][len];

    String longest = null;
    for (int index = 0; index < s.length(); index++) {
      for (int i = 0; i < len - index; i++) {
        int j = i + index;
        System.out.println("i\t" + i + " j\t" + j + " index \t" + index);
        if (s.charAt(i) == s.charAt(j) && (j - i <= 2 || dp[i + 1][j - 1])) {
          dp[i][j] = true;
          if (j - i + 1 > maxLen) {
            maxLen = j - i + 1;
            longest = s.substring(i, j + 1);
            stringList = new ArrayList<String>();
            stringList.add(longest);
          }
          if (j - i + 1 == maxLen) {
            maxLen = j - i + 1;
            stringList.add(s.substring(i, j + 1));
          }
        }
      }
    }
    return longest;
  }
}
