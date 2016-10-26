package com.manoj.trees;

public class MyTreeNode<T extends Comparable<T>> {
  private MyTreeNode<T> left;
  private T data;
  private int level;
  private String name;
  private MyTreeNode<T> right;
  private MyTreeNode<T> parent;

  public MyTreeNode(final T data, final String name) {
    this.data = data;
    this.name = name;
  }

  public MyTreeNode<T> getLeft() {
    return left;
  }

  public void setLeft(final MyTreeNode<T> left) {
    this.left = left;
  }

  public T getData() {
    return data;
  }

  public void setData(final T data) {
    this.data = data;
  }

  public MyTreeNode<T> getRight() {
    return right;
  }

  public void setRight(final MyTreeNode<T> right) {
    this.right = right;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(final int level) {
    this.level = level;
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name + " has the key " + data + " is at level " + level;
  }

  public MyTreeNode<T> getParent() {
    return parent;
  }

  public void setParent(MyTreeNode<T> parent) {
    this.parent = parent;
  }
}
