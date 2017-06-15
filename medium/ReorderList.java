package medium;

import dataStructures.ListNode;

/*
 *  Given a singly linked list L: L0->L1->..Ln-1->Ln,
 *  reorder it to: L0->Ln->L1->Ln-1..
 *  You must do this in-place without altering the nodes' values.
 *  Given {1,2,3,4}, reorder it to {1,4,2,3}. 
 */
public class ReorderList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode list = new ListNode(1);
		ListNode list1 = new ListNode(2);
		ListNode list2 = new ListNode(3);
		ListNode list3 = new ListNode(10);
		ListNode list4 = new ListNode(20);
		list.next = list1;
		list1.next = list2;
		list2.next = list3;
		list3.next = list4;
		reorderList(list);
	}

	public static void reorderList(ListNode head) {
		if(head == null || head.next == null || head.next.next == null)
			return;
		ListNode slow = head.next;
		ListNode fast = head.next.next;
		
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		
		//If odd number of elements
		if(fast!=null)
			slow = slow.next;
		
		//Reverse second part of list
		slow = reverse(slow);
		fast = head;
		
		ListNode temp = slow;
		while(slow!=null){
			ListNode next1 = fast.next;
			ListNode next2 = slow.next;
			fast.next = slow;
			slow.next = next1;
			fast = slow.next;
			slow = next2;
			
		}
		
		fast.next = null;
		while(head!=null){
			System.out.println(head.val);
			head=head.next;
		}
		return;
	}
	
	private static ListNode reverse(ListNode slow) {
		// TODO Auto-generated method stub
		
		ListNode prev = null;
		while(slow!= null){
			ListNode next = slow.next;
			slow.next = prev;
			prev = slow;
			slow = next;
		}
		return prev;
	}
}
