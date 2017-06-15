package medium;

import dataStructures.ListNode;

/*
 * Given a singly linked list, group all odd nodes together followed by the even nodes. 
 * Please note here we are talking about the node number and not the value in the nodes.
 * 
 */
public class OddEvenLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode list = new ListNode(1);
		ListNode list1 = new ListNode(2);
		ListNode list2 = new ListNode(3);
		ListNode list3 = new ListNode(10);
		ListNode list4 = new ListNode(20);
		ListNode list5 = new ListNode(25);
		ListNode list6 = new ListNode(30);
		ListNode list7 = new ListNode(40);
		list.next = list1;
		list1.next = list2;
		list2.next = list3;
		list3.next = list4;
		list4.next = list5;
		list5.next = list6;
		list6.next = list7;
		ListNode mod = oddEvenList(list);
		while(mod!=null){
			System.out.println(mod.val);
			mod= mod.next;
		}
	}
	
	public static ListNode oddEvenList(ListNode head) {
		if(head == null || head.next == null || head.next.next == null)
			return head;
		ListNode odd = head;
		ListNode even = head.next;
		ListNode evenStart = even;
		while(even!= null && even.next != null){
			ListNode nxt = even.next;
			even.next = nxt.next;
			odd.next = nxt;
			odd = odd.next;
			even = even.next;
		}
		odd.next = evenStart;
		return head;
	}

}
