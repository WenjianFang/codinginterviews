/*
 * judge if there exist a circle in a list
 * get the circle length
 * get entry
 */
public class Solution {
	public ListNode createList(int[] array){
		if(array.length==0) return null;
		ListNode head = new ListNode(array[0]);
		ListNode p = head;
		for(int i=1; i<array.length; i++){
			ListNode newNode = new ListNode(array[i]);
			newNode.next = null;
			p.next = newNode;
			p = newNode;
		}
		p.next = head.next;
		return head;
	}
	/**
	 * 
	 * @param head: list head
	 * @return ListNode type, return the node that first and second pointer meet
	 * the return node is in the circle
	 * null if there are no circle
	 */
	public ListNode isThereExistCircle(ListNode head){
		if(head == null) return null;
		if(head.next==null) return null;
		
		ListNode firstPointer = head.next;
		ListNode secondPointer = head.next.next;
		
		while(firstPointer != secondPointer){/*if first and second pointer meet, exist circle*/
			if(secondPointer == null||secondPointer.next==null) return null;/*null, no circle*/
			firstPointer = firstPointer.next;/*first pointer move one step*/
			secondPointer = secondPointer.next.next;/*second pointer move two step*/
		}
		return firstPointer;/*return one node on the circle*/
	}
	
	/**
	 * use the isThereExistCircle judge the circle, and get one node on the circle
	 * use a new pointer to start from current node, when they first meet, we can get
	 * length of circle
	 * @param head:list head
	 * @return length of circle
	 */
	public int getCircleLength(ListNode head){
		ListNode p = isThereExistCircle(head);
		int count;
		if(p==null) return 0;
		else{
			ListNode tmp = p.next;/*start from next pointer*/
			count = 1;/*count the length*/
			while(tmp != p){/*when they meet*/
				count++;
				tmp = tmp.next;
			}/*they meet, we get the length*/
		}
		return count;
	}

	/**
	 * get the length of the circle
	 * two pointer, firstPointer first move length step
	 * secondPointer start, when first and second pointer meet
	 * that is the entry node of the circle
	 * @param head
	 * @return
	 */
	public ListNode getEntryNodeOfCircle(ListNode head){
		int length = getCircleLength(head);
		if(length==0) return null;
		ListNode firstPointer = head;
		for(int i=0; i<length; i++){
			firstPointer = firstPointer.next;
		}/*first pointer move length of circle*/
		ListNode secondPointer = head;/*second pointer start*/
		while(secondPointer != firstPointer){/*move two pointer until they meet*/
			firstPointer = firstPointer.next;
			secondPointer = secondPointer.next;
		}
		return secondPointer;
	}
}
