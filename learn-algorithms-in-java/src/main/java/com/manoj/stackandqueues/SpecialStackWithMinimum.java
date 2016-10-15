package com.manoj.stackandqueues;

public class SpecialStackWithMinimum<T extends Comparable<T>> {
  StackWithArray<T> mainStack;
  StackWithArray<T> minimumStack;

  public SpecialStackWithMinimum(final int size) {
    mainStack = new StackWithArray<>(size);
    minimumStack = new StackWithArray<>(size);
  }

  public void push(final T data) {
    if (mainStack.isEmpty() && minimumStack.isEmpty()) {
      mainStack.push(data);
      minimumStack.push(data);
    } else {
      T top = minimumStack.peek();
      if (top.compareTo(data) >= 0) {
        minimumStack.push(data);
      }
      mainStack.push(data);
    }
  }

  public T pop() {
    T mainData = null;
    if (mainStack.isEmpty() && minimumStack.isEmpty()) {
      System.out.println("Stack is empty");
    } else {
      T minimum = minimumStack.peek();
      mainData = mainStack.pop();
      if (minimum.compareTo(mainData) == 0) {
        minimumStack.pop();
      }
    }
    return mainData;
  }

  public T getMinimum() {
    T minimum = null;
    if (mainStack.isEmpty() && minimumStack.isEmpty()) {
      System.out.println("Stack is empty");
    } else {
      minimum = minimumStack.peek();
    }
    return minimum;
  }
}
