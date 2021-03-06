package com.manoj.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongestPalindromeSubStringTest {
  LongestPalindromeSubString lgstPlnd;

  @Before
  public void initialize() {
    lgstPlnd = new LongestPalindromeSubString();
  }

  @Test
  public void testWithAllPalindrome() {
    String s = "qawsedrdeswaq";
    Assert.assertEquals(s, lgstPlnd.longestPalindrome(s));

  }

  @Test
  public void testWithTwoPalindromeWithSameLength() {
    String s = "qawsedrdeswaqxyzabcdcbazyx";
    Assert.assertEquals("qawsedrdeswaq", lgstPlnd.longestPalindrome(s));
    for (String str : lgstPlnd.stringList) {
      System.out.println(str);
    }

  }

  @Test
  public void testWithAllPalindromeA() {
    String s = "qawsedrdeswaqa";
    Assert.assertEquals("qawsedrdeswaq", lgstPlnd.longestPalindrome(s));

  }
}
