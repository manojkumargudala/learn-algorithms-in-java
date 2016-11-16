package com.manoj.linkedlist;

public class LinkedList<T> {
  Node<T> head;

  public void addToTheLast(final Node<T> node) {
    if (head == null) {
      head = node;
    } else {
      Node<T> temp = head;
      while (temp.getNext() != null)
        temp = temp.getNext();
      temp.setNext(node);
    }
  }

  public void printList(final Node<T> head) {
    Node<T> temp = head;
    while (temp != null) {
      System.out.format("%d ", temp.getData());
      temp = temp.getNext();
    }
    System.out.println();
  }

  public Node<T> reverseLinkedList(Node<T> currentNode) {
    Node<T> previousNode = null;
    Node<T> nextNode;
    while (currentNode != null) {
      System.out.println(currentNode);
      nextNode = currentNode.getNext();
      currentNode.setNext(previousNode);
      previousNode = currentNode;
      currentNode = nextNode;
    }
    return previousNode;
  }

  public Node<T> reverseListUsingRecurssion(final Node<T> head) {
    if (head == null || head.getNext() == null)
      return head;

    Node<T> second = head.getNext();
    head.setNext(null);
    Node<T> rest = reverseListUsingRecurssion(second);
    second.setNext(head);
    return rest;
  }

  @Override
  public boolean equals(final Object expected) {
    if (!(expected instanceof Node))
      return false;
    else {
      @SuppressWarnings("unchecked")
      Node<T> expect = (Node<T>) expected;
      Node<T> temp = head;
      while (temp != null) {
        if (!temp.getData().equals(expect.getData())) {
          return false;
        }
        expect = expect.getNext();
        temp = temp.getNext();
      }
    }
    return true;
  }
}
