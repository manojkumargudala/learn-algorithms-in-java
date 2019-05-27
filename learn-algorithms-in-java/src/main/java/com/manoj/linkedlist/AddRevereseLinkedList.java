package com.manoj.linkedlist;

public class AddRevereseLinkedList {
	// https://leetcode.com/problems/add-two-numbers/
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode finalList = new ListNode(0);
		ListNode rootNode = finalList;
		int pow = 0;
		while (l1 != null && l2 != null) {
			ListNode sub;
			if (l1.val + l2.val + pow >= 10) {
				sub = new ListNode((l1.val + l2.val) - 10 + pow);
				pow = 1;
			} else {
				sub = new ListNode(l1.val + l2.val + pow);
				pow = 0;
			}
			finalList.next = sub;
			finalList = sub;
			l1 = l1.next;
			l2 = l2.next;
		}
		while (l1 != null) {
			ListNode remainingNode;
			if (l1.val + pow >= 10) {
				remainingNode = new ListNode((l1.val + pow) - 10);
				pow = 1;
			} else {
				remainingNode = new ListNode(l1.val + pow);
				pow = 0;
			}
			finalList.next = remainingNode;
			finalList = remainingNode;
			l1 = l1.next;
		}
		while (l2 != null) {
			ListNode remainingNode;
			if (l2.val + pow >= 10) {
				remainingNode = new ListNode((l2.val + pow) - 10);
				pow = 1;
			} else {
				remainingNode = new ListNode((l2.val + pow));
				pow = 0;
			}
			finalList.next = remainingNode;
			finalList = remainingNode;
			l2 = l2.next;
		}
		if (pow == 1) {
			finalList.next = new ListNode(1);
		}
		return rootNode.next;
	}

	public static void main(final String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(9);
		l2.next.next.next = new ListNode(9);
		AddRevereseLinkedList addRevereseLinkedList = new AddRevereseLinkedList();
		ListNode l = addRevereseLinkedList.addTwoNumbers(l1, l2);
		System.out.println(l.val);
		System.out.println(l.next.val);
		System.out.println(l.next.next.val);
		System.out.println(l.next.next.next.val);
		System.out.println(l.next.next.next.next.val);

	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(final int x) {
		System.out.println("Node created with valie " + x);
		val = x;
	}
}