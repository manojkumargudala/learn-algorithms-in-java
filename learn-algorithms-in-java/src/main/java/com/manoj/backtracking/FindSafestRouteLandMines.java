package com.manoj.backtracking;

public class FindSafestRouteLandMines {
  int rowNum[] = {-1, 0, 0, 1};
  int colNum[] = {0, -1, 1, 0};
  int numberOfRows;
  int numberOfColoumns;
  int min_dist = Integer.MAX_VALUE;
  int mat[][];
  boolean[][] visited;

  public FindSafestRouteLandMines(final int[][] mat) {
    this.numberOfRows = mat.length;
    this.numberOfColoumns = mat[0].length;
    this.mat = mat;
    visited = new boolean[numberOfRows][numberOfColoumns];
  }

  public int findShortestPath() {

    markUnsafeCells(mat);
    for (int i = 0; i < numberOfRows; i++) {
      if (mat[i][0] == 1) {
        initialzeVisitedToFalse(visited, numberOfRows, numberOfColoumns);
        findShortestPathUtil(i, 0, 0);
        if (min_dist == numberOfColoumns - 1)
          break;
      }
    }

    if (min_dist != Integer.MAX_VALUE) {
      System.out.println("Length of shortest safe route is min_dist " + min_dist);
      return min_dist;
    }

    else {
      System.out.println("Destination not reachable from  given source");
      return -1;
    }
  }

  private void findShortestPathUtil(final int i, final int j, final int dist) {
    if (j == numberOfColoumns - 1) {
      min_dist = Math.min(dist, min_dist);
      return;
    }

    if (dist > min_dist)
      return;

    visited[i][j] = true;

    for (int k = 0; k < 4; k++) {
      if (checkValidCellMove(i, j, k)) {
        findShortestPathUtil(i + rowNum[k], j + colNum[k], dist + 1);
      }
    }

    visited[i][j] = false;
  }

  private boolean checkValidCellMove(final int i, final int j, int k) {
    return isValid(i + rowNum[k], j + colNum[k])
        && isSafe(mat, visited, i + rowNum[k], j + colNum[k]);
  }

  private boolean isSafe(final int[][] mat, final boolean[][] visited, final int x, final int y) {
    if (mat[x][y] == 0 || visited[x][y])
      return false;

    return true;
  }

  private void initialzeVisitedToFalse(final boolean[][] visited, final int row, final int column) {
    for (int i = 0; i < row; i++)
      for (int j = 0; j < column; j++)
        visited[i][j] = false;

  }

  private void markUnsafeCells(final int mat[][]) {
    for (int i = 0; i < numberOfRows; i++) {
      for (int j = 0; j < numberOfColoumns; j++) {
        if (mat[i][j] == 0) {
          // mark all adjacent cells
          for (int k = 0; k < 4; k++)
            if (isValid(i + rowNum[k], j + colNum[k]))
              mat[i + rowNum[k]][j + colNum[k]] = -1;
        }
      }
    }

    for (int i = 0; i < numberOfRows; i++) {
      for (int j = 0; j < numberOfColoumns; j++) {
        if (mat[i][j] == -1)
          mat[i][j] = 0;
      }
    }

  }

  private boolean isValid(final int i, final int j) {
    if (i < numberOfRows && j < numberOfColoumns && i >= 0 && j >= 0)
      return true;
    return false;
  }
}
