package com.manoj.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class MakeStringPalindromTest {
  MakeStringPalindrome mkstr;

  @Before
  public void initialize() {
    mkstr = new MakeStringPalindrome();
  }

  @Test
  public void addinstarting() {
    Assert.assertEquals("b", mkstr.leastPalindrome("aaab"));
  }

  @Test
  public void addinEndig() {
    Assert.assertEquals("b", mkstr.leastPalindrome("baaa"));
  }

  @Test
  public void addinstartingprefix() {
    Assert.assertEquals("be", mkstr.leastPalindrome("aaabe"));
  }

  @Test
  public void addinEndigSuffix() {
    Assert.assertEquals("be", mkstr.leastPalindrome("ebaaa"));
  }

  @Test
  public void totalUnMatching() {
    Assert.assertEquals("onmlkjihgfedcba", mkstr.leastPalindrome("abcdefghijklmnop"));
  }

  @Test
  public void alreadyPalindrome() {
    Assert.assertEquals("", mkstr.leastPalindrome("baaab"));
  }
}
