package com.manoj.linkedlist;

public class Node {
  private char data;
  private Node next;

  Node(final char d) {
    setData(d);
    setNext(null);
  }

  public char getData() {
    return data;
  }

  public void setData(final char data) {
    this.data = data;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(final Node next) {
    this.next = next;
  }


}
