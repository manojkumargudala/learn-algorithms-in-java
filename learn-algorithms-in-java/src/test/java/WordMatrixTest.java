import org.junit.Assert;
import org.junit.Test;

import com.manoj.backtracking.WordMatrix;
import com.manoj.common.PrinterFunctions;

public class WordMatrixTest {
	@Test
	public void simpleTest() {
		int[][] solution = { { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 1, 2, 3, 4 },
				{ 0, 0, 0, 0, 0 } };
		char[][] matrix = { { 't', 'z', 'x', 'c', 'd' }, { 'a', 'h', 'n', 'z', 'x' }, { 'h', 'w', 'o', 'i', 'o' },
				{ 'o', 'r', 'n', 'r', 'n' }, { 'a', 'b', 'r', 'i', 'n' } };
		PrinterFunctions.printArray(matrix);
		System.out.println("\n");
		WordMatrix wordMatrix = new WordMatrix(matrix.length);
		System.out.println("\n");
		if (wordMatrix.searchWord(matrix, "rnrn")) {
			System.out.println("\n");
			PrinterFunctions.printArray(wordMatrix.solution);
			Assert.assertArrayEquals(wordMatrix.solution, solution);
		} else {
			System.out.println("NO PATH FOUND");
		}
	}

	@Test
	public void noWordFinder() {
		int[][] solution = { { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0 } };
		char[][] matrix = { { 't', 'z', 'x', 'c', 'd' }, { 'a', 'h', 'n', 'z', 'x' }, { 'h', 'w', 'o', 'i', 'o' },
				{ 'o', 'r', 'n', 'r', 'n' }, { 'a', 'b', 'r', 'i', 'n' } };
		PrinterFunctions.printArray(matrix);
		System.out.println("\n");
		WordMatrix wordMatrix = new WordMatrix(matrix.length);
		System.out.println("\n");
		if (wordMatrix.searchWord(matrix, "abcdedf")) {
			System.out.println("\n");
			PrinterFunctions.printArray(wordMatrix.solution);
			Assert.assertArrayEquals(wordMatrix.solution, solution);
		} else {
			System.out.println("NO PATH FOUND");
		}
	}
}
