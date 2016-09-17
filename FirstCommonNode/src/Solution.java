/*first link go k step, and then compare first and second list*/
public class Solution {
	public ListNode getFirstCommonNode(ListNode head1, ListNode head2){
		if(head1 == null || head2 == null) return null;
		
		/*get list length*/
		int lenList1 = getListLength(head1);
		int lenList2 = getListLength(head2);
		
		ListNode pShort;
		ListNode pLong;
		int lenDiff;
		/*get long and short list's head*/
		if(lenList1-lenList2>0){
			lenDiff = lenList1-lenList2;
			pLong = head1;
			pShort = head2;
		}
		else{
			lenDiff = lenList2-lenList1;
			pLong = head2;
			pShort = head1;
		}
		/*pLong put on the position that length equal to pShort*/
		while(lenDiff>0){
			pLong = pLong.next;
			lenDiff--;
		}
		
		while(pLong != null && pShort != null){
			if(pLong != pShort){
				pLong = pLong.next;
				pShort = pShort.next;
			}
			else
				break;
		}
		return pLong;
		
	}
	private int getListLength(ListNode head){
		if(head==null) return 0;
		ListNode p = head;
		int length=0;
		while(p != null){
			length++;
			p = p.next;
		}
		return length;
	}
}
