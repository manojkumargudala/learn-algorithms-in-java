package com.manoj.linkedlist;

import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {
  LinkedList<Integer> list;
  Node<Integer> head;

  @Before
  public void instiateTest() {
    head = new Node<Integer>(5);
    list = new LinkedList<Integer>();
    list.addToTheLast(head);
    list.addToTheLast(new Node<Integer>(6));
    list.addToTheLast(new Node<Integer>(7));
    list.addToTheLast(new Node<Integer>(1));
    list.addToTheLast(new Node<Integer>(2));

    list.printList(head);

  }

  @Test
  public void testReverse() {
    head = list.reverseLinkedList(head);
    list.printList(head);
  }

  @Test
  public void testReverseRecurssion() {
    head = list.reverseListUsingRecurssion(head);
    list.printList(head);
  }
}
