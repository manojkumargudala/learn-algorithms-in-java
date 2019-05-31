package com.manoj.trees;

import java.util.Stack;

public class RangeSumOfBst {
	int sum = 0;

	public int rangeSumBST1(final TreeNode root, final int L, final int R) {
		postOrderTraverseTree(root, L, R);
		return sum;

	}

	public void postOrderTraverseTree(final TreeNode focusNode, final int L, final int H) {
		if (focusNode != null) {
			postOrderTraverseTree(focusNode.left, L, H);
			postOrderTraverseTree(focusNode.right, L, H);
			if (focusNode.val > L && focusNode.val < H) {
				sum = sum + focusNode.val;
			}
		}

	}

	public int rangeSumBST(final TreeNode root, final int L, final int R) {
		int i = 0;
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			if (node.left != null) {
				stack.push(node.left);
			}
			if (node.right != null) {
				stack.push(node.right);
			}
			if (node.val > L && node.val < R) {
				i = i + node.val;
			}
		}
		return i;
	}
}
