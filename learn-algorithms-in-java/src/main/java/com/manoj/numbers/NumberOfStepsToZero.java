package com.manoj.numbers;

public class NumberOfStepsToZero {
	public int numberOfSteps(int num) {
		int numberOfSteps = 0;
		while (num != 0) {
			if (num % 2 == 0) {
				num = num / 2;
			} else {
				num = num - 1;
			}
			numberOfSteps++;
		}
		return numberOfSteps;

	}

	public static void main(String[] args) {
		NumberOfStepsToZero numberOfStepsToZero = new NumberOfStepsToZero();
		System.out.println(numberOfStepsToZero.numberOfSteps(1000000));
	}
}
