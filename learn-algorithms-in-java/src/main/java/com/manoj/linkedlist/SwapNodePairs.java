package com.manoj.linkedlist;

public class SwapNodePairs {
	// https://leetcode.com/problems/swap-nodes-in-pairs/submissions/
	public ListNode swapPairs(final ListNode head) {
		if (head != null) {
			swapPairsHelper(head);
		}
		return head;
	}

	public void swapPairsHelper(final ListNode node) {
		if (node.next != null) {
			int temp = node.next.val;
			node.next.val = node.val;
			node.val = temp;
			if (node.next.next != null) {
				swapPairsHelper(node.next.next);
			}
		}
	}
}
