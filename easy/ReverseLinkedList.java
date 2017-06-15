package easy;

import dataStructures.ListNode;

/*
 * Reverse a singly linked list.
 */
public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode list = new ListNode(1);
		ListNode list1 = new ListNode(2);
		ListNode list2 = new ListNode(2);
		ListNode list3 = new ListNode(10);
		ListNode list4 = new ListNode(20);
		list.next = list1;
		list1.next = list2;
		list2.next = list3;
		list3.next = list4;
		list = reverseList(list);
		while(list!=null){
			System.out.println(list.val);
			list = list.next;
		}
	}
	
	public static ListNode reverseList(ListNode head) {
		if(head == null || head.next == null)
			return head;
		ListNode temp = null;
		while(head!=null){
			ListNode next = head.next;
			head.next = temp;
			temp = head;
			head = next;
		}
		return temp;
	}

}
