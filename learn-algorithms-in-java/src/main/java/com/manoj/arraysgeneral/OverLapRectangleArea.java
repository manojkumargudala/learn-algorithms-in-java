package com.manoj.arraysgeneral;

public class OverLapRectangleArea {
	// https://leetcode.com/problems/rectangle-area/
	public int computeArea(final int A, final int B, final int C, final int D, final int E, final int F, final int G,
			final int H) {
		return checkAreaOfRectange(A, B, C, D) + checkAreaOfRectange(E, F, G, H)
				- checkCommonArea(A, B, C, D, E, F, G, H);
	}

	private int checkAreaOfRectange(final int a, final int b, final int c, final int d) {
		System.out.println("Areas is " + mod((c - a) * (d - b)));
		return mod((c - a) * (d - b));
	}

	private int mod(final int i) {
		if (i > 0) {
			return i;
		}
		return 0 - i;
	}

	private int checkCommonArea(final int A, final int B, final int C, final int D, final int E, final int F,
			final int G, final int H) {
		if (checkOverlap(A, C, E, G) && checkOverlap(B, D, F, H)) {
			return 0;
		} else {
			int iLeft = Math.max(A, E);
			int iRight = Math.min(C, G);
			int iTop = Math.max(B, F);
			int iBottom = Math.min(D, H);
			System.out.println(iLeft + "\t" + iRight + "\t" + iTop + "\t" + iBottom);
			System.out.println((iRight - iLeft) + "\t" + (iBottom - iTop));

			int commonArea = Math.max(0, iRight - iLeft) * Math.max(0, iBottom - iTop);
			System.out.println(commonArea);
			return commonArea;
		}
	}

	private boolean checkOverlap(final int i, final int j, final int k, final int l) {
		return !(k >= j || l <= i);
	}

	public static void main(final String[] args) {
		OverLapRectangleArea overLapRectangle = new OverLapRectangleArea();
		// System.out.println(overLapRectangle.computeArea(0, 0, 2, 2, 1, 1, 3,
		// 3));
		// System.out.println(overLapRectangle.computeArea(0, 0, 1, 1, 1, 0, 2,
		// 1));
		// System.out.println(overLapRectangle.computeArea(-3, -3, -1, -1, -2,
		// -2, 0, 0));
		// System.out.println(overLapRectangle.computeArea(-3, 0, 3, 4, 0, -1,
		// 9, 2));
		// System.out.println(overLapRectangle.computeArea(0, 0, 0, 0, -1, -1,
		// 1, 1));
		// System.out.println(overLapRectangle.computeArea(-1, -1, 1, 1, 0, 0,
		// 0, 0));
		// System.out.println(overLapRectangle.computeArea(-1, -1, 1, 1, 0, 0,
		// 0, 0));

		// System.out.println(overLapRectangle.computeArea(-2, -2, 2, 2, -1, -1,
		// 1, 1));
		System.out.println(overLapRectangle.computeArea(-1, 0, 0, 1, 1, 0, 1, 1));

		System.out.println(overLapRectangle.computeArea(-1500000001, 0, -1500000000, 1, 1500000001, 0, 1500000001, 1));

	}
}
