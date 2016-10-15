package com.manoj.stackandqueues;

public class FindExpressionDuplicateParenthesis {
  StackWithArray<Character> arrayStack;

  public FindExpressionDuplicateParenthesis(final int size) {
    this.arrayStack = new StackWithArray<Character>(size);
  }

  public boolean findDuplicateParenthesis(final String str) {
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ')') {
        Character top = arrayStack.pop();
        if (!(top == null) && top == '(')
          return true;
        else {
          while (top != '(') {
            top = arrayStack.pop();
          }
        }
      } else
        arrayStack.push(str.charAt(i));
    }
    return false;
  }
}
