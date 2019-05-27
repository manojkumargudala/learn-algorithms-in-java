package com.manoj.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeafNodeSimilar {
	public boolean leafSimilar(final TreeNode root1, final TreeNode root2) {
		List<Integer> leafValues = new ArrayList<Integer>();
		postOrderTraverseTree(root1, leafValues);
		List<Integer> leafValues2 = new ArrayList<Integer>();
		postOrderTraverseTree(root2, leafValues2);
		return leafValues.equals(leafValues2);
	}

	public boolean leafSimilar1(final TreeNode root1, final TreeNode root2) {
		List<Integer> leafValues1 = getLeafNodes(root1);
		List<Integer> leafValues2 = getLeafNodes(root2);
		return leafValues1.equals(leafValues2);
	}

	public List<Integer> getLeafNodes(final TreeNode root) {
		List<Integer> leafValues = new ArrayList<Integer>();
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
			if (node.left == null && node.right == null) {
				leafValues.add(node.val);
			}
		}
		return leafValues;
	}

	public void postOrderTraverseTree(final TreeNode focusNode, final List<Integer> leafValues) {
		if (focusNode != null) {
			postOrderTraverseTree(focusNode.left, leafValues);
			postOrderTraverseTree(focusNode.right, leafValues);
			if (focusNode.left == null && focusNode.right == null) {
				leafValues.add(focusNode.val);
			}
		}
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(final int x) {
		val = x;
	}
}
