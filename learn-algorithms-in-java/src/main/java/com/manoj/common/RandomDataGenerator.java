package com.manoj.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomDataGenerator {
  public static int[] populateArrayFrom(final int beginIndex, final int endIndex,
      final int numbers) {
    int[] ar1 = new int[numbers];
    for (int i = 0; i < ar1.length; i++) {
      ar1[i] = (int) (Math.random() * (endIndex - beginIndex));
    }
    return ar1;
  }

  public static int[] populateArrayFrom(final int numbers) {
    return populateArrayFrom(0, numbers, numbers);
  }

  public static List<Integer> populateArrayListFrom(final int numbers) {
    List<Integer> lst = new ArrayList<Integer>();
    for (Integer data : populateArrayFrom(0, numbers, numbers)) {
      lst.add(data);
    }
    return lst;
  }

  public static int getRandomNumberBetween(final int min, final int max) {
    Random foo = new Random();
    int randomNumber = foo.nextInt(max - min) + min;
    if (randomNumber == min) {
      return min + 1;
    } else {
      return randomNumber;
    }

  }
}
