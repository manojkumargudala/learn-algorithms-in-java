package com.manoj.stackandqueues;

import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.manoj.common.GenerateData;
import com.manoj.common.RandomDataGenerator;

public class SpecialStackWithMinimumTest {
  List<String> randomGeneratedString;
  SpecialStackWithMinimum<String> stk;

  @Before
  public void generateStack() {
    randomGeneratedString = GenerateData.generateArrayListOfStrings(20, 5);
    stk = new SpecialStackWithMinimum<String>(20);
  }

  @Test
  public void testRandom() {
    for (String str : randomGeneratedString) {
      stk.push(str);
    }
    for (int i = 0; i < 15; i++) {
      randomGeneratedString.remove(stk.pop());
      Assert.assertEquals(Collections.min(randomGeneratedString), stk.getMinimum());
    }
  }

  @Test
  public void testWithNumbers() {
    SpecialStackWithMinimum<Integer> stkNbr = new SpecialStackWithMinimum<Integer>(20);
    List<Integer> randomNbrLst = RandomDataGenerator.populateArrayListFrom(10);
    for (Integer str : randomNbrLst) {
      stkNbr.push(str);
    }
    for (int i = 0; i < 9; i++) {
      System.out.println("the minimun nbr is " + stkNbr.getMinimum());
      randomNbrLst.remove(stkNbr.pop());
      Assert.assertEquals(Collections.min(randomNbrLst), stkNbr.getMinimum());
    }
  }

  @Test
  public void testWithNumbersWithOwnData() {
    SpecialStackWithMinimum<Integer> stkNbr = new SpecialStackWithMinimum<Integer>(20);
    int[] randomNbr = {8, 7, 1, 3, 8, 5, 3, 6, 2, 1};
    for (Integer str : randomNbr) {
      stkNbr.push(str);
    }
    for (int i = 0; i < 4; i++) {
      System.out.println("the minimun nbr is " + stkNbr.getMinimum());
      System.out.println("Nubmer poped out is " + stkNbr.pop());
    }
    Assert.assertEquals(1, (int) stkNbr.getMinimum());
    for (int i = 0; i < 4; i++) {
      System.out.println("the minimun nbr is " + stkNbr.getMinimum());
      System.out.println("Nubmer poped out is " + stkNbr.pop());
    }
    Assert.assertEquals(7, (int) stkNbr.getMinimum());
  }
}
