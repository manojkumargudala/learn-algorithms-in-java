package com.manoj.stackandqueues;

import java.util.EmptyStackException;

public class StackWithLinkedList<T> {

  private MyNode<T> top;

  public T pop() {
    if (top == null)
      throw new EmptyStackException();
    T item = top.getData();
    top = top.getNext();
    return item;
  }

  public void push(final T item) {
    MyNode<T> t = new MyNode<T>(item);
    top = t.getNext();
    top = t;
  }

  public T peek() {
    if (top == null)
      throw new EmptyStackException();
    return top.getData();
  }

  public boolean isEmpty() {
    return top == null;
  }
}
