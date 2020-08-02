package algorithm;

import algorithm.data.structures.ListNode;

public class AddTwoNumbers {

	//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
	//
	//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
	//
	//Example:
	//
	//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
	//Output: 7 -> 0 -> 8
	//Explanation: 342 + 465 = 807.

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode p = l1, q = l2, curr = dummyHead;
		int carry = 0;
		while (p != null || q != null) {
			int x = (p != null) ? p.getVal() : 0;
			int y = (q != null) ? q.getVal() : 0;
			int sum = carry + x + y;
			carry = sum / 10;
			curr.setNext(new ListNode(sum % 10));
			curr = curr.getNext();
			if (p != null) p = p.getNext();
			if (q != null) q = q.getNext();
		}
		if (carry > 0) {
			curr.setNext(new ListNode(carry));
		}
		return dummyHead.getNext();
	}

}
