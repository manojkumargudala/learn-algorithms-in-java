package com.manoj.matrix;

public class TraverseMatrixSpiral {
  public void traverseMatrix(final int a[][]) {
    int coloumLength = a[0].length;
    int rowLength = a.length;
    int rowIndex = 0, coloumnIndex = 0;
    while (rowIndex < rowLength && coloumnIndex < coloumLength) {
      for (int i = 0; i < coloumLength; i++) {
        System.out.println(a[rowIndex][i]);
      }
      rowIndex++;
      for (int i = rowIndex; i < rowLength; i++) {
        System.out.println(a[i][coloumLength - 1]);
      }
      coloumLength--;
      if (rowIndex < rowLength) {
        for (int i = coloumLength - 1; i >= coloumnIndex; i--) {
          System.out.println(a[rowLength - 1][i]);
        }
        rowLength--;
      }
      if (coloumnIndex < coloumLength) {
        for (int i = rowLength - 1; i >= rowIndex; i--) {
          System.out.println(a[i][coloumnIndex]);
        }
        coloumnIndex++;
      }
    }
  }

  public static void main(final String[] args) {
    int a[][] = {{1, 2, 3, 4, 5, 6}, {7, 8, 9, 10, 11, 12}, {13, 14, 15, 16, 17, 18}};
    TraverseMatrixSpiral trsspl = new TraverseMatrixSpiral();
    trsspl.traverseMatrix(a);


  }
}
