
public class Solution {
	public ListNode mergeTwoList(ListNode head1, ListNode head2){
		if(head1 == null) return head2;
		if(head2 == null) return head1;/*if one of list is null, return another list*/
		
		/*
		 * decide the head node
		 */
		ListNode newHead;
		if(head1.val < head2.val){
			newHead = head1;
			head1 = head1.next;
		}
		else{
			newHead = head2;
			head2 = head2.next;
		}
		/*
		 * while loop if two lists both have number
		 */
		ListNode p = newHead;
		while((head1 != null)&&(head2 != null)){
			if(head1.val < head2.val){/*head1 touched and next*/
				p.next = head1;
				p = head1;
				head1 = head1.next;
			}
			else{/*head2 touched and next*/
				p.next = head2;
				p = head2;
				head2 = head2.next;
			}
		}
		if((head2 == null)&&(head1 != null)){/*head2 null, head1 all touched*/
			p.next = head1;
		}
		if((head1 == null)&&(head2 != null)){/*head1 null, head2 all touched*/
			p.next = head2;
		}
		return newHead;
	}
}
