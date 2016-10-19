package com.manoj.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongestCommonSubStringTest {
  LongestCommonSubString lcs;

  @Before
  public void initialize() {
    lcs = new LongestCommonSubString();
  }

  @Test
  public void testData() {
    Assert.assertEquals("etgg", lcs.lcs("testeretretsertfsdgdfgdg", "extgg"));
  }

  @Test
  public void NoMatcher() {
    Assert.assertEquals("", lcs.lcs("testeretretsertfsdgdfgdg", "zxcv"));
  }
}
