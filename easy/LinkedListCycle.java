package easy;

import dataStructures.ListNode;

/*
 *  Given a linked list, determine if it has a cycle in it. 
 */
public class LinkedListCycle {

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
		list4.next = list1;
		System.out.println(hasCycle(list));
	}

	public static boolean hasCycle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while(fast!=null && fast.next!=null){
			fast = fast.next.next;
			slow = slow.next;
			if(fast == slow)
				return true;
		}
		return false;
	}
}
