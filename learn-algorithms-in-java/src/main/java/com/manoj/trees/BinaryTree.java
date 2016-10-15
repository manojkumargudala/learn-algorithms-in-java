package com.manoj.trees;

import com.manoj.common.PrintTreeData;

public class BinaryTree {

  MyTreeNode<Integer> root;

  public void addNode(final int key, final String name) {
    MyTreeNode<Integer> newNode = new MyTreeNode<Integer>(key, name);
    if (root == null) {
      root = newNode;
      root.setLevel(0);
    } else {
      MyTreeNode<Integer> focusNode = root;
      MyTreeNode<Integer> parent;
      while (true) {
        parent = focusNode;
        if (key < focusNode.getData()) {
          focusNode = focusNode.getLeft();
          if (focusNode == null) {
            parent.setLeft(newNode);
            break;
          }
        } else {
          focusNode = focusNode.getRight();
          if (focusNode == null) {
            parent.setRight(newNode);
            break;
          }
        }
      }
      newNode.setLevel(parent.getLevel() + 1);
      return;
    }
  }


  public void inOrderTraverseTree(final MyTreeNode<Integer> focusNode) {
    if (focusNode != null) {
      inOrderTraverseTree(focusNode.getLeft());
      System.out.println(focusNode);
      inOrderTraverseTree(focusNode.getRight());
    }
  }

  public void preorderTraverseTree(final MyTreeNode<Integer> focusNode) {
    if (focusNode != null) {
      System.out.println(focusNode);
      preorderTraverseTree(focusNode.getLeft());
      preorderTraverseTree(focusNode.getRight());
    }
  }

  public void postOrderTraverseTree(final MyTreeNode<Integer> focusNode) {
    if (focusNode != null) {
      postOrderTraverseTree(focusNode.getLeft());
      postOrderTraverseTree(focusNode.getRight());
      System.out.println(focusNode);
    }
  }

  public MyTreeNode<Integer> findNode(final int key) {

    MyTreeNode<Integer> focusNode = root;
    while (focusNode.getData() != key) {
      if (key < focusNode.getData()) {
        focusNode = focusNode.getLeft();
      } else {
        focusNode = focusNode.getRight();
      }
      if (focusNode == null)
        return null;
    }
    return focusNode;
  }

  public static void main(final String[] args) {

    BinaryTree theTree = new BinaryTree();

    theTree.addNode(50, "Boss");

    theTree.addNode(25, "Vice President");

    theTree.addNode(15, "Office Manager");
    theTree.addNode(10, "Customer");

    theTree.addNode(30, "Secretary");

    theTree.addNode(75, "Sales Manager");

    theTree.addNode(85, "Salesman 1");

    // Different ways to traverse binary trees

    theTree.inOrderTraverseTree(theTree.root);

    // theTree.preorderTraverseTree(theTree.root);

    // theTree.postOrderTraverseTree(theTree.root);

    // Find the node with key 75
    PrintTreeData.printNode(theTree.root);
    System.out.println("\nNode with the key 75");

    System.out.println(theTree.findNode(75));

  }
}

