package com.manoj.stackandqueues;

import java.util.ArrayList;
import java.util.List;

public class StackWithArray<T> {

  private int top;
  int size;
  List<T> stack;

  public StackWithArray(final int size) {
    this.size = size;
    stack = new ArrayList<T>(size);
    top = -1;
  }

  public void push(final T value) {
    if (top == size - 1) {
      System.out.println("Stack is full, can't push a value");
    } else {

      top = top + 1;
      stack.add(value);
    }
  }

  public T peek() {
    return stack.get(top);
  }

  public T pop() {
    T popel = null;
    if (!isEmpty()) {
      popel = stack.get(top);
      top = top - 1;
    } else {
      System.out.println("Can't pop...stack is empty");
    }
    return popel;
  }

  public boolean isEmpty() {
    return top == -1;
  }

  public void display() {
    for (int i = 0; i <= top; i++) {
      System.out.print(stack.get(i) + " ");
    }
    System.out.println();
  }
}
