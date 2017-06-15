package easy;

import dataStructures.ListNode;

/*
 * Remove all occurrences of an element in a linked list
 */
public class RemoveLinkedListElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode list = new ListNode(1);
		ListNode list1 = new ListNode(1);
		ListNode list2 = new ListNode(1);
		ListNode list3 = new ListNode(10);
		ListNode list4 = new ListNode(20);
//		list.next = list1;
//		list1.next = list2;
//		list2.next = list3;
//		list3.next = list4;
		ListNode upd = removeElements(list, 1);
		while(upd!=null){
			System.out.println(upd.val);
			upd = upd.next;
		}
	}
	
	public static ListNode removeElements(ListNode head, int val) {
		if(head == null)
			return null;
		while(head != null && head.val == val)
			head = head.next;
		ListNode temp = head;
		while(temp != null && temp.next != null){
			if(temp.next.val == val)
				temp.next = temp.next.next;
			else
				temp = temp.next;
		}
		return head;
	}

}
