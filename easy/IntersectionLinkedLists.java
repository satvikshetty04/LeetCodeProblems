package easy;

import dataStructures.ListNode;

/*
 * Write a program to find the node at which the intersection 
 * of two singly linked lists begins.
 * If the two linked lists have no intersection at all, return null.
 * You may assume there are no cycles anywhere in the entire linked structure.
 */
public class IntersectionLinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode list = new ListNode(1);
		ListNode list1 = new ListNode(2);
		ListNode list2 = new ListNode(3);
		ListNode list3 = new ListNode(10);
		ListNode list4 = new ListNode(20);
		ListNode list5 = new ListNode(30);
		list.next = list1;
		list1.next = list2;
		list2.next = list3;
		
		list4.next = list5;
		//list5.next = list2;
		
		System.out.println(getIntersectionNode(list, list4));
	}
	
	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if(headA == null || headB == null)
			return null;
		int len1 = 0,len2 = 0;
		ListNode temp1 = headA;
		ListNode temp2 = headB;
		while(temp1 != null){
			temp1 = temp1.next;
			len1++;
		}
		while(temp2 != null){
			temp2 = temp2.next;
			len2++;
		}
		
		temp1 = headA;
		temp2 = headB;
		if(len1>len2)
			for(int i=0;i<len1-len2;i++)
				temp1 = temp1.next;
		else if(len1<len2)
			for(int i=0;i<len2-len1;i++)
				temp2 = temp2.next;
		
		while(temp1!=null && temp2!=null && temp1!=temp2){
			temp1 = temp1.next;
			temp2 = temp2.next;
		}
		return temp1;
	}

}
