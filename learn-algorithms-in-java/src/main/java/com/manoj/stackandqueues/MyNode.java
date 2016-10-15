package com.manoj.stackandqueues;

public class MyNode<T> {
  private final T data;
  private MyNode<T> next;

  public MyNode(final T data) {
    this.data = data;
  }

  public T getData() {
    return data;
  }

  public MyNode<T> getNext() {
    return next;
  }

  public void setNext(MyNode<T> next) {
    this.next = next;
  }
}
