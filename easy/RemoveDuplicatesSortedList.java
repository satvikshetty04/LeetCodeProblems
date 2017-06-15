package easy;

import dataStructures.ListNode;

/*
 * Given a sorted linked list, delete all duplicates such that 
 * each element appear only once. 
 */
public class RemoveDuplicatesSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode list = new ListNode(1);
		ListNode list1 = new ListNode(1);
		ListNode list2 = new ListNode(3);
		ListNode list3 = new ListNode(10);
		ListNode list4 = new ListNode(10);
		ListNode list5 = new ListNode(10);
		ListNode list6 = new ListNode(10);
		ListNode list7 = new ListNode(10);
		list.next = list1;
		list1.next = list2;
		list2.next = list3;
		list3.next = list4;
		list4.next = list5;
		list5.next = list6;
		list6.next = list7;
		ListNode mod = deleteDuplicates(list);
		while(mod!=null){
			System.out.println(mod.val);
			mod= mod.next;
		}
	}
	
	public static ListNode deleteDuplicates(ListNode head) {
		if(head == null || head.next == null)
			return head;
		ListNode temp = head;
		while(temp.next!=null){
			if(temp.val == temp.next.val)
				temp.next = temp.next.next;
			else
				temp = temp.next;
		}
		return head;
	}

}
