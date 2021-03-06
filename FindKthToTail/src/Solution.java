/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
    	if((head==null)||(k==0)) return null;
    	
    	/*first use one pointer to locate the k-eth position*/
    	ListNode p1 = head;
    	for(int i=1; i<k; i++){
    		if(p1.next != null){
    			p1 = p1.next;
    		}
    		else
    			return null;
    	}
    	
    	/*use another pointer from head to go
    	 * if the first pointer arrive the last one
    	 * distance(second pointer, first pointer)=k
    	 */
    	ListNode p2 = head;
    	while(p1.next != null){
    		p1 = p1.next;
    		p2 = p2.next;
    	}
    	return p2;
    }
}
