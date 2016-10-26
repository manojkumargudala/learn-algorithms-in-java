package com.manoj.trees;

public class BuildBinaryTree<T extends Comparable<T>> {

  MyTreeNode<T> root;

  public void addNode(final T key, final String name) {
    MyTreeNode<T> newNode = new MyTreeNode<T>(key, name);
    if (root == null) {
      root = newNode;
      root.setLevel(0);
    } else {
      MyTreeNode<T> focusNode = root;
      MyTreeNode<T> parent;
      while (true) {
        parent = focusNode;
        if (focusNode.getData().compareTo(key) < 0) {
          focusNode = focusNode.getLeft();
          if (focusNode == null) {
            parent.setLeft(newNode);
            newNode.setParent(parent);
            break;
          }
        } else {
          focusNode = focusNode.getRight();
          if (focusNode == null) {
            parent.setRight(newNode);
            newNode.setParent(parent);
            break;
          }
        }
      }
      newNode.setLevel(parent.getLevel() + 1);
      return;
    }
  }


  public void inOrderTraverseTree(final MyTreeNode<T> focusNode) {
    if (focusNode != null) {
      inOrderTraverseTree(focusNode.getLeft());
      System.out.println(focusNode);
      inOrderTraverseTree(focusNode.getRight());
    }
  }

  public void preorderTraverseTree(final MyTreeNode<T> focusNode) {
    if (focusNode != null) {
      System.out.println(focusNode);
      preorderTraverseTree(focusNode.getLeft());
      preorderTraverseTree(focusNode.getRight());
    }
  }

  public void postOrderTraverseTree(final MyTreeNode<T> focusNode) {
    if (focusNode != null) {
      postOrderTraverseTree(focusNode.getLeft());
      postOrderTraverseTree(focusNode.getRight());
      System.out.println(focusNode);
    }
  }

  public MyTreeNode<T> findNode(final T key) {

    MyTreeNode<T> focusNode = root;
    while (focusNode.getData() != key) {
      if (focusNode.getData().compareTo(key) < 0) {
        focusNode = focusNode.getLeft();
      } else {
        focusNode = focusNode.getRight();
      }
      if (focusNode == null)
        return null;
    }
    return focusNode;
  }


  public void delete(final T toDelete) {
    root = delete(root, toDelete);
  }

  private MyTreeNode<T> delete(final MyTreeNode<T> p, final T toDelete) {
    if (p == null)
      throw new RuntimeException("cannot delete.");
    else if (p.getData().compareTo(toDelete) < 0)
      p.setLeft(delete(p.getLeft(), toDelete));
    else if (p.getData().compareTo(toDelete) > 0)
      p.setRight(delete(p.getRight(), toDelete));
    else {
      if (p.getLeft() == null)
        return p.getRight();
      else if (p.getRight() == null)
        return p.getLeft();
      else {
        p.setData(retrieveData(p.getLeft()));
        p.setLeft(delete(p.getLeft(), p.getData()));
      }
    }
    return p;
  }

  private T retrieveData(MyTreeNode<T> p) {
    while (p.getRight() != null)
      p = p.getRight();
    System.out.println("data retreived is " + p.getData());
    return p.getData();
  }

}

