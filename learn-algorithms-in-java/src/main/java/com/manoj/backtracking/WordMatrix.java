package com.manoj.backtracking;

public class WordMatrix {
  public int[][] solution;
  int path = 1;
  int matrixLength;

  // initialize the solution matrix in constructor.
  public WordMatrix(final int matrixLength) {
    this.matrixLength = matrixLength;
    solution = new int[matrixLength][matrixLength];
    for (int i = 0; i < matrixLength; i++) {
      for (int j = 0; j < matrixLength; j++) {
        solution[i][j] = 0;
      }
    }
  }

  public boolean searchWord(final char[][] matrix, final String word) {
    for (int i = 0; i < matrixLength; i++) {
      for (int j = 0; j < matrixLength; j++) {
        if (search(matrix, word, i, j, 0)) {
          return true;
        }
      }
    }
    return false;
  }

  public boolean search(final char[][] matrix, final String word, final int row, final int col,
      final int index) {
    // check if current cell not already used or character in it is not not

    if (solution[row][col] != 0 || word.charAt(index) != matrix[row][col]) {
      return false;
    }

    if (index == word.length() - 1) {
      // word is found, return true
      solution[row][col] = path++;
      return true;
    }

    // mark the current cell as 1
    solution[row][col] = path++;
    // check if cell is already used

    if (isSafe(row + 1, col) && search(matrix, word, row + 1, col, index + 1)) {
      // go down
      return true;
    }
    if (isSafe(row - 1, col) && search(matrix, word, row - 1, col, index + 1)) {
      // go up
      return true;
    }
    if (isSafe(row, col + 1) && search(matrix, word, row, col + 1, index + 1)) {
      // go right
      return true;
    }
    if (isSafe(row, col - 1) && search(matrix, word, row, col - 1, index + 1)) {
      // go left
      return true;
    }
    if (isSafe(row - 1, col + 1) && search(matrix, word, row - 1, col + 1, index + 1)) {
      // go diagonally up right
      return true;
    }
    if (isSafe(row - 1, col - 1) && search(matrix, word, row - 1, col - 1, index + 1)) {
      // go diagonally up left
      return true;
    }
    if (isSafe(row + 1, col - 1) && search(matrix, word, row + 1, col - 1, index + 1)) {
      // go diagonally down left
      return true;
    }
    if (isSafe(row + 1, col + 1) && search(matrix, word, row + 1, col + 1, index + 1)) {
      // go diagonally down right
      return true;
    }

    // if none of the option works out, BACKTRACK and return false
    solution[row][col] = 0;
    path--;
    return false;
  }

  public boolean isSafe(final int matrixRowIndex, final int matrixColIndex) {
    if (matrixRowIndex >= 0 && matrixRowIndex < matrixLength && matrixColIndex >= 0
        && matrixColIndex < matrixLength) {
      return true;
    }
    return false;
  }
}
