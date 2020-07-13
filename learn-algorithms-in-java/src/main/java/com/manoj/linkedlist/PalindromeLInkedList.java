package com.manoj.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLInkedList {
	public boolean isPalindrome(ListNode head) {
		List<Integer> stringBuffer = new ArrayList<Integer>();
		ListNode foListNode = head;
		while (foListNode != null) {
			stringBuffer.add(foListNode.val);
			foListNode = foListNode.next;
		}
		int first = 0;
		int last = stringBuffer.size() - 1;
		while (first <= last) {
			if (stringBuffer.get(first) != stringBuffer.get(last))
				return false;
			first++;
			last--;

		}
		return true;
	}

}
