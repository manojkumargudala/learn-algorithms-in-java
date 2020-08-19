package com.manoj.numbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PowerFulIntegers {
	public List<Integer> powerfulIntegers(final int x, final int y, final int bound) {
		long startTime = (new Date()).getTime();
		List<Integer> integerList = new ArrayList<Integer>();
		int maxBound = (bound - 1) / (x > y ? y : x);
		for (int i = 0; i <= maxBound; i++) {
			for (int j = 0; j <= maxBound; j++) {
				int result = (int) (Math.pow(x, i) + Math.pow(y, j));
				if (result <= bound) {
					if (!integerList.contains(result)) {
						integerList.add(result);
					}
				}
			}
		}
		Collections.sort(integerList);
		long endTime = ((new Date()).getTime()) - startTime;
		System.out.println(endTime);
		return integerList;

	}

	public List<Integer> powerfulIntegers1(final int x, final int y, final int bound) {
		long startTime = (new Date()).getTime();
		Set<Integer> s = new HashSet<Integer>();
		for (int i = 0; i <= (x == 1 ? 0 : Math.log(bound) / Math.log(x)); i++) {
			for (int j = 0; j <= (y == 1 ? 0 : Math.log(bound) / Math.log(y)); j++) {
				int powerful = ((int) Math.pow(x, i)) + ((int) Math.pow(y, j));
				if (powerful <= bound) {
					s.add(powerful);
				}
			}
		}
		long endTime = ((new Date()).getTime()) - startTime;
		System.out.println(endTime);
		return new ArrayList<Integer>(s);
	}

	public static void main(final String[] args) {
		PowerFulIntegers powerFulIntegers = new PowerFulIntegers();
		List<Integer> ints = powerFulIntegers.powerfulIntegers(1, 1, 1000000);
		System.out.println(ints);
		ints = powerFulIntegers.powerfulIntegers1(1, 1, 1000000);
		System.out.println(ints);

	}
}
