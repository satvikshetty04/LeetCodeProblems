package medium;

import dataStructures.ListNode;

public class RotateList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		ListNode ret = rotateRight(l1, 0);
		while(ret!=null){
			System.out.println(ret.val);
			ret = ret.next;
		}
	}
	
	public static ListNode rotateRight(ListNode head, int k) {
		if(head == null || head.next == null)
			return head;
		int i = 1, len = 1;
		ListNode temp = head;
		while(temp.next!=null){
			len++;
			temp = temp.next;
		}
		k = k%len;
		if(k == 0)
			return head;
		temp = head;
		while(i++<len-k)
			temp = temp.next;
		ListNode temp2 = temp.next;
		temp.next = null;
		temp = temp2;
		while(temp.next!=null)
			temp = temp.next;
		temp.next = head;
		return temp2;
	}

}
