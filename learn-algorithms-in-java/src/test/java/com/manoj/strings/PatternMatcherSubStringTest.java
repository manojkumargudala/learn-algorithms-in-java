package com.manoj.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PatternMatcherSubStringTest {
  PatternMatcherSubString ptrnmatchrSubString;

  @Before
  public void intitalize() {
    ptrnmatchrSubString = new PatternMatcherSubString();
  }

  @Test
  public void testEmptyPattern() {
    Assert.assertEquals(-1, ptrnmatchrSubString.searchUsingString("", "adsfsddfdf"));
  }

  @Test
  public void testEmptyText() {
    Assert.assertEquals(-1, ptrnmatchrSubString.searchUsingString("asfsfs", ""));
  }

  @Test
  public void testEmptyBoth() {
    Assert.assertEquals(-1, ptrnmatchrSubString.searchUsingString("", ""));
  }

  @Test
  public void testNullPattern() {
    Assert.assertEquals(-1, ptrnmatchrSubString.searchUsingString(null, "adsfsddfdf"));
  }

  @Test
  public void testNullText() {
    Assert.assertEquals(-1, ptrnmatchrSubString.searchUsingString("asfsfs", null));
  }

  @Test
  public void testNullBoth() {
    Assert.assertEquals(-1, ptrnmatchrSubString.searchUsingString(null, null));
  }

  @Test
  public void testWithtext() {
    Assert.assertEquals(7, ptrnmatchrSubString.searchUsingString("abcd", "ertyuioabcde"));
  }

  @Test
  public void testWithSingleChar() {
    Assert.assertEquals(6, ptrnmatchrSubString.searchUsingString("abcdb", "xyzert"));
  }
}
