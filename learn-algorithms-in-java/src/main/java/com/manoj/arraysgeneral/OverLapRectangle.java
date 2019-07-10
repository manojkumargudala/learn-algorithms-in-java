package com.manoj.arraysgeneral;

public class OverLapRectangle {
	// https://leetcode.com/problems/rectangle-overlap/
	public boolean isRectangleOverlap(final int[] rec1, final int[] rec2) {
		return checkOverlap(rec1[0], rec1[2], rec2[0], rec2[2]) && checkOverlap(rec1[1], rec1[3], rec2[1], rec2[3]);
	}

	private boolean checkOverlap(final int i, final int j, final int k, final int l) {
		return !(k >= j || l <= i);
	}

	public static void main(final String[] args) {
		OverLapRectangle overLapRectangle = new OverLapRectangle();
		int[] rec1 = { 0, 0, 2, 2 };
		int[] rec2 = { 1, 1, 3, 3 };
		System.out.println(overLapRectangle.isRectangleOverlap(rec1, rec2));
		int[] rec3 = { 0, 0, 1, 1 };
		int[] rec4 = { 1, 0, 2, 1 };
		System.out.println(overLapRectangle.isRectangleOverlap(rec3, rec4));
		int[] rec5 = { -3, -3, -1, -1 };
		int[] rec6 = { -2, -2, 0, 0 };
		System.out.println(overLapRectangle.isRectangleOverlap(rec5, rec6));
	}
}
