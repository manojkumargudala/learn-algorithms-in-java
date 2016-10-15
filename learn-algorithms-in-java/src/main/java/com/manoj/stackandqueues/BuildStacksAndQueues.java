package com.manoj.stackandqueues;

public class BuildStacksAndQueues {
  public static <T> void BuildStack(final StackWithArray<T> stack, final T[] arrayStack) {
    for (T data : arrayStack) {
      stack.push(data);
    }
  }
}
