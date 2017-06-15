package medium;

import dataStructures.ListNode;

/*
 * Reverse a linked list from position m to n. Do it in-place and in one-pass. 
 */
public class ReverseLinkedList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode list = new ListNode(1);
		ListNode list1 = new ListNode(2);
		ListNode list2 = new ListNode(27);
		ListNode list3 = new ListNode(10);
		ListNode list4 = new ListNode(20);
		list.next = list1;
		list1.next = list2;
		list2.next = list3;
		list3.next = list4;
		ListNode reversed = reverseBetween(list, 2, 5);
		while(reversed!=null){
			System.out.println(reversed.val);
			reversed = reversed.next;
		}
	}
	
	public static ListNode reverseBetween(ListNode head, int m, int n) {
		if(head==null || head.next==null)
			return head;
		int ctr = 1;
		ListNode start = new ListNode(-1);
		start.next = head;
		ListNode prev = start;
		for(ctr=1; ctr<m; ctr++)
			prev = prev.next;
		
		ListNode temp = prev.next;
		while(ctr!=n){
			ListNode nxt = temp.next;
			temp.next = nxt.next;
			nxt.next = prev.next;
			prev.next = nxt;
			ctr++;
		}
		return start.next;
	}

}
