package com.manoj.arraysgeneral;

import org.junit.Before;
import org.junit.Test;

import com.manoj.common.PrinterFunctions;
import com.manoj.common.RandomDataGenerator;

public class SumOfSubsetsGivenSetTest {
	SumOfSubsetsGivenSet sumofsubset;

	@Before
	public void initialize() {
		sumofsubset = new SumOfSubsetsGivenSet();
	}

	// @Test
	public void randomSetOf10Nbrs() {
		int[] populateArrayFrom = RandomDataGenerator.populateArrayFrom(10);
		PrinterFunctions.printArray(populateArrayFrom);
		sumofsubset.subSetSum(populateArrayFrom);
	}

	@Test
	public void mySetOf10Nbrs() {
		int arr[] = { 5, 4, 3 };
		sumofsubset.subSetSum(arr);

	}
}
