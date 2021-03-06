
public class Solution {
	public ListNode reverseList(ListNode head){
		if(head == null) return null;
		if(head.next == null) return head;
		
		ListNode prev = head;/*current head*/
		ListNode p = head.next;/*current node*/
		ListNode next;/*current node's next node*/
		
		while(p.next != null){
			next = p.next;/*store next node*/
			p.next = prev;/*current node move to be head node*/
			prev = p;/*current head node*/
			p = next;/*move to next node*/
		}
		/*now p.next == null, so p is the last node to reverse*/
		p.next = prev;
		head.next = null;
		return p;/*after reverse p node, p is point to the list head*/
	}
}