package com.manoj.common;

public class PrinterFunctions {
	public static void printArray(final int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();
	}

	public static void printArray(final int[][] array2d) {
		for (int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d.length; j++) {
				System.out.print(" " + array2d[i][j]);
			}
			System.out.println();
		}
	}

	public static void printArray(final char[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(" " + matrix[i][j]);
			}
			System.out.println();
		}

	}

	public static void printArray(final String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();
	}
}
