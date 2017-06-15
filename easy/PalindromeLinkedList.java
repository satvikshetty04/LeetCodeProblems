package easy;

//import java.util.Stack;
import dataStructures.ListNode;

/*
 * Given a singly linked list, determine if it is a palindrome.
 * Could you do it in O(n) time and O(1) space?
 */

public class PalindromeLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode list = new ListNode(1);
		ListNode list1 = new ListNode(2);
		//ListNode list2 = new ListNode(2);
		//ListNode list3 = new ListNode(10);
		//ListNode list4 = new ListNode(20);
		list.next = list1;
		//list1.next = list3;
		//list2.next = list3;
		//list3.next = list4;
		System.out.println(isPalindrome(list));
		
	}
	
	//O(1) 
	public static boolean isPalindrome(ListNode head) {
		if(head == null || head.next == null)
			return true;
		ListNode slow = head;
		ListNode fast = head;
		while(fast!=null && fast.next!=null){
			fast = fast.next.next;
			slow = slow.next;
		}
		
		//If odd number of elements
		if(fast!=null)
			slow = slow.next;
		
		//Reverse second part of list
		slow = reverse(slow);
		fast = head;
		
		while(slow!=null){
			if(fast.val != slow.val)
				return false;
			fast = fast.next;
			slow = slow.next;
		}
		return true;
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

	//Using stack
	/*public static boolean isPalindrome(ListNode head) {
		if(head == null || head.next == null)
			return true;
		
		Stack<Integer> s = new Stack<Integer>();
		ListNode temp = head;
		while(temp!=null){
			s.add(temp.val);
			temp = temp.next;
		}
		while(!s.isEmpty()){
			if(head.val == s.pop())
				head = head.next;
			else
				return false;
		}
		return true;
	}*/
}
