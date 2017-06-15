package easy;

import dataStructures.ListNode;

/*
 * Write a function to delete a node (except the tail) in a singly linked list, 
 * given only access to that node.
 */
public class DeleteNodeLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode list = new ListNode(1);
		ListNode list1 = new ListNode(2);
		ListNode list2 = new ListNode(2);
		ListNode list3 = new ListNode(10);
		ListNode list4 = new ListNode(20);
		list.next = list1;
		list1.next = list3;
		list2.next = list3;
		list3.next = list4;
		System.out.println();
	}

	public static void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}
}
