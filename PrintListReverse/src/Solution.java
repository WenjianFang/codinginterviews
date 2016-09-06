/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.ArrayList;
import java.util.Stack;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    	ArrayList<Integer> vals = new ArrayList<>();/*store the reversed values*/
    	ListNode p = listNode;
        if(p==null) return vals;/*if list is NULL, return null*/
        Stack<ListNode> s = new Stack<>();/*using stack to temp store values*/
        while(p!=null){
        	s.push(p);/*push list nodes*/
        	p = p.next;
        }
        while(!s.empty()){
        	vals.add(s.pop().val);/*pop list nodes and obtain the values to arraylist*/
        }
        return vals;
    }
}