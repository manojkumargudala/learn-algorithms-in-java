package com.manoj.linkedlist;

public class Node<T> {
  private T data;
  private Node<T> next;

  Node(final T d) {
    setData(d);
    setNext(null);
  }

  public T getData() {
    return data;
  }

  public void setData(final T data) {
    this.data = data;
  }

  public Node<T> getNext() {
    return next;
  }

  public void setNext(final Node<T> next) {
    this.next = next;
  }

  @Override
  public String toString() {
    return "Node data is " + data;
  }

}
