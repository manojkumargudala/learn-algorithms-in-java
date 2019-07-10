package com.manoj.matrix;

public class KthElementInSortedMatrix {
	public int kthSmallest(final int[][] matrix, final int k) {
		// System.out.println(matrix[0].length);
		// System.out.println(k / matrix[0].length);
		// System.out.println(matrix.length);
		// System.out.println(k - (matrix[0].length * (k / matrix[0].length)));
		int coloumn = k - (matrix[0].length * (k / matrix[0].length));
		// System.out.println("coloumn " + coloumn);
		int row = k / matrix[0].length;
		// System.out.println("row " + row);
		return matrix[row == 0 ? 0 : coloumn == 0 ? row - 1 : row][coloumn == 0 ? matrix[0].length - 1 : coloumn - 1];
	}

	public static void main(final String[] args) {
		int[][] matrixq = { { 1, 5, 6, 7 }, { 10, 11, 12, 13 }, { 14, 15, 16, 17 }, { 26, 27, 28, 29 } };
		int[][] matrix = { { 1, 5 }, { 26, 27 } };

		KthElementInSortedMatrix kthElementInSortedMatrix = new KthElementInSortedMatrix();
		System.out.println(kthElementInSortedMatrix.kthSmallest(matrix, 2));

	}
}
