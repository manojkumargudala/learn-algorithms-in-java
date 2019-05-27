package com.manoj.strings;

public class JewelAndStones {
	// https://leetcode.com/problems/jewels-and-stones/
	public int numJewelsInStones(final String J, final String S) {
		int tolStones = 0;
		for (int i = 0; i < S.length(); i++) {
			if (J.indexOf(S.charAt(i)) > -1) {
				tolStones = tolStones + 1;
			}
		}
		return tolStones;
	}

	public static void main(final String[] args) {
		JewelAndStones jewelAndStones = new JewelAndStones();
		System.out.println(jewelAndStones.numJewelsInStones("aA", "aAAbbbba"));
	}
}
