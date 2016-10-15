package com.manoj.common;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateData {
  public static String[] generateArrayOfStrings(final int countOfString, final int stringLength) {
    return (String[]) (generateArrayListOfStrings(countOfString, stringLength)).toArray();
  }

  public static List<String> generateArrayListOfStrings(final int countOfString,
      final int stringLength) {
    List<String> strlst = new ArrayList<String>();
    for (int i = 0; i < countOfString; i++) {
      strlst.add(RandomStringUtils.randomAlphanumeric(stringLength));
    }
    return strlst;
  }
}
