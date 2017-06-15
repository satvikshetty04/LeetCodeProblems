package medium;
import java.util.Random;

import dataStructures.ListNode;

/*
 * Given a singly linked list, return a random node's value from the linked list. 
 * Each node must have the same probability of being chosen.
 * What if the linked list is extremely large and its length is unknown to you? 
 * Could you solve this efficiently without using extra space? 
 */
public class LinkedListRandomNode {

	ListNode head = null;
	Random random = null;
	
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
		LinkedListRandomNode l = new LinkedListRandomNode(list);
		System.out.println(l.getRandom());
	}
	
	public LinkedListRandomNode(ListNode head){
		this.head = head;
		random = new Random();
	}
    
    /** Returns a random node's value. */
    public int getRandom() {
        if(head == null)
        	return 0;
        int ctr = 1;
        ListNode h = head;
        int chosen = h.val;
        while(h!=null){
        	if((random.nextInt(ctr) + 1) == ctr++)
        		chosen = h.val;
        	h = h.next;
        }
        return chosen;
    }

}
