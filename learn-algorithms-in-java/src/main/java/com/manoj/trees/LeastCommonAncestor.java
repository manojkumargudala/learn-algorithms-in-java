package com.manoj.trees;

public class LeastCommonAncestor {
//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
	public TreeNode lowestCommonAncestor(final TreeNode root, final TreeNode p, final TreeNode q) {
		if (root.val > p.val && root.val > q.val) {
			return lowestCommonAncestor(root.left, p, q);
		} else {
			if (root.val < p.val && root.val < q.val) {
				return lowestCommonAncestor(root.right, p, q);
			} else {
				return root;
			}
		}
	}
}
