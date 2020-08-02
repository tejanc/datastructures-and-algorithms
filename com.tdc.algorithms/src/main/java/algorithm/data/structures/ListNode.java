package algorithm.data.structures;

// Definition for singly-linked list.
public class ListNode {
	private int val;
	private ListNode next;
	ListNode() {}
	public ListNode(int val) { this.setVal(val); }
	ListNode(int val, ListNode next) { this.setVal(val); this.setNext(next); }
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	public ListNode getNext() {
		return next;
	}
	public void setNext(ListNode next) {
		this.next = next;
	}
}

