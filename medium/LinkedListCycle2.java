package medium;

//import java.util.HashSet;

import dataStructures.ListNode;

/*
 * Given a linked list, return the node where the cycle begins. 
 * If there is no cycle, return null.
 * Can you solve it without using extra space?  
 */
public class LinkedListCycle2 {

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
		list4.next = list2;
		System.out.println(detectCycle(list).val);

	}
	
	//Without extra space
	public static ListNode detectCycle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while(fast!=null && fast.next!=null){
			fast = fast.next.next;
			slow = slow.next;
			if(fast == slow){
				slow = head;
				while(slow!=fast){
					slow = slow.next;
					fast = fast.next;
				}
				return slow;
			}
		}
		return null;
	}
	/*
	//Using extra storage
	public static ListNode detectCycle(ListNode head) {
		if(head == null || head.next == null)
			return null;
		HashSet<ListNode> set = new HashSet<ListNode>();
		set.add(head);
		while(head.next!=null){
			head = head.next;
			if(set.add(head))
				continue;
			return head;
		}
		return null;
	}*/

}
