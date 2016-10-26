package com.manoj.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BstSearching {
  public MyTreeNode<Integer> breadthFirstTraversal(final MyTreeNode<Integer> root, final int key) {
    Queue<MyTreeNode<Integer>> queue = new LinkedList<MyTreeNode<Integer>>();
    queue.add(root);
    while (!queue.isEmpty()) {
      MyTreeNode<Integer> node = queue.peek();
      if (node.getData() == key) {
        return node;
      }
      queue.poll();
      if (node.getLeft() != null) {
        queue.add(node.getLeft());
      }
      if (node.getRight() != null) {
        queue.add(node.getRight());
      }
    }
    return null;
  }

  public MyTreeNode<Integer> depthFirstTraversal(final MyTreeNode<Integer> root, final int key) {
    Stack<MyTreeNode<Integer>> stack = new Stack<MyTreeNode<Integer>>();
    stack.push(root);
    while (!stack.isEmpty()) {
      MyTreeNode<Integer> node = stack.peek();
      if (node.getData() == key) {
        return node;
      }
      stack.pop();
      if (node.getLeft() != null) {
        stack.push(node.getLeft());
      }
      if (node.getRight() != null) {
        stack.push(node.getRight());
      }
    }
    return null;
  }
}
