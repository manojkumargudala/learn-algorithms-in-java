package com.manoj.stackandqueues;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class FindExpressionDuplicateParenthesisTest {
  FindExpressionDuplicateParenthesis findExp;

  @Before
  public void beforeTest() {
    findExp = new FindExpressionDuplicateParenthesis(100);
  }

  @Test
  public void testWithOneBraces() {
    String pattern = "(";
    Assert.assertEquals(pattern, false, findExp.findDuplicateParenthesis(pattern));
  }

  @Test
  public void testAllOpenBraces() {
    String pattern = "(((((((((((((((";
    Assert.assertEquals(pattern, false, findExp.findDuplicateParenthesis(pattern));
  }

  @Test
  public void testData1() {
    String pattern = "(((a+(b)))+(c+d))";
    Assert.assertEquals(pattern, true, findExp.findDuplicateParenthesis(pattern));
  }

  @Test
  public void testData2() {
    String pattern = "((a+b)+((c+d)))";
    Assert.assertEquals(pattern, true, findExp.findDuplicateParenthesis(pattern));
  }

  @Test
  public void testData3() {
    String pattern = "(((a+(b))+c+d))";
    Assert.assertEquals(pattern, true, findExp.findDuplicateParenthesis(pattern));
  }

  @Test
  public void testData4() {
    String pattern = "((a+b)+(c+d))";
    Assert.assertEquals(pattern, false, findExp.findDuplicateParenthesis(pattern));
  }

  @Test
  public void testData5() {
    String pattern = "((a+(b))+(c+d))";
    Assert.assertEquals(pattern, false, findExp.findDuplicateParenthesis(pattern));
  }
}
