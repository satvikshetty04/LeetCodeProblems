package easy;

import dataStructures.ListNode;

/*
 * Merge two sorted linked lists and return it as a new list. 
 * The new list should be made by splicing together the nodes of the first two lists.
 */
public class MergeTwoSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode list = new ListNode(1);
		ListNode list1 = new ListNode(2);
		ListNode list2 = new ListNode(3);
		ListNode list3 = new ListNode(10);
		ListNode list4 = new ListNode(12);
		ListNode list5 = new ListNode(14);
		ListNode list6 = new ListNode(7);
		ListNode list7 = new ListNode(40);
		list.next = list1;
		list1.next = list2;
		list2.next = list3;
		list3.next = list4;
		list4.next = list5;
		//list5.next = list6;
		list6.next = list7;
		ListNode mod = mergeTwoLists(list, list6);
		while(mod!=null){
			System.out.println(mod.val);
			mod= mod.next;
		}
		
	}
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null)
			return l2;
		if(l2 == null)
			return l1;
		
		ListNode ptr = new ListNode(-1);
		ListNode temp = ptr;
		while(l1 != null && l2 != null){
			if(l1.val>l2.val){
				temp.next = l2;
				l2 = l2.next;
			}
			else{
				temp.next = l1;
				l1 = l1.next;
			}
			temp = temp.next;
		}
		if(l1 == null)
			temp.next = l2;
		if(l2 == null)
			temp.next = l1;
		return ptr.next;
	}

}
